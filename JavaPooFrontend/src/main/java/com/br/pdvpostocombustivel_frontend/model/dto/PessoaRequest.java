package com.br.dto;

import com.br.pdvpostocombustivel_frontend.model.enums.TipoPessoa;
import java.time.LocalDate;

public record PessoaRequest(
        String nomeCompleto,
        String cpfCnpj,
        Long numeroCtps,
        LocalDate dataNascimento,
        TipoPessoa TipoPesoa
) {}
