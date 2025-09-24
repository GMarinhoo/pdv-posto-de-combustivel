package com.br.pdvpostocombustivel.pessoa.dto;

public record ContatoRequest(
        String telefone,
        String email,
        String endereco
) {
}
