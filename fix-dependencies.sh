#!/bin/bash
# 快速修复后端依赖问题

set -e

echo "🔧 开始修复后端依赖..."

# 创建 lib 目录
mkdir -p foam-api-v2/lib

# 从原始 Docker 镜像提取依赖
echo "📦 从原始镜像提取依赖..."
docker create --name foam-deps-extract ciwei123321/foam-api-v2:latest > /dev/null 2>&1
docker cp foam-deps-extract:/app.jar /tmp/foam-app.jar
docker rm foam-deps-extract > /dev/null 2>&1

# 解压 JAR 并提取依赖
echo "📂 解压依赖文件..."
cd /tmp
python3 -c "
import zipfile
import os

jar_path = '/tmp/foam-app.jar'
extract_path = '/tmp/foam-deps-extracted'

os.makedirs(extract_path, exist_ok=True)
with zipfile.ZipFile(jar_path, 'r') as z:
    for f in z.namelist():
        if f.startswith('BOOT-INF/lib/') and f.endswith('.jar'):
            # 提取文件名
            filename = f.split('/')[-1]
            # 读取内容并写入目标
            content = z.read(f)
            target = os.path.join(extract_path, filename)
            with open(target, 'wb') as out:
                out.write(content)
            print(f'  ✅ {filename}')
"

# 复制依赖到项目
cp /tmp/foam-deps-extracted/*.jar /home/nax/foam-project/foam-api-v2/lib/

# 清理
rm -rf /tmp/foam-app.jar /tmp/foam-deps-extracted

echo ""
echo "✅ 依赖提取完成！"
echo ""
echo "📁 提取的依赖文件:"
ls -la /home/nax/foam-project/foam-api-v2/lib/ | head -20
echo "... (共 $(ls /home/nax/foam-project/foam-api-v2/lib/*.jar | wc -l) 个 JAR 文件)"
echo ""
echo "📝 下一步："
echo "1. 修改 pom.xml，添加本地依赖配置"
echo "2. 运行 'mvn clean package -DskipTests' 测试编译"
