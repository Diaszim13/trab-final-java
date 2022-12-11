package org.projSom.models;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "componentes")
public class Componente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,name = "nome", length = 100)
    private String nome;

    @Column(nullable = false,name = "altura", length = 100)
    private Float altura;

    @Column(nullable = false,name = "largura", length = 100)
    private Float largura;

    @Column(nullable = false,name = "potencia", length = 100)
    private Float potencia;

    @Column(nullable = false,name = "quantidade", length = 100)
    private Integer quantidade;

    public Componente() {};

    public Componente(Long id, String nome, Float altura, Float largura, Float potencia, Integer quantidade) {
        this.id = id;
        this.nome = nome;
        this.altura = altura;
        this.largura = largura;
        this.potencia = potencia;
        this.quantidade = quantidade;
    }
}
