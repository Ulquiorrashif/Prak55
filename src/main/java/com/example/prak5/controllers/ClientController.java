package com.example.prak5.controllers;

import com.example.prak5.entity.Book;
import com.example.prak5.entity.Client;
import com.example.prak5.repository.BookRepository;
import com.example.prak5.repository.ClientRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public class ClientController {
    ClientRepository clientRepository;
    @GetMapping("/cli/show")
    public List get(){
        return clientRepository.findAll();
    }
    @PostMapping("/cli/add")
    public void add(Client client){
        System.out.println(client);
        clientRepository.save(client);
    }
}
