# JEE_Project1
#### Maven+MyBatis练习

# DataBase
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