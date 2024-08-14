package com.example.bookservice.dto;
import com.example.bookservice.domain.Author;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;


public record BookDTO(
        Long id,
        @NotEmpty(message = "Title should not be empty")
        String title,
        @NotNull(message = "Author should not be null")
        Author author
) {
}