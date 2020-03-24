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