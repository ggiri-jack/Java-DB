package com.example.demo.book.service;

import com.example.demo.book.db.entity.BookEntity;
import com.example.demo.book.db.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }


    public BookEntity create(BookEntity book){
        return bookRepository.save(book);
    }


    public List<BookEntity> findAll(){
        return bookRepository.findAll();
    }
}
