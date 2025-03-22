package com.example.SpringProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringProject.Entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {}
