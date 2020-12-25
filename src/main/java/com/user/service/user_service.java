package com.user.service;


import com.user.model.user_model;
import com.user.repository.user_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class user_service
{
    @Autowired
    private user_repository repo;

    public user_model save_user(user_model u)
    {
        user_model res = repo.save(u);
        return res;
    }
}
