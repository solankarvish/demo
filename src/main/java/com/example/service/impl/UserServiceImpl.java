package com.example.service.impl;

import com.example.model.User;
import com.example.repo.UserRepository;
import com.example.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserServiceI {


//    // @Autowired // constructor dependency injection
//    public UserServiceImpl(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    public UserRepository getUserRepository() {
//        return userRepository;
//    }
//
//    //@Autowired // setter Dependency injection
//    public void setUserRepository(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//IOC - Inversion of Control, spring bean life cycle ,DI Injection

    //DI - Dependency Injection -setter,constructor,feild dependency injection

    @Autowired // FI Dependency injection
    private UserRepository userRepository;

    @Override
    public User createUser1(User user) {
        return null;
    }

    @Override
    public User updateUser(User user, Long userId) {
        return null;
    }

    @Override
    public User getSingleUser(Long userId) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public void deleteUser(Long userId) {

    }
}
