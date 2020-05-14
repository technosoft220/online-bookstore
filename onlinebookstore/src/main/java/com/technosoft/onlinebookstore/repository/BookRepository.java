package com.technosoft.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.technosoft.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
