package com.tomys.bms.bookmanagementservice.service;

import com.tomys.bms.bookmanagementservice.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> getBooks();
    Book saveBook(Book book);
    Book updateBook(Book book);
    Book getBookById(Long id);
    void deleteBookById(Long id);
}
