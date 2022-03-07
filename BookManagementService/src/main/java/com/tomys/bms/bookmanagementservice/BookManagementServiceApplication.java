package com.tomys.bms.bookmanagementservice;

import com.tomys.bms.bookmanagementservice.entity.Book;
import com.tomys.bms.bookmanagementservice.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookManagementServiceApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BookManagementServiceApplication.class, args);
    }

    @Autowired
    private BookRepository bookRepository;


    @Override
    public void run(String... args) throws Exception {
    }
}
