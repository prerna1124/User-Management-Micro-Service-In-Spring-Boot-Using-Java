package com.user.repository;

import com.user.model.user_model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface user_repository extends JpaRepository<user_model,Integer>
{

}
