package modul5.controller;

import modul5.model.KTP;
import modul5.view.Penduduk;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PendudukController {
    private final KTP ktp;
    private final Penduduk view;

    public PendudukController(KTP ktp, Penduduk view) {
        this.ktp = ktp;
        this.view = view;

        this.view.getSumbitButton().addActionListener(e -> handleSubmit());
        this.view.getBackButton().addActionListener(e -> handleBack());
       
    }


    private void handleSubmit() {
        try {
            KTP ktp = new KTP(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
            System.out.println("Tes");

        } catch (Exception ex) {
           System.out.println("Error");
        }
    }

    private void handleBack() {
      
    }
}
