package br.com.projeto.aluguel_veiculos.model;

import java.sql.Date;
import java.text.DecimalFormat;

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

@NoArgsConstructor
@AllArgsConstructor

@Table
@Entity

public class AluguelModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id_aluguel;
    private VeiculoModel veiculo;
    private Date dataAluguel;
    private Date dataEntrega;
    private ClienteModel cliente;
    private char entregue;
    private String observacao;
    private DecimalFormat valorPago;
}
