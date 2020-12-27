package com.user.controller;

import com.user.exception.ResourceNotFoundException;
import com.user.model.user_model;
import com.user.repository.user_repository;
import com.user.service.user_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<user_model> find_user_by_id(@PathVariable Integer id)
    {
        return service.find_user_by_id(id);
    }

    @PostMapping("deleteUser/{id}")
    public void delete_user(@PathVariable Integer id)
    {
        service.delete_user(id);
    }

    @PostMapping("updateUser/{id}")
    public user_model update_user(@PathVariable Integer id,@RequestBody user_model user)
    {
        return service.update_user(id,user);
    }

}
