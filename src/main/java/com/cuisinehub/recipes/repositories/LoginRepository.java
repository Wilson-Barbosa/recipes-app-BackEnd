package com.cuisinehub.recipes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cuisinehub.recipes.entities.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Integer> {
    
}
