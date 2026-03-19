package com.SistemaVendas.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Venda {

    private Integer idVenda;
    private Integer idCliente;
    private Integer idCidade;
    private Integer idPeriodo;
    private Integer idVendedor;
    private Integer idLoja;
    private String dataVenda;
    private String horaVenda;
    private String metodoPagamento;
    private double totalVenda;

}
