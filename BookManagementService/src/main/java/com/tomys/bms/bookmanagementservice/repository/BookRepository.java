package com.tomys.bms.bookmanagementservice.repository;

import com.tomys.bms.bookmanagementservice.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

    

}
