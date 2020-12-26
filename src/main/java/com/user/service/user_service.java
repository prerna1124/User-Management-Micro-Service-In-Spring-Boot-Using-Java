package com.user.service;


import com.user.model.user_model;
import com.user.repository.user_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

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

    public void delete_user(int id)
    {
        repo.deleteById(id);
    }

    public user_model update_user(int id,user_model user)
    {
        Optional<user_model> exist = repo.findById(id);
        user_model existingUser = exist.get();
        if(user.getAge()!=0)
            existingUser.setAge(user.getAge());
        if(user.getEmail_address()!=null)
            existingUser.setEmail_address(user.getEmail_address());
        if(user.getPhone_no()!=null)
            existingUser.setPhone_no(user.getPhone_no());
        return repo.save(existingUser);
    }

}
