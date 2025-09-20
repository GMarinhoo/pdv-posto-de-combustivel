package com.br.pdvpostocombustivel.api.enums;

public enum TipoPessoa {

    FISICA("Pessoa"),
    JURIDICA("Pessoa Jurídica");

    private final String descricao;

    private TipoPessoa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
