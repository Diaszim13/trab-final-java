package org.projSom.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "pagamentos")
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //depois ver para criar o enum
    @Column(nullable = false,name = "tipoid", length = 100)
    private String tipo;

    @Column(nullable = false,name = "valor", length = 100)
    private Double valor;

    @Column(nullable = false, name = "quantidade")
    private Integer quantidade;

    @Column(nullable = false,name = "aprovado", length = 100)
    private boolean aprovado;

    @Column(name = "Data_pagamento", updatable = false)
    private LocalDate dataPagamento;

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    @PrePersist
    public void prePersist() {
        setDataPagamento(LocalDate.now());
    }

    public double calculaValorTotal() {
        return this.quantidade * this.valor;
    }

    public void adicionaQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removeQuantidade(int quantidade) {
        this.quantidade -= quantidade;
    }


}
