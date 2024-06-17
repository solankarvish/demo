package com.example.service;

import com.example.model.User;

import java.util.List;

public interface UserServiceI {

    //CURD

    //CREATE
    User createUser1(User user);

    //UPDATE
    User updateUser(User user, Long userId);

    //GET Single data
    User getSingleUser(Long userId);

    //GET All data
    List<User> getAllUsers();

    //DELETE
    void deleteUser(Long userId);


}
