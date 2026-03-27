package com.SistemaVendas.Model;

public class Produto {

    private Integer idProduto;
    private String nomeProduto;
    private String descricao;
    private Double valorCusto;
    private Double valorVenda;

    // Construtor vazio
    public Produto() {
    }

    // Construtor completo
    public Produto(Integer idProduto, String nomeProduto, String descricao,
                   Double valorCusto, Double valorVenda) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.descricao = descricao;
        this.valorCusto = valorCusto;
        this.valorVenda = valorVenda;
    }

    // Getters e Setters
    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(Double valorCusto) {
        this.valorCusto = valorCusto;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    // toString
    @Override
    public String toString() {
        return nomeProduto;
    }
}