package com.br.pdvpostocombustivel.pessoa.dto;

import java.math.BigDecimal;
import java.util.Date;

public record PrecoResponse(
        BigDecimal valor,
        String dataAlteracao,
        Date horaAlteracao
) {
}
