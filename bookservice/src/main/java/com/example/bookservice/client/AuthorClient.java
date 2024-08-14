package com.example.bookservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.bookservice.domain.Author;

@FeignClient(name = "author-service", url = "http://localhost:8081")
public interface AuthorClient {
    @GetMapping("/authors/{id}")
    Author getAuthorById(@PathVariable("id") Long id);
}
