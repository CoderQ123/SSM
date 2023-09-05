### 第一章 初识Mybatis
#### 1.1 框架概述
* 程序中的框架【代码半成品】
  * Mybatis　:　持久层框架【dao层】 
  * SpringMVC:　:　控制层框架【Servlet】  
  * Spring　:　全能

#### 1.2 Mybatis简介
* Mybatis是一个半自动化持久层ORM(Object Relation Mapping)框架
* 将java中的对象与数据库中的表建立映射关系，优势：操作Java中的对象，就可以影响到数据库中表的数据
> java中一个Bean对应数据库的一张表

> java中一个对象对应表中的一条记录
* Hibernate是一个全自动化(无需手写SQL)
* Mybatis与JDBC对比
> JDBC与JAVA代码耦合度高
* JavaPojo(palin old java object)普通老实java对象
  * JavaBean 等同于 Pojo

### 第二章 搭建Mybatis框架
> * 导入jar包
> * 编写核心配置文件
>   * 位置resources
>   * 名称mybatis-config.xml
> * 书写相关接口以及映射文件
>   * 映射文件位置resources/mapper
>   * 映射文件名称XXXMapper.xml
>     * 映射文件注意事项
>     * 映射名与接口名一致
>     * 映射文件nameSpace与接口全类名一致
>     * 映射文件Sql的id与接口的方法名一致
> * 测试【sqlSession】

### 第三章 Mapper中SQL语句的参数问题
* 语法#{}和${}介绍和区别
  * #{} 占位符+动态赋值
  * ${} 字符串拼接 + 动态赋值
  * #{} 可以防止sql注入攻击，但是占位符只能占值，不能代替关键字（例如default）
  * ${} 存在sql注入攻击，但是存在sql中可以存在关键字
  > insert into t_users values DEFAULT,

* 传入参数类型
  * 接受单个基本类型参数 ${} #{key} key名为任意 
  * 接受实体类的对象 ${} #{key} key名为对象属性名
  * 接受map类参数 #{} ${key} key 名为map中key名
  * 散列多个基本类型参数 #{} ${} 是无法根据参数名取值
    * 方案一：散列的参数封装到map中
    * 方案二：添加注解声明值@Param
