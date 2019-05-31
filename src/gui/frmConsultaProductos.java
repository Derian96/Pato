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

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.GestionProducto;
import logica.Producto;

public class frmConsultaProductos extends javax.swing.JInternalFrame {
    
    GestionProducto gestionProducto;
    Producto producto;

    /**
     * Creates new form frmProductos
     * @throws java.sql.SQLException
     */
    public frmConsultaProductos() throws SQLException {
        initComponents();
        gestionProducto = new GestionProducto();
        producto = null;
        listarProductos();
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        lblTotal = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        chkEstado = new javax.swing.JCheckBox();
        chkCategoria = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        txtidProducto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        cboEstado = new javax.swing.JComboBox<>();
        cboCategorias = new javax.swing.JComboBox<>();
        btnCerrar = new javax.swing.JButton();

        setTitle("Reporte Productos");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/img/product_16x16.png"))); // NOI18N

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID PRODUCTO", "NOMBRE", "DESCRIPCION"
            }
        ));
        tblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProductos);

        lblTotal.setText("Total: 0");

        chkEstado.setText("Estado");
        chkEstado.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkEstadoStateChanged(evt);
            }
        });
        chkEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkEstadoActionPerformed(evt);
            }
        });

        chkCategoria.setText("Categorías");
        chkCategoria.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkCategoriaStateChanged(evt);
            }
        });
        chkCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCategoriaActionPerformed(evt);
            }
        });

        jLabel1.setText("ID_Producto");

        jLabel2.setText("Nombre");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel3.setText("Existiencia");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        cboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        cboEstado.setSelectedIndex(-1);

        cboCategorias.setToolTipText("");

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkEstado)
                            .addComponent(jLabel1))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(chkCategoria))
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cboCategorias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtidProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombre)))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkEstado, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chkCategoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addComponent(txtNombre)
                    .addComponent(txtidProducto)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 635, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMouseClicked

    }//GEN-LAST:event_tblProductosMouseClicked

    private void chkEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkEstadoActionPerformed

    private void chkCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkCategoriaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void chkEstadoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkEstadoStateChanged
        if (chkEstado.isSelected()) {
            cboEstado.setEnabled(true);
        } else {
            cboEstado.setEnabled(false);
        }
    }//GEN-LAST:event_chkEstadoStateChanged

    private void chkCategoriaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkCategoriaStateChanged
        if (chkCategoria.isSelected()) {
            cboCategorias.setEnabled(true);
            try {
                listarCategorias();
            } catch (SQLException ex) {
                Logger.getLogger(frmConsultaProductos.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            cboCategorias.setEnabled(false);
        }
    }//GEN-LAST:event_chkCategoriaStateChanged

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JComboBox<String> cboCategorias;
    private javax.swing.JComboBox<String> cboEstado;
    private javax.swing.JCheckBox chkCategoria;
    private javax.swing.JCheckBox chkEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtidProducto;
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
    
    private void listarCategorias() throws SQLException{
        cboCategorias.removeAllItems();
        cboCategorias.addItem("Elegir");
        gestionProducto.conectarBD();
        ResultSet rs = gestionProducto.seleccionar("SELECT nombre FROM tblcategoria");
        
        try {
            while (rs.next()) {
                cboCategorias.addItem(rs.getString(1));
            }
        gestionProducto.desconectarBD();
        } catch (SQLException ex){
         System.err.println(ex);
         gestionProducto.desconectarBD();
        }
    }
    
    private void buscar() {
        // ---------------  BUSQUEDA POR DEFECTO -------------//
        String sql = "SELECT * FROM tblproducto ";
        
        // ------------ Se asignan variables para los input text ------------ //
        String idProducto = txtidProducto.getText();
        String Nombre = txtNombre.getText();
        String Stock = txtStock.getText();
              
        // ------------------------- Se verifican los Input ----------------------------- //
        int uno=0;
        // verificacion de input idProducto
        if (!idProducto.equals("")) {
            sql+="WHERE idproducto = "+idProducto;
            uno=1;
        }
        
        // verificacion de input Nombre
        if (!Nombre.equals("")) {
            if (uno==0) {
                sql+="WHERE nombre LIKE '"+Nombre +"' ";
                uno=1;
            }else{
                sql+="AND nombre LIKE '"+Nombre +"' ";
            }
        }
        
        // verificacion de input Existencia
        if (!Stock.equals("")) {
            if (uno==0) {
                sql+="AND existencia LIKE '"+Stock+"' ";
                uno=2;
            }else{
                sql+="OR existencia LIKE '"+Stock +"' ";
            }
        }
        
        // ----------------  BUSQUEDA POR ESTADO ---------------- //
        if (chkEstado.isSelected() && !chkCategoria.isSelected()) {
            if (cboEstado.getSelectedIndex() == 0) {
                sql = "SELECT * FROM tblproducto WHERE suspendido = 1 ";
                // ------------------------- Se verifican los Input ----------------------------- //
                int cont=0;
                // verificacion de input idProducto
                if (!idProducto.equals("")) {
                    sql+=" AND idProducto = '"+idProducto+"' ";
                    cont=1;
                }

                // verificacion de input Nombre
                if (!Nombre.equals("")) {
                    if (cont==0) {
                        sql+="AND nombre LIKE '"+Nombre +"' ";
                        cont=1;
                    }else{
                        sql+="OR nombre LIKE '"+Nombre +"' ";
                    }
                }

                // verificacion de input Existencia
                if (!Stock.equals("")) {
                    if (cont==0) {
                        sql+="AND existencia LIKE '"+Stock+"' ";
                        cont = 1;
                    }else{
                        sql+="OR existencia LIKE '"+Stock +"' ";
                    }
                }
            } else {
                sql = "SELECT * FROM tblproducto WHERE suspendido = 0 ";
                // ------------------------- Se verifican los Input ----------------------------- //
                int cont=0;
                // verificacion de input idProducto
                if (!idProducto.equals("")) {
                    sql+=" AND idProducto = '"+idProducto+"' ";
                    cont=1;
                }

                // verificacion de input Nombre
                if (!Nombre.equals("")) {
                    if (cont==0) {
                        sql+="AND nombre LIKE '"+Nombre +"' ";
                        cont=1;
                    }else{
                        sql+="OR nombre LIKE '"+Nombre +"' ";
                    }
                }

                // verificacion de input Existencia
                if (!Stock.equals("")) {
                    if (cont==0) {
                        sql+="AND existencia LIKE '"+Stock+"' ";
                        cont = 1;
                    }else{
                        sql+="OR existencia LIKE '"+Stock +"' ";
                    }
                }
            }
        }
        
        // -------------------  BUSQUEDA POR CATEGORIA ---------------- //
        if (!chkEstado.isSelected() && chkCategoria.isSelected()) {
            if (cboCategorias.getSelectedIndex() > 0) {
                //obtiene el nombre de la cateogria
                //buscar el id de ese nombre
                sql = "SELECT * FROM tblproducto WHERE idcategoria = '"+cboCategorias.getSelectedIndex()+"' ";
                // ------------------------- Se verifican los Input ----------------------------- //
                int cont=0;
                // verificacion de input idProducto
                if (!idProducto.equals("")) {
                    sql+="AND idProducto = '"+idProducto+"' ";
                    cont=1;
                }

                // verificacion de input Nombre
                if (!Nombre.equals("")) {
                    if (cont==0) {
                        sql+="AND nombre LIKE '"+Nombre +"' ";
                        cont=1;
                    }else{
                        sql+="OR nombre LIKE '"+Nombre +"' ";
                    }
                }

                // verificacion de input Existencia
                if (!Stock.equals("")) {
                    if (cont==0) {
                        sql+="AND existencia = '"+Stock+"' ";
                        cont = 1;
                    }else{
                        sql+="OR existencia = '"+Stock +"' ";
                    }
                }
            } 
        }
        
        // ---------------  BUSQUEDA POR ESTADO Y CATEGORIA ------------- //
        if (chkEstado.isSelected() && chkCategoria.isSelected()) {
            if (cboCategorias.getSelectedIndex() >0) {
                //obtiene el nombre de la cateogria
                //buscar el id de ese nombre
                sql = "SELECT * FROM tblproducto WHERE idcategoria = '"+cboCategorias.getSelectedIndex()+"' ";
                // ------------------------- Se verifican los Input ----------------------------- //
                int cont=0;
                // verificacion de input idProducto
                if (!idProducto.equals("")) {
                    sql+=" AND idProducto = '"+idProducto+"' ";
                    cont=1;
                }

                // verificacion de input Nombre
                if (!Nombre.equals("")) {
                    if (cont==0) {
                        sql+="AND nombre LIKE '"+Nombre +"' ";
                        cont=1;
                    }else{
                        sql+="OR nombre LIKE '"+Nombre +"' ";
                    }
                }

                // verificacion de input Existencia
                if (!Stock.equals("")) {
                    if (cont==0) {
                        sql+="AND existencia LIKE '"+Stock+"' ";
                        cont = 1;
                    }else{
                        sql+="OR existencia LIKE '"+Stock +"' ";
                    }
                }
            } 
        }
        gestionProducto.conectarBD();
        ResultSet rs = gestionProducto.seleccionar(sql);
        if (rs!=null) {
            tblProductos.setModel(gestionProducto.cargarEnTabla(rs));
            
        }
    }
    
    

    
}
