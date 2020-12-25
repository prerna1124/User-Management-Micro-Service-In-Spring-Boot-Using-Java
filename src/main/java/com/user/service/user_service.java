package com.user.service;


import com.user.model.user_model;
import com.user.repository.user_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class user_service
{
    @Autowired
    private user_repository repo;

    public user_model save_user(user_model u)
    {
        return repo.save(u);

    }

    public List<user_model> find_all_users()
    {
        return repo.findAll();
    }

    public Optional<user_model> find_user_by_id(int id)
    {
        return repo.findById(id);
    }
}
