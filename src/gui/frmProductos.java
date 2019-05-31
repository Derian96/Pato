package gui;

import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import logica.GestionProducto;
import logica.Producto;

public class frmProductos extends javax.swing.JInternalFrame {
    
    GestionProducto gestionProducto;
    Producto producto;

    public frmProductos() throws SQLException {
        initComponents();
        gestionProducto = new GestionProducto();
        producto = null;
        listarProductos();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        winProducto = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIdProducto = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        cboCategorias = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtExistencia = new javax.swing.JTextField();
        txtNivelNuevoPedido = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        chkSuspendido = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        cboProveedor = new javax.swing.JComboBox<>();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        popMnuProductos = new javax.swing.JPopupMenu();
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
        tblProductos = new javax.swing.JTable();
        lblTotal = new javax.swing.JLabel();

        winProducto.setAlwaysOnTop(true);
        winProducto.setMinimumSize(new java.awt.Dimension(449, 455));
        winProducto.setResizable(false);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel1.setText("Datos producto");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Id Producto:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("Categoría:");

        cboCategorias.setMaximumRowCount(50);
        cboCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCategoriasActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setText("Existencia:");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setText("Precio:");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel7.setText("Nivel nuevo pedido");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel8.setText("Suspendido");

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        jLabel9.setText("Proveedor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                                    .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9))
                            .addGap(69, 69, 69)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNivelNuevoPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                .addComponent(txtNombre)
                                .addComponent(txtExistencia)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                .addComponent(cboCategorias, 0, 203, Short.MAX_VALUE)
                                .addComponent(cboProveedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(151, 151, 151)
                                .addComponent(chkSuspendido))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtExistencia, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNivelNuevoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkSuspendido)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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

        javax.swing.GroupLayout winProductoLayout = new javax.swing.GroupLayout(winProducto.getContentPane());
        winProducto.getContentPane().setLayout(winProductoLayout);
        winProductoLayout.setHorizontalGroup(
            winProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, winProductoLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
            .addGroup(winProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        winProductoLayout.setVerticalGroup(
            winProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(winProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(winProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        popMnuEditar.setText("Editar");
        popMnuEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popMnuEditarActionPerformed(evt);
            }
        });
        popMnuProductos.add(popMnuEditar);

        popMnuEliminar.setLabel("Eliminar");
        popMnuEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popMnuEliminarActionPerformed(evt);
            }
        });
        popMnuProductos.add(popMnuEliminar);

        popMnuImprimir.setLabel("Imprimir");
        popMnuImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popMnuImprimirActionPerformed(evt);
            }
        });
        popMnuProductos.add(popMnuImprimir);
        popMnuProductos.add(jSeparator1);

        popMnuCerrar.setLabel("Cerrar");
        popMnuCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popMnuCerrarActionPerformed(evt);
            }
        });
        popMnuProductos.add(popMnuCerrar);

        setTitle("Gestión Productos");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/img/product_16x16.png"))); // NOI18N

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

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID PRODUCTO", "NOMBRE", "DESCRIPCION"
            }
        ));
        tblProductos.setComponentPopupMenu(popMnuProductos);
        tblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProductos);

        lblTotal.setText("Total: 0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(barraHerramientas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(barraHerramientas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        guardar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        editar();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // Código del botón cerrar del formulario frmProductos
        this.setVisible(false);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // Código del botón cancelar de winProducto
        winProducto.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cboCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCategoriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboCategoriasActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
     salvar();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void popMnuEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popMnuEditarActionPerformed
        btnEditarActionPerformed(evt);
    }//GEN-LAST:event_popMnuEditarActionPerformed

    private void popMnuEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popMnuEliminarActionPerformed
        btnEliminarActionPerformed(evt);
    }//GEN-LAST:event_popMnuEliminarActionPerformed

    private void popMnuCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popMnuCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_popMnuCerrarActionPerformed

    private void popMnuImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popMnuImprimirActionPerformed
        // Reporte con parametros (idProducto)
    }//GEN-LAST:event_popMnuImprimirActionPerformed

    private void tblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMouseClicked
        // evento doble clic. Hace llamada al código del botón btnEditar (Reutilización de código
        if (evt.getClickCount() == 2){ // Si le dio doble clic
            btnEditarActionPerformed (new ActionEvent(tblProductos, 0, ""));
        }
    }//GEN-LAST:event_tblProductosMouseClicked

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        // Llamamos al metodo para crear el reporte de productos
        gestionProducto.cargarReporteProductos();
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
    private javax.swing.JComboBox<String> cboCategorias;
    private javax.swing.JComboBox<String> cboProveedor;
    private javax.swing.JCheckBox chkSuspendido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JMenuItem popMnuCerrar;
    private javax.swing.JMenuItem popMnuEditar;
    private javax.swing.JMenuItem popMnuEliminar;
    private javax.swing.JMenuItem popMnuImprimir;
    private javax.swing.JPopupMenu popMnuProductos;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtExistencia;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtNivelNuevoPedido;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JDialog winProducto;
    // End of variables declaration//GEN-END:variables
    
     private void listarProductos() {
        
        gestionProducto.conectarBD();
        ResultSet rs = gestionProducto.listarProductos();
        
        if (rs != null) {
            tblProductos.setModel(gestionProducto.cargarEnTabla(rs));
            lblTotal.setText("Total: " + tblProductos.getRowCount());
        }
        
        gestionProducto.desconectarBD();
    }
    
   private void CargarNombresCategoria() {
        cboCategorias.removeAllItems();
        cboCategorias.addItem("Elegir");
        gestionProducto.conectarBD();
        ResultSet rs = gestionProducto.seleccionar("SELECT nombre from tblcategoria");
        try {
            while (rs.next()) {
                cboCategorias.addItem(rs.getString(1));

            }
            gestionProducto.desconectarBD();
        } catch (SQLException ex) {
            System.err.println(ex);
            gestionProducto.desconectarBD();
        }

    }
    private void CargarProveedores() {
        cboProveedor.removeAllItems();
        cboProveedor.addItem("Elegir");
        gestionProducto.conectarBD();
        ResultSet rs = gestionProducto.seleccionar("SELECT idProveedor from tblproveedor");
        try {
            while (rs.next()) {
                cboProveedor.addItem(rs.getString(1));

            }
            gestionProducto.desconectarBD();
        } catch (SQLException ex) {
            System.err.println(ex);
            gestionProducto.desconectarBD();
        }

    }
    
    private void guardar(){
     winProducto.setSize(600, 450);
        winProducto.setTitle("Guardar");
        ImageIcon img = new ImageIcon(getClass().getResource("/img/save.png"));
        winProducto.setIconImage(img.getImage());
        txtIdProducto.setText("");
        txtIdProducto.setEditable(true);
        txtNombre.setText("");
        txtExistencia.setText("");
        txtPrecio.setText("");
        txtNivelNuevoPedido.setText("");
        chkSuspendido.setSelected(false);
        CargarNombresCategoria();
        CargarProveedores();
        winProducto.setLocationRelativeTo(tblProductos);
        winProducto.setVisible(true);
    
    }
    
    private void salvar() {
        //abre el frmProductos
    
    String msg = validarDatos();
        if (msg.equals("")) {
            producto = new Producto();
            producto.setIdProducto(Integer.parseInt(txtIdProducto.getText()));
            producto.setNombre(txtNombre.getText());
            producto.setExistencia(Integer.parseInt(txtExistencia.getText()));
            producto.setPrecio(Double.parseDouble(txtPrecio.getText()));
            producto.setNivelNuevoPedido(Integer.parseInt(txtNivelNuevoPedido.getText()));
            producto.setSuspendido(chkSuspendido.isSelected() ? 1 : 0);
            //busca el id de la categoria 
            try {
                gestionProducto.conectarBD();
                ResultSet rs = gestionProducto.seleccionar("SELECT idCategoria FROM tblcategoria WHERE NOMBRE LIKE'"
                        + cboCategorias.getSelectedItem().toString() + "'");
                if (rs.next()) {
                    producto.setIdCategoria(rs.getInt(1));
                }
                gestionProducto.desconectarBD();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
            
            //busca el id del proveedor 
            try {
                gestionProducto.conectarBD();
                ResultSet rs = gestionProducto.seleccionar("SELECT idProveedor FROM tblproveedor WHERE IDPROVEEDOR LIKE'"
                        + cboProveedor.getSelectedItem().toString() + "'");
                if (rs.next()) {
                    producto.setIdProveedor(rs.getInt(1));
                }
                gestionProducto.desconectarBD();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
            
            if (winProducto.getTitle().equals("Guardar")) {
                if (gestionProducto.buscarProducto(producto.getIdProducto()) == null) {
                    if (gestionProducto.insertarProducto(producto)) {
                        JOptionPane.showMessageDialog(winProducto, "Producto almacenado exitosamente", "Guardar", JOptionPane.INFORMATION_MESSAGE);
                        winProducto.dispose();
                        listarProductos();

                    } else {
                        JOptionPane.showMessageDialog(winProducto, "Error al intentar guardar el producto", "Guardar", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(winProducto, "Id de producto ya registrado", "Guardar", JOptionPane.INFORMATION_MESSAGE);
                }
            }

            //editar
            if (winProducto.getTitle().equals("Editar")) {
                if (gestionProducto.editarProducto(producto)) {
                    JOptionPane.showMessageDialog(winProducto, "Producto editado exitosamente", "Editar", JOptionPane.INFORMATION_MESSAGE);
                    winProducto.dispose();
                    listarProductos();
                } else {
                    JOptionPane.showMessageDialog(winProducto, "Error al intentar editar producto", "Editar", JOptionPane.ERROR_MESSAGE);

                }
            }
        } else {
            JOptionPane.showMessageDialog(winProducto, msg, "Validando datos", JOptionPane.INFORMATION_MESSAGE);

        }
    
    }
    
    private void eliminar(){
        // Llamada al método eliminarProducto
        int fila = tblProductos.getSelectedRow();
         
        if (fila != -1) {
            int idProducto = Integer.parseInt(tblProductos.getValueAt(fila, 0).toString());
            String nombre = tblProductos.getValueAt(fila, 1).toString();
            int resp = JOptionPane.showConfirmDialog(winProducto, "¿Esta seguro de eliminar el producto "+nombre+"?","Eliminar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            
            if (resp == JOptionPane.YES_OPTION) {
                gestionProducto.conectarBD();
                
                if (gestionProducto.eliminarProducto(idProducto)) {
                    JOptionPane.showMessageDialog(winProducto, "Producto eliminado exitosamente", "Eliminar", JOptionPane.INFORMATION_MESSAGE);
                    listarProductos();
                } else {
                    JOptionPane.showMessageDialog(winProducto,"Error al intentar eliminar", "Eliminar", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(winProducto, "Seleccione el producto que desea eliminar", "Eliminar", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private void editar() {
        // Código para abrir el JDialog winProducto cuando se desea editar un producto existente
        int fila = tblProductos.getSelectedRow();
        if (fila != -1) {
            winProducto.setSize(500, 400);
            winProducto.setTitle("Editar");
            ImageIcon img = new ImageIcon(getClass().getResource("/img/edit.png"));
            winProducto.setIconImage(img.getImage());
            winProducto.setLocationRelativeTo(tblProductos);
            int idProducto = Integer.parseInt(tblProductos.getValueAt(fila, 0).toString());
            producto = gestionProducto.buscarProducto(idProducto);
             //busca el nombre de la categoria
            CargarNombresCategoria();
            try {
                gestionProducto.conectarBD();
                ResultSet rs = gestionProducto.seleccionar("SELECT nombre FROM tblcategoria WHERE idCategoria =" + producto.getIdCategoria());
                if (rs.next()) {
                    String nombre = rs.getString(1);
                    cboCategorias.setSelectedItem(nombre);
                }
                gestionProducto.desconectarBD();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
            //busca el id del proveedor
            CargarProveedores();
            try {
                gestionProducto.conectarBD();
                ResultSet rs = gestionProducto.seleccionar("SELECT idProveedor FROM tblproveedor WHERE idProveedor =" + producto.getIdProveedor());
                if (rs.next()) {
                    int idProveedor = rs.getInt(1);
                    cboProveedor.setSelectedItem(idProveedor);
                }
                gestionProducto.desconectarBD();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
            txtIdProducto.setText("" + producto.getIdProducto());
            txtIdProducto.setEditable(false);
            txtNombre.setText(producto.getNombre());
            txtExistencia.setText("" + producto.getExistencia());
            txtPrecio.setText("" + producto.getPrecio());
            txtNivelNuevoPedido.setText("" + producto.getNivelNuevoPedido());
            chkSuspendido.setSelected(producto.getSuspendido()== 1 ? true:false);
            
            winProducto.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Seleccione el producto que desea editar", "Editar", JOptionPane.ERROR_MESSAGE);

        }
    }

    private String validarDatos() {
        
        // Validar que escribo in idProducto numerico
        if (txtIdProducto.getText().trim().equals("")){
            txtIdProducto.requestFocus();
            return "Por favor ingrese el id del producto";
        } else {
            try {
                Integer.parseInt(txtIdProducto.getText());
            } catch(NumberFormatException e){
                txtIdProducto.requestFocus();
                return "El id del producto debe de ser en formato número";
            }
        }
        
        // Validamos que no repita el idProducto sl ingresar nuevo
        if(winProducto.getTitle().equals("Guardar")){
            if (gestionProducto.buscarIdProducto(Integer.parseInt(txtIdProducto.getText()))){
                txtIdProducto.requestFocus();
                return "El id ingresado no se encuentra disponible";
            }
        }
        
        
        // Validar el nombre del producto
        if(txtNombre.getText().trim().equals("")){
            txtNombre.requestFocus();
            return "Por favor ingrese el nombre del producto";
        }
        
        // // Validar la categoria
        if(cboCategorias.getSelectedIndex() == -1){
            cboCategorias.requestFocus();
            return "Por favor ingrese una categoria del producto";
        }
        
        if (txtExistencia.getText().trim().equals("")){
            txtExistencia.requestFocus();
            return "Por favor ingrese la cantidad de existencias";
            
        } else {
            try {
                Integer.parseInt(txtExistencia.getText());
            } catch(NumberFormatException e){
                txtExistencia.requestFocus();
                return "Las existencias deben de ser en formato número";
            }  

        }
        
        // Validar que el valor de Precio no esté vacio y que sea valores numericos
        if (txtPrecio.getText().trim().equals("")){
            txtPrecio.requestFocus();
            return "Por favor ingrese el precio";
        } else {
            try {
                Double.parseDouble(txtPrecio.getText());
            } catch(NumberFormatException e){
                txtPrecio.requestFocus();
                return "El precio deben de ser en formato número";
            }
        }
        
        // Validar que el valor del Nivel de Nuevo Pedido no esté vacio y que sea valores numericos
        if (txtNivelNuevoPedido.getText().trim().equals("")){
            txtNivelNuevoPedido.requestFocus();
            return "Por favor ingrese nivel de nuevo pedido";
        } else {
            try {
                Integer.parseInt(txtNivelNuevoPedido.getText());
            } catch(NumberFormatException e){
                txtNivelNuevoPedido.requestFocus();
                return "El nivel de nuevo pedido debe de ser en formato número";
            }
        }

        return ""; // No hay errores
    }
    
    
}
