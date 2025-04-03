/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package baza;

import java.util.List;

/**
 *
 * @author Uros
 */
public interface GenerickiBroker<T> {

    public List<T> vratiSve() throws Exception;

    public List<T> vratiSve(T parametar, String uslov) throws Exception;

    public void dodaj(T parametar) throws Exception;

    public void promeni(T parametar) throws Exception;

    public void obrisi(T parametar) throws Exception;
}
