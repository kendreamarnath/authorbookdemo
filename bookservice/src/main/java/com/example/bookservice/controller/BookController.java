
package com.example.bookservice.controller;

import com.example.bookservice.client.AuthorClient;
import com.example.bookservice.dto.BookDTO;
import com.example.bookservice.domain.Book;
import com.example.bookservice.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {
      @Autowired
    private final BookRepository bookRepository;

     @Autowired
    private final AuthorClient authorClient;

    public BookController(BookRepository bookRepository, AuthorClient authorClient) {
        this.bookRepository = bookRepository;
        this.authorClient = authorClient;
    }

    @GetMapping("/books")
    public List<BookDTO> getAllBooks() {
        List<Book> books = bookRepository.findAll();
        List<BookDTO> bookDtos = new ArrayList<>();
        for (Book book : books) {
            BookDTO bookDto = new BookDTO(book.getId(),book.getTitle(),authorClient.getAuthorById(book.getId()));
            bookDtos.add(bookDto);
        }
        return bookDtos;
    }

    @GetMapping("/books/{id}")
    public BookDTO getBookById(@PathVariable Long id) {
        Book book = bookRepository.findById(id);
        BookDTO dto=new BookDTO(book.getId(),book.getTitle(),authorClient.getAuthorById(book.getId()));
        return dto;
    }

}
