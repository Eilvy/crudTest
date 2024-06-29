package com.test.crudt.controller;


import com.test.crudt.pojo.Result;
import com.test.crudt.pojo.Users;
import com.test.crudt.service.UsersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    //Post请求方法，用于创建用户
    @PostMapping
    //接收请求体中的用户信息(用Users类接收)
    public Result add(@RequestBody Users user){
        log.info("创建用户："+user.getName());
        //调用usersService中的add方法，创建用户
        usersService.add(user);
        return Result.success();
    }

    //Get请求方法，用于查询所有用户
    @GetMapping
    public Result list(){
        log.info("查询所有用户");
        //调用usersService中的list方法，查询所有用户
        //将查询到的用户用List<Users>保存
        List<Users> usersList = usersService.list();
        //返回查询到的用户列表
        return Result.success(usersList);
    }

    //Delete请求方法，用于删除用户
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable("id") Integer id){
        log.info("删除用户id="+id);
        //调用usersService中的delete方法，删除用户
        usersService.delete(id);
        return Result.success();
    }

    //Put请求方法，用于更新用户信息
    @PutMapping()
    //接收请求体中的用户信息(用Users类接收)和用户id(Integer类型)
    public Result update( @RequestBody Users user){
        log.info("更新用户id="+user.getId());
        //调用usersService中的update方法，更新用户
        usersService.update(user);
        return Result.success();
    }
}
