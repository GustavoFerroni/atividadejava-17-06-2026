/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jokenpo;

/**
 *
 * @author Gustavo Ferroni
 */
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class Jokenpo extends JFrame {

    JRadioButton pedra, papel, tesoura;
    JButton jogar;
    JLabel resultado;

    public Jokenpo() {
        setTitle("Jokenpô");
        setSize(300, 220);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        pedra = new JRadioButton("Pedra");
        papel = new JRadioButton("Papel");
        tesoura = new JRadioButton("Tesoura");

        pedra.setBounds(20, 20, 100, 25);
        papel.setBounds(20, 50, 100, 25);
        tesoura.setBounds(20, 80, 100, 25);

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(pedra);
        grupo.add(papel);
        grupo.add(tesoura);

        add(pedra);
        add(papel);
        add(tesoura);

        jogar = new JButton("Jogar");
        jogar.setBounds(100, 120, 100, 25);
        add(jogar);

        resultado = new JLabel("");
        resultado.setBounds(20, 160, 250, 25);
        add(resultado);

        jogar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int usuario = 0;

                if (pedra.isSelected()) usuario = 0;
                if (papel.isSelected()) usuario = 1;
                if (tesoura.isSelected()) usuario = 2;

                Random r = new Random();
                int computador = r.nextInt(3);

                if (usuario == computador) {
                    resultado.setText("Empate!");
                } else if (
                        (usuario == 0 && computador == 2) ||
                        (usuario == 1 && computador == 0) ||
                        (usuario == 2 && computador == 1)
                ) {
                    resultado.setText("Usuário venceu!");
                } else {
                    resultado.setText("Computador venceu!");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Jokenpo();
    }
}