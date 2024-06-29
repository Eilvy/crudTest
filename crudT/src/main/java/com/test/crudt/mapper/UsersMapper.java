package com.test.crudt.mapper;


import com.test.crudt.pojo.Users;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UsersMapper {
    @Insert("insert into users(name,gender,phone) values(#{name},#{gender},#{phone})")
    void insert(Users user);

    @Select("select * from users")  //查询所有用户信息
    List<Users> list();

    @Delete("delete from users where id = #{id}")  //删除用户信息
    void delete(int id);

    @Update("update users set name = #{name},gender = #{gender},phone = #{phone} where id = #{id}")  //更新用户信息
    void update(Users user);
}
