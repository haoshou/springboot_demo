package com.example.web.domain;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.DateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserEntityRepositoryTest {

    @Autowired
    private UserEntityRepository userEntityRepository;

    @Test
    public void test() {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String formattedDate = dateFormat.format(date);

        userEntityRepository.save(new UserEntity("a1", "password1", "a1@qq.com", "a1nick", formattedDate));
        userEntityRepository.save(new UserEntity("a2", "password2", "a2@qq.com", "a2nick", formattedDate));
        userEntityRepository.save(new UserEntity("a3", "password3", "a3@qq.com", "a3nick", formattedDate));

        Assert.assertEquals(3, userEntityRepository.findAll().size());
    }
}