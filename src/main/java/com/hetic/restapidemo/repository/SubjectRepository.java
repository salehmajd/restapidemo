package com.hetic.restapidemo.repository;

import com.hetic.restapidemo.dto.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
