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
            JLabel golonganDarah = new JLabel("Pilih Gol Darah:");
            JRadioButton golA = new JRadioButton("A");
            JRadioButton golB = new JRadioButton("B");
            JRadioButton golO = new JRadioButton("O");
            JRadioButton golAB = new JRadioButton("AB");

            JLabel alamat = new JLabel(" Alamat  :  ");
            JTextField alamatValue = new JTextField(10);
            JLabel RTRW = new JLabel(" RT/RW  :  ");
            JTextField RTRWValue = new JTextField(10);

            JLabel KelDesa= new JLabel("Kel/Desa : ");
            JTextField KelDesaValue = new JTextField(10);
            JLabel kecamatan= new JLabel("Kecamatan : ");
            JTextField kecamatanValue = new JTextField(10);



            JLabel kosong =  new JLabel("\n");
            JLabel kosong2 =  new JLabel("\n");

            JButton submit = new JButton("Submit");

            //NIK
            formPanel.add(NIK);
            formPanel.add(NIKValue);
            //Nama
            formPanel.add(nama);
            formPanel.add(namaValue);
            //Tempat Tanggal lahir
            formPanel.add(tempatL);
            formPanel.add(tempatLValue);
            //Tanggal Lahir
            formPanel.add(tanggalLahir);
            formPanel.add(ttlValue);
            //Jenis Kelamain
            formPanel.add(jenisKelamin);
            formPanel.add(kosong);
            formPanel.add(priaButton);
            formPanel.add(wanitaButton);
            //Golongan Darah
            formPanel.add(golonganDarah);
            formPanel.add(kosong2);
            formPanel.add(golA);
            formPanel.add(golB);
            formPanel.add(golO);
            formPanel.add(golAB);
            //Alamat
            formPanel.add(alamat);
            formPanel.add(alamatValue);
            //RT/RW
            formPanel.add(RTRW);
            formPanel.add(RTRWValue);
            //Kel/Desa
            formPanel.add(KelDesa);
            formPanel.add(KelDesaValue);
            //Kecamatan
            formPanel.add(kecamatan);
            formPanel.add(kecamatanValue);


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
                    String golonganDarah = null;
                    String alamat = alamatValue.getText();

                    if (priaButton.isSelected()) {
                        jenisKelamin = priaButton.getText();
                    } else if (wanitaButton.isSelected()) {
                        jenisKelamin = wanitaButton.getText();
                    }

                    if (golA.isSelected()) {
                        golonganDarah = golA.getText();
                    }else if ( golB.isSelected() ) {
                        golonganDarah = golB.getText();
                        
                    }else if (golO.isSelected()) {
                        golonganDarah = golO.getText();
                        
                    }else if(golAB.isSelected()){
                        golonganDarah = golAB.getText();
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
                                "<b>Golongan Darah:</b> " + golonganDarah + "<br>" +
                                "<b>Alamat:</b> " + alamat + "<br>" +
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
