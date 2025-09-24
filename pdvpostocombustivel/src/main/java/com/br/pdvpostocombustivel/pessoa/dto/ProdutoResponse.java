package com.br.pdvpostocombustivel.pessoa.dto;

public record ProdutoResponse(
        String nome,
        String referencia,
        String fornecedor,
        String categoria,
        String marca
) {
}
