/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package baza;

/**
 *
 * @author Uros
 */
public interface BrokerBP<T> extends GenerickiBroker<T> {

    default public void povezi() throws Exception {
        Konekcija.getInstanca().getConnection();
    }

    default public void prekiniVezu() throws Exception {
        Konekcija.getInstanca().getConnection().close();
    }

    default public void sacuvajPromene() throws Exception {
        Konekcija.getInstanca().getConnection().commit();
    }

    default public void ponistiPromene() throws Exception {
        Konekcija.getInstanca().getConnection().rollback();
    }
}
