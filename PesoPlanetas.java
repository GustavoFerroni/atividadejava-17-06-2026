/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pesoplanetas;

/**
 *
 * @author Gustavo Ferroni
 */
import javax.swing.*;
import java.awt.event.*;

public class PesoPlanetas extends JFrame {

    JTextField peso;
    JComboBox<String> planeta;
    JButton calcular;
    JLabel resultado;

    public PesoPlanetas() {
        setTitle("Peso nos Planetas");
        setSize(350, 200);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel l1 = new JLabel("Peso na Terra:");
        l1.setBounds(20, 20, 100, 25);
        add(l1);

        peso = new JTextField();
        peso.setBounds(130, 20, 100, 25);
        add(peso);

        String[] planetas = {
            "Mercúrio", "Vênus", "Marte",
            "Júpiter", "Saturno", "Urano"
        };

        planeta = new JComboBox<>(planetas);
        planeta.setBounds(130, 60, 100, 25);
        add(planeta);

        calcular = new JButton("Calcular");
        calcular.setBounds(110, 100, 100, 25);
        add(calcular);

        resultado = new JLabel("");
        resultado.setBounds(20, 140, 300, 25);
        add(resultado);

        calcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double p = Double.parseDouble(peso.getText());
                double fator = 1;

                switch (planeta.getSelectedIndex()) {
                    case 0: fator = 0.37; break;
                    case 1: fator = 0.88; break;
                    case 2: fator = 0.38; break;
                    case 3: fator = 2.64; break;
                    case 4: fator = 1.15; break;
                    case 5: fator = 1.17; break;
                }

                resultado.setText("Peso: " + (p * fator) + " kg");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new PesoPlanetas();
    }
}