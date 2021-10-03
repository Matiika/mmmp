package com.jwd.dao.repository.impl;

import com.jwd.dao.domain.User;
import com.jwd.dao.domain.UserDto;
import com.jwd.dao.repository.UserDao;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    // stubbed database

    private List<User> stubbedUsers = new ArrayList<>();

    public UserDaoImpl() {
        initStubbedUsers();
    }

    private void initStubbedUsers() {
        stubbedUsers.add(new User(1L, "abra","Andrei","Rohau", "111"));
        stubbedUsers.add(new User(2L, "bara","Egor","Pysh", "222"));
        stubbedUsers.add(new User(3L, "cobra","Dima","Falei", "333"));
    }

    @Override
    public List<UserDto> getUsers() {
        //validate parameters from higher layer
        final List<User> users = stubbedUsers;
        final List<UserDto> userDtos = new ArrayList<>();
        for (final User daoUserDto : users){
            userDtos.add(new UserDto(daoUserDto));
        }
        return userDtos;
    }

    @Override
    public UserDto saveUser(User user) {
        //validate parameters from higher layer
        //do not  forget to generate user id
        stubbedUsers.add(user); // execute query saving user to database
        return new UserDto(user);
    }
}
