package com.example.web.controller;

import com.example.web.domain.User;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class WebController {

    @RequestMapping("/getUser")
    public User getUser() {
        User user = new User();
        user.setName("");
        user.setAge(0);
        user.setPassWord("");
        return user;
    }

    @RequestMapping("/saveUser")
    public void saveUser(@Valid User user, BindingResult result) {
        if (result.hasErrors()) {
            List<ObjectError> list = result.getAllErrors();
            for (ObjectError objectError : list) {
                System.out.println(objectError.getCode() + ":" + objectError.getDefaultMessage());
            }
        }
    }
}
