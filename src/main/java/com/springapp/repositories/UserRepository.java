package com.springapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springapp.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
