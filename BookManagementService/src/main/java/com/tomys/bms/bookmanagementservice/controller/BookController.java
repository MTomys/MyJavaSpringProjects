package com.tomys.bms.bookmanagementservice.controller;
import com.tomys.bms.bookmanagementservice.entity.Book;
import com.tomys.bms.bookmanagementservice.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class BookController {
    private BookService bookService;


    public BookController(BookService bookService) {
        super();
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public String listBooks(Model model) {
        model.addAttribute("books", bookService.getBooks());
        return "books";
    }

    @GetMapping("/books/new")
    public String createBookForm(Model model){
        Book book = new Book();
        model.addAttribute("book", book);
        return "create_book";
    }

    @PostMapping("/books")
    public String saveBook(@ModelAttribute("book") Book book) {
        if (book.getBookName() == null) {
            System.out.println("bookName null");
        }
        if (book.getAuthorName() == null) {
            System.out.println("Author Name null");
        }
        if (book.getIsbn10() == null) {
            System.out.println("isbn 10 null");
        }
        if (book.getIsbn13() == null) {
            System.out.println("isbn 13 null");
        }

        this.bookService.saveBook(book);
        return "redirect:/books";
    }



}
