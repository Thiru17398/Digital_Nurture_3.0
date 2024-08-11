package com.library.service;

import org.springframework.stereotype.Service;
import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class BookService {
    private final BookRepository bookRepository;

    // Constructor injection
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBooks() {
        System.out.println("Displaying books:");
        bookRepository.findAll().forEach(System.out::println);
    }
}
