/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuelouy.interfaz.common;

import vuelouy.dominio.Pedido;
import vuelouy.dominio.Viaje;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
/**
 *
 * @author Usuario
 */
public class MenuPedidos extends javax.swing.JPanel implements Observer {

    /**
     * Creates new form MenuListaPedido
     */
    private ComunicacionPaneles comunicacion;
    private Viaje viaje;

    /**
     *
     */
    public MenuPedidos() {
        initComponents();
    }

    /**
     *
     * @param p
     */
    public MenuPedidos(ComunicacionPaneles p, Viaje v) {
        viaje = v;
        comunicacion = p;
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

        lblPedidos = new javax.swing.JLabel();
        panelBebida = new javax.swing.JPanel();
        btnRefresco = new javax.swing.JButton();
        btnCafe = new javax.swing.JButton();
        btnAgua = new javax.swing.JButton();
        btnWhisky = new javax.swing.JButton();
        panelComida = new javax.swing.JPanel();
        btnCena = new javax.swing.JButton();
        btnMerienda = new javax.swing.JButton();
        btnDesayuno = new javax.swing.JButton();
        btnAlmuerzo = new javax.swing.JButton();
        panelOtros = new javax.swing.JPanel();
        btnAyuda = new javax.swing.JButton();
        btnAlmohada = new javax.swing.JButton();
        btnAuriculares = new javax.swing.JButton();
        btnManta = new javax.swing.JButton();

        lblPedidos.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("vuelouy/interfaz/common/Bundle"); // NOI18N
        lblPedidos.setText(bundle.getString("MenuPedidos.lblPedidos.text")); // NOI18N

        panelBebida.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, bundle.getString("MenuPedidos.panelBebida.border.border.title"), javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12)), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        btnRefresco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRefresco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vuelouy/image/Btn.png"))); // NOI18N
        btnRefresco.setText(bundle.getString("MenuPedidos.btnRefresco.text")); // NOI18N
        btnRefresco.setBorderPainted(false);
        btnRefresco.setContentAreaFilled(false);
        btnRefresco.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRefresco.setPreferredSize(new java.awt.Dimension(300, 28));
        btnRefresco.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vuelouy/image/BtnP.png"))); // NOI18N
        btnRefresco.setRolloverEnabled(false);
        btnRefresco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefrescoActionPerformed(evt);
            }
        });

        btnCafe.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCafe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vuelouy/image/Btn.png"))); // NOI18N
        btnCafe.setText(bundle.getString("MenuPedidos.btnCafe.text")); // NOI18N
        btnCafe.setBorderPainted(false);
        btnCafe.setContentAreaFilled(false);
        btnCafe.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCafe.setPreferredSize(new java.awt.Dimension(300, 28));
        btnCafe.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vuelouy/image/BtnP.png"))); // NOI18N
        btnCafe.setRolloverEnabled(false);
        btnCafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCafeActionPerformed(evt);
            }
        });

        btnAgua.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAgua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vuelouy/image/Btn.png"))); // NOI18N
        btnAgua.setText(bundle.getString("MenuPedidos.btnAgua.text")); // NOI18N
        btnAgua.setBorderPainted(false);
        btnAgua.setContentAreaFilled(false);
        btnAgua.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAgua.setPreferredSize(new java.awt.Dimension(300, 28));
        btnAgua.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vuelouy/image/BtnP.png"))); // NOI18N
        btnAgua.setRolloverEnabled(false);
        btnAgua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAguaActionPerformed(evt);
            }
        });

        btnWhisky.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnWhisky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vuelouy/image/Btn.png"))); // NOI18N
        btnWhisky.setText("Whisky"); // NOI18N
        btnWhisky.setToolTipText(bundle.getString("MenuPedidos.btnWhisky.toolTipText")); // NOI18N
        btnWhisky.setActionCommand(bundle.getString("MenuPedidos.btnWhisky.actionCommand")); // NOI18N
        btnWhisky.setBorderPainted(false);
        btnWhisky.setContentAreaFilled(false);
        btnWhisky.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnWhisky.setPreferredSize(new java.awt.Dimension(300, 28));
        btnWhisky.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vuelouy/image/BtnP.png"))); // NOI18N
        btnWhisky.setRolloverEnabled(false);
        btnWhisky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWhiskyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBebidaLayout = new javax.swing.GroupLayout(panelBebida);
        panelBebida.setLayout(panelBebidaLayout);
        panelBebidaLayout.setHorizontalGroup(
            panelBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBebidaLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panelBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnWhisky, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCafe, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresco, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
        panelBebidaLayout.setVerticalGroup(
            panelBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBebidaLayout.createSequentialGroup()
                .addComponent(btnWhisky, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnCafe, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnRefresco, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        panelComida.setBorder(javax.swing.BorderFactory.createTitledBorder(null, bundle.getString("MenuPedidos.panelComida.border.title"), javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        btnCena.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vuelouy/image/Btn.png"))); // NOI18N
        btnCena.setText(bundle.getString("MenuPedidos.btnCena.text")); // NOI18N
        btnCena.setBorderPainted(false);
        btnCena.setContentAreaFilled(false);
        btnCena.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCena.setPreferredSize(new java.awt.Dimension(125, 96));
        btnCena.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vuelouy/image/BtnP.png"))); // NOI18N
        btnCena.setRolloverEnabled(false);
        btnCena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCenaActionPerformed(evt);
            }
        });

        btnMerienda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnMerienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vuelouy/image/Btn.png"))); // NOI18N
        btnMerienda.setText(bundle.getString("MenuPedidos.btnMerienda.text")); // NOI18N
        btnMerienda.setBorderPainted(false);
        btnMerienda.setContentAreaFilled(false);
        btnMerienda.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMerienda.setPreferredSize(new java.awt.Dimension(125, 96));
        btnMerienda.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vuelouy/image/BtnP.png"))); // NOI18N
        btnMerienda.setRolloverEnabled(false);
        btnMerienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMeriendaActionPerformed(evt);
            }
        });

        btnDesayuno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDesayuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vuelouy/image/Btn.png"))); // NOI18N
        btnDesayuno.setText(bundle.getString("MenuPedidos.btnDesayuno.text")); // NOI18N
        btnDesayuno.setBorderPainted(false);
        btnDesayuno.setContentAreaFilled(false);
        btnDesayuno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDesayuno.setPreferredSize(new java.awt.Dimension(125, 96));
        btnDesayuno.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vuelouy/image/BtnP.png"))); // NOI18N
        btnDesayuno.setRolloverEnabled(false);
        btnDesayuno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesayunoActionPerformed(evt);
            }
        });

        btnAlmuerzo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAlmuerzo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vuelouy/image/Btn.png"))); // NOI18N
        btnAlmuerzo.setText(bundle.getString("MenuPedidos.btnAlmuerzo.text")); // NOI18N
        btnAlmuerzo.setBorderPainted(false);
        btnAlmuerzo.setContentAreaFilled(false);
        btnAlmuerzo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAlmuerzo.setPreferredSize(new java.awt.Dimension(125, 96));
        btnAlmuerzo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vuelouy/image/BtnP.png"))); // NOI18N
        btnAlmuerzo.setRolloverEnabled(false);
        btnAlmuerzo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlmuerzoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelComidaLayout = new javax.swing.GroupLayout(panelComida);
        panelComida.setLayout(panelComidaLayout);
        panelComidaLayout.setHorizontalGroup(
            panelComidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelComidaLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panelComidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelComidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelComidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMerienda, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCena, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnAlmuerzo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnDesayuno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
        panelComidaLayout.setVerticalGroup(
            panelComidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelComidaLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(btnDesayuno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnAlmuerzo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnCena, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnMerienda, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        panelOtros.setBorder(javax.swing.BorderFactory.createTitledBorder(null, bundle.getString("MenuPedidos.panelOtros.border.title"), javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        btnAyuda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vuelouy/image/Btn.png"))); // NOI18N
        btnAyuda.setText(bundle.getString("MenuPedidos.btnAyuda.text")); // NOI18N
        btnAyuda.setBorderPainted(false);
        btnAyuda.setContentAreaFilled(false);
        btnAyuda.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAyuda.setPreferredSize(new java.awt.Dimension(300, 28));
        btnAyuda.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vuelouy/image/BtnP.png"))); // NOI18N
        btnAyuda.setRolloverEnabled(false);
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
            }
        });

        btnAlmohada.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAlmohada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vuelouy/image/Btn.png"))); // NOI18N
        btnAlmohada.setText(bundle.getString("MenuPedidos.btnAlmohada.text")); // NOI18N
        btnAlmohada.setBorderPainted(false);
        btnAlmohada.setContentAreaFilled(false);
        btnAlmohada.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAlmohada.setPreferredSize(new java.awt.Dimension(300, 28));
        btnAlmohada.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vuelouy/image/BtnP.png"))); // NOI18N
        btnAlmohada.setRolloverEnabled(false);
        btnAlmohada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlmohadaActionPerformed(evt);
            }
        });

        btnAuriculares.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAuriculares.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vuelouy/image/Btn.png"))); // NOI18N
        btnAuriculares.setText(bundle.getString("MenuPedidos.btnAuriculares.text")); // NOI18N
        btnAuriculares.setBorderPainted(false);
        btnAuriculares.setContentAreaFilled(false);
        btnAuriculares.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAuriculares.setPreferredSize(new java.awt.Dimension(300, 28));
        btnAuriculares.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vuelouy/image/BtnP.png"))); // NOI18N
        btnAuriculares.setRolloverEnabled(false);
        btnAuriculares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAuricularesActionPerformed(evt);
            }
        });

        btnManta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnManta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vuelouy/image/Btn.png"))); // NOI18N
        btnManta.setText(bundle.getString("MenuPedidos.btnManta.text")); // NOI18N
        btnManta.setBorderPainted(false);
        btnManta.setContentAreaFilled(false);
        btnManta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnManta.setPreferredSize(new java.awt.Dimension(300, 28));
        btnManta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vuelouy/image/BtnP.png"))); // NOI18N
        btnManta.setRolloverEnabled(false);
        btnManta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMantaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelOtrosLayout = new javax.swing.GroupLayout(panelOtros);
        panelOtros.setLayout(panelOtrosLayout);
        panelOtrosLayout.setHorizontalGroup(
            panelOtrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOtrosLayout.createSequentialGroup()
                .addGroup(panelOtrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAuriculares, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlmohada, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManta, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
        panelOtrosLayout.setVerticalGroup(
            panelOtrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOtrosLayout.createSequentialGroup()
                .addComponent(btnAlmohada, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnManta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnAuriculares, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblPedidos))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(panelOtros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(panelBebida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPedidos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(panelBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(panelOtros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefrescoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefrescoActionPerformed
        viaje.agregarPedido(new Pedido(viaje.getAsiento(), "Refresco"));
        comunicacion.setPanel(" ");
        comunicacion.cambio();
        showMessageDialog(this, comunicacion.obtenerValorTraducido("MenuPedidos.mensaje"), "", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnRefrescoActionPerformed

    private void btnCafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCafeActionPerformed
        viaje.agregarPedido(new Pedido(viaje.getAsiento(), "Cafe"));
        comunicacion.setPanel(" ");
        comunicacion.cambio();
        showMessageDialog(this, comunicacion.obtenerValorTraducido("MenuPedidos.mensaje"), "", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnCafeActionPerformed

    private void btnAguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAguaActionPerformed
        viaje.agregarPedido(new Pedido(viaje.getAsiento(), "Agua Mineral"));
        comunicacion.setPanel(" ");
        comunicacion.cambio();
        showMessageDialog(this, comunicacion.obtenerValorTraducido("MenuPedidos.mensaje"), "", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnAguaActionPerformed

    private void btnWhiskyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWhiskyActionPerformed
        viaje.agregarPedido(new Pedido(viaje.getAsiento(), "Whisky"));
        comunicacion.setPanel(" ");
        comunicacion.cambio();
        showMessageDialog(this, comunicacion.obtenerValorTraducido("MenuPedidos.mensaje"), "", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnWhiskyActionPerformed

    private void btnCenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCenaActionPerformed
        viaje.agregarPedido(new Pedido(viaje.getAsiento(), "Cena"));
        comunicacion.setPanel(" ");
        comunicacion.cambio();
        showMessageDialog(this, comunicacion.obtenerValorTraducido("MenuPedidos.mensaje"), "", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnCenaActionPerformed

    private void btnMeriendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMeriendaActionPerformed
        viaje.agregarPedido(new Pedido(viaje.getAsiento(), "Merienda"));
        comunicacion.setPanel(" ");
        comunicacion.cambio();
        showMessageDialog(this, comunicacion.obtenerValorTraducido("MenuPedidos.mensaje"), "", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnMeriendaActionPerformed

    private void btnDesayunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesayunoActionPerformed
        viaje.agregarPedido(new Pedido(viaje.getAsiento(), "Desayuno"));
        comunicacion.setPanel(" ");
        comunicacion.cambio();
        showMessageDialog(this, comunicacion.obtenerValorTraducido("MenuPedidos.mensaje"), "", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnDesayunoActionPerformed

    private void btnAlmuerzoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlmuerzoActionPerformed
        viaje.agregarPedido(new Pedido(viaje.getAsiento(), "Almuerzo"));
        comunicacion.setPanel(" ");
        comunicacion.cambio();
        showMessageDialog(this, comunicacion.obtenerValorTraducido("MenuPedidos.mensaje"), "", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnAlmuerzoActionPerformed

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        viaje.agregarPedido(new Pedido(viaje.getAsiento(), "Ayuda"));
        comunicacion.setPanel(" ");
        comunicacion.cambio();
        showMessageDialog(this, comunicacion.obtenerValorTraducido("MenuPedidos.mensaje"), "", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnAyudaActionPerformed

    private void btnAlmohadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlmohadaActionPerformed
        viaje.agregarPedido(new Pedido(viaje.getAsiento(), "Almohada"));
        comunicacion.setPanel(" ");
        comunicacion.cambio();
        showMessageDialog(this, comunicacion.obtenerValorTraducido("MenuPedidos.mensaje"), "", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnAlmohadaActionPerformed

    private void btnAuricularesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAuricularesActionPerformed
        viaje.agregarPedido(new Pedido(viaje.getAsiento(), "Auriculares"));
        comunicacion.setPanel(" ");
        comunicacion.cambio();
        showMessageDialog(this, comunicacion.obtenerValorTraducido("MenuPedidos.mensaje"), "", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnAuricularesActionPerformed

    private void btnMantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMantaActionPerformed
        viaje.agregarPedido(new Pedido(viaje.getAsiento(), "Manta"));
        comunicacion.setPanel(" ");
        comunicacion.cambio();
        showMessageDialog(this, comunicacion.obtenerValorTraducido("MenuPedidos.mensaje"), "", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnMantaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgua;
    private javax.swing.JButton btnAlmohada;
    private javax.swing.JButton btnAlmuerzo;
    private javax.swing.JButton btnAuriculares;
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnCafe;
    private javax.swing.JButton btnCena;
    private javax.swing.JButton btnDesayuno;
    private javax.swing.JButton btnManta;
    private javax.swing.JButton btnMerienda;
    private javax.swing.JButton btnRefresco;
    private javax.swing.JButton btnWhisky;
    private javax.swing.JLabel lblPedidos;
    private javax.swing.JPanel panelBebida;
    private javax.swing.JPanel panelComida;
    private javax.swing.JPanel panelOtros;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        if (comunicacion.getBPanel()) {
            this.setVisible(false);
            comunicacion.getVentanaInicioP().mostrarSubMenu(comunicacion.getPanel());
        }
        panelBebida.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, comunicacion.obtenerValorTraducido("MenuPedidos.panelBebida.border.border.title"), javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12)), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12)));
        panelComida.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, comunicacion.obtenerValorTraducido("MenuPedidos.panelComida.border.title"), javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12)), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12)));
        panelOtros.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, comunicacion.obtenerValorTraducido("MenuPedidos.panelOtros.border.title"), javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12)), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12)));
        lblPedidos.setText(comunicacion.obtenerValorTraducido("MenuPedidos.lblPedidos.text"));
        btnAlmohada.setText(comunicacion.obtenerValorTraducido("MenuPedidos.btnAlmohada.text"));
        btnAuriculares.setText(comunicacion.obtenerValorTraducido("MenuPedidos.btnAuriculares.text"));
        btnAyuda.setText(comunicacion.obtenerValorTraducido("MenuPedidos.btnAyuda.text"));
        btnManta.setText(comunicacion.obtenerValorTraducido("MenuPedidos.btnManta.text"));
        btnAlmuerzo.setText(comunicacion.obtenerValorTraducido("MenuPedidos.btnAlmuerzo.text"));
        btnCena.setText(comunicacion.obtenerValorTraducido("MenuPedidos.btnCena.text"));
        btnDesayuno.setText(comunicacion.obtenerValorTraducido("MenuPedidos.btnDesayuno.text"));
        btnMerienda.setText(comunicacion.obtenerValorTraducido("MenuPedidos.btnMerienda.text"));
        btnWhisky.setText(comunicacion.obtenerValorTraducido("MenuPedidos.btnWhisky.actionCommand"));
        btnAgua.setText(comunicacion.obtenerValorTraducido("MenuPedidos.btnAgua.text"));
        btnCafe.setText(comunicacion.obtenerValorTraducido("MenuPedidos.btnCafe.text"));
        btnRefresco.setText(comunicacion.obtenerValorTraducido("MenuPedidos.btnRefresco.text"));
    }
}
