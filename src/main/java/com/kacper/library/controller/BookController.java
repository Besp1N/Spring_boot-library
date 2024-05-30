package com.kacper.library.controller;

import com.kacper.library.repository.BookRepository;
import com.kacper.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("book")
public class BookController
{
    final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("add")
    public ResponseEntity<String> addBook(
            @RequestParam String title,
            @RequestParam String author,
            @RequestParam Integer libId
    ) {
        return bookService.addBook(title, author, libId);
    }

}
