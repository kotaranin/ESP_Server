/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konfiguracija;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Uros
 */
public class Konfiguracija {

    private static Konfiguracija instanca;
    private Properties konfiguracija;

    private Konfiguracija() throws IOException {
        konfiguracija = new Properties();
        konfiguracija.load(new FileInputStream(System.getProperty("user.dir") + "\\config\\config.properties"));
    }

    public static Konfiguracija getInstanca() throws IOException {
        if (instanca == null) {
            instanca = new Konfiguracija();
        }
        return instanca;
    }

    public Properties getKonfiguracija() {
        return konfiguracija;
    }

    public void setKonfiguracija(Properties konfiguracija) {
        this.konfiguracija = konfiguracija;
    }

    public String getProperty(String kljuc) {
        return konfiguracija.getProperty(kljuc, "n/a");
    }

    public void setProperty(String kljuc, String vrednost) {
        konfiguracija.setProperty(kljuc, vrednost);
    }
    
    public void sacuvaj() throws IOException {
        konfiguracija.store(new FileOutputStream(System.getProperty("user.dir") + "\\config\\config.properties"), null);
    }

}
