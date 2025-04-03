/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baza;

import domen.OpstiDomenskiObjekat;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Uros
 */
public class Broker implements BrokerBP<OpstiDomenskiObjekat> {

    @Override
    public List<OpstiDomenskiObjekat> vratiSve(OpstiDomenskiObjekat parametar, String uslov) throws Exception {
        List<OpstiDomenskiObjekat> lista = new LinkedList<>();
        String upit = "SELECT * FROM " + parametar.vratiNazivTabele() + ((uslov == null) ? "" : uslov);
        System.out.println(upit);
        Statement statement = Konekcija.getInstanca().getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(upit);
        lista = parametar.vratiListu(resultSet);
        resultSet.close();
        statement.close();
        return lista;
    }

    @Override
    public void dodaj(OpstiDomenskiObjekat parametar) throws Exception {
        String upit = "INSERT INTO " + parametar.vratiNazivTabele() + " (" + parametar.vratiKoloneZaUbacivanje() + ") VALUES (" + parametar.vratiVrednostiZaUbacivanje() + ")";
        System.out.println(upit);
        Statement statement = Konekcija.getInstanca().getConnection().createStatement();
        statement.executeUpdate(upit);
        statement.close();
    }

    @Override
    public void promeni(OpstiDomenskiObjekat parametar) throws Exception {
        String upit = "UPDATE " + parametar.vratiNazivTabele() + " SET " + parametar.vratiVrednostZaIzmenu() + " WHERE " + parametar.vratiPrimarniKljuc();
        System.out.println(upit);
        Statement statement = Konekcija.getInstanca().getConnection().createStatement();
        statement.executeUpdate(upit);
        statement.close();
    }

    @Override
    public void obrisi(OpstiDomenskiObjekat parametar) throws Exception {
        String upit = "DELETE FROM " + parametar.vratiNazivTabele() + " WHERE " + parametar.vratiPrimarniKljuc();
        System.out.println(upit);
        Statement statement = Konekcija.getInstanca().getConnection().createStatement();
        statement.executeUpdate(upit);
        statement.close();
    }

    @Override
    public List<OpstiDomenskiObjekat> vratiSve() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
