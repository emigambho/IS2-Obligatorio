/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuelouy.interfaz.common;

import java.util.Observable;
import java.util.Observer;
import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class VentanaAlerta extends javax.swing.JFrame implements Observer {

    private ComunicacionPaneles comunicacion;

    /**
     * Creates new form VentanaAlerta
     */
    public VentanaAlerta() {
        initComponents();
    }

    /**
     *
     * @param com
     */
    public VentanaAlerta(ComunicacionPaneles com) {
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

        jPanel1 = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();
        lblTexto = new javax.swing.JLabel();

        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblTexto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTexto, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblTexto;
    // End of variables declaration//GEN-END:variables

    ImageIcon imgDespArrib = new ImageIcon(getClass().getResource("/vuelouy/image/cinto.gif"));
    ImageIcon imgTurb = new ImageIcon(getClass().getResource("/vuelouy/image/cuidado.gif"));
    ImageIcon imgBienv = new ImageIcon(getClass().getResource("/vuelouy/image/saludo.gif"));

    @Override
    public void update(Observable o, Object arg) {
        if (comunicacion.getBMensaje()) {
            if (!comunicacion.getMensaje().equals("Desaparecer")) {
                cargarPanel(comunicacion.getMensaje());
                this.setVisible(true);
            } else {
                this.setVisible(false);
                comunicacion.setbMensaje(false);
            }
        }
    }

    /**
     *
     * @param opcion
     */
    public void cargarPanel(String opcion) {

        switch (opcion) {
            case "Despegando":
                lblImagen.setIcon(imgDespArrib);
                lblTexto.setText(comunicacion.obtenerValorTraducido("VentanaAlerta.lblTexto.despegando"));
                break;
            case "Arribando":
                lblImagen.setIcon(imgDespArrib);
                lblTexto.setText(comunicacion.obtenerValorTraducido("VentanaAlerta.lblTexto.arribando"));
                break;
            case "Turbulencia":
                lblImagen.setIcon(imgTurb);
                lblTexto.setText(comunicacion.obtenerValorTraducido("VentanaAlerta.lblTexto.turbulencia"));
                break;
            case "Bienvenida":
                lblImagen.setIcon(imgBienv);
                lblTexto.setText(comunicacion.obtenerValorTraducido("VentanaAlerta.lblTexto.bienvenida"));
                break;
            default:
                break;
        }
    }

}
