package com.example.authorservice.domain;

import lombok.*;

@Setter
@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author {
    private Long id;
    private String name;
}
