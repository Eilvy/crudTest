package com.test.crudt.service;


import com.test.crudt.pojo.Users;

import java.util.List;

public interface UsersService {

    void add(Users user);

    List<Users> list();

    void delete(int id);

    void update(Users user);
}
