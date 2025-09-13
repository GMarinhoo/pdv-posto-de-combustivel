package com.br.pdvpostocombustivel.domain.entity;

import java.util.Date;

public class Pessoa {

    // atributos

    private String nomeCompleto;
    private String cpfCnpf;
    private Date dataNascimento;
    private Long numeroCtps;

    // contrutores

    public Pessoa (String nomeCompleto, String cpfCmpf, Date dataNascimento, Long numeroCtps) {
        this.nomeCompleto = nomeCompleto;
        this.cpfCnpf = cpfCmpf;
        this.dataNascimento = dataNascimento;
        this.numeroCtps = numeroCtps;
    }

    public Pessoa () {

    }
    // getters

    public String getNomeCompleto () {
        return nomeCompleto;
    }

    public String getCpfCnpf () {
        return cpfCnpf;
    }

    public Date getDataNascimento() {
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

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setNumeroCtps(Long NumeroCtps) {
        this.numeroCtps = numeroCtps;
    }

}