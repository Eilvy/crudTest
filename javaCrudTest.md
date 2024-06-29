## 总览

​	本项目用于基础的基于`java`后端的数据库增删改查

​	采用Restful风格的接口编写

### 增加用户

采用Post请求

传入数据的方式为`json`格式

传入后存储在Users对象中，进行下一步写入数据库操作

![image-20240629114417587](C:\Users\L\AppData\Roaming\Typora\typora-user-images\image-20240629114417587.png)

返回值为

![image-20240629114547626](C:\Users\L\AppData\Roaming\Typora\typora-user-images\image-20240629114547626.png)

数据库中

![image-20240629114851490](C:\Users\L\AppData\Roaming\Typora\typora-user-images\image-20240629114851490.png)

### 删除用户

用Delete请求

需服务端传入要删除的用户id

请求和返回结果如下

![image-20240629114828310](C:\Users\L\AppData\Roaming\Typora\typora-user-images\image-20240629114828310.png)

数据库变为

![image-20240629114906646](C:\Users\L\AppData\Roaming\Typora\typora-user-images\image-20240629114906646.png)

### 检索所有用户

Get请求

检索数据库已存在的所有用户的所有信息

请求和返回结果为

![image-20240629115043886](C:\Users\L\AppData\Roaming\Typora\typora-user-images\image-20240629115043886.png)

### 更改用户信息

Put请求

更改用户信息

更改前数据库

![image-20240629115145946](C:\Users\L\AppData\Roaming\Typora\typora-user-images\image-20240629115145946.png)

请求和返回结果为

![image-20240629115543679](C:\Users\L\AppData\Roaming\Typora\typora-user-images\image-20240629115543679.png)

数据库为

![image-20240629115555156](C:\Users\L\AppData\Roaming\Typora\typora-user-images\image-20240629115555156.png)

## 注意事项

本项目仅用于测试数据库crud功能，较为简陋

创建新用户没有检索用户名重复问题（非必要）

更改用户信息未设置单个项目修改，只能全部项目进行修改

查询用户仅能查询所有用户信息，不支持单次查询