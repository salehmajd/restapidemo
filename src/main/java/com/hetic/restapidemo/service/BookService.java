package com.hetic.restapidemo.service;

import com.hetic.restapidemo.dto.Book;
import com.hetic.restapidemo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book save(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> findAll(){
        return bookRepository.findAll();
    }
}
