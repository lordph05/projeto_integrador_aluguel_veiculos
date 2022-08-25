package br.com.projeto.aluguel_veiculos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.projeto.aluguel_veiculos.model.VeiculoModel;
import br.com.projeto.aluguel_veiculos.repository.VeiculoRepository;

@Controller
public class VeiculoController {
    
    @Autowired
    VeiculoRepository veiculoRepo;

    @GetMapping("/veiculo")
    public String veiculo(){
        return "cars";
    }

    @PostMapping("/veiculo")
    public String veiculoSave(VeiculoModel veiculo){
        veiculoRepo.save(veiculo);
        return "redirect:/veiculo";
    }
}
