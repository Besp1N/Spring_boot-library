package com.kacper.library.controller;

import com.kacper.library.model.Library;
import com.kacper.library.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("library")
public class LibraryController
{
    final LibraryService libraryService;

    @Autowired
    public LibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }


    @GetMapping("get/all")
    public ResponseEntity<List<Library>> getAll() {
       return libraryService.getAll();
    }

    @PostMapping("add")
    public ResponseEntity<String> add(@RequestParam String name) {
        return libraryService.addLibrary(name);
    }
}
