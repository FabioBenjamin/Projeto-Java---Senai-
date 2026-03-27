package com.SistemaVendas.Model;

public class Loja {

    private Integer idLoja;
    private String nomeLoja;
    private String telefone;

    // Construtor vazio
    public Loja() {
    }

    // Construtor completo
    public Loja(Integer idLoja, String nomeLoja, String telefone) {
        this.idLoja = idLoja;
        this.nomeLoja = nomeLoja;
        this.telefone = telefone;
    }

    // Getters e Setters
    public Integer getIdLoja() {
        return idLoja;
    }

    public void setIdLoja(Integer idLoja) {
        this.idLoja = idLoja;
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // toString
    @Override
    public String toString() {
        return nomeLoja;
    }
}