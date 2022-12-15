package org.projSom.models;

import java.util.Date;

public abstract class Clientes extends Usuario {

    public Clientes() {
    }

    public Clientes(Long id, String nome, String endereco, String cpf, Date nascimento) {
        super(id, nome, endereco, cpf, nascimento);
    }


}
