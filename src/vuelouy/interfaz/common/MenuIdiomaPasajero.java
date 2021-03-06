/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vuelouy.interfaz.common;

import java.util.Locale;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author alumnoFI
 */
public class MenuIdiomaPasajero extends javax.swing.JPanel implements Observer{

    /**
     * Creates new form MenuIdiomaPasajero2
     */
    private ComunicacionPaneles comunicacion;

    /**
     *
     */
    public MenuIdiomaPasajero() {
        initComponents();
    }
    
    /**
     *
     * @param com
     */
    public MenuIdiomaPasajero(ComunicacionPaneles com) {
        comunicacion = com;
        comunicacion.addObserver(this);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIdioma = new javax.swing.JLabel();
        btnEspaniol1 = new javax.swing.JButton();
        btnIng1 = new javax.swing.JButton();
        btnFrances = new javax.swing.JButton();
        btnAleman = new javax.swing.JButton();
        btnItaliano = new javax.swing.JButton();

        lblIdioma.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblIdioma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("vuelouy/interfaz/common/Bundle"); // NOI18N
        lblIdioma.setText(bundle.getString("MenuIdiomaPasajero.lblIdioma.text")); // NOI18N

        btnEspaniol1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vuelouy/image/IdiomaEsp.png"))); // NOI18N
        btnEspaniol1.setBorder(null);
        btnEspaniol1.setBorderPainted(false);
        btnEspaniol1.setContentAreaFilled(false);
        btnEspaniol1.setPreferredSize(new java.awt.Dimension(96, 96));
        btnEspaniol1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vuelouy/image/IdiomaEspP.png"))); // NOI18N
        btnEspaniol1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspaniol1ActionPerformed(evt);
            }
        });

        btnIng1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vuelouy/image/IdiomaIng.png"))); // NOI18N
        btnIng1.setBorder(null);
        btnIng1.setBorderPainted(false);
        btnIng1.setContentAreaFilled(false);
        btnIng1.setPreferredSize(new java.awt.Dimension(96, 96));
        btnIng1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vuelouy/image/IdiomaEngP.png"))); // NOI18N
        btnIng1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIng1ActionPerformed(evt);
            }
        });

        btnFrances.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vuelouy/image/IdiomaFra.png"))); // NOI18N
        btnFrances.setBorder(null);
        btnFrances.setBorderPainted(false);
        btnFrances.setContentAreaFilled(false);
        btnFrances.setPreferredSize(new java.awt.Dimension(96, 96));
        btnFrances.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vuelouy/image/IdiomaFraP.png"))); // NOI18N
        btnFrances.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrancesActionPerformed(evt);
            }
        });

        btnAleman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vuelouy/image/IdiomaAleman.png"))); // NOI18N
        btnAleman.setBorder(null);
        btnAleman.setBorderPainted(false);
        btnAleman.setContentAreaFilled(false);
        btnAleman.setPreferredSize(new java.awt.Dimension(96, 96));
        btnAleman.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vuelouy/image/IdiomaAlemanP.png"))); // NOI18N
        btnAleman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlemanActionPerformed(evt);
            }
        });

        btnItaliano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vuelouy/image/IdiomaItaliano.png"))); // NOI18N
        btnItaliano.setBorder(null);
        btnItaliano.setBorderPainted(false);
        btnItaliano.setContentAreaFilled(false);
        btnItaliano.setPreferredSize(new java.awt.Dimension(96, 96));
        btnItaliano.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vuelouy/image/IdiomaItalianoP.png"))); // NOI18N
        btnItaliano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItalianoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 589, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblIdioma, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(142, 142, 142)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnFrances, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnAleman, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnEspaniol1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnIng1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnItaliano, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(143, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 572, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(90, 90, 90)
                    .addComponent(lblIdioma)
                    .addContainerGap(457, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(187, 187, 187)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnEspaniol1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnIng1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnItaliano, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnFrances, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAleman, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(187, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEspaniol1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspaniol1ActionPerformed
        comunicacion.setIdioma(Locale.getDefault());
        comunicacion.cambio();
    }//GEN-LAST:event_btnEspaniol1ActionPerformed

    private void btnIng1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIng1ActionPerformed
        comunicacion.setIdioma(Locale.US);
        comunicacion.cambio();
    }//GEN-LAST:event_btnIng1ActionPerformed

    private void btnFrancesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrancesActionPerformed
        comunicacion.setIdioma(Locale.FRANCE);
        comunicacion.cambio();
    }//GEN-LAST:event_btnFrancesActionPerformed

    private void btnAlemanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlemanActionPerformed
        comunicacion.setIdioma(Locale.GERMANY);
        comunicacion.cambio();
    }//GEN-LAST:event_btnAlemanActionPerformed

    private void btnItalianoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItalianoActionPerformed
        comunicacion.setIdioma(Locale.ITALY);
        comunicacion.cambio();
    }//GEN-LAST:event_btnItalianoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAleman;
    private javax.swing.JButton btnEspaniol1;
    private javax.swing.JButton btnFrances;
    private javax.swing.JButton btnIng1;
    private javax.swing.JButton btnItaliano;
    private javax.swing.JLabel lblIdioma;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object o1) {
        lblIdioma.setText(comunicacion.obtenerValorTraducido("MenuIdiomaPasajero.lblIdioma.text"));
    }

}
