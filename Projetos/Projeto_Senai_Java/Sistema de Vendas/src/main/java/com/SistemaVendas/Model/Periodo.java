package com.SistemaVendas.Model;

import java.time.LocalDate;

public class Periodo {

    private Integer idPeriodo;
    private LocalDate dataPeriodo;
    private Integer diaSemana;
    private String mesPeriodo;
    private Integer anoPeriodo;

    // Construtor vazio
    public Periodo() {
    }

    // Construtor completo
    public Periodo(Integer idPeriodo, LocalDate dataPeriodo, Integer diaSemana,
                   String mesPeriodo, Integer anoPeriodo) {
        this.idPeriodo = idPeriodo;
        this.dataPeriodo = dataPeriodo;
        this.diaSemana = diaSemana;
        this.mesPeriodo = mesPeriodo;
        this.anoPeriodo = anoPeriodo;
    }

    // Getters e Setters
    public Integer getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(Integer idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public LocalDate getDataPeriodo() {
        return dataPeriodo;
    }

    public void setDataPeriodo(LocalDate dataPeriodo) {
        this.dataPeriodo = dataPeriodo;
    }

    public Integer getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(Integer diaSemana) {
        this.diaSemana = diaSemana;
    }

    public String getMesPeriodo() {
        return mesPeriodo;
    }

    public void setMesPeriodo(String mesPeriodo) {
        this.mesPeriodo = mesPeriodo;
    }

    public Integer getAnoPeriodo() {
        return anoPeriodo;
    }

    public void setAnoPeriodo(Integer anoPeriodo) {
        this.anoPeriodo = anoPeriodo;
    }

    // toString
    @Override
    public String toString() {
        return dataPeriodo != null ? dataPeriodo.toString() : "";
    }
}