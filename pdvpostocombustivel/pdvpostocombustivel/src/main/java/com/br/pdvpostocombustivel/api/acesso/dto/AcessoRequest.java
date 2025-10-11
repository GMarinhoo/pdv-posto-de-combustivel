package com.br.pdvpostocombustivel.api.acesso.dto;

import org.springframework.format.annotation.DateTimeFormat;

public record AcessoRequest(
        String usuiario,
        String senha)
{}
