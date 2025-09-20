package com.br.pdvpostocombustivel.api.domain.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "estoque")
public class Estoque {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private BigDecimal quantidade;

    @Column(length = 200, nullable = false)
    private String localTanque;

    @Column(length = 200, nullable = false)
    private String loteEndereco;

    @Column(length = 200, nullable = false)
    private String loteFabricacao;

    @Column(nullable = false)
    private Date dataValidade;

    public Estoque (BigDecimal quantidade, String localTanque, String loteEndereco, String loteFabricacao, Date dataValidade) {
        this.quantidade = quantidade;
        this.localTanque = localTanque;
        this.loteEndereco = loteEndereco;
        this.loteFabricacao = loteFabricacao;
        this.dataValidade = dataValidade;
    }

    public Estoque () {

    }

    public Long getId () {
        return id;
    }

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

    public void setId(Long id) {
        this.id = id;
    }
}