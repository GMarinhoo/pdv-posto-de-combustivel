package com.br.pdvpostocombustivel.api.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.websocket.OnMessage;

import java.time.LocalDate;

import java.util.Date;
@Entity
@Table(name = "pessoa")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(length = 200, nullable = false)
    private String nomeCompleto;

    @Column(length = 14, nullable = false)
    private String cpfCnpf;

    @Column(length = 12)
    private LocalDate dataNascimento;

    @Column(length = 10, nullable = false)
    private Long numeroCtps;

    // contrutores

    public Pessoa (String nomeCompleto, String cpfCmpf, LocalDate dataNascimento, Long numeroCtps) {
        this.nomeCompleto = nomeCompleto;
        this.cpfCnpf = cpfCmpf;
        this.dataNascimento = dataNascimento;
        this.numeroCtps = numeroCtps;
    }

    public Pessoa () {

    }
    // getters

    public Long getId () {
        return id;
    }

    public String getNomeCompleto () {
        return nomeCompleto;
    }

    public String getCpfCnpf () {
        return cpfCnpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public Long getNumeroCtps() {
        return numeroCtps;
    }

    // setters

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setCpfCnpf(String cpfCnpf) {
        this.cpfCnpf = cpfCnpf;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setNumeroCtps(Long NumeroCtps) {
        this.numeroCtps = numeroCtps;
    }

    public void setId(Long id) {
        this.id = id;
    }
}