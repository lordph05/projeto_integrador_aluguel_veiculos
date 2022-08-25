package br.com.projeto.aluguel_veiculos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

@AllArgsConstructor
@NoArgsConstructor

@Table(name = "cliente")
@Entity

public class ClienteModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Long id_cliente;
    private String nome;
    private String endereco;
    private String UF;
    private String telefone;
    private String cpf;
    private String email;
}
