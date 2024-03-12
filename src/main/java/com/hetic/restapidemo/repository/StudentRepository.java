package com.hetic.restapidemo.repository;

import com.hetic.restapidemo.dto.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
