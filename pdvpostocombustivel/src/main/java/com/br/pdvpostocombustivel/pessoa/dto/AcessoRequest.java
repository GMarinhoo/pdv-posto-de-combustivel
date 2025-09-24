package com.br.pdvpostocombustivel.pessoa.dto;

import org.springframework.format.annotation.DateTimeFormat;

public record AcessoRequest(
        String usario,
        String senha)
{}
