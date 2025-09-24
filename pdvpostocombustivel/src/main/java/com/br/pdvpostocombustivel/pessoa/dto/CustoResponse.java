package com.br.pdvpostocombustivel.pessoa.dto;

import java.util.Date;

public record CustoResponse(
        Double imposto,
        Double custoVarivel,
        Double custoFixo,
        Double margemLucro,
        Date dataprocessamento
) {
}
