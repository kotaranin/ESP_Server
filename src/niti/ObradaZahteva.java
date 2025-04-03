/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package niti;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import komunikacija.Odgovor;
import komunikacija.Posiljalac;
import komunikacija.Primalac;
import komunikacija.Zahtev;

/**
 *
 * @author Uros
 */
public class ObradaZahteva extends Thread {
    
    private boolean kraj;
    private Socket socket;
    private Posiljalac posiljalac;
    private Primalac primalac;

    public ObradaZahteva(Socket socket) {
        this.kraj = false;
        this.socket = socket;
        posiljalac = new Posiljalac(socket);
        primalac = new Primalac(socket);
    }

    @Override
    public void run() {
        while (!kraj) {
            try {
                Zahtev zahtev = (Zahtev) primalac.primi();
                Odgovor odgovor = new Odgovor();
                switch (zahtev.getOperacija()) {
                    case LOG_IN:

                        break;
                    default:
                        throw new AssertionError("Greska, nepostojeca operacija!");
                }
                posiljalac.posalji(odgovor);
            } catch (IOException ex) {
                Logger.getLogger(ObradaZahteva.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ObradaZahteva.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void prekini() throws IOException {
        kraj = true;
        socket.close();
        interrupt();
    }

}
