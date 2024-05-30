//package com.kacper.library.config;
//
//import com.kacper.library.model.Book;
//import com.kacper.library.model.Library;
//import com.kacper.library.repository.BookRepository;
//import com.kacper.library.repository.LibraryRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class DataLoader implements CommandLineRunner
//{
//    final BookRepository bookRepository;
//    final LibraryRepository libraryRepository;
//
//    @Autowired
//    public DataLoader(BookRepository bookRepository, LibraryRepository libraryRepository) {
//        this.bookRepository = bookRepository;
//        this.libraryRepository = libraryRepository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        Book book = new Book();
//        book.setAuthor("Kacper");
//        book.setTitle("Java Programming");
//
//        Library library = new Library();
//        library.setName("Lib1");
//        library.addBook(book);
//
//        libraryRepository.save(library);
//    }
//}
