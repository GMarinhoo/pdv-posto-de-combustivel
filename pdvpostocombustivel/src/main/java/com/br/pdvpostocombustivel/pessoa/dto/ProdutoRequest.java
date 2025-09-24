package com.br.pdvpostocombustivel.pessoa.dto;

public record ProdutoRequest(
        String nome,
        String referencia,
        String fornecedor,
        String categoria,
        String marca
) {
}
