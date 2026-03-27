package com.SistemaVendas.Model;

import java.time.LocalDate;

public class Vendedor {

    private Integer id;
    private String nome;
    private String sexo;
    private LocalDate dataNascimento;
    private LocalDate dataContrato;

    // Construtor vazio
    public Vendedor() {
    }

    // Construtor completo
    public Vendedor(Integer id, String nome, String sexo,
                    LocalDate dataNascimento, LocalDate dataContrato) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.dataContrato = dataContrato;
    }

    // Getters e Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(LocalDate dataContrato) {
        this.dataContrato = dataContrato;
    }

    // toString
    @Override
    public String toString() {
        return nome;
    }
}