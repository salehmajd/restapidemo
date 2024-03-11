package com.hetic.restapidemo.repository;

import com.hetic.restapidemo.dto.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
