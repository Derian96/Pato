/*
    Universidad Nacional de Costa Rica
    Sede Regional Chorotega, Campus Nicoya  
    Ingeniería en Sistemas de Información
    Programación II - EIF204
    Académica: Gloriana Peña Ramírez 

    PROYECTO PROGRAMADO - Facturación JAVA

    Desarrolladores: 
    - Eddie Alfaro 
    - Derian Abarca
    - Diego Aguilar
*/ 

package gui;

import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import logica.GestionProveedor;
import logica.Proveedor;

public class frmProveedores extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmProveedores
     */
    
    GestionProveedor gestionProveedor;
    Proveedor proveedor;
    
    public frmProveedores() {
        initComponents();
        gestionProveedor = new GestionProveedor();
        proveedor = null;
        listarProveedores();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        winProveedor = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIdProveedor = new javax.swing.JTextField();
        txtCompañia = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtRepresentante = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        popMnuProveedores = new javax.swing.JPopupMenu();
        popMnuEditar = new javax.swing.JMenuItem();
        popMnuEliminar = new javax.swing.JMenuItem();
        popMnuImprimir = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        popMnuCerrar = new javax.swing.JMenuItem();
        barraHerramientas = new javax.swing.JToolBar();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProveedores = new javax.swing.JTable();
        lblTotal = new javax.swing.JLabel();

        winProveedor.setAlwaysOnTop(true);
        winProveedor.setMinimumSize(new java.awt.Dimension(465, 403));
        winProveedor.setResizable(false);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel1.setText("Datos proveedor");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Id Proveedor");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Compañia");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("Representante");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setText("Teléfono");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(txtIdProveedor))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(txtCompañia, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCompañia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        btnSalvar.setText("Guardar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout winProveedorLayout = new javax.swing.GroupLayout(winProveedor.getContentPane());
        winProveedor.getContentPane().setLayout(winProveedorLayout);
        winProveedorLayout.setHorizontalGroup(
            winProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, winProveedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(winProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(winProveedorLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        winProveedorLayout.setVerticalGroup(
            winProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(winProveedorLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(winProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        popMnuEditar.setText("Editar");
        popMnuEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popMnuEditarActionPerformed(evt);
            }
        });
        popMnuProveedores.add(popMnuEditar);

        popMnuEliminar.setLabel("Eliminar");
        popMnuEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popMnuEliminarActionPerformed(evt);
            }
        });
        popMnuProveedores.add(popMnuEliminar);

        popMnuImprimir.setLabel("Imprimir");
        popMnuImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popMnuImprimirActionPerformed(evt);
            }
        });
        popMnuProveedores.add(popMnuImprimir);
        popMnuProveedores.add(jSeparator1);

        popMnuCerrar.setLabel("Cerrar");
        popMnuCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popMnuCerrarActionPerformed(evt);
            }
        });
        popMnuProveedores.add(popMnuCerrar);

        setTitle("Proveedores");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/img/provedury_32x32.png"))); // NOI18N

        barraHerramientas.setFloatable(false);
        barraHerramientas.setRollover(true);

        btnGuardar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setFocusable(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        barraHerramientas.add(btnGuardar);

        btnEditar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setFocusable(false);
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        barraHerramientas.add(btnEditar);

        btnEliminar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setFocusable(false);
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        barraHerramientas.add(btnEliminar);

        btnImprimir.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/printer.png"))); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.setFocusable(false);
        btnImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImprimir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        barraHerramientas.add(btnImprimir);

        btnCerrar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit_32x32.png"))); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.setFocusable(false);
        btnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        barraHerramientas.add(btnCerrar);

        tblProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Compañia", "Contacto", "Teléfono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProveedores.setComponentPopupMenu(popMnuProveedores);
        tblProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProveedoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProveedores);

        lblTotal.setText("Total: 0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(477, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(barraHerramientas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(486, Short.MAX_VALUE)
                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(barraHerramientas, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(43, 43, 43)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // Código para mostrar winProveedor
        guardar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // Código para abrir el JDialog winProveedor cuando se desea editar un proveedores existente
        editar();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       // Llamada al método eliminarProveedor
       eliminar();        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // Código del botón cerrar del formulario frmProveedor
        this.setVisible(false);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // Botón Guardar de la ventana winCategoria
        salvar();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // Código del botón cancelar de winProveedor
        winProveedor.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void popMnuEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popMnuEditarActionPerformed
        btnEditarActionPerformed(evt);
    }//GEN-LAST:event_popMnuEditarActionPerformed

    private void popMnuEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popMnuEliminarActionPerformed
        btnEliminarActionPerformed(evt);
    }//GEN-LAST:event_popMnuEliminarActionPerformed

    private void popMnuImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popMnuImprimirActionPerformed
        // Reporte con parametros (idProducto)
    }//GEN-LAST:event_popMnuImprimirActionPerformed

    private void popMnuCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popMnuCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_popMnuCerrarActionPerformed

    private void tblProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProveedoresMouseClicked
        // evento doble clic. Hace llamada al código del botón btnEditar (Reutilización de código
        if (evt.getClickCount() == 2){ // Si le dio doble clic
            btnEditarActionPerformed (new ActionEvent(tblProveedores, 0, ""));
        }
    }//GEN-LAST:event_tblProveedoresMouseClicked

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
         // Llamamos al metodo para crear el reporte de productos
        gestionProveedor.cargarReporteProveedores();
    }//GEN-LAST:event_btnImprimirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar barraHerramientas;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JMenuItem popMnuCerrar;
    private javax.swing.JMenuItem popMnuEditar;
    private javax.swing.JMenuItem popMnuEliminar;
    private javax.swing.JMenuItem popMnuImprimir;
    private javax.swing.JPopupMenu popMnuProveedores;
    private javax.swing.JTable tblProveedores;
    private javax.swing.JTextField txtCompañia;
    private javax.swing.JTextField txtIdProveedor;
    private javax.swing.JTextField txtRepresentante;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JDialog winProveedor;
    // End of variables declaration//GEN-END:variables
    
    private void listarProveedores() {
        
        gestionProveedor.conectarBD();
        ResultSet rs = gestionProveedor.listarProveedores();
        
        if (rs != null) {
            tblProveedores.setModel(gestionProveedor.cargarEnTabla(rs));
            lblTotal.setText("Total: " + tblProveedores.getRowCount());
        }
        
        gestionProveedor.desconectarBD();
    }
    
    private void guardar(){
        winProveedor.setSize(360, 260);
        winProveedor.setTitle("Guardar");
        ImageIcon img = new ImageIcon(getClass().getResource("/img/save.png"));
        winProveedor.setIconImage(img.getImage());
        txtIdProveedor.setEditable(true);
        txtIdProveedor.setText("");
        txtCompañia.setText("");
        txtRepresentante.setText("");
        txtTelefono.setText("");
           
        winProveedor.setLocationRelativeTo(tblProveedores);
        winProveedor.setVisible(true);
    }
    private void salvar(){
        String msg = validarDatos();
        
        if (msg.equals("")) {
            proveedor = new Proveedor();
            proveedor.setidProveedor(Integer.parseInt(txtIdProveedor.getText()));
            proveedor.setCompañia(txtCompañia.getText());
            proveedor.setRepresentante(txtRepresentante.getText());
            proveedor.setTelefono(txtTelefono.getText());

            // ==========================    ====================== //
            if(winProveedor.getTitle().equals("Guardar")){
                if (gestionProveedor.insertarProveedor(proveedor)){
                    JOptionPane.showMessageDialog(winProveedor, "Proveedor almacenado exitosamente", "Guardar", JOptionPane.INFORMATION_MESSAGE);
                    winProveedor.dispose();
                    listarProveedores();
                } else {
                    JOptionPane.showMessageDialog(winProveedor, "Error al intentar guardar proveedir", "Guardar", JOptionPane.ERROR_MESSAGE);
                }
            }
            // =======================   ========================= //
            if(winProveedor.getTitle().equals("Editar")){
                if (gestionProveedor.editarProveedor(proveedor)){
                    JOptionPane.showMessageDialog(winProveedor, "Proveedor editado exitosamente", "Editar", JOptionPane.INFORMATION_MESSAGE);
                    winProveedor.dispose();
                    listarProveedores();
                } else {
                    JOptionPane.showMessageDialog(winProveedor, "Error al intentar editar proveedor", "Editar", JOptionPane.ERROR_MESSAGE);
                }
            }
            // =======================   ========================= //
            
            
        } else {
            JOptionPane.showMessageDialog(winProveedor,msg, "Validando datos", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private void editar(){
        int fila = tblProveedores.getSelectedRow();
        
        if (fila != -1 ){
            winProveedor.setSize(360, 260);
            winProveedor.setTitle("Editar");
            ImageIcon img = new ImageIcon(getClass().getResource("/img/edit.png"));
            winProveedor.setIconImage(img.getImage());
            winProveedor.setLocationRelativeTo(tblProveedores);
            
            int idProveedor = Integer.parseInt(tblProveedores.getValueAt(fila, 0).toString());
            proveedor = gestionProveedor.buscarProveedor(idProveedor);
            
            txtIdProveedor.setEditable(false);
            txtIdProveedor.setText(""+proveedor.getidProveedor());
            txtCompañia.setText(proveedor.getCompañia());
            txtRepresentante.setText(proveedor.getRepresentante());
            txtTelefono.setText(proveedor.getTelefono());

            winProveedor.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(winProveedor, "Seleccione el proveedor que desea editar", "Editar", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private void eliminar(){
        int fila = tblProveedores.getSelectedRow();
         
        if (fila != -1) {
            int idProveedor = Integer.parseInt(tblProveedores.getValueAt(fila, 0).toString());
            String compañia = tblProveedores.getValueAt(fila, 1).toString();
            int resp = JOptionPane.showConfirmDialog(winProveedor, "¿Esta seguro de eliminar el proveedor "+compañia+"?","Eliminar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            
            if (resp == JOptionPane.YES_OPTION) {
                gestionProveedor.conectarBD();
                
                if (gestionProveedor.eliminarProveedor(idProveedor)) {
                    JOptionPane.showMessageDialog(winProveedor, "Proveedor eliminado exitosamente", "Eliminar", JOptionPane.INFORMATION_MESSAGE);
                    listarProveedores();
                } else {
                    JOptionPane.showMessageDialog(winProveedor,"Error al intentar eliminar", "Eliminar", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(winProveedor, "Seleccione el proveedor que desea eliminar", "Eliminar", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private String validarDatos() {
        
        // Validar que escribo in idProveedor numerico
        if (txtIdProveedor.getText().trim().equals("")){
            txtIdProveedor.requestFocus();
            return "Por favor ingrese el id del proveedor";
        } else {
            try {
                Integer.parseInt(txtIdProveedor.getText());
            } catch(NumberFormatException e){
                txtIdProveedor.requestFocus();
                return "El id del proveedor debe de ser en formato número";
            }
        }
        
        // Validamos que no repita el idProveedor sl ingresar nuevo
        if(winProveedor.getTitle().equals("Guardar")){
            if (gestionProveedor.buscarIdProveedor(Integer.parseInt(txtIdProveedor.getText()))){
                txtIdProveedor.requestFocus();
                return "El id ingresado no se encuentra disponible";
            }
        }
        
        
        // Validar el nombre de la compañia
        if(txtCompañia.getText().trim().equals("")){
            txtCompañia.requestFocus();
            return "Por favor ingrese el nombre de la compañia";
        }
        
        // Validar el nombre del representante
        if(txtRepresentante.getText().trim().equals("")){
            txtRepresentante.requestFocus();
            return "Por favor ingrese el nombre del representante";
        }
        
        // Validar el telefono
        if(txtTelefono.getText().trim().equals("")){
            txtTelefono.requestFocus();
            return "Por favor ingrese el teléfono";
        }

        return ""; // No hay errores
    }
    

}
