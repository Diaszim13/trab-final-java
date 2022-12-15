package org.projSom;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    static JFrame frame;
    static JLabel label, l1;
    static JComboBox comboBox;

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
        String[] colunas = {"Marca", "Modelo", "Potência", "Preço"};
        String[][] dados = new String[1][4];
        //frame montar peça
        frame = new JFrame("ADICIONAR PEÇA");

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


        }else if(funcaoSistemaSelecionada.equals("Montar peça")) {
            JTextField autoFalante = new JTextField(5);
            JTextField amplificador = new JTextField(5);
                dados[0][0] = JOptionPane.showInputDialog("Digite a marca do aparelho");
                dados[0][1] = JOptionPane.showInputDialog("Digite o modelo do aparelho");
                dados[0][2] = JOptionPane.showInputDialog("Digite a potência do aparelho");
                dados[0][3] = JOptionPane.showInputDialog("Digite o preço do aparelho");
            // Assemble the sound box using the specified parts
            JTable tabela = new JTable(dados, colunas);
            JOptionPane.showMessageDialog(null, tabela);

        } else if(funcaoSistemaSelecionada.equals("Fazer compra")) {

        }
    }
}