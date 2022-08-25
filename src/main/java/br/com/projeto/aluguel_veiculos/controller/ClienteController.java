package br.com.projeto.aluguel_veiculos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.projeto.aluguel_veiculos.model.ClienteModel;
import br.com.projeto.aluguel_veiculos.repository.ClienteRepository;

@Controller
public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepo;

    @GetMapping("/cliente")
    public String cliente(){
        return "client";
    }

    @PostMapping("/cliente")
    public String clientesave(ClienteModel cliente){
        clienteRepo.save(cliente);
        return"redirect:/cliente";
    }


}