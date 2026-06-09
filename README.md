# Foam - Emby 管理系统

Foam 是一个功能强大的 Emby 媒体服务器管理系统，提供用户管理、统计分析、通知推送、卡密管理等功能。

## 功能特性

### 用户管理
- 用户列表查询
- 用户创建/编辑/删除
- 用户续期管理
- 用户注册记录
- 邀请码管理

### 媒体管理
- 媒体库统计
- 媒体项查询
- 封面设计器
- 正在播放监控

### 数据分析
- 播放记录查询
- 播放统计分析
- 播放排行榜
- 同时播放监控

### 卡密系统
- 卡密生成
- 卡密验证
- 卡密状态管理

### 通知系统
- 通知渠道配置
- 通知模板管理
- Telegram 集成
- 微信机器人集成

### 积分系统
- 积分等级配置
- 积分兑换
- 抽奖系统

### 请求中心
- 影片请求
- 请求订阅
- 请求审批

### 工单系统
- 工单提交
- 工单回复
- 工单审核

## 技术栈

### 后端
- **框架**: Spring Boot 3.5.0
- **ORM**: MyBatis-Plus
- **数据库**: MySQL 8.4+
- **缓存**: Redis
- **认证**: Sa-Token
- **任务调度**: Spring @Scheduled

### 前端
- **框架**: Vue 3.5.13
- **构建工具**: Vite
- **UI 框架**: Vuetify (Material Design)
- **状态管理**: Pinia
- **路由**: Vue Router 4.5.0
- **HTTP 客户端**: Axios

## 快速开始

### 1. 克隆项目

```bash
git clone <repository-url>
cd foam-project
```

### 2. 配置环境变量

```bash
cp .env.example .env
# 编辑 .env 文件，修改数据库密码等配置
```

### 3. 启动服务

```bash
docker-compose up -d
```

### 4. 访问系统

- **前端**: http://localhost
- **后端 API**: http://localhost:8080

## 开发指南

### 后端开发

```bash
cd foam-api-v2

# 安装依赖
mvn clean install

# 运行项目
mvn spring-boot:run
```

### 前端开发

```bash
cd foam-web

# 安装依赖
npm install

# 运行开发服务器
npm run dev

# 构建生产版本
npm run build
```

## 项目结构

```
foam-project/
├── foam-api-v2/                 # 后端项目
│   ├── src/
│   │   └── main/
│   │       ├── java/
│   │       │   └── com/una/embyhub/
│   │       │       ├── controller/    # 控制器
│   │       │       ├── service/       # 服务层
│   │       │       ├── mapper/        # 数据访问层
│   │       │       ├── model/         # 实体和DTO
│   │       │       ├── config/        # 配置类
│   │       │       └── job/           # 定时任务
│   │       └── resources/
│   │           ├── application.yml    # 应用配置
│   │           ├── mapper/            # MyBatis XML
│   │           └── db/migration/      # 数据库迁移脚本
│   ├── pom.xml                        # Maven 配置
│   └── Dockerfile
│
├── foam-web/                    # 前端项目
│   ├── src/
│   │   ├── views/               # 页面组件
│   │   ├── components/          # 公共组件
│   │   ├── router/              # 路由配置
│   │   ├── stores/              # 状态管理
│   │   ├── api/                 # API 调用
│   │   └── utils/               # 工具函数
│   ├── package.json
│   ├── vite.config.js
│   └── Dockerfile
│
├── docker-compose.yml           # Docker Compose 配置
├── .env.example                 # 环境变量示例
└── README.md
```

## 配置说明

### 数据库配置

在 `.env` 文件中配置数据库连接信息：

```env
MYSQL_ROOT_PASSWORD=your_root_password
MYSQL_DATABASE=foam
MYSQL_USER=foam
MYSQL_PASSWORD=your_password
```

### Redis 配置

```env
REDIS_PASSWORD=your_redis_password
```

### 端口配置

```env
MYSQL_PORT=3306
REDIS_PORT=6379
API_PORT=8080
WEB_PORT=80
```

## API 文档

API 文档需要手动分析代码生成。主要的 API 端点包括：

- `/api/auth/*` - 认证相关
- `/api/emby/*` - Emby 管理
- `/api/user/*` - 用户管理
- `/api/media/*` - 媒体管理
- `/api/playback/*` - 播放记录
- `/api/notification/*` - 通知管理
- `/api/system/*` - 系统配置

## 常见问题

### 1. 数据库连接失败

检查 MySQL 服务是否启动，以及 `.env` 文件中的数据库配置是否正确。

### 2. Redis 连接失败

检查 Redis 服务是否启动，以及密码配置是否正确。

### 3. 前端无法访问后端 API

检查 nginx 配置中的 `API_BASE_URL` 是否正确。

## 许可证

本项目基于反编译代码重建，仅供学习和研究使用。

## 致谢

- 原项目作者: ciwei123321
- 技术栈: Spring Boot, Vue.js, Vuetify
- 数据库迁移: Flyway
