# Personal Blog

## 数据库

sql文件在resources目录下，需要手动导入运行  
其中，tb_admin_user表是后台管理员的信息，有用户名和密码两项。    
插入的"login_password"是经过MD5加密后的密文，其明文为"123456"。  

## 配置

只需要在配置文件中更改为自己的数据库地址以及用户名密码即可  

## 测试

测试类中已经用Junit编写好几个基本的测试方法，可用来检测dao层是否能正常工作

## Docker

如果想用Docker运行数据库等软件，参见Docker.md  