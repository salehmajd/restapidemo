package com.hetic.restapidemo.controller;

import com.hetic.restapidemo.dto.Book;
import com.hetic.restapidemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public Book create(@RequestBody Book book) {
        return bookService.save(book);
    }

    @GetMapping("")
    public List<Book> findAll() {
        return bookService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Book> findById(@PathVariable Long id) {
        Optional<Book> book = bookService.findById(id);
        System.out.println(book);
        if (book.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Book not found");
        }
        return book;
    }
    @DeleteMapping("/{id}")
    public Long deleteById(@PathVariable Long id) {
        bookService.deleteById(id);
        return id;
    }
}
