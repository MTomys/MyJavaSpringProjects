package com.tomys.bms.bookmanagementservice.entity;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "book_name", nullable = false)
    private String bookName;

    @Column(name = "isbn_10", nullable = false)
    private Long isbn10;

    @Column(name = "isbn_13", nullable = false)
    private Long isbn13;

    @Column(name = "author_name", nullable = false)
    private String authorName;

    public Book() {

    }

    public Book(String bookName, Long isbn10, Long isbn13, String authorName) {
        this.bookName = bookName;
        this.isbn10 = isbn10;
        this.isbn13 = isbn13;
        this.authorName = authorName;
    }

    public Long getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public Long getIsbn10() {
        return isbn10;
    }

    public Long getIsbn13() {
        return isbn13;
    }

    public String getAuthorName() {
        return authorName;
    }
}
