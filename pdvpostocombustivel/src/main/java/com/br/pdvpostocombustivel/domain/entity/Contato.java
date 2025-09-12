package com.br.pdvpostocombustivel.domain.entity;

public class Contato {

    // atributos
    private String telefone;
    private String email;
    private String endereco;

    //constutor

    public Contato (String telefone, String email, String endereco) {
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public String getTelefone () {
        return telefone;
    }

    public String getEmail () {
        return telefone;
    }

    public String getEndereco () {
        return endereco;
    }

    public void setTelefone (String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}