package br.com.projeto.aluguel_veiculos.repository;

import java.text.NumberFormat;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.aluguel_veiculos.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository <UserModel, Long>{

    //TODOS OS USUÁRIOS
    //public List<UserModel> getAllUserModel(); 
}
