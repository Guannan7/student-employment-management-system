# GitHub上传详细操作指南

## 🎯 新手小白专用：手把手教你上传项目到GitHub

### 📋 准备工作

#### 1. 安装必要软件
1. **Git**: 访问 https://git-scm.com/download/win 下载并安装
2. **GitHub Desktop** (可选): https://desktop.github.com/
3. **文本编辑器**: 推荐 VS Code https://code.visualstudio.com/

#### 2. 注册GitHub账号
1. 访问 https://github.com
2. 点击右上角 "Sign up"
3. 填写信息并完成注册
4. 验证邮箱地址

### 🚀 详细上传步骤

#### Step 1: 创建GitHub仓库

**方法一：网页创建（推荐新手）**
1. 登录GitHub
2. 点击右上角 "+" → "New repository"
3. 填写信息：
   - Repository name: `student-employment-management-system`
   - Description: `学生就业信息管理系统`
   - 选择 "Public"
   - 勾选 "Add a README file"
   - 点击 "Create repository"

**方法二：命令行创建**
```bash
# 安装GitHub CLI (可选)
scoop install gh

# 登录GitHub
gh auth login

# 创建仓库
gh repo create student-employment-management-system --public --description "学生就业信息管理系统"
```

#### Step 2: 本地项目初始化

1. **打开命令提示符** (Win+R → 输入cmd)
2. **进入项目目录**:
```bash
cd e:\springboot-schema-master
```

3. **初始化Git仓库**:
```bash
git init
```

4. **配置Git用户信息**:
```bash
git config --global user.name "你的GitHub用户名"
git config --global user.email "你的GitHub邮箱"
```

5. **添加远程仓库**:
```bash
git remote add origin https://github.com/你的用户名/student-employment-management-system.git
```

#### Step 3: 第一步上传 - 基础结构

1. **创建初始提交**:
```bash
# 添加.gitignore文件
git add .gitignore
git commit -m "Initial commit: Add .gitignore file"

# 添加主README文件
git add README.md
git commit -m "Step 1: Add main project README with comprehensive documentation"

# 推送到GitHub
git push -u origin master
```

2. **验证上传**: 访问你的GitHub仓库页面，确认文件已上传

#### Step 4: 第二步上传 - 主项目结构

1. **创建目录结构**:
```bash
# Windows命令
mkdir main-project\springboot-schema-master
mkdir sub-project\Student05
mkdir docs
mkdir screenshots
```

2. **复制项目文件**:
```bash
# 复制主项目文件
xcopy /E /I springboot-schema-master main-project\springboot-schema-master
```

3. **添加并提交**:
```bash
git add main-project/
git commit -m "Step 2: Add main project structure and basic files"
git push origin master
```

#### Step 5: 第三步上传 - 数据库文件

1. **添加数据库相关文件**:
```bash
git add main-project/springboot-schema-master/db/
git commit -m "Step 3: Add database schema and initial data"

# 添加配置文件
git add main-project/springboot-schema-master/src/main/resources/
git commit -m "Step 3: Add application configuration files"

# 推送
git push origin master
```

#### Step 6: 第四步上传 - 后端代码

1. **分批添加Java代码** (避免一次添加太多):
```bash
# 先添加主要代码包
git add main-project/springboot-schema-master/src/main/java/com/
git commit -m "Step 4: Add main Java source code - Part 1"

# 再添加其他代码
git add main-project/springboot-schema-master/src/main/java/
git commit -m "Step 4: Add complete Java source code - Part 2"

# 添加测试代码
git add main-project/springboot-schema-master/src/test/
git commit -m "Step 4: Add unit tests and test configurations"

# 推送
git push origin master
```

#### Step 7: 第五步上传 - 前端资源

1. **添加前端文件**:
```bash
# 添加静态资源
git add main-project/springboot-schema-master/src/main/resources/static/
git commit -m "Step 5: Add frontend static resources and CSS/JS files"

# 添加模板文件
git add main-project/springboot-schema-master/src/main/resources/templates/
git commit -m "Step 5: Add HTML templates and frontend pages"

# 推送
git push origin master
```

#### Step 8: 第六步上传 - 子项目

1. **处理Student05项目**:
```bash
# 复制Student05项目
xcopy /E /I Student05 sub-project\Student05

# 创建子项目README
echo # Student05 - MyBatis基础项目 > sub-project\Student05\README.md
echo 这是一个简单的MyBatis项目，用于学习MyBatis基础操作。 >> sub-project\Student05\README.md

# 添加并提交
git add sub-project/
git commit -m "Step 6: Add Student05 sub-project with MyBatis implementation"
git push origin master
```

#### Step 9: 第七步上传 - 文档完善

1. **创建文档文件**:
```bash
# 创建文档目录结构
echo # 项目文档 > docs\项目说明.md
echo # 安装部署指南 > docs\安装部署指南.md
echo # 数据库设计 > docs\数据库设计.md
echo # API文档 > docs\API文档.md

# 添加文档
git add docs/
git commit -m "Step 7: Add comprehensive project documentation"

# 如果有截图，添加截图
# git add screenshots/
# git commit -m "Step 7: Add system screenshots and demo images"

# 推送
git push origin master
```

#### Step 10: 第八步上传 - 最终整理

1. **最终整理和标签**:
```bash
# 更新主README（如果需要）
git add README.md
git commit -m "Step 8: Final project documentation and structure optimization"

# 创建发布标签
git tag -a v1.0.0 -m "First stable release of Student Employment Management System"

# 推送标签和最终更改
git push origin v1.0.0
git push origin master
```

### 🎯 上传完成后的验证

1. **检查GitHub仓库**: 确保所有文件都已正确上传
2. **验证项目结构**: 确认目录结构符合预期
3. **测试README显示**: 检查Markdown是否正确渲染
4. **查看提交历史**: 确认8个步骤的提交记录

### 🛠️ 常见问题解决

#### 问题1: 上传失败
```bash
# 强制推送（谨慎使用）
git push -f origin master

# 或者先拉取再推送
git pull origin master
git push origin master
```

#### 问题2: 文件太大
```bash
# 检查大文件
find . -type f -size +100M

# 使用Git LFS（大文件存储）
git lfs track "*.zip"
git lfs track "*.pdf"
```

#### 问题3: 提交信息错误
```bash
# 修改最后一次提交信息
git commit --amend -m "新的提交信息"

# 推送到远程
git push -f origin master
```

### 📊 上传进度检查清单

- [ ] Step 1: 基础结构和README ✅
- [ ] Step 2: 主项目结构 ✅
- [ ] Step 3: 数据库和配置 ✅
- [ ] Step 4: 后端核心代码 ✅
- [ ] Step 5: 前端资源 ✅
- [ ] Step 6: Student05子项目 ✅
- [ ] Step 7: 文档和截图 ✅
- [ ] Step 8: 最终整理和标签 ✅

### 🎉 恭喜！上传完成

上传完成后，你的GitHub仓库将包含：
- 📁 完整的项目结构
- 📖 详细的文档说明
- 🔧 清晰的提交历史
- 🏷️ 版本标签
- 📸 系统截图（如果有）

### 🔗 后续操作

1. **分享你的项目**: 将仓库链接分享给他人
2. **持续更新**: 定期更新项目代码
3. **添加Issues**: 管理项目任务和Bug
4. **创建Wiki**: 添加更详细的文档
5. **设置Actions**: 添加自动化构建和测试

---

💡 **小贴士**: 每次上传前记得先 `git pull` 获取最新更改，避免冲突！

🚀 **遇到问题？** 随时回来查看这份指南，或者在GitHub上提交Issue寻求帮助！