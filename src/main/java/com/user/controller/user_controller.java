package com.user.controller;

import com.user.model.user_model;
import com.user.service.user_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/findAllUsers")
    public List<user_model> find_all_users()
    {
        return service.find_all_users();
    }

    @GetMapping("/findUser/{id}")
    public Optional<user_model> find_user_by_id(@PathVariable Integer id)
    {
        return service.find_user_by_id(id);
    }

    @PostMapping("deleteUser/{id}")
    public void delete_user(@PathVariable Integer id)
    {
        service.delete_user(id);
    }

}
