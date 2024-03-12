package com.hetic.restapidemo.service;

import com.hetic.restapidemo.dto.Student;
import com.hetic.restapidemo.dto.Subject;
import com.hetic.restapidemo.repository.StudentRepository;
import com.hetic.restapidemo.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    public Subject save(Subject subject) {
        return subjectRepository.save(subject);
    }

    public List<Subject> findAll(){
        return subjectRepository.findAll();
    }

    public Optional<Subject> findById(Long id) {
        return subjectRepository.findById(id);
    }

    public void deleteById(Long id) {
        subjectRepository.deleteById(id);
    }
}
