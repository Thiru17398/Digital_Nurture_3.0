package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        // Load Spring context from XML configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Print statement to indicate that the application context is loaded
        System.out.println("Spring IoC Container is configured and loaded.");

        // Retrieve the BookService bean
        BookService bookService = (BookService) context.getBean("bookService");

        // Print statement to indicate that the BookService bean is retrieved
        System.out.println("BookService bean is retrieved from the Spring IoC Container.");

        // Call method to display books
        System.out.println("Displaying books:");
        bookService.displayBooks();
    }
}
