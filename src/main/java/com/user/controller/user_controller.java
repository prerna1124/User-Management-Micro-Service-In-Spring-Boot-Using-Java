package com.user.controller;

import com.user.model.user_model;
import com.user.service.user_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class user_controller
{
    @Autowired
    private user_service service;

    @PostMapping("/addUser")
    public user_model add_user(@RequestBody user_model u)
    {
        user_model res = service.save_user(u);
        return res;
    }

}