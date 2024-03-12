package com.hetic.restapidemo.controller;

import com.hetic.restapidemo.dto.Book;
import com.hetic.restapidemo.dto.Student;
import com.hetic.restapidemo.service.BookService;
import com.hetic.restapidemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public Student create(@RequestBody Student student) {
        return studentService.save(student);
    }

    @GetMapping("")
    public List<Student> findAll() {
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Student> findById(@PathVariable Long id) {
        Optional<Student> student = studentService.findById(id);
        if (student.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Book not found");
        }
        return student;
    }
    @DeleteMapping("/{id}")
    public Long deleteById(@PathVariable Long id) {
        studentService.deleteById(id);
        return id;
    }
}
