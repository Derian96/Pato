package gui;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.GestionCliente;
import logica.GestionEmpresa;
import logica.GestionFactura;
import logica.GestionProducto;

public class frmFacturacion extends javax.swing.JInternalFrame {

    GestionFactura gestionFactura;
    GestionCliente gestionCliente;
    GestionEmpresa gestionEmpresa;
    GestionProducto gestionProducto;
    
    public frmFacturacion() {
        initComponents();
        gestionFactura = new GestionFactura();
        gestionCliente = new GestionCliente();
        gestionEmpresa = new GestionEmpresa();
        gestionProducto = new GestionProducto();
        inicializarDatos();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        winEmpleado = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        txtBuscarEmpleado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleados = new javax.swing.JTable();
        winCliente = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        txtBuscarCliente = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        winEmpresa = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        txtBuscarEmpresa = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblEmpresa = new javax.swing.JTable();
        winProducto = new javax.swing.JDialog();
        txtBuscarProducto = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lblFecha = new javax.swing.JLabel();
        lblNumeroPedido = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIdEmpleado = new javax.swing.JTextField();
        btnBuscarEmpleado = new javax.swing.JButton();
        txtIdCliente = new javax.swing.JTextField();
        btnBuscarCliente = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtIdEmpresaTransporte = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnBuscarEmpresa = new javax.swing.JButton();
        lblIdP = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnIdP = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnAgregarProducto = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        lblProducto = new javax.swing.JLabel();
        lblExistencia = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblProductosAgregados = new javax.swing.JTable();
        btnProcesar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        winEmpleado.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                winEmpleadoWindowOpened(evt);
            }
        });

        txtBuscarEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarEmpleadoKeyReleased(evt);
            }
        });

        tblEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmpleados);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBuscarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBuscarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout winEmpleadoLayout = new javax.swing.GroupLayout(winEmpleado.getContentPane());
        winEmpleado.getContentPane().setLayout(winEmpleadoLayout);
        winEmpleadoLayout.setHorizontalGroup(
            winEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        winEmpleadoLayout.setVerticalGroup(
            winEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        winCliente.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                winClienteWindowOpened(evt);
            }
        });

        txtBuscarCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarClienteKeyReleased(evt);
            }
        });

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblClientes);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout winClienteLayout = new javax.swing.GroupLayout(winCliente.getContentPane());
        winCliente.getContentPane().setLayout(winClienteLayout);
        winClienteLayout.setHorizontalGroup(
            winClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        winClienteLayout.setVerticalGroup(
            winClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        winEmpresa.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                winEmpresaWindowOpened(evt);
            }
        });

        txtBuscarEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarEmpresaKeyReleased(evt);
            }
        });

        tblEmpresa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpresaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblEmpresa);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBuscarEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBuscarEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout winEmpresaLayout = new javax.swing.GroupLayout(winEmpresa.getContentPane());
        winEmpresa.getContentPane().setLayout(winEmpresaLayout);
        winEmpresaLayout.setHorizontalGroup(
            winEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        winEmpresaLayout.setVerticalGroup(
            winEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        winProducto.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                winProductoWindowOpened(evt);
            }
        });

        txtBuscarProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtBuscarProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarProductoKeyReleased(evt);
            }
        });

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductosMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblProductos);

        javax.swing.GroupLayout winProductoLayout = new javax.swing.GroupLayout(winProducto.getContentPane());
        winProducto.getContentPane().setLayout(winProductoLayout);
        winProductoLayout.setHorizontalGroup(
            winProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(winProductoLayout.createSequentialGroup()
                .addComponent(txtBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        winProductoLayout.setVerticalGroup(
            winProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(winProductoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(txtBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        setTitle("Facturación");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/img/product_16x16.png"))); // NOI18N

        lblFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblNumeroPedido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("N. Pedido: ");

        jLabel2.setText("Fecha: ");

        jLabel3.setText("Empleado:");

        btnBuscarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/find_16x16.png"))); // NOI18N
        btnBuscarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEmpleadoActionPerformed(evt);
            }
        });

        btnBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/find_16x16.png"))); // NOI18N
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        jLabel4.setText("Cliente:");

        jLabel5.setText("Empresa envió:");

        btnBuscarEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/find_16x16.png"))); // NOI18N
        btnBuscarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEmpresaActionPerformed(evt);
            }
        });

        lblIdP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtCantidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setText("Precio");

        jLabel6.setText("Id Producto");

        btnIdP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/find_16x16-2.png"))); // NOI18N
        btnIdP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIdPActionPerformed(evt);
            }
        });

        jLabel7.setText("Producto");

        jLabel9.setText("Cantidad");

        btnAgregarProducto.setText("Agregar Producto");
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });

        jLabel13.setText("Existencia");

        lblProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblExistencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblPrecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtIdEmpresaTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnBuscarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblNumeroPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnBuscarEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnIdP, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblIdP, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblExistencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel9)
                                .addGap(25, 25, 25))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(32, 32, 32)
                                .addComponent(btnAgregarProducto))
                            .addComponent(lblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNumeroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3)
                                .addComponent(txtIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBuscarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIdEmpresaTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(btnBuscarEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(btnIdP)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(btnAgregarProducto)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblIdP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105))
        );

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        tblProductosAgregados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Producto", "Producto", "Cantidad", "Precio", "SubTotal"
            }
        ));
        tblProductosAgregados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductosAgregadosMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblProductosAgregados);

        btnProcesar.setText("Procesar");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });

        jLabel8.setText("Total:");

        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane4)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(btnProcesar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProcesar))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void winEmpleadoWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_winEmpleadoWindowOpened
        //Carga los datos de los empleados
        String sql = "select idempleado, apellidos, nombre, cargo from tblempleado";
        gestionFactura.conectarBD();
        ResultSet rs = gestionFactura.seleccionar(sql);
        if (rs != null) {
        tblEmpleados.setModel(gestionFactura.cargarEnTabla(rs));
        }
        gestionFactura.desconectarBD();

    }//GEN-LAST:event_winEmpleadoWindowOpened

    private void txtBuscarEmpleadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarEmpleadoKeyReleased
        String sql = "select idempleado, apellidos, nombre, cargo from tblempleado ";
        if (!txtBuscarEmpleado.getText().equals("")) {
        sql += "where apellidos like '%" + txtBuscarEmpleado.getText()
        + "%' or nombre like '%" + txtBuscarEmpleado.getText() + "%'";
        }
        gestionFactura.conectarBD();
        ResultSet rs = gestionFactura.seleccionar(sql);
        if (rs != null) {
        tblEmpleados.setModel(gestionFactura.cargarEnTabla(rs));
        }
        gestionFactura.desconectarBD();

    }//GEN-LAST:event_txtBuscarEmpleadoKeyReleased

    private void tblEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpleadosMouseClicked
        if (evt.getClickCount()==2) {
            int fila = tblEmpleados.getSelectedRow();
            txtIdEmpleado.setText(tblEmpleados.getValueAt(fila, 0).toString());
            winEmpleado.dispose();
        }
    }//GEN-LAST:event_tblEmpleadosMouseClicked

    private void btnBuscarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEmpleadoActionPerformed
        winEmpleado.setSize(500, 400);
        winEmpleado.setTitle("Empleados");
        ImageIcon img = new ImageIcon(getClass().getResource("/img/search.png"));
        winEmpleado.setIconImage(img.getImage());
        winEmpleado.setLocationRelativeTo(btnBuscarEmpleado);
        winEmpleado.setVisible(true);

    }//GEN-LAST:event_btnBuscarEmpleadoActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        winCliente.setSize(500, 400);
        winCliente.setTitle("Clientes");
        ImageIcon img = new ImageIcon(getClass().getResource("/img/search.png"));
        winCliente.setIconImage(img.getImage());
        winCliente.setLocationRelativeTo(btnBuscarCliente);
        winCliente.setVisible(true);
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnBuscarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEmpresaActionPerformed
        winEmpresa.setSize(500, 400);
        winEmpresa.setTitle("Empresas");
        ImageIcon img = new ImageIcon(getClass().getResource("/img/search.png"));
        winEmpresa.setIconImage(img.getImage());
        winEmpresa.setLocationRelativeTo(btnBuscarEmpleado);
        winEmpresa.setVisible(true);
    }//GEN-LAST:event_btnBuscarEmpresaActionPerformed

    private void txtBuscarClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarClienteKeyReleased
        String sql = "select IdCliente, NombreEmpresa, NombreContacto, CargoContacto FROM tblcliente ";
        if (!txtBuscarCliente.getText().equals("")) {
        sql += "where NombreEmpresa like '%" + txtBuscarCliente.getText()
        + "%' or NombreContacto like '%" + txtBuscarCliente.getText() + "%'";
        }
        gestionCliente.conectarBD();
        ResultSet rs = gestionCliente.seleccionar(sql);
        if (rs != null) {
        tblClientes.setModel(gestionCliente.cargarEnTabla(rs));
        }
        gestionCliente.desconectarBD();
    }//GEN-LAST:event_txtBuscarClienteKeyReleased

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked
        if (evt.getClickCount()==2) {
            int fila = tblClientes.getSelectedRow();
            txtIdCliente.setText(tblClientes.getValueAt(fila, 0).toString());
            winCliente.dispose();
        }
    }//GEN-LAST:event_tblClientesMouseClicked

    private void winClienteWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_winClienteWindowOpened
        //Carga los datos de los clientes
        String sql = "select IdCliente, NombreEmpresa, NombreContacto, CargoContacto from tblcliente";
        gestionCliente.conectarBD();
        ResultSet rs = gestionCliente.seleccionar(sql);
        if (rs != null) {
        tblClientes.setModel(gestionCliente.cargarEnTabla(rs));
        }
        gestionCliente.desconectarBD();
    }//GEN-LAST:event_winClienteWindowOpened

    private void txtBuscarEmpresaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarEmpresaKeyReleased
        String sql = "SELECT IdEmpresasTransporte, NombreEmpresa, Telefono FROM empresastransporte";
        if (!txtBuscarEmpresa.getText().equals("")) {
        sql += "where NombreEmpresa like '%" + txtBuscarEmpresa.getText()
        + "%' or Telefono like '%" + txtBuscarEmpresa.getText() + "%'";
        }
        gestionEmpresa.conectarBD();
        ResultSet rs = gestionEmpresa.seleccionar(sql);
        if (rs != null) {
        tblEmpresa.setModel(gestionEmpresa.cargarEnTabla(rs));
        }
        gestionEmpresa.desconectarBD();
    }//GEN-LAST:event_txtBuscarEmpresaKeyReleased

    private void tblEmpresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpresaMouseClicked
        if (evt.getClickCount()==2) {
            int fila = tblEmpresa.getSelectedRow();
            txtIdEmpresaTransporte.setText(tblEmpresa.getValueAt(fila, 0).toString());
            winEmpresa.dispose();
        }
    }//GEN-LAST:event_tblEmpresaMouseClicked

    private void winEmpresaWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_winEmpresaWindowOpened
        //Carga los datos de los empleados
        String sql = "SELECT IdEmpresasTransporte, NombreEmpresa, Telefono from empresastransporte";
        gestionEmpresa.conectarBD();
        ResultSet rs = gestionEmpresa.seleccionar(sql);
        if (rs != null) {
        tblEmpresa.setModel(gestionEmpresa.cargarEnTabla(rs));
        }
        gestionEmpresa.desconectarBD();
    }//GEN-LAST:event_winEmpresaWindowOpened

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnIdPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIdPActionPerformed
         winProducto.setSize(500, 400);
 winProducto.setTitle("Productos");
ImageIcon img = new ImageIcon(getClass().getResource("/img/search.png"));
        winProducto.setIconImage(img.getImage());
 winProducto.setLocationRelativeTo(btnIdP);
 winProducto.setVisible(true);
    }//GEN-LAST:event_btnIdPActionPerformed

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
         int idProducto = Integer.parseInt(lblIdP.getText());
       String producto = lblProducto.getText();
       int existencia = Integer.parseInt(lblExistencia.getText());
       int cantidad = Integer.parseInt(txtCantidad.getText());
       double precio = Double.parseDouble(lblPrecio.getText());
       DefaultTableModel modelo = (DefaultTableModel) tblProductosAgregados.getModel();
       if (existencia >= cantidad) {
           String fila[] = new String[5];
           fila[0] = "" + idProducto;
           fila[1] = producto;
           fila[2] = "" + cantidad;
           fila[3] = "" + precio;
           fila[4] = "" + cantidad * precio;
           modelo.addRow(fila);
           tblProductosAgregados.setModel(modelo);
       }else {
           JOptionPane.showMessageDialog(rootPane, "Existencia no suficiente para la cantidad que desea comprar", "Agregar producto", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        
        String msg = validarDatos();
        
        if (msg.equals("")){
        ArrayList<String> sentencias = new ArrayList<>(); 
        sentencias.add("insert into pedido values(" + lblNumeroPedido.getText()
                + ",'" + txtIdEmpleado.getText()
                +"'" + "," + txtIdCliente.getText()
                + ",'" + lblFecha.getText()
                +"'" + ",'" + lblFecha.getText()
                +"'" + ",'" + lblFecha.getText()
                +"'" + "," + txtIdEmpresaTransporte.getText()
                +",0,null,null,null,null,null,null)");
        
        for (int i = 0; i < tblProductosAgregados.getRowCount(); i++) {
            sentencias.add("insert into detalles_de_pedido values("+lblNumeroPedido.getText() +","+ //idPedido
                    tblProductosAgregados.getValueAt(i, 0)+","+//idProducto
                            tblProductosAgregados.getValueAt(i, 3)+","+//precio
                            tblProductosAgregados.getValueAt(i, 2)+","+//cantidd
                            0//descuento
                            +")");
            sentencias.add("update tblproducto set existencia = existencia - " 
                    + tblProductosAgregados.getValueAt(i, 2)+
                    " where idproducto = "+tblProductosAgregados.getValueAt(i, 0));
        }
        System.out.println(sentencias.toString());
        gestionFactura.procesarFactura(sentencias);
        JOptionPane.showMessageDialog(rootPane, "Factura gestionada correctamente");
        this.dispose();
        //jasper
        } else {
            JOptionPane.showMessageDialog(this,msg, "Validando datos", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_btnProcesarActionPerformed

    private void tblProductosAgregadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosAgregadosMouseClicked
  
    }//GEN-LAST:event_tblProductosAgregadosMouseClicked

    private void txtBuscarProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarProductoKeyReleased
         String sql = "SELECT IdProducto, Nombre, Existencia, Precio FROM tblproductose";
        if (!txtBuscarProducto.getText().equals("")) {
        sql += "where Nombre like '%" + txtBuscarProducto.getText()
        + "%' or IdProducto like '%" + txtBuscarProducto.getText() + "%'";
        }
        gestionEmpresa.conectarBD();
        ResultSet rs = gestionEmpresa.seleccionar(sql);
        if (rs != null) {
        tblEmpresa.setModel(gestionEmpresa.cargarEnTabla(rs));
        }
        gestionEmpresa.desconectarBD();
                                    
    }//GEN-LAST:event_txtBuscarProductoKeyReleased

    private void winProductoWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_winProductoWindowOpened
        //cargar los datos del producto
        String sql = "select idProducto, nombre,Existencia,Precio  from tblProducto";
        gestionProducto.conectarBD();
        ResultSet rs = gestionProducto.seleccionar(sql);
        if (rs!= null) {
            tblProductos.setModel(gestionProducto.cargarEnTabla(rs));           
        }
        gestionProducto.desconectarBD();
    }//GEN-LAST:event_winProductoWindowOpened

    private void tblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMouseClicked
                 if (evt.getClickCount()==2) {
 int fila = tblProductos.getSelectedRow();
 lblIdP.setText(tblProductos.getValueAt(fila, 0).toString());
 lblProducto.setText(tblProductos.getValueAt(fila, 1).toString());
 lblExistencia.setText(tblProductos.getValueAt(fila, 2).toString());
 lblPrecio.setText(tblProductos.getValueAt(fila, 3).toString());
 winProducto.dispose();
 }
    }//GEN-LAST:event_tblProductosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarEmpleado;
    private javax.swing.JButton btnBuscarEmpresa;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnIdP;
    private javax.swing.JButton btnProcesar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblExistencia;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblIdP;
    private javax.swing.JLabel lblNumeroPedido;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTable tblEmpleados;
    private javax.swing.JTable tblEmpresa;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTable tblProductosAgregados;
    private javax.swing.JTextField txtBuscarCliente;
    private javax.swing.JTextField txtBuscarEmpleado;
    private javax.swing.JTextField txtBuscarEmpresa;
    private javax.swing.JTextField txtBuscarProducto;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIdEmpleado;
    private javax.swing.JTextField txtIdEmpresaTransporte;
    private javax.swing.JDialog winCliente;
    private javax.swing.JDialog winEmpleado;
    private javax.swing.JDialog winEmpresa;
    private javax.swing.JDialog winProducto;
    // End of variables declaration//GEN-END:variables
    
    
    private void inicializarDatos(){
        // Carga el ultimo numero de pedido
        String sql = " SELECT IFNULL(MAX(IdPedido),0)+1 AS IdPedido FROM pedido";
        gestionFactura.conectarBD();
        ResultSet rs = gestionFactura.seleccionar(sql);
        try {
            if (rs.next()){
                lblNumeroPedido.setText(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        gestionFactura.desconectarBD();
        //Cargar la fecha actual
        Date javaDate = new Date();
        Long javaTime = javaDate.getTime();
        Date sqlDate = new java.sql.Date(javaTime);
        lblFecha.setText(sqlDate.toString());
    }
     private String validarDatos() {
        // Validar que escribo in idCategoria numerico
        if (txtIdCliente.getText().trim().equals("")){
            txtIdCliente.requestFocus();
            return "Por favor ingrese el id del cliente";
        }
        
        if(txtIdEmpleado.getText().trim().equals("")){
            txtIdEmpleado.requestFocus();
            return "Por favor ingrese el id de la categoría";
        }
        if(txtIdEmpresaTransporte.getText().trim().equals("")){
            txtIdEmpresaTransporte.requestFocus();
            return "Por favor ingrese el id de la categoría";
        }
        return ""; // No hay errores
     }
}
