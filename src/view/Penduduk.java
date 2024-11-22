package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class Penduduk {

    static class Frame extends JFrame {
        JLabel nama = new JLabel("NAMA  :  ");
        JTextField namaValue = new JTextField(10);
        JLabel ttl = new JLabel("Tempat, Tanggal Lahir  :  ");
        JTextField ttlValue = new JTextField(10);


        JButton submit = new JButton("Submit");
        JTextArea resultArea = new JTextArea(5, 20);

        public Frame(){
            super("Input data penduduk");
            setSize(600, 400);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new BorderLayout());

            JPanel p1 = new JPanel(new FlowLayout());
            p1.add(nama);
            p1.add(namaValue);
            p1.add(ttl);
            p1.add(ttlValue);

            resultArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(resultArea);
//
//            getContentPane().add("North", p1);
//            getContentPane().add(p2);
//            getContentPane().add("South", submit);

            add(p1, BorderLayout.NORTH);
            add(submit, BorderLayout.SOUTH);
            add(scrollPane, BorderLayout.CENTER);

            submit.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {

                    String nama = namaValue.getText();
                    String ttl = ttlValue.getText();

                    if (nama.isEmpty() || ttl.isEmpty()) {
                        resultArea.setText("Mohon isi semua field!\n");
                    } else {
                        resultArea.append("Nama: " + nama + "\n");
                        resultArea.append("Tempat, Tanggal Lahir: " + ttl + "\n");
                        resultArea.append("--------------------------\n");
                    }

                    // Kosongkan input setelah submit
                    namaValue.setText("");
                    ttlValue.setText("");
                }
            });
            setVisible(true);
        }


    }

    public static void main(String[] args) {
        new Frame();
    }

}
