package com.kacper.library.service;

import com.kacper.library.model.Book;
import com.kacper.library.model.Library;
import com.kacper.library.repository.BookRepository;
import com.kacper.library.repository.LibraryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService
{
    final BookRepository bookRepository;
    final LibraryRepository libraryRepository;

    public BookService(BookRepository bookRepository, LibraryRepository libraryRepository, LibraryService libraryService) {
        this.bookRepository = bookRepository;
        this.libraryRepository = libraryRepository;
    }

    public ResponseEntity<String> addBook(String title, String author, int libId) {
        Optional<Library> library = libraryRepository.findById(libId);

        if (library.isEmpty()) {
            return new ResponseEntity<>("Library not found", HttpStatus.NOT_FOUND);
        }

        Book book = new Book();
        book.setTitle(title);
        book.setAuthor(author);
        book.setLibrary(library.get());
        bookRepository.save(book);
        return new ResponseEntity<>("Book added successfully", HttpStatus.CREATED);
    }

    public ResponseEntity<List<Book>> getAllBooks() {
        return new ResponseEntity<>(bookRepository.findAll(), HttpStatus.OK);
    }
}
