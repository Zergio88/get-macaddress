package principal;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class Form_QR extends JFrame {

    private JTextField textField;
    private JButton generateButton;
    private JLabel qrLabel;

    public Form_QR() {
        setTitle("Generador de Código QR");
        setSize(450, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        textField = new JTextField(20);
        // la primera vez cargar la caja de texto con la mac-address
        
        generateButton = new JButton("Generar Código QR");
        qrLabel = new JLabel();
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generateQRCode(textField.getText());
            }
        });

        add(new JLabel("Mac-Address:"));
        add(textField);
        add(generateButton);
        add(qrLabel);
    }

    private void generateQRCode(String text) {
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        try {
            BitMatrix bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, 250, 250);
            File qrFile = new File("QRCode.png");
            MatrixToImageWriter.writeToPath(bitMatrix, "PNG", qrFile.toPath());
            qrLabel.setIcon(new ImageIcon(ImageIO.read(qrFile)));
            JOptionPane.showMessageDialog(this, "Código QR generado como QRCode.png");
        } catch (WriterException | IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error generando el código QR: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
        	Form_QR app = new Form_QR();
            app.setVisible(true);
        });
    }
}
