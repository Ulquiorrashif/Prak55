package com.example.prak5.controllers;

import com.example.prak5.entity.Book;
import com.example.prak5.repository.BookRepository;
import com.example.prak5.service.BookService;
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
    BookService bookService;
    @GetMapping("/show")
    public List get(){
        System.out.println(bookService.getAll().get(0));

        return bookService.getAll();
    }
    @PostMapping("/add")
    public void add(Book book){
        System.out.println(book);
        bookService.save(book);
    }

}
