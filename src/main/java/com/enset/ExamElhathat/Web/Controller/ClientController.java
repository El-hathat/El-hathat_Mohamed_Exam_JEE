package com.enset.ExamElhathat.Web.Controller;

import com.enset.ExamElhathat.DAO.entities.Client;
import com.enset.ExamElhathat.DAO.repositories.ClientRepository;
import com.enset.ExamElhathat.DTO.ClientDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;



@RestController
@RequestMapping("/api/clients")
public class ClientController {

    @Autowired
    private  ClientRepository clientRepository;



    @PostMapping
    public Client saveClient(@RequestBody Client client) {
        return clientRepository.save(client);
    }

    @GetMapping("/{id}")
    public Client getClient(@PathVariable Long id) {
        return clientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Client introuvable"));
    }

    @GetMapping
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }
}

