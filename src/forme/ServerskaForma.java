/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forme;

import java.awt.BorderLayout;
import paneli.PanelBaza;
import paneli.PanelPort;
import paneli.PanelStatus;

/**
 *
 * @author Uros
 */
public class ServerskaForma extends javax.swing.JFrame {

    /**
     * Creates new form ServerskaForma
     */
    public ServerskaForma() {
        initComponents();
        setLocationRelativeTo(null);
        pnlGlavni.setLayout(new BorderLayout());
        menuItemStatusActionPerformed(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlGlavni = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuItemStatus = new javax.swing.JMenuItem();
        menuItemBaza = new javax.swing.JMenuItem();
        menuItemPort = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout pnlGlavniLayout = new javax.swing.GroupLayout(pnlGlavni);
        pnlGlavni.setLayout(pnlGlavniLayout);
        pnlGlavniLayout.setHorizontalGroup(
            pnlGlavniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );
        pnlGlavniLayout.setVerticalGroup(
            pnlGlavniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 265, Short.MAX_VALUE)
        );

        jMenu1.setText("Meni");

        menuItemStatus.setText("Status servera");
        menuItemStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemStatusActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemStatus);

        menuItemBaza.setText("Konfiguracija baze");
        menuItemBaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBazaActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemBaza);

        menuItemPort.setText("Konfiguracija porta");
        menuItemPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemPortActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemPort);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlGlavni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlGlavni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemStatusActionPerformed
        pnlGlavni.removeAll();
        pnlGlavni.add(PanelStatus.getInstanca());
        pnlGlavni.revalidate();
        pnlGlavni.repaint();
    }//GEN-LAST:event_menuItemStatusActionPerformed

    private void menuItemBazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBazaActionPerformed
        pnlGlavni.removeAll();
        pnlGlavni.add(PanelBaza.getInstanca());
        pnlGlavni.revalidate();
        pnlGlavni.repaint();
    }//GEN-LAST:event_menuItemBazaActionPerformed

    private void menuItemPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemPortActionPerformed
        pnlGlavni.removeAll();
        pnlGlavni.add(PanelPort.getInstanca());
        pnlGlavni.revalidate();
        pnlGlavni.repaint();
    }//GEN-LAST:event_menuItemPortActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuItemBaza;
    private javax.swing.JMenuItem menuItemPort;
    private javax.swing.JMenuItem menuItemStatus;
    private javax.swing.JPanel pnlGlavni;
    // End of variables declaration//GEN-END:variables
}
