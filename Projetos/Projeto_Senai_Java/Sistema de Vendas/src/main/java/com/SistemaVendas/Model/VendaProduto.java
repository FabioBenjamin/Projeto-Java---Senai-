package com.SistemaVendas.Model;

public class VendaProduto {

    private Integer idVendaProduto;
    private Integer idProduto;
    private Integer idVenda;
    private Integer quantidade;
    private Double valorUnitario;
    private Double desconto;

    // Construtor vazio
    public VendaProduto() {
    }

    // Construtor completo
    public VendaProduto(Integer idVendaProduto, Integer idProduto, Integer idVenda,
                        Integer quantidade, Double valorUnitario, Double desconto) {
        this.idVendaProduto = idVendaProduto;
        this.idProduto = idProduto;
        this.idVenda = idVenda;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.desconto = desconto;
    }

    // Getters e Setters
    public Integer getIdVendaProduto() {
        return idVendaProduto;
    }

    public void setIdVendaProduto(Integer idVendaProduto) {
        this.idVendaProduto = idVendaProduto;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public Integer getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(Integer idVenda) {
        this.idVenda = idVenda;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    // toString
    @Override
    public String toString() {
        return "Produto " + idProduto + " - Qtd: " + quantidade;
    }
}