## 注意事项

本项目仅用于测试数据库crud功能，较为简陋

创建新用户没有检索用户名重复问题（非必要）

更改用户信息未设置单个项目修改，只能全部项目进行修改

查询用户仅能查询所有用户信息，不支持单次查询

另外因为是期末周了，复习进度有点紧，其他完善功能暂时未开发

## 总览

​	本项目用于基础的基于`java`后端的数据库增删改查

​	采用Restful风格的接口编写

  技术栈采用SpringBoot的web框架,Mybatis,Lombok

  数据库采用Mysql

### 增加用户

采用Post请求

传入数据的方式为`json`格式

传入后存储在Users对象中，进行下一步写入数据库操作

![image-20240629114417587](https://github.com/Eilvy/crudTest/blob/master/pic/%E5%B1%8F%E5%B9%95%E6%88%AA%E5%9B%BE%202024-06-29%20114414.png)

返回值为

![image-20240629114547626](https://github.com/Eilvy/crudTest/blob/master/pic/%E5%B1%8F%E5%B9%95%E6%88%AA%E5%9B%BE%202024-06-29%20114545.png)

数据库中

![image-20240629114851490](https://github.com/Eilvy/crudTest/blob/master/pic/%E5%B1%8F%E5%B9%95%E6%88%AA%E5%9B%BE%202024-06-29%20114849.png)

### 删除用户

用Delete请求

需服务端传入要删除的用户id

请求和返回结果如下

![image-20240629114828310](https://github.com/Eilvy/crudTest/blob/master/pic/%E5%B1%8F%E5%B9%95%E6%88%AA%E5%9B%BE%202024-06-29%20114825.png)

数据库变为

![image-20240629114906646](https://github.com/Eilvy/crudTest/blob/master/pic/%E5%B1%8F%E5%B9%95%E6%88%AA%E5%9B%BE%202024-06-29%20114905.png)

### 检索所有用户

Get请求

检索数据库已存在的所有用户的所有信息

请求和返回结果为

![image-20240629115043886](https://github.com/Eilvy/crudTest/blob/master/pic/%E5%B1%8F%E5%B9%95%E6%88%AA%E5%9B%BE%202024-06-29%20115039.png)

### 更改用户信息

Put请求

更改用户信息

更改前数据库

![image-20240629115145946](https://github.com/Eilvy/crudTest/blob/master/pic/%E5%B1%8F%E5%B9%95%E6%88%AA%E5%9B%BE%202024-06-29%20115134.png)

请求和返回结果为

![image-20240629115543679](https://github.com/Eilvy/crudTest/blob/master/pic/%E5%B1%8F%E5%B9%95%E6%88%AA%E5%9B%BE%202024-06-29%20115530.png)

数据库为

![image-20240629115555156](https://github.com/Eilvy/crudTest/blob/master/pic/%E5%B1%8F%E5%B9%95%E6%88%AA%E5%9B%BE%202024-06-29%20115548.png)


