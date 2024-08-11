package com.library.service;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookServiceTest {

    private ApplicationContext context;
    private BookService bookService;

    @Before
    public void setUp() {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        bookService = (BookService) context.getBean("bookService");
    }

    @Test
    public void testDisplayBooks() {
        // Method to verify logging aspect
        bookService.displayBooks();

        // Add assertions or verifications as needed
        // Example: Check console output or use a mock to verify logging behavior
    }
}
