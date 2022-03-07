package com.tomys.bms.bookmanagementservice.service.impl;

import com.tomys.bms.bookmanagementservice.entity.Book;
import com.tomys.bms.bookmanagementservice.repository.BookRepository;
import com.tomys.bms.bookmanagementservice.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getBooks() {
        return this.bookRepository.findAll();
    }
}
