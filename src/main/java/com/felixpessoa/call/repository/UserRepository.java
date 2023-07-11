package com.felixpessoa.call.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felixpessoa.call.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
