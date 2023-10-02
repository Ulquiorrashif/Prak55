package com.example.prak5.controllers;

import com.example.prak5.entity.Book;
import com.example.prak5.repository.BookRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Data
@AllArgsConstructor
//@RequestMapping("/book")
@CrossOrigin("*")
public class BookController {
    BookRepository bookRepository;
    @GetMapping("/show")
    public List get(){
        return bookRepository.findAll();
    }
    @PostMapping("/add")
    public void add(Book book){
        System.out.println(book);
        bookRepository.save(book);
    }
}
