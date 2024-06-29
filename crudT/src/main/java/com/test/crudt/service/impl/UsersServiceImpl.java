package com.test.crudt.service.impl;

import com.test.crudt.mapper.UsersMapper;
import com.test.crudt.pojo.Users;
import com.test.crudt.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;
    @Override
    public void add(Users user) {
        usersMapper.insert(user);
    }

    @Override
    public List<Users> list() {

        return usersMapper.list();
    }

    @Override
    public void delete(int id) {
        usersMapper.delete(id);
    }

    @Override
    public void update(Users user) {
        usersMapper.update(user);
    }
}
