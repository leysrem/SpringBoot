package com.springapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.springapp.entities.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{


}
