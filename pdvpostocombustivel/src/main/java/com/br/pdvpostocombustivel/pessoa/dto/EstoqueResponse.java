package com.br.pdvpostocombustivel.pessoa.dto;

import java.math.BigDecimal;
import java.util.Date;

public record EstoqueResponse(
        BigDecimal quantidade,
        String localTanque,
        String loteEndereco,
        String loteFabricacao,
        Date dataValidade
) {
}
