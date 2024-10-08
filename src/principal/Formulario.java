package principal;


import javax.swing.*;

import auxiliar.BuscaMacAddress;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario extends JFrame {

    public Formulario() {
        // Configurar la ventana principal
        setTitle("Get MAC Address");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centra la ventana en la pantalla

        // Crear un panel con GridBagLayout
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL; // Estirar horizontalmente
        gbc.insets = new Insets(5, 5, 5, 5); // Espaciado de 5px

        // Crear etiquetas y campos de texto
        JLabel label1 = new JLabel("Serie:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST; // Alinear a la derecha
        panel.add(label1, gbc);

        JTextField campo1 = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST; // Alinear a la izquierda
        panel.add(campo1, gbc);

        JLabel label2 = new JLabel("Hardware ID:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST; // Alinear a la derecha
        panel.add(label2, gbc);

        JTextField campo2 = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST; // Alinear a la izquierda
        campo2.setText(BuscaMacAddress.getMacAddress());
        panel.add(campo2, gbc);

        // Crear el boton
        JButton boton = new JButton("Enviar");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2; // El boton ocupara� dos columnas
        gbc.anchor = GridBagConstraints.CENTER; // Centrar el boton
        panel.add(boton, gbc);

        // Accion al hacer clic en el boton
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener el texto de los campos de texto
                String valorCampo1 = campo1.getText();
                String valorCampo2 = campo2.getText();

                // Mostrar un mensaje con los valores
                JOptionPane.showMessageDialog(null, "Campo 1: " + valorCampo1 + "\nCampo 2: " + valorCampo2);
            }
        });

        // A�adir el panel a la ventana
        add(panel);

        // Hacer la ventana visible
        setVisible(true);
    }

    public static void main(String[] args) {
        // Ejecutar la aplicacionn en el hilo de la interfaz grafica
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Formulario();
            }
        });
    }
}
