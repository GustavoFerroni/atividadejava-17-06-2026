/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.triangulo;

/**
 *
 * @author Gustavo Ferroni
 */
import javax.swing.*;
import java.awt.event.*;

public class Triangulo extends JFrame {

    JTextField lado1, lado2, lado3;
    JButton verificar;
    JLabel resultado;

    public Triangulo() {
        setTitle("Triângulo");
        setSize(300, 200);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel l1 = new JLabel("Lado 1:");
        l1.setBounds(20, 20, 80, 25);
        add(l1);

        lado1 = new JTextField();
        lado1.setBounds(100, 20, 100, 25);
        add(lado1);

        JLabel l2 = new JLabel("Lado 2:");
        l2.setBounds(20, 50, 80, 25);
        add(l2);

        lado2 = new JTextField();
        lado2.setBounds(100, 50, 100, 25);
        add(lado2);

        JLabel l3 = new JLabel("Lado 3:");
        l3.setBounds(20, 80, 80, 25);
        add(l3);

        lado3 = new JTextField();
        lado3.setBounds(100, 80, 100, 25);
        add(lado3);

        verificar = new JButton("Verificar");
        verificar.setBounds(90, 110, 100, 25);
        add(verificar);

        resultado = new JLabel("");
        resultado.setBounds(20, 140, 250, 25);
        add(resultado);

        verificar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(lado1.getText());
                int b = Integer.parseInt(lado2.getText());
                int c = Integer.parseInt(lado3.getText());

                if (a == b && b == c) {
                    resultado.setText("Equilátero");
                } else if (a == b || a == c || b == c) {
                    resultado.setText("Isósceles");
                } else {
                    resultado.setText("Escaleno");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Triangulo();
    }
}
