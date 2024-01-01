package com.niit.stackroute.springmysql.service;

import com.niit.stackroute.springmysql.model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();
    public User saveUser(User user);
}
