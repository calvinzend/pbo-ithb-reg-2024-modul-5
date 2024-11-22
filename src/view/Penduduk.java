package view;

import com.toedter.calendar.JDateChooser;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class Penduduk {

    static class Frame extends JFrame {
        JLabel NIK = new JLabel("NIK  :  ");
        JTextField NIKValue = new JTextField(10);
        JLabel nama = new JLabel("NAMA  :  ");
        JTextField namaValue = new JTextField(10);
        JLabel tempatL = new JLabel("Tempat Lahir  :  ");
        JTextField tempatLValue = new JTextField(10);
        JLabel tanggalLahir = new JLabel("Tanggal Lahir  :  ");
        private JDateChooser ttlValue = new JDateChooser();
        
        JTextArea resultArea = new JTextArea(5, 20);

        JButton submit = new JButton("Submit");

        public Frame() {
            super("Input Data Penduduk");
            setSize(600, 400);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new BorderLayout());

            JPanel p1 = new JPanel(new GridLayout(0, 2, 5, 5));
            p1.add(NIK);
            p1.add(NIKValue);
            p1.add(nama);
            p1.add(namaValue);
            p1.add(tempatL);
            p1.add(tempatLValue);
            p1.add(tanggalLahir);
            p1.add(ttlValue);

            resultArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(resultArea);

            add(p1, BorderLayout.NORTH);
            add(scrollPane, BorderLayout.CENTER);
            add(submit, BorderLayout.SOUTH);

            submit.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String nik = NIKValue.getText().trim();
                    String nama = namaValue.getText().trim();
                    String tempat = tempatLValue.getText().trim();
                    java.util.Date tanggal = ttlValue.getDate();

                    if (nik.isEmpty() || nama.isEmpty() || tempat.isEmpty() || tanggal == null) {
                        resultArea.setText("Mohon isi semua field!\n");
                        return;
                    }else{
                        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                        String tanggalFormatted = sdf.format(tanggal);
    
                        resultArea.append("NIK: " + nik + "\n");
                        resultArea.append("Nama: " + nama + "\n");
                        resultArea.append("Tempat, Tanggal Lahir: " + tempat + ", " + tanggalFormatted + "\n");
                        resultArea.append("--------------------------\n");
                        
                    }

                    NIKValue.setText("");
                    namaValue.setText("");
                    tempatLValue.setText("");
                    ttlValue.setDate(null);
                }
            });

            setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Frame();
    }
}
