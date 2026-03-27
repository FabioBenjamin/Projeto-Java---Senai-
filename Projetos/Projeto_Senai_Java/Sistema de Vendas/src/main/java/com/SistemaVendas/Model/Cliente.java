package com.SistemaVendas.Model;

import java.time.LocalDate;

public class Cliente {

    private Integer idCliente;
    private String nomeCompleto;
    private LocalDate dataNascimento;
    private String cpf;
    private String rg;
    private String email;
    private String sexo;

    // Construtor vazio
    public Cliente() {
    }

    // Construtor completo
    public Cliente(Integer idCliente, String nomeCompleto, LocalDate dataNascimento,
                   String cpf, String rg, String email, String sexo) {
        this.idCliente = idCliente;
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.rg = rg;
        this.email = email;
        this.sexo = sexo;
    }

    // Getters e Setters
    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    // toString
    @Override
    public String toString() {
        return nomeCompleto;
    }
}