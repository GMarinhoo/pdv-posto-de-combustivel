package com.br.pdvpostocombustivel.api.domain.entity;

import com.br.pdvpostocombustivel.api.enums.TipoPessoa;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;

import java.time.LocalDate;

import java.util.Date;
@Entity
@Table(name = "pessoa")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "nome_completo",length = 200, nullable = false)
    private String nomeCompleto;

    @Column(name = "cpf_cnpj", length = 14, nullable = false)
    private String cpfCnpj;

    @Column(name = "numero_ctps", length = 10, nullable = false)
    private Long numeroCtps;

    @Column(name= "data_nascimento", length = 12)
    private LocalDate dataNascimento;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo pessoa", nullable = false, length = 15)
    private TipoPessoa tipoPessoa;

    public Pessoa (String nomeCompleto, String cpfCnpj, LocalDate dataNascimento, Long numeroCtps, TipoPessoa tipoPessoa) {
        this.nomeCompleto = nomeCompleto;
        this.cpfCnpj = cpfCnpj;
        this.numeroCtps = numeroCtps;
        this.dataNascimento = dataNascimento;
        this.tipoPessoa = tipoPessoa;
    }

    public Pessoa () {

    }

    public Long getId () {
        return id;
    }

    public String getNomeCompleto () {
        return nomeCompleto;
    }

    public String getCpfCnpj () {
        return cpfCnpj;
    }

    public Long getNumeroCtps () {
        return numeroCtps;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public void setNumeroCtps(Long NumeroCtps) {
        this.numeroCtps = numeroCtps;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }
}