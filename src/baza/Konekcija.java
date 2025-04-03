/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baza;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import konfiguracija.Konfiguracija;

/**
 *
 * @author Uros
 */
public class Konekcija {

    private static Konekcija instanca;
    private Connection connection;

    private Konekcija() throws IOException, SQLException {
        if (connection == null || connection.isClosed()) {
            String url = Konfiguracija.getInstanca().getProperty("URL");
            String korisnickoIme = Konfiguracija.getInstanca().getProperty("korisnicko_ime");
            String lozinka = Konfiguracija.getInstanca().getProperty("lozinka");
            connection = DriverManager.getConnection(url, korisnickoIme, lozinka);
            connection.setAutoCommit(false);
        }
    }

    public static Konekcija getInstanca() throws IOException, SQLException {
        if (instanca == null) {
            instanca = new Konekcija();
        }
        return instanca;
    }

    public Connection getConnection() {
        return connection;
    }

}
