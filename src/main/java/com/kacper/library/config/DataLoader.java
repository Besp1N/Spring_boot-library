package com.kacper.library.config;

import com.kacper.library.model.Book;
import com.kacper.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner
{
    final BookRepository bookRepository;

    @Autowired
    public DataLoader(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Book book = new Book();
        book.setAuthor("Kacper");
        book.setTitle("Java Programming");

        bookRepository.save(book);
    }
}
