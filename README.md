# 学生就业信息管理系统

## 📋 项目简介

这是一个基于Spring Boot开发的学生就业信息管理系统，旨在为企业和求职者提供一个高效的就业信息管理平台。系统包含完整的企业信息管理、求职者信息管理、招聘信息发布等功能。

## 🏗️ 项目结构

```
student-employment-management-system/
├── main-project/                    # 主项目目录
│   └── springboot-schema-master/    # Spring Boot完整项目
├── sub-project/                     # 子项目目录
│   └── Student05/                   # MyBatis基础项目
├── docs/                            # 项目文档
├── screenshots/                     # 系统截图
└── README.md                        # 项目总说明
```

## 🚀 技术栈

### 主项目 (springboot-schema-master)
- **后端框架**: Spring Boot 2.2.2
- **数据库**: MySQL 5.7+ 
- **ORM框架**: MyBatis Plus 2.3
- **安全框架**: Apache Shiro 1.3.2
- **工具库**: 
  - Hutool 4.0.12
  - FastJSON 1.2.8
  - Apache Commons
- **AI功能**: 百度人工智能SDK
- **Java版本**: 1.8

### 子项目 (Student05)
- **框架**: 纯MyBatis
- **数据库**: MySQL 5.6+
- **测试**: JUnit 4.12

## 📦 功能模块

### 企业端功能
- ✅ 企业信息管理
- ✅ 招聘信息发布
- ✅ 求职者简历查看
- ✅ 简历收藏功能
- ✅ 企业介绍展示

### 求职者端功能
- ✅ 个人信息管理
- ✅ 简历上传
- ✅ 岗位搜索
- ✅ 企业信息查看
- ✅ 收藏职位

### 系统管理功能
- ✅ 岗位分类管理
- ✅ 新闻资讯发布
- ✅ 留言板功能
- ✅ 评论系统
- ✅ 系统配置管理

## 🛠️ 快速开始

### 环境要求
- Java 1.8+
- MySQL 5.7+
- Maven 3.6+
- 内存: 最小2GB，推荐4GB

### 数据库配置
1. 创建数据库
```sql
CREATE DATABASE springbootjlvpc CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
```

2. 导入数据库文件
```bash
mysql -u root -p springbootjlvpc < main-project/springboot-schema-master/db/mysql.sql
```

### 项目配置
1. 修改数据库连接配置
编辑 `main-project/springboot-schema-master/src/main/resources/application.yml`

```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/springbootjlvpc?useUnicode=true&characterEncoding=utf-8&useSSL=false
    username: your_username
    password: your_password
```

2. 构建项目
```bash
cd main-project/springboot-schema-master
mvn clean install
```

3. 运行项目
```bash
mvn spring-boot:run
```

4. 访问系统
- 前台地址: http://localhost:8080/springbootjlvpC
- 后台管理: http://localhost:8080/springbootjlvpC/admin

## 📁 分步上传说明

本项目采用分步上传的方式，共分为8个步骤：

1. **Step 1**: 项目基础结构和说明文档
2. **Step 2**: 后端核心代码和配置文件
3. **Step 3**: 数据库文件和相关配置
4. **Step 4**: 前端资源和静态文件
5. **Step 5**: 完整的项目文档
6. **Step 6**: Student05子项目
7. **Step 7**: 项目优化和最终整理
8. **Step 8**: 使用指南和后续维护

## 📸 系统截图

### 系统首页
![系统首页](screenshots/homepage.png)

### 企业信息管理
![企业信息](screenshots/company-management.png)

### 求职者信息管理
![求职者信息](screenshots/jobseeker-management.png)

## 🤝 贡献指南

1. Fork 本仓库
2. 创建您的功能分支 (`git checkout -b feature/AmazingFeature`)
3. 提交您的更改 (`git commit -m 'Add some AmazingFeature'`)
4. 推送到分支 (`git push origin feature/AmazingFeature`)
5. 打开一个 Pull Request

## 📝 许可证

本项目采用 MIT 许可证 - 查看 [LICENSE](LICENSE) 文件了解详情

## 👥 联系方式

- 项目作者: [您的姓名]
- 邮箱: [您的邮箱]
- 项目地址: https://github.com/[您的用户名]/student-employment-management-system

## 🔗 相关链接

- [Spring Boot官方文档](https://spring.io/projects/spring-boot)
- [MyBatis Plus官方文档](https://baomidou.com/)
- [Apache Shiro官方文档](https://shiro.apache.org/)

---

⭐ 如果这个项目对您有帮助，请给个Star支持一下！