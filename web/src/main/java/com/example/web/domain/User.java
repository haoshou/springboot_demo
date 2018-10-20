package com.example.web.domain;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class User {

    @NotEmpty(message = "用户名不能为空")
    private String name;

    @Max(value = 100, message = "年龄不能大于100岁")
    @Min(value = 0, message = "年龄不能小于0岁")
    private int age;

    @NotEmpty(message = "密码不能为空")
    @Length(message = "密码长度不能小于6位", min = 6)
    private String passWord;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
