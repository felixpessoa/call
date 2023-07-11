package com.felixpessoa.call.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felixpessoa.call.model.Chat;

public interface ChatRepository extends JpaRepository<Chat, Long>{
    
}

