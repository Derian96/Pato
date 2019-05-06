/*
    Universidad Nacional de Costa Rica
    Sede Regional Chorotega, Campus Nicoya  
    Ingeniería en Sistemas de Información
    Programación II - EIF204
    Académica: Gloriana Peña Ramírez 

    PROYECTO PROGRAMADO - Facturación JAVA
                                                                                                                       
    Software: Econimic Sails                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
    Grupo: Javafari Team

    Desarrolladores: 
    - Eddie Alfaro 
    - Derian Abarca
    - Diego Aguilar
 */
package gui;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import logica.GestionUsuario;

public class frmLogin extends javax.swing.JFrame {

    public String iduser;
    private final GestionUsuario gestionUsuario;
    private int aux = 3;

    public frmLogin() {

        initComponents();
        //Código para poner icono personalizado al JFrame frmPrincipal
        ImageIcon icon = new ImageIcon(getClass().getResource("/img/company.png"));
        this.setIconImage(icon.getImage());
        txtpassword.setEnabled(false);
        btnlogin.setEnabled(false);
        gestionUsuario = new GestionUsuario();
          
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
        btnlogin = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Iniciar Sesión");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_Login_in_85205.png"))); // NOI18N
        btnlogin.setText("  Ingresar");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_Login_out_85206.png"))); // NOI18N
        btnSalir.setText("  Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_supermarket-shopper-building-shopping_basket-business_and_finance-commerce_and_shopping_4059739 (1).png"))); // NOI18N

        txtusername.setToolTipText("username");
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        txtusername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtusernameKeyReleased(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/users_32x32.png"))); // NOI18N
        jLabel2.setText(" Usuario: ");

        txtpassword.setToolTipText("password");
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        txtpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpasswordKeyReleased(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_key_309058.png"))); // NOI18N
        jLabel3.setText("Contraseña:");

        jLabel4.setText("Powered by Javafari Team");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 63, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // Código del Menu Item salir
        int resp = JOptionPane.showConfirmDialog(rootPane, "¿Esta seguro de salir?", "Salir",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (resp == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtusernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusernameKeyReleased
        if (!txtusername.getText().equals("")) {
            txtpassword.setEnabled(true);
        } else {
            txtpassword.setEnabled(false);
        }
    }//GEN-LAST:event_txtusernameKeyReleased

    private void txtpasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyReleased
        if (!txtpassword.getText().equals("")) {
            btnlogin.setEnabled(true);
        } else {
            btnlogin.setEnabled(false);
        }
    }//GEN-LAST:event_txtpasswordKeyReleased

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        btnlogin.setEnabled(false);
        String username = txtusername.getText();
        String password = String.valueOf(txtpassword.getPassword());

        try {
            login(username, password);
        } catch (SQLException e) {
            gestionUsuario.desconectarBD();
            JOptionPane.showMessageDialog(rootPane, "Ha ocurrido un error al intentar conectarse al sistema, por favor intentelo de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
            limpiar();
        }
    }//GEN-LAST:event_btnloginActionPerformed

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmLogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables

    // Funcion login
    private void login(String username, String password) throws SQLException 
    {
        // Verificamos si el usuario existe Javafari Team
        if (gestionUsuario.usuarioExiste(username)) 
        {
            if(gestionUsuario.verificarPass(username,password))
            {
                String sql = "SELECT * FROM tblusuario WHERE usuario = '" + username + "'";
                gestionUsuario.conectarBD();
                ResultSet rs = gestionUsuario.seleccionar(sql);
            
                // verificamos si existe coincidencia
                if (rs.next())
                {
                    int id_user_session = Integer.parseInt(rs.getString(1));
                    String name_user_session = rs.getString(2);
                    int idtipoUsuario = rs.getInt(7);


                    // Envio de reporte de inicio de sesión del usuario
                    gestionUsuario.Login_log("El usuario " + name_user_session + " ha iniciado session.", id_user_session);

                    JOptionPane.showMessageDialog(rootPane, "Bienvenido: " + name_user_session, "Login", JOptionPane.INFORMATION_MESSAGE);
                    frmPrincipal Principal;
                    Principal = new frmPrincipal();
                    Principal.txtuser.setText(name_user_session);
                    Principal.txtid.setText("" + id_user_session);

                    if(idtipoUsuario == 2)
                    {
                        Principal.mnuCategoriaGestion.setVisible(false);
                        Principal.mnuProveedoresGestion.setVisible(false);
                        Principal.mnuProductosGestion.setVisible(false);
                        Principal.mnuClientesGestion.setVisible(false);
                        Principal.mnuFacturacion.setVisible(false);
                        Principal.mnuVentasIngresosReporte.setVisible(false);
                        Principal.mnuUsuariosGestion.setVisible(false);
                        Principal.mnuAyudaIssue.setVisible(false);
                    } 
                    else if ( idtipoUsuario == 3) 
                    {
                        Principal.mnuCategorias.setVisible(false);
                        Principal.mnuProveedores.setVisible(false);
                        Principal.mnuProductos.setVisible(false);
                        Principal.mnuClientesReporte.setVisible(false);
                        Principal.mnuUsuarios.setVisible(false);
                        Principal.mnuVentas.setVisible(false);
                        Principal.mnuAyudaIssue.setVisible(false);
                    }
                    Principal.setLocationRelativeTo(null);
                    Principal.setVisible(true);
                    this.dispose();
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "El usuario ó la contraseña son incorrectos.", "Error", JOptionPane.WARNING_MESSAGE);
                    aux--;
                    limpiar();
                    gestionUsuario.desconectarBD();
                }
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Contraseña Incorrecta", "Error", JOptionPane.WARNING_MESSAGE);
                limpiar();
                gestionUsuario.desconectarBD();
                
            }
        } 
        else
        {
            JOptionPane.showMessageDialog(rootPane, "El usuario y la contraseña son incorrectos.", "Error", JOptionPane.WARNING_MESSAGE);
            aux--;
            limpiar();
            gestionUsuario.desconectarBD();
        }
        
        // Verificamos si la variable aux, si es igual a cero entonces se cierra el programa
        if (aux == 0) 
        {
            JOptionPane.showMessageDialog(rootPane, "Ha excedido el numero de intentos permitidos, el sistema se cerrará.", "Error", JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }  
    }
    
    // Funcion limpiar permite resetear los input y restablecer los botones
    private void limpiar()
    {
        txtpassword.setText("");
        txtusername.setText("");
        txtpassword.setEnabled(false);
        btnlogin.setEnabled(false);
        txtusername.requestFocus();
    }
}
