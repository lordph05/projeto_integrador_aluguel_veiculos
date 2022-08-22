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

// GETTER E SETTER PELO LOMBOK
@Getter
@Setter

// CONSTRUTOR DE TODOS OS ATRIBUTOS
@AllArgsConstructor

// CONSTRUTOR VAZIO
@NoArgsConstructor

// INFORMANDO QUE ESSA CLASSE É UMA ENTIDADE
@Entity

//INFORMANDO QUE A CLASSE É UMA TABELA
@Table



public class UserModel {
       // definir ele como um id e gerar automaticamente
       @Id
       
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       
       private Long id_user;
       private String name;
       private String cargo;
       private String login;
       private String senha;
       private String email;
}
