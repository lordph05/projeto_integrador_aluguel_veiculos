package br.com.projeto.aluguel_veiculos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import br.com.projeto.aluguel_veiculos.model.UserModel;
//import br.com.projeto.aluguel_veiculos.repository.UserRepository;

@Controller
public class UserController {
    

    @Autowired
   // private UserRepository useRepository;


    @GetMapping(value="/user")
    public String user(){
        return "formUser";
    }
     
    /*@PostMapping(value="/user")
    public String user(UserModel user){
        useRepository.save(user);
        return "redirect:/user";
    }*/
   
}
