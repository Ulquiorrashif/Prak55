package com.example.prak5.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.management.ConstructorParameters;

@Entity
@RequiredArgsConstructor
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String author;
    private int numberAuthor;
    private String type;
    private int price;

    private String title;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", numberAuthor=" + numberAuthor +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", title='" + title + '\'' +
                '}';
    }
}
