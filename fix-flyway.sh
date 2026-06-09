#!/bin/bash
# 修复 Flyway 迁移问题

set -e

echo "🔧 修复 Flyway 迁移问题..."

# 检查 MySQL 是否运行
if ! docker ps | grep -q foam-mysql; then
    echo "❌ MySQL 未运行，请先启动服务"
    echo "   运行: docker compose -f docker-compose-simple.yml up -d mysql"
    exit 1
fi

# 等待 MySQL 就绪
echo "⏳ 等待 MySQL 就绪..."
sleep 5

# 修复 Flyway
echo "🗄️ 修复 Flyway schema_history 表..."
docker exec foam-mysql mysql -u foam -pfoam123456 foam -e "
-- 删除失败的迁移记录
DELETE FROM flyway_schema_history WHERE success = 0;

-- 显示当前迁移状态
SELECT '当前迁移状态:' AS info;
SELECT installed_rank, version, description, success
FROM flyway_schema_history
ORDER BY installed_rank DESC
LIMIT 10;
"

echo ""
echo "✅ Flyway 修复完成！"
echo ""
echo "📝 下一步："
echo "1. 重启 API 服务: docker restart foam-api"
echo "2. 查看日志: docker logs -f foam-api"
