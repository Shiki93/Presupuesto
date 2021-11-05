package Interfaz;


public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Sistema
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        PanelPrincipal = new javax.swing.JPanel();
        lblCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        lblNombreUsuario = new javax.swing.JLabel();
        TabAccounts = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableCuentaCorriente = new javax.swing.JTable();
        btnEditarCuentaCorriente = new javax.swing.JButton();
        btnNuevaCuentaCorriente = new javax.swing.JButton();
        btnEliminarCuentaCorriente = new javax.swing.JButton();
        btnDetalleCuentaCorriente = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablePrestamos = new javax.swing.JTable();
        btnNuevoPrestamo = new javax.swing.JButton();
        btnEliminarPrestamo = new javax.swing.JButton();
        btnDetallePrestamo = new javax.swing.JButton();
        btnEditarPrestamo1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableTarjetas = new javax.swing.JTable();
        btnNuevaTarjeta = new javax.swing.JButton();
        btnEliminarTarjeta = new javax.swing.JButton();
        btnEditarTarjeta = new javax.swing.JButton();
        btnDetalleTarjeta = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnEditarUsuario = new javax.swing.JButton();
        btnChangePassword = new javax.swing.JButton();
        lblBalance = new javax.swing.JLabel();
        txtBalanceDisponible = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCorreo.setFont(new java.awt.Font("8BIT WONDER", 2, 14)); // NOI18N
        lblCorreo.setText("Correo Electronico");
        PanelPrincipal.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 30));

        txtCorreo.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        PanelPrincipal.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 310, 40));

        txtNombre.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        PanelPrincipal.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 310, 40));

        lblNombreUsuario.setFont(new java.awt.Font("8BIT WONDER", 2, 14)); // NOI18N
        lblNombreUsuario.setText("Nombre del usuario");
        PanelPrincipal.add(lblNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 20));

        TabAccounts.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableCuentaCorriente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Fecha Apertura", "Balance", "Moneda", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TableCuentaCorriente);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1060, 490));

        btnEditarCuentaCorriente.setFont(new java.awt.Font("8BIT WONDER", 0, 12)); // NOI18N
        btnEditarCuentaCorriente.setText("Editar cuenta");
        jPanel2.add(btnEditarCuentaCorriente, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 510, 259, 40));

        btnNuevaCuentaCorriente.setFont(new java.awt.Font("8BIT WONDER", 2, 12)); // NOI18N
        btnNuevaCuentaCorriente.setText("Agregar nueva cuenta");
        jPanel2.add(btnNuevaCuentaCorriente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, -1, 40));

        btnEliminarCuentaCorriente.setFont(new java.awt.Font("8BIT WONDER", 2, 12)); // NOI18N
        btnEliminarCuentaCorriente.setText("Eliminar Cuenta");
        jPanel2.add(btnEliminarCuentaCorriente, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 510, 259, 40));

        btnDetalleCuentaCorriente.setFont(new java.awt.Font("8BIT WONDER", 0, 12)); // NOI18N
        btnDetalleCuentaCorriente.setText("Ver Detalles");
        jPanel2.add(btnDetalleCuentaCorriente, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 510, 250, 40));

        TabAccounts.addTab("Cuentas Corriente", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablePrestamos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Saldo a Pagar", "Monto de Pago", "Fecha de Pago", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TablePrestamos);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1060, 490));

        btnNuevoPrestamo.setFont(new java.awt.Font("8BIT WONDER", 2, 12)); // NOI18N
        btnNuevoPrestamo.setText("Agregar nueva cuenta");
        jPanel5.add(btnNuevoPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, -1, 40));

        btnEliminarPrestamo.setFont(new java.awt.Font("8BIT WONDER", 2, 12)); // NOI18N
        btnEliminarPrestamo.setText("Eliminar Cuenta");
        jPanel5.add(btnEliminarPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 510, 259, 40));

        btnDetallePrestamo.setFont(new java.awt.Font("8BIT WONDER", 0, 12)); // NOI18N
        btnDetallePrestamo.setText("Ver Detalles");
        jPanel5.add(btnDetallePrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 510, 250, 40));

        btnEditarPrestamo1.setFont(new java.awt.Font("8BIT WONDER", 0, 12)); // NOI18N
        btnEditarPrestamo1.setText("Editar cuenta");
        jPanel5.add(btnEditarPrestamo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 510, 259, 40));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 570));

        TabAccounts.addTab("Prestamos", jPanel3);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableTarjetas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Saldo a Pagar", "Monto de Pago", "Fecha de Pago", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(TableTarjetas);

        jPanel7.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1060, 490));

        btnNuevaTarjeta.setFont(new java.awt.Font("8BIT WONDER", 2, 12)); // NOI18N
        btnNuevaTarjeta.setText("Agregar nueva cuenta");
        jPanel7.add(btnNuevaTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, -1, 40));

        btnEliminarTarjeta.setFont(new java.awt.Font("8BIT WONDER", 2, 12)); // NOI18N
        btnEliminarTarjeta.setText("Eliminar Cuenta");
        jPanel7.add(btnEliminarTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 510, 259, 40));

        btnEditarTarjeta.setFont(new java.awt.Font("8BIT WONDER", 0, 12)); // NOI18N
        btnEditarTarjeta.setText("Editar cuenta");
        jPanel7.add(btnEditarTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 510, 259, 40));

        btnDetalleTarjeta.setFont(new java.awt.Font("8BIT WONDER", 0, 12)); // NOI18N
        btnDetalleTarjeta.setText("Ver Detalles");
        jPanel7.add(btnDetalleTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 510, 250, 40));

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 570));

        TabAccounts.addTab("Trajetas de Credito", jPanel6);

        PanelPrincipal.add(TabAccounts, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 1080, 600));

        btnLogout.setFont(new java.awt.Font("8BIT WONDER", 0, 12)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 310, 40));

        btnEditarUsuario.setFont(new java.awt.Font("8BIT WONDER", 0, 12)); // NOI18N
        btnEditarUsuario.setText("Editar Usuario");
        PanelPrincipal.add(btnEditarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 310, 40));

        btnChangePassword.setFont(new java.awt.Font("8BIT WONDER", 0, 12)); // NOI18N
        btnChangePassword.setText("Cambiar password");
        PanelPrincipal.add(btnChangePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 310, 40));

        lblBalance.setFont(new java.awt.Font("8BIT WONDER", 2, 14)); // NOI18N
        lblBalance.setText("Balance disponible");
        PanelPrincipal.add(lblBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 30));

        txtBalanceDisponible.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txtBalanceDisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBalanceDisponibleActionPerformed(evt);
            }
        });
        PanelPrincipal.add(txtBalanceDisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 310, 40));

        jTabbedPane1.addTab("Principal", PanelPrincipal);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1450, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBalanceDisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBalanceDisponibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBalanceDisponibleActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        this.setVisible(false);
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JTabbedPane TabAccounts;
    private javax.swing.JTable TableCuentaCorriente;
    private javax.swing.JTable TablePrestamos;
    private javax.swing.JTable TableTarjetas;
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JButton btnDetalleCuentaCorriente;
    private javax.swing.JButton btnDetallePrestamo;
    private javax.swing.JButton btnDetalleTarjeta;
    private javax.swing.JButton btnEditarCuentaCorriente;
    private javax.swing.JButton btnEditarPrestamo1;
    private javax.swing.JButton btnEditarTarjeta;
    private javax.swing.JButton btnEditarUsuario;
    private javax.swing.JButton btnEliminarCuentaCorriente;
    private javax.swing.JButton btnEliminarPrestamo;
    private javax.swing.JButton btnEliminarTarjeta;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnNuevaCuentaCorriente;
    private javax.swing.JButton btnNuevaTarjeta;
    private javax.swing.JButton btnNuevoPrestamo;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JTextField txtBalanceDisponible;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
