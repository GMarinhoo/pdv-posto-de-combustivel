package com.br.pdvpostocombustivel.api.domain.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Estoque {

    // atributos

    private BigDecimal quantidade;
    private String localTanque;
    private String loteEndereco;
    private String loteFabricacao;
    private Date dataValidade;

    // contrutores

    public Estoque (BigDecimal quantidade, String localTanque, String loteEndereco, String loteFabricacao, Date dataValidade) {
        this.quantidade = quantidade;
        this.localTanque = localTanque;
        this.loteEndereco = loteEndereco;
        this.loteFabricacao = loteFabricacao;
        this.dataValidade = dataValidade;
    }

    // getters

    public BigDecimal getQuantidade () {
        return quantidade;
    }

    public String getLocalTanque () {
        return localTanque;
    }

    public String getLoteEndereco () {
        return loteEndereco;
    }

    public String getLoteFabricacao () {
        return loteFabricacao;
    }

    public Date getDataValidade () {
        return dataValidade;
    }

    public void setQuantidade (BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public void setLocalTanque (String localTanque) {
        this.localTanque = localTanque;
    }

    public void setLoteEndereco (String loteEndereco) {
        this.loteEndereco = loteEndereco;
    }

    public void setLoteFabricacao (String loteFabricacao) {
        this.loteFabricacao = loteFabricacao;
    }

    public void setDataValidade (Date dataValidade) {
        this.dataValidade = dataValidade;
    }
}