/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import niti.ObradaZahteva;

/**
 *
 * @author Uros
 */
public class Server extends Thread {

    private boolean kraj;
    private ServerSocket serverSocket;
    private List<ObradaZahteva> klijenti;

    public Server() {
        kraj = false;
        klijenti = new LinkedList<>();
    }

    @Override
    public void run() {
        try {
            serverSocket = new ServerSocket(9000);
            System.out.println("Server pokrenut...");
            while (!kraj) {
                Socket socket = serverSocket.accept();
                ObradaZahteva obradaZahteva = new ObradaZahteva(socket);
                klijenti.add(obradaZahteva);
                obradaZahteva.start();
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void zaustavi() throws IOException {
        kraj = true;
        for (ObradaZahteva klijent : klijenti) {
            klijent.prekini();
        }
        serverSocket.close();
    }
}
