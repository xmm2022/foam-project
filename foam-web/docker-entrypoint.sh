#!/bin/sh
set -e

: "${API_BASE_URL:=http://host.docker.internal:8080}"

envsubst '$API_BASE_URL' \
  < /etc/nginx/conf.d/default.conf.template \
  > /etc/nginx/conf.d/default.conf

exec nginx -g 'daemon off;'
