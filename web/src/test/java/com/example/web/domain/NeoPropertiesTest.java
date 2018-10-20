package com.example.web.domain;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NeoPropertiesTest {

    @Resource
    private NeoProperties neoProperties;

    @Test
    public void testNeoProperties() {
        Assert.assertEquals(neoProperties.getTitle(), "测试springboot");
        Assert.assertEquals(neoProperties.getDescription(), "测试成功");
    }

}