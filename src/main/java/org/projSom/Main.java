package org.projSom;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Connection conn = null;
        try {
           String URL = "jdbc:postgresql:projSom?user=postgres&password=132465";
           conn = DriverManager.getConnection(URL);
           if(conn.isValid(100)) {
               System.out.println("FOI");
           }
        }catch (SQLException E) {
            E.printStackTrace();
        }

        Object[] opcs = new String[]{"Cadastrar usuario", "Montar peça", "Fazer compra", "Emitir nota fiscal"};
        JTextField nomePessoaField = new JTextField(5);
        JTextField docPessoaField = new JTextField(5);
        JPanel pannelAddCliente = new JPanel();
        Object funcaoSistemaSelecionada = JOptionPane.showInputDialog(null,
                "Escolha a função do programa",
                "funcoes",
                JOptionPane.INFORMATION_MESSAGE, null,
                opcs, opcs[0]);

        if(funcaoSistemaSelecionada.equals("Cadastrar usuario"))
        {
            pannelAddCliente.add(new JLabel("Nome"));
            pannelAddCliente.add(nomePessoaField);
            Object novoUsuario = JOptionPane.showInputDialog(null,
                    pannelAddCliente,
                    "Adicione os dados", JOptionPane.QUESTION_MESSAGE
                    );


        }
    }
}