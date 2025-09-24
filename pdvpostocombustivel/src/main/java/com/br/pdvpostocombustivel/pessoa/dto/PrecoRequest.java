package com.br.pdvpostocombustivel.pessoa.dto;

import java.math.BigDecimal;
import java.util.Date;

public record PrecoRequest(
        BigDecimal valor,
        String dataAlteracao,
        Date horaAlteracao
) {
}
