package com.kacper.library.service;

import com.kacper.library.model.Library;
import com.kacper.library.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryService
{
    final private LibraryRepository libraryRepository;

    @Autowired
    public LibraryService(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    public ResponseEntity<List<Library>> getAll() {
       return new ResponseEntity<>(libraryRepository.findAll(), HttpStatus.OK);
    }

    public ResponseEntity<String> addLibrary(String name) {
        Library library = new Library();
        library.setName(name);
        libraryRepository.save(library);
        return new ResponseEntity<>("Saved" ,HttpStatus.CREATED);
    }
}
