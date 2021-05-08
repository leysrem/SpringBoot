package com.springapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springapp.entities.Book;
import com.springapp.entities.User;
import com.springapp.repositories.UserRepository;



@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return this.repository.findAll();
	}
	
	public User findUser(long id) {
		return this.repository.findById(id).orElse(null);

	}


	public void generateUsers(final Integer nb) {
		for (int i = 0; i < nb; i++) {
			User user = new User();
			Book book = new Book();
			user.setFirstname("fname"+i);
			user.setLastname("Lname"+i);

			this.repository.save(user);
		}
	}
}
