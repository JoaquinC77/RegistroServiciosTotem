package app;

import hilo.HiloCambioServicioAutomatico;
import java.awt.Color;
import java.io.IOException;
import java.util.Calendar;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import model.clases.Contrato;
import model.clases.Pasajero;
import model.ws.ContratoWS;
import model.ws.ImpresoraWS;
import model.ws.PasajeroWS;
import model.ws.RegistroServicioWS;


public class RegistrosServicios extends javax.swing.JFrame {

    private RegistroServicioWS conn;
    private Pasajero pasajero;
    public int idServicio;
    private HiloCambioServicioAutomatico hiloCambioSer;

    public RegistrosServicios() {
        initComponents();
        this.setLocationRelativeTo(null);
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        //Hilo para el cambio automatico de servicios
        hiloCambioSer = new HiloCambioServicioAutomatico(lblNombreservicio, btnImprimirBoucher, btnLimpiar, txtRut);
        hiloCambioSer.start();

        // conexion al registro de servicios
        conn = new RegistroServicioWS();

        //foco al campo de rut
        txtRut.requestFocus();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblNombrePersona = new javax.swing.JLabel();
        lblNombreservicio = new javax.swing.JLabel();
        txtRut = new javax.swing.JTextField();
        btnImprimirBoucher = new javax.swing.JButton();
        lblExit = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(255);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_Food_C214_2427858.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 80));

        lblNombrePersona.setBackground(new java.awt.Color(255, 255, 255));
        lblNombrePersona.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 36)); // NOI18N
        lblNombrePersona.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombrePersona.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(lblNombrePersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 380, 80));

        lblNombreservicio.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 36)); // NOI18N
        lblNombreservicio.setText("Servicio: (el elegido)");
        jPanel1.add(lblNombreservicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));

        txtRut.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 36)); // NOI18N
        txtRut.setForeground(new java.awt.Color(51, 51, 51));
        txtRut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRut.setToolTipText("");
        txtRut.setBorder(null);
        txtRut.setCaretColor(new java.awt.Color(153, 153, 153));
        txtRut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRutKeyPressed(evt);
            }
        });
        jPanel1.add(txtRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 380, 80));

        btnImprimirBoucher.setBackground(new java.awt.Color(255, 153, 51));
        btnImprimirBoucher.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 36)); // NOI18N
        btnImprimirBoucher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_business_filled_line_printer_business_managemen_5737119.png"))); // NOI18N
        btnImprimirBoucher.setText(" Imprimir Voucher");
        btnImprimirBoucher.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnImprimirBoucher.setContentAreaFilled(false);
        btnImprimirBoucher.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnImprimirBoucherMouseMoved(evt);
            }
        });
        btnImprimirBoucher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnImprimirBoucherMouseExited(evt);
            }
        });
        btnImprimirBoucher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirBoucherActionPerformed(evt);
            }
        });
        jPanel1.add(btnImprimirBoucher, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 350, 100));

        lblExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_3_58929.png"))); // NOI18N
        lblExit.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblExitMouseMoved(evt);
            }
        });
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblExitMouseExited(evt);
            }
        });
        jPanel1.add(lblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 10, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 380, 20));

        jLabel5.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Acerque Tarjeta o Ingrese RUT");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 520, -1));

        btnLimpiar.setBackground(new java.awt.Color(255, 153, 51));
        btnLimpiar.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 36)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseMoved(evt);
            }
        });
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseExited(evt);
            }
        });
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 540, 310, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImprimirBoucherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirBoucherActionPerformed
        try {
            if (!conn.getValidacionRegistroExistente(pasajero.getId(), hiloCambioSer.getIdServicio())) {
                Calendar calendar = Calendar.getInstance();

                // obtengo la fecha y hora actual
                String servicio = "";
                int mes = (int) calendar.get(Calendar.MONTH) + 1;
                String fecha = String.valueOf(calendar.get(Calendar.YEAR) + "/" + mes + "/" + calendar.get(Calendar.DAY_OF_MONTH));
                String hora = String.valueOf(calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));

                System.out.println(fecha);
                System.out.println(hora);

                try {

                    switch (hiloCambioSer.getIdServicio()) {
                        case 1:
                            servicio = "DESAYUNO";
                            break;
                        case 2:
                            servicio = "ALMUERZO";
                            break;
                        case 3:
                            servicio = "CENA";
                            break;
                        default:
                            servicio = "¡ERROR!";

                    }

                    Contrato contrato = new ContratoWS().getContratoVigenteForIdPasajero(pasajero.getId());
                    
                    System.out.println("SERVICIO: "+hiloCambioSer.getIdServicio());
                    System.out.println("NOMBRE PERSONA: "+pasajero.getNombre());
                    
                    conn.insertRegistroServicio(pasajero.getId(), contrato.getId(), String.valueOf(hiloCambioSer.getIdServicio()));

                    new ImpresoraWS().printVoucher(servicio, pasajero.getNombre(), pasajero.getRut(), fecha + " " + hora);

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "ERROR DE REGISTRO", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "USTED YA ACCEDIO A ESTE SERVICIO", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getLocalizedMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        limpiarCampos();


    }//GEN-LAST:event_btnImprimirBoucherActionPerformed


    private void txtRutKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutKeyPressed

        // if si el campo es mayor a 9 caracteres
        // se busca rut
        if (txtRut.getText().length() > 9) {
            System.out.println("RUT " + txtRut.getText());
            String rut = txtRut.getText();

            try {

                if (new PasajeroWS().getPasajero(rut) != null) {
                    pasajero = new PasajeroWS().getPasajero(rut);
                    lblNombrePersona.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
                    lblNombrePersona.setText(pasajero.getNombre() + " " + pasajero.getApellidoP());

                    txtRut.transferFocus();

                } else {
                    JOptionPane.showMessageDialog(this, "PASAJERO INEXISTENTE");

                    limpiarCampos();
                }

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error de busqueda");
            }
        }

    }//GEN-LAST:event_txtRutKeyPressed

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblExitMouseClicked

    private void btnImprimirBoucherMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirBoucherMouseMoved
        btnImprimirBoucher.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
        btnImprimirBoucher.setContentAreaFilled(true);
        btnImprimirBoucher.setBackground(new Color(238, 112, 82));
    }//GEN-LAST:event_btnImprimirBoucherMouseMoved

    private void btnImprimirBoucherMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirBoucherMouseExited
        btnImprimirBoucher.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
        btnImprimirBoucher.setContentAreaFilled(false);
    }//GEN-LAST:event_btnImprimirBoucherMouseExited

    private void lblExitMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseMoved
        lblExit.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
    }//GEN-LAST:event_lblExitMouseMoved

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        lblExit.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_lblExitMouseExited

    private void btnLimpiarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseMoved
        btnLimpiar.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
        btnLimpiar.setContentAreaFilled(true);
        btnLimpiar.setBackground(new Color(238, 112, 82));
    }//GEN-LAST:event_btnLimpiarMouseMoved

    private void btnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseExited
        btnLimpiar.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
        btnLimpiar.setContentAreaFilled(false);
    }//GEN-LAST:event_btnLimpiarMouseExited

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void limpiarCampos() {
        //vacio los campos
        txtRut.setText("");
        lblNombrePersona.setText("");
        txtRut.requestFocus();
        
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistrosServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrosServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrosServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrosServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrosServicios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImprimirBoucher;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblNombrePersona;
    private javax.swing.JLabel lblNombreservicio;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables
}
