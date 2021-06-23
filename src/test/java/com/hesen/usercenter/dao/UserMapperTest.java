package com.hesen.usercenter.dao;

import com.hesen.usercenter.dao.user.UserMapper;
import com.hesen.usercenter.domain.entity.user.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void insertUser() {
        User user = new User(null, "t", "t", "t", "t", new Date(), new Date(), 10);
        userMapper.insertSelective(user);
    }
}
