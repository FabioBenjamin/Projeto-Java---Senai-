package com.SistemaVendas.Model;

public class Estado {

    private Integer idEstado;
    private String nomeEstado;

    // Construtor vazio
    public Estado() {
    }

    // Construtor com parâmetros
    public Estado(Integer idEstado, String nomeEstado) {
        this.idEstado = idEstado;
        this.nomeEstado = nomeEstado;
    }

    // Getters e Setters
    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public String getNomeEstado() {
        return nomeEstado;
    }

    public void setNomeEstado(String nomeEstado) {
        this.nomeEstado = nomeEstado;
    }

    // toString (útil pra ComboBox)
    @Override
    public String toString() {
        return nomeEstado;
    }
}