/*
 * package principal;
 * 
 * 
 * import javax.swing.*;
 * 
 * import auxiliar.BuscaMacAddress;
 * 
 * import java.awt.*; import java.awt.event.ActionEvent; import
 * java.awt.event.ActionListener;
 * 
 * public class Formulario extends JFrame {
 * 
 * public Formulario() { // Configurar la ventana principal
 * setTitle("Get MAC Address"); setSize(300, 150);
 * setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); setLocationRelativeTo(null);
 * // Centra la ventana en la pantalla
 * 
 * // Crear un panel con GridBagLayout JPanel panel = new JPanel(new
 * GridBagLayout()); GridBagConstraints gbc = new GridBagConstraints(); gbc.fill
 * = GridBagConstraints.HORIZONTAL; // Estirar horizontalmente gbc.insets = new
 * Insets(5, 5, 5, 5); // Espaciado de 5px
 * 
 * // Crear etiquetas y campos de texto JLabel label1 = new JLabel("Serie:");
 * gbc.gridx = 0; gbc.gridy = 0; gbc.anchor = GridBagConstraints.EAST; //
 * Alinear a la derecha panel.add(label1, gbc);
 * 
 * JTextField campo1 = new JTextField(10); gbc.gridx = 1; gbc.gridy = 0;
 * gbc.anchor = GridBagConstraints.WEST; // Alinear a la izquierda
 * panel.add(campo1, gbc);
 * 
 * JLabel label2 = new JLabel("Hardware ID:"); gbc.gridx = 0; gbc.gridy = 1;
 * gbc.anchor = GridBagConstraints.EAST; // Alinear a la derecha
 * panel.add(label2, gbc);
 * 
 * JTextField campo2 = new JTextField(10); gbc.gridx = 1; gbc.gridy = 1;
 * gbc.anchor = GridBagConstraints.WEST; // Alinear a la izquierda
 * campo2.setText(BuscaMacAddress.getMacAddress()); panel.add(campo2, gbc);
 * 
 * // Crear el boton JButton boton = new JButton("Enviar"); gbc.gridx = 0;
 * gbc.gridy = 2; gbc.gridwidth = 2; // El boton ocupara� dos columnas
 * gbc.anchor = GridBagConstraints.CENTER; // Centrar el boton panel.add(boton,
 * gbc);
 * 
 * // Accion al hacer clic en el boton boton.addActionListener(new
 * ActionListener() {
 * 
 * @Override public void actionPerformed(ActionEvent e) { // Obtener el texto de
 * los campos de texto String valorCampo1 = campo1.getText(); String valorCampo2
 * = campo2.getText();
 * 
 * // Mostrar un mensaje con los valores JOptionPane.showMessageDialog(null,
 * "Campo 1: " + valorCampo1 + "\nCampo 2: " + valorCampo2); } });
 * 
 * // A�adir el panel a la ventana add(panel);
 * 
 * // Hacer la ventana visible setVisible(true); }
 * 
 * public static void main(String[] args) { // Ejecutar la aplicacionn en el
 * hilo de la interfaz grafica SwingUtilities.invokeLater(new Runnable() {
 * 
 * @Override public void run() { new Formulario(); } }); } }
 */




/*
 * package principal;
 * 
 * import javax.swing.*; import auxiliar.BuscaMacAddress; import java.awt.*;
 * import java.awt.event.ActionEvent; import java.awt.event.ActionListener;
 * 
 * public class Formulario extends JFrame {
 * 
 * public Formulario() { // Configurar la ventana principal
 * setTitle("Get MAC Address"); setSize(350, 200); // Ajustar tamaño para
 * acomodar más campos setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 * setLocationRelativeTo(null); // Centra la ventana en la pantalla
 * 
 * // Crear un panel con GridBagLayout JPanel panel = new JPanel(new
 * GridBagLayout()); GridBagConstraints gbc = new GridBagConstraints(); gbc.fill
 * = GridBagConstraints.HORIZONTAL; // Estirar horizontalmente gbc.insets = new
 * Insets(5, 5, 5, 5); // Espaciado de 5px
 * 
 * // Etiqueta y campo para "User" JLabel labelUser = new JLabel("User:");
 * gbc.gridx = 0; gbc.gridy = 0; gbc.anchor = GridBagConstraints.EAST;
 * panel.add(labelUser, gbc);
 * 
 * JTextField campoUser = new JTextField(10); gbc.gridx = 1; gbc.gridy = 0;
 * gbc.anchor = GridBagConstraints.WEST; campoUser.setEditable(false);
 * panel.add(campoUser, gbc);
 * 
 * // Etiqueta y campo para "Serie" JLabel label1 = new JLabel("Serie:");
 * gbc.gridx = 0; gbc.gridy = 1; gbc.anchor = GridBagConstraints.EAST;
 * panel.add(label1, gbc);
 * 
 * JTextField campo1 = new JTextField(10); gbc.gridx = 1; gbc.gridy = 1;
 * gbc.anchor = GridBagConstraints.WEST; panel.add(campo1, gbc);
 * 
 * // Etiqueta y campo para "Hardware ID" JLabel label2 = new
 * JLabel("Hardware ID:"); gbc.gridx = 0; gbc.gridy = 2; gbc.anchor =
 * GridBagConstraints.EAST; panel.add(label2, gbc);
 * 
 * JTextField campo2 = new JTextField(10); gbc.gridx = 1; gbc.gridy = 2;
 * gbc.anchor = GridBagConstraints.WEST;
 * campo2.setText(BuscaMacAddress.getMacAddress()); panel.add(campo2, gbc);
 * 
 * // Etiqueta y campo para "Cant. por día" JLabel labelCant = new
 * JLabel("Cant. por día:"); gbc.gridx = 0; gbc.gridy = 3; gbc.anchor =
 * GridBagConstraints.EAST; panel.add(labelCant, gbc);
 * 
 * JTextField campoCant = new JTextField(10); gbc.gridx = 1; gbc.gridy = 3;
 * gbc.anchor = GridBagConstraints.WEST; panel.add(campoCant, gbc);
 * 
 * // Crear el botón "Enviar" JButton boton = new JButton("Enviar"); gbc.gridx =
 * 0; gbc.gridy = 4; gbc.gridwidth = 2; // El botón ocupará dos columnas
 * gbc.anchor = GridBagConstraints.CENTER; panel.add(boton, gbc);
 * 
 * // Acción al hacer clic en el botón boton.addActionListener(new
 * ActionListener() {
 * 
 * @Override public void actionPerformed(ActionEvent e) { // Obtener el texto de
 * los campos de texto String user = campoUser.getText(); String valorCampo1 =
 * campo1.getText(); String valorCampo2 = campo2.getText(); String cantPorDia =
 * campoCant.getText();
 * 
 * // Mostrar un mensaje con los valores JOptionPane.showMessageDialog(null,
 * "User: " + user + "\nSerie: " + valorCampo1 + "\nHardware ID: " + valorCampo2
 * + "\nCant. por día: " + cantPorDia); } });
 * 
 * // Añadir el panel a la ventana add(panel);
 * 
 * // Hacer la ventana visible setVisible(true); }
 * 
 * public static void main(String[] args) { // Ejecutar la aplicación en el hilo
 * de la interfaz gráfica SwingUtilities.invokeLater(new Runnable() {
 * 
 * @Override public void run() { new Formulario(); } }); } }
 */

/*
 * package principal;
 * 
 * import javax.swing.*; import auxiliar.BuscaMacAddress; import java.awt.*;
 * import java.awt.event.ActionEvent; import java.awt.event.ActionListener;
 * 
 * public class Formulario extends JFrame {
 * 
 * public Formulario() { // Configurar la ventana principal
 * setTitle("Get MAC Address"); setSize(400, 250); // Aumentar el tamaño de la
 * ventana setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 * setLocationRelativeTo(null); // Centrar la ventana en la pantalla
 * 
 * // Crear un panel con GridBagLayout JPanel panel = new JPanel(new
 * GridBagLayout()); GridBagConstraints gbc = new GridBagConstraints(); gbc.fill
 * = GridBagConstraints.HORIZONTAL; // Estirar horizontalmente gbc.insets = new
 * Insets(10, 10, 10, 10); // Mayor espaciado para agrandar el tamaño
 * gbc.weightx = 1; // Asegura que los componentes se expandan en ancho
 * 
 * Font font = new Font("Arial", Font.PLAIN, 16); // Aumentar el tamaño de la
 * fuente
 * 
 * // Etiqueta y campo para "User" JLabel labelUser = new JLabel("User:");
 * labelUser.setFont(font); // Aplicar tamaño de fuente gbc.gridx = 0; gbc.gridy
 * = 0; gbc.anchor = GridBagConstraints.EAST; panel.add(labelUser, gbc);
 * 
 * JTextField campoUser = new JTextField(15); // Campo más ancho
 * campoUser.setFont(font); gbc.gridx = 1; gbc.gridy = 0; gbc.anchor =
 * GridBagConstraints.WEST; panel.add(campoUser, gbc);
 * 
 * // Etiqueta y campo para "Serie" JLabel label1 = new JLabel("Serie:");
 * label1.setFont(font); gbc.gridx = 0; gbc.gridy = 1; gbc.anchor =
 * GridBagConstraints.EAST; panel.add(label1, gbc);
 * 
 * JTextField campo1 = new JTextField(15); campo1.setFont(font); gbc.gridx = 1;
 * gbc.gridy = 1; gbc.anchor = GridBagConstraints.WEST; panel.add(campo1, gbc);
 * 
 * // Etiqueta y campo para "Hardware ID" JLabel label2 = new
 * JLabel("Hardware ID:"); label2.setFont(font); gbc.gridx = 0; gbc.gridy = 2;
 * gbc.anchor = GridBagConstraints.EAST; panel.add(label2, gbc);
 * 
 * JTextField campo2 = new JTextField(15); campo2.setFont(font); gbc.gridx = 1;
 * gbc.gridy = 2; gbc.anchor = GridBagConstraints.WEST;
 * campo2.setText(BuscaMacAddress.getMacAddress()); panel.add(campo2, gbc);
 * 
 * // Etiqueta y campo para "Cant. por día" JLabel labelCant = new
 * JLabel("Cant. por día:"); labelCant.setFont(font); gbc.gridx = 0; gbc.gridy =
 * 3; gbc.anchor = GridBagConstraints.EAST; panel.add(labelCant, gbc);
 * 
 * JTextField campoCant = new JTextField(15); campoCant.setFont(font); gbc.gridx
 * = 1; gbc.gridy = 3; gbc.anchor = GridBagConstraints.WEST;
 * panel.add(campoCant, gbc);
 * 
 * // Crear el botón "Enviar" JButton boton = new JButton("Enviar");
 * boton.setFont(font); gbc.gridx = 0; gbc.gridy = 4; gbc.gridwidth = 2; // El
 * botón ocupará dos columnas gbc.anchor = GridBagConstraints.CENTER;
 * panel.add(boton, gbc);
 * 
 * // Acción al hacer clic en el botón boton.addActionListener(new
 * ActionListener() {
 * 
 * @Override public void actionPerformed(ActionEvent e) { // Obtener el texto de
 * los campos de texto String user = campoUser.getText(); String valorCampo1 =
 * campo1.getText(); String valorCampo2 = campo2.getText(); String cantPorDia =
 * campoCant.getText();
 * 
 * // Mostrar un mensaje con los valores JOptionPane.showMessageDialog(null,
 * "User: " + user + "\nSerie: " + valorCampo1 + "\nHardware ID: " + valorCampo2
 * + "\nCant. por día: " + cantPorDia); } });
 * 
 * // Añadir el panel a la ventana add(panel);
 * 
 * // Hacer la ventana visible setVisible(true); }
 * 
 * public static void main(String[] args) { // Ejecutar la aplicación en el hilo
 * de la interfaz gráfica SwingUtilities.invokeLater(new Runnable() {
 * 
 * @Override public void run() { new Formulario(); } }); } }
 */






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
        setSize(500, 300); // Aumentar el tamaño de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla

        // Crear un panel con GridBagLayout
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL; // Estirar horizontalmente
        gbc.insets = new Insets(10, 10, 10, 10); // Mayor espaciado para agrandar el tamaño
        gbc.weightx = 1; // Asegura que los componentes se expandan en ancho

        Font font = new Font("Arial", Font.PLAIN, 16); // Aumentar el tamaño de la fuente

        // Etiqueta y campo para "User"
        JLabel labelUser = new JLabel("User:");
        labelUser.setFont(font); // Aplicar tamaño de fuente
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(labelUser, gbc);

        JTextField campoUser = new JTextField(15); // Campo más ancho
        campoUser.setFont(font);
        campoUser.setEnabled(false); // Inicialmente bloqueado
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(campoUser, gbc);

        // Etiqueta y campo para "Serie"
        JLabel label1 = new JLabel("Serie:");
        label1.setFont(font);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(label1, gbc);

        JTextField campo1 = new JTextField(15);
        campo1.setFont(font);
        campo1.setEnabled(false); // Inicialmente bloqueado
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(campo1, gbc);

        // Botón para habilitar "Serie"
        JButton botonHabilitarSerie = new JButton("Editar");
        botonHabilitarSerie.setFont(font);
        gbc.gridx = 2;
        gbc.gridy = 1;
        panel.add(botonHabilitarSerie, gbc);

        // Acción del botón para habilitar "Serie"
        botonHabilitarSerie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                campo1.setEnabled(true); // Habilitar el campo
            }
        });

        // Etiqueta y campo para "Hardware ID"
        JLabel label2 = new JLabel("Hardware ID:");
        label2.setFont(font);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(label2, gbc);

        JTextField campo2 = new JTextField(15);
        campo2.setFont(font);
        campo2.setText(BuscaMacAddress.getMacAddress());
        campo2.setEnabled(false); // Inicialmente bloqueado
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(campo2, gbc);

        // Botón para habilitar "Hardware ID"
        JButton botonHabilitarHardware = new JButton("Editar");
        botonHabilitarHardware.setFont(font);
        gbc.gridx = 2;
        gbc.gridy = 2;
        panel.add(botonHabilitarHardware, gbc);

        // Acción del botón para habilitar "Hardware ID"
        botonHabilitarHardware.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                campo2.setEnabled(true); // Habilitar el campo
            }
        });

        // Etiqueta y campo para "Cant. por día"
        JLabel labelCant = new JLabel("Cant. por día:");
        labelCant.setFont(font);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(labelCant, gbc);

        JTextField campoCant = new JTextField(15);
        campoCant.setFont(font);
        campoCant.setEnabled(false); // Inicialmente bloqueado
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(campoCant, gbc);

        // Crear el botón "Enviar"
        JButton boton = new JButton("Enviar");
        boton.setFont(font);
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 1; // El botón ocupará dos columnas
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(boton, gbc);

        // Acción al hacer clic en el botón "Enviar"
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener el texto de los campos de texto
                String user = campoUser.getText();
                String valorCampo1 = campo1.getText();
                String valorCampo2 = campo2.getText();
                String cantPorDia = campoCant.getText();

                // Mostrar un mensaje con los valores
                JOptionPane.showMessageDialog(null,
                    "User: " + user + 
                    "\nSerie: " + valorCampo1 + 
                    "\nHardware ID: " + valorCampo2 + 
                    "\nCant. por día: " + cantPorDia);
            }
        });

        // Añadir el panel a la ventana
        add(panel);

        // Hacer la ventana visible
        setVisible(true);
    }

    public static void main(String[] args) {
        // Ejecutar la aplicación en el hilo de la interfaz gráfica
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Formulario();
            }
        });
    }
}



