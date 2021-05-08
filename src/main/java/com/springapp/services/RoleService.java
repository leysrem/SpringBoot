package com.springapp.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springapp.entities.Role;
import com.springapp.repositories.RoleRepository;


@Service
public class RoleService {

    @Autowired
    private RoleRepository repository;

    public Map<Long, String> getTemplateList(){
        Map<Long, String> result = new HashMap<>();

        for (Role item : this.repository.findAll()) {
            result.put(item.getId(), item.getName());
        }

        return result;
    }

    public Role findRole(final Long roleId) {
        return this.repository.findById(roleId).orElse(null);
    }
    
}
