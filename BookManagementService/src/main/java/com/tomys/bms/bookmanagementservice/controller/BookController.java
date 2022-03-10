package com.tomys.bms.bookmanagementservice.controller;
import com.tomys.bms.bookmanagementservice.entity.Book;
import com.tomys.bms.bookmanagementservice.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


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
        this.bookService.saveBook(book);
        return "redirect:/books";
    }

    @GetMapping("/books/edit/{id}")
    public String editBookForm(@PathVariable Long id, Model model) {
        model.addAttribute("book", bookService.getBookById(id));
        return "edit_book";
    }

    @PostMapping("/books/{id}")
    public String updateBook(@PathVariable Long id, @ModelAttribute("book") Book book) {
        Book currentBook = bookService.getBookById(id);
        currentBook.setId(id);
        currentBook.setBookName(book.getBookName());
        currentBook.setAuthorName(book.getAuthorName());
        currentBook.setIsbn10(book.getIsbn10());
        currentBook.setIsbn13(book.getIsbn13());
        bookService.updateBook(currentBook);
        return "redirect:/books";
    }

    @GetMapping("/books/{id}")
    public String deleteBook(@PathVariable Long id) {
        bookService.deleteBookById(id);
        return "redirect:/books";
    }


}
