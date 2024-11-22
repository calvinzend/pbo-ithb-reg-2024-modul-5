package view;

import com.toedter.calendar.JDateChooser;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.*;

public class Penduduk {

    static class Frame extends JFrame {
        CardLayout cardLayout = new CardLayout(); 
        JPanel cardPanel = new JPanel(cardLayout);

        public Frame() {
            super("Input Data Penduduk");
            setSize(600, 400);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new BorderLayout());
 
            JPanel inputPage = createInputPage();

            JPanel resultPage = createResultPage();

            cardPanel.add(inputPage, "InputPage");
            cardPanel.add(resultPage, "ResultPage");

            add(cardPanel, BorderLayout.CENTER);

            setVisible(true);
        }

        private JPanel createInputPage() {
            JPanel inputPanel = new JPanel(new BorderLayout());
            JPanel formPanel = new JPanel(new GridLayout(0, 2, 5, 5));

            JLabel NIK = new JLabel(" NIK  :  ");
            JTextField NIKValue = new JTextField(10);
            JLabel nama = new JLabel(" NAMA  :  ");
            JTextField namaValue = new JTextField(10);
            JLabel tempatL = new JLabel(" Tempat Lahir  :  ");
            JTextField tempatLValue = new JTextField(10);
            JLabel tanggalLahir = new JLabel(" Tanggal Lahir  :  ");
            JDateChooser ttlValue = new JDateChooser();
            JRadioButton priaButton = new JRadioButton("Pria");
            JRadioButton wanitaButton = new JRadioButton("Wanita");
            JLabel jenisKelamin = new JLabel("Pilih Jenis Kelamin:");
            JLabel kosong =  new JLabel("\n");

            JButton submit = new JButton("Submit");

            formPanel.add(NIK);
            formPanel.add(NIKValue);
            formPanel.add(nama);
            formPanel.add(namaValue);
            formPanel.add(tempatL);
            formPanel.add(tempatLValue);
            formPanel.add(tanggalLahir);
            formPanel.add(ttlValue);
            formPanel.add(jenisKelamin);
            formPanel.add(kosong);
            formPanel.add(priaButton);
            formPanel.add(wanitaButton);

            inputPanel.add(formPanel, BorderLayout.CENTER);
            inputPanel.add(submit, BorderLayout.SOUTH);

            submit.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String nik = NIKValue.getText().trim();
                    String nama = namaValue.getText().trim();
                    String tempat = tempatLValue.getText().trim();
                    java.util.Date tanggal = ttlValue.getDate();
                    String jenisKelamin = null;

                    if (priaButton.isSelected()) {
                        jenisKelamin = "Pria";
                    } else if (wanitaButton.isSelected()) {
                        jenisKelamin = "Wanita";
                    }

                    if (nik.isEmpty() || nama.isEmpty() || tempat.isEmpty() || tanggal == null) {
                        JOptionPane.showMessageDialog(inputPanel, "Mohon isi semua field!", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    } else {
                        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                        String tanggalFormatted = sdf.format(tanggal);

                        JLabel resultLabel = (JLabel) ((JPanel) cardPanel.getComponent(1)).getComponent(0);
                        String hasil = "<html>" +
                                "<b>NIK:</b> " + nik + "<br>" +
                                "<b>Nama:</b> " + nama + "<br>" +
                                "<b>Tempat, Tanggal Lahir:</b> " + tempat + ", " + tanggalFormatted + "<br>" +
                                "<b>Jenis Kelamin:</b> " + jenisKelamin + "<br>" +
                                "</html>";
                        resultLabel.setText(hasil);

                        cardLayout.show(cardPanel, "ResultPage");
                    }
                }
            });

            return inputPanel;
        }

        private JPanel createResultPage() {
            JPanel resultPanel = new JPanel(new BorderLayout());
            JLabel resultLabel = new JLabel("<html><b>Hasil akan ditampilkan di sini</b></html>", SwingConstants.CENTER);

            JButton backButton = new JButton("Kembali");

            resultPanel.add(resultLabel, BorderLayout.CENTER);
            resultPanel.add(backButton, BorderLayout.SOUTH);

            backButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    cardLayout.show(cardPanel, "InputPage");
                }
            });

            return resultPanel;
        }
    }

    public static void main(String[] args) {
        new Frame();
    }
}
