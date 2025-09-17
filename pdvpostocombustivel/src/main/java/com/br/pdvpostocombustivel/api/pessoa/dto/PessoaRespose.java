package com.br.pdvpostocombustivel.api.pessoa.dto;

import java.time.LocalDate;

// Para resposta
public record PessoaRespose(
        Long id,
        String nomeCompleto,
        String cpfCnpj,
        Long numeroCtps,
        LocalDate dataNascimento
) {}
