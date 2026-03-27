package com.SistemaVendas.Model;

public class Cidade {

    private Integer idCidade;
    private Integer idEstado;
    private String nomeCidade;

    // Construtor vazio
    public Cidade() {
    }

    // Construtor com parâmetros
    public Cidade(Integer idCidade, Integer idEstado, String nomeCidade) {
        this.idCidade = idCidade;
        this.idEstado = idEstado;
        this.nomeCidade = nomeCidade;
    }

    // Getters e Setters
    public Integer getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(Integer idCidade) {
        this.idCidade = idCidade;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    // toString (útil para ComboBox, TableView, etc.)
    @Override
    public String toString() {
        return nomeCidade;
    }
}