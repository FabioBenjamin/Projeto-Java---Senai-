package com.SistemaVendas.Model;

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
    private Double totalVenda;

    // Construtor vazio
    public Venda() {
    }

    // Construtor completo
    public Venda(Integer idVenda, Integer idCliente, Integer idCidade, Integer idPeriodo,
                 Integer idVendedor, Integer idLoja, String dataVenda, String horaVenda,
                 String metodoPagamento, Double totalVenda) {
        this.idVenda = idVenda;
        this.idCliente = idCliente;
        this.idCidade = idCidade;
        this.idPeriodo = idPeriodo;
        this.idVendedor = idVendedor;
        this.idLoja = idLoja;
        this.dataVenda = dataVenda;
        this.horaVenda = horaVenda;
        this.metodoPagamento = metodoPagamento;
        this.totalVenda = totalVenda;
    }

    // Getters e Setters
    public Integer getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(Integer idVenda) {
        this.idVenda = idVenda;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(Integer idCidade) {
        this.idCidade = idCidade;
    }

    public Integer getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(Integer idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public Integer getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(Integer idVendedor) {
        this.idVendedor = idVendedor;
    }

    public Integer getIdLoja() {
        return idLoja;
    }

    public void setIdLoja(Integer idLoja) {
        this.idLoja = idLoja;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getHoraVenda() {
        return horaVenda;
    }

    public void setHoraVenda(String horaVenda) {
        this.horaVenda = horaVenda;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public Double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(Double totalVenda) {
        this.totalVenda = totalVenda;
    }

    // toString
    @Override
    public String toString() {
        return "Venda #" + idVenda + " - Total: R$ " + totalVenda;
    }
}