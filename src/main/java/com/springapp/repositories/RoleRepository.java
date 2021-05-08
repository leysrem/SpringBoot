package com.springapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springapp.entities.Role;


public interface RoleRepository extends JpaRepository<Role, Long> {

}
