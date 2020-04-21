# JEE_Project1
#### Maven+MyBatis练习

# DataBase
#### v1.00
- Create database name by zy
```sql
create database zy;
```
- Create table
```sql
create table zy(
    id int(10) not null PRIMARY KEY AUTO_INCREMENT, 
    name varchar(45) not null, 
    pass varchar(45) not null
)
```
- Insert data
```sql
INSERT INTO zy values('aa','aa'),
('bb','bb'),
('cc','cc'),
```
#### v2.00
- 1、用户角色表的结构如下。
```sql
CREATE TABLE `sys_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '角色ID',
  `role_name` varchar(50) DEFAULT NULL COMMENT '角色名',
  `enabled` int(11) DEFAULT NULL COMMENT '有效标志',
  `create_by` bigint(20) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='角色表';

- 在角色表中添加如下两条记录
INSERT INTO `sys_role` VALUES ('1', '管理员', '1', '1', '2016-04-01 17:02:14');
INSERT INTO `sys_role` VALUES ('2', '普通用户', '1', '1', '2016-04-01 17:02:34');
```
- 2、用户表的结构如下。
```sql
CREATE TABLE `sys_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `user_name` varchar(50) DEFAULT NULL COMMENT '用户名',
  `user_password` varchar(50) DEFAULT NULL COMMENT '密码',
  `user_email` varchar(50) DEFAULT 'test@mybatis.tk' COMMENT '邮箱',
  `user_info` text COMMENT '简介',
  `head_img` blob COMMENT '头像',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1035 DEFAULT CHARSET=utf8 COMMENT='用户表';

- 在用户表中添加如下两条记录
INSERT INTO `sys_user` VALUES ('1', 'admin', '123456', 'admin@mybatis.tk', '管理员用户', 0x1231231230, '2016-06-07 01:11:12');
INSERT INTO `sys_user` VALUES ('1001', 'test', '123456', 'test@mybatis.tk', '测试用户', 0x1231231230, '2016-06-07 00:00:00');
```
- 3、用户角色关系表
```sql
CREATE TABLE `sys_user_role` (
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户ID',
  `role_id` bigint(20) DEFAULT NULL COMMENT '角色ID'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户角色关联表';

- 用户角色关系表中添加如下三条记录
INSERT INTO `sys_user_role` VALUES ('1', '1');
INSERT INTO `sys_user_role` VALUES ('1', '2');
INSERT INTO `sys_user_role` VALUES ('1001', '2');
```
#### v2.10
（1）权限表sys_privilege的结构如下
```sql
CREATE TABLE `sys_privilege` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '权限ID',
  `privilege_name` varchar(50) DEFAULT NULL COMMENT '权限名称',
  `privilege_url` varchar(200) DEFAULT NULL COMMENT '权限URL',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='权限表';

- 向数据表权限表中输入如下数据
INSERT INTO `sys_privilege` VALUES ('1', '用户管理', '/users');
INSERT INTO `sys_privilege` VALUES ('2', '角色管理', '/roles');
INSERT INTO `sys_privilege` VALUES ('3', '系统日志', '/logs');
INSERT INTO `sys_privilege` VALUES ('4', '人员维护', '/persons');
INSERT INTO `sys_privilege` VALUES ('5', '单位维护', '/companies');
```
 （2）角色权限关联表sys_role_privilege，表结构如下
 ```sql
CREATE TABLE `sys_role_privilege` (
  `role_id` bigint(20) DEFAULT NULL COMMENT '角色ID',
  `privilege_id` bigint(20) DEFAULT NULL COMMENT '权限ID'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色权限关联表';

- 向角色权限关联表中输入如下的记录
INSERT INTO `sys_role_privilege` VALUES ('1', '1');
INSERT INTO `sys_role_privilege` VALUES ('1', '3');
INSERT INTO `sys_role_privilege` VALUES ('1', '2');
INSERT INTO `sys_role_privilege` VALUES ('2', '4');
INSERT INTO `sys_role_privilege` VALUES ('2', '5');
```

# Run   
src\main\java\anlzou\com\test\\*

# Update
#### v1.00
> 2020年3月30日23点04分

- MyBatis深入了解，完善项目结构
- 添加了增删改查
- 成功运行与调试

> 2020年4月7日18点58分

- MyBatis动态SQL练习
    - if用法
        - 1、在where条件中使用if
        - 2、在update中使用if
        - 3、insert 动态插入列中使用 if
    - choose 用法
    - where用法
    - set 用法
    - trim 用法
        - 1、用trim标签替代where
        - 2、用trim标签替代set
    - foreach 用法
        - 1、foreach实现in集合
        - 2、foreach实现批量输入数据 
        
#### v2.00
> 2020年4月14日17点52分

- 使用Mybatis 代码生成器
    - MyBatis generator
    - mybatis高级查询
        - 一对一映射  
#### v2.10
> 2020年4月20日16点35分
- ...
    - ...
        - 一对多映射