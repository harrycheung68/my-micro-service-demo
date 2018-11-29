package com.itmuch.cloud.service.impl;

import com.itmuch.cloud.dao.UserMapper;
import com.itmuch.cloud.pojo.User;
import com.itmuch.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
