#!/bin/sh
set -e

# 根据环境变量决定是否添加代理配置
PROXY_OPTS=""
if [ "$HTTP_PROXY_ENABLED" = "true" ]; then
    PROXY_OPTS="-Dhttp.proxyHost=$(echo $HTTP_PROXY | cut -d/ -f3 | cut -d: -f1) \
                -Dhttp.proxyPort=$(echo $HTTP_PROXY | cut -d/ -f3 | cut -d: -f2) \
                -Dhttps.proxyHost=$(echo $HTTPS_PROXY | cut -d/ -f3 | cut -d: -f1) \
                -Dhttps.proxyPort=$(echo $HTTPS_PROXY | cut -d/ -f3 | cut -d: -f2) \
                -Dhttp.nonProxyHosts=$(echo $NO_PROXY | tr ',' '|')"
fi

# 使用 SPRING_PROFILE 环境变量设置 Spring 配置文件
SPRING_OPTS="--spring.profiles.active=${SPRING_PROFILE:-prod}"

# 允许通过环境变量添加额外的 JVM 参数
JVM_OPTS="${JVM_OPTS:-}"

# 执行 Java 应用
exec java -Dfile.encoding=UTF-8 $JVM_OPTS $PROXY_OPTS -jar /app.jar $SPRING_OPTS "$@"
