package com.hetic.restapidemo.controller;

import com.hetic.restapidemo.dto.Subject;
import com.hetic.restapidemo.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/subjects")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public Subject create(@RequestBody Subject subject) {
        return subjectService.save(subject);
    }

    @GetMapping("")
    public List<Subject> findAll() {
        return subjectService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Subject> findById(@PathVariable Long id) {
        Optional<Subject> subject = subjectService.findById(id);
        if (subject.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Book not found");
        }
        return subject;
    }
    @DeleteMapping("/{id}")
    public Long deleteById(@PathVariable Long id) {
        subjectService.deleteById(id);
        return id;
    }
}
