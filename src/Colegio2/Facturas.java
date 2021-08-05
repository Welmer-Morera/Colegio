/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colegio2;

import Logica.Libro;
import Logica.LibroBD;
import Logica.Factura;
import Logica.FacturaBD;
import Logica.DetalleFactura;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * 
 */


public class Facturas extends javax.swing.JInternalFrame {
ArrayList<DetalleFactura> df= new ArrayList();
private String fecha;
private String NumFactura;
private  double SubTotal_1;
private  double SubTotal_2;
private  double TotalFactura;
private  double Descuento;
private  double Impuesto;
Calendar fe= new GregorianCalendar() ;
LibroBD BDlibro;
FacturaBD BDfactura;
    public Facturas() {
        initComponents();
        BDlibro = new LibroBD();
        BDfactura = new FacturaBD();
        CargarAlumnos();
        generar_Numero_Factura();
        Generar_fecha();
        
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        winFactura = new javax.swing.JDialog();
        cboAlumnos = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNumFactura = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        lblAlumno = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAlumno = new javax.swing.JTextField();
        lbl = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        txtLibro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtIdLibro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnAgregarLibro = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFactura = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtSubtotal1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtSubTotal2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtImpuesto = new javax.swing.JTextField();
        btnProcesar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        lblTotalFactura = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        winListaLibros = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLibros = new javax.swing.JTable();
        winCobro = new javax.swing.JDialog();
        jLabel13 = new javax.swing.JLabel();
        txtTotalFactura = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtPagaCon = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtVuelto = new javax.swing.JTextField();
        btnCobrar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        cboAlumnos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAlumnosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel1.setText("Facturación ");

        jLabel2.setText("Num Factura");

        jLabel4.setText("Fecha:");

        lblAlumno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblAlumno.setText("Alumno");

        txtAlumno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lbl.setText("Libro:");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel8.setText("Nombre");

        jLabel9.setText("Cantidad");

        btnAgregarLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mas.png"))); // NOI18N
        btnAgregarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarLibroActionPerformed(evt);
            }
        });

        tblFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Prrecio", "Cantidad", "Total"
            }
        ));
        jScrollPane2.setViewportView(tblFactura);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("SubTotal");

        txtSubtotal1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Descuento");

        txtDescuento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDescuento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescuentoKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("SubTotal");

        txtSubTotal2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Impuesto");

        txtImpuesto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtImpuesto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtImpuestoKeyReleased(evt);
            }
        });

        btnProcesar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dinero.png"))); // NOI18N
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("Total a pagar");

        lblTotalFactura.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTotalFactura.setText("0");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Descripcion");

        txtDescripcion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout winFacturaLayout = new javax.swing.GroupLayout(winFactura.getContentPane());
        winFactura.getContentPane().setLayout(winFacturaLayout);
        winFacturaLayout.setHorizontalGroup(
            winFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, winFacturaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(31, 31, 31)
                .addComponent(lblTotalFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnProcesar)
                .addGap(69, 69, 69))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, winFacturaLayout.createSequentialGroup()
                .addGroup(winFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(winFacturaLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(winFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(winFacturaLayout.createSequentialGroup()
                                .addGroup(winFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(winFacturaLayout.createSequentialGroup()
                                        .addComponent(lblAlumno)
                                        .addGap(25, 25, 25)
                                        .addComponent(txtAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, winFacturaLayout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(lbl)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtIdLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(winFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(winFacturaLayout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel16)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDescripcion))
                                    .addGroup(winFacturaLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel9)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(winFacturaLayout.createSequentialGroup()
                                .addGroup(winFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(cboAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(winFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(winFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumFactura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, winFacturaLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(winFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(winFacturaLayout.createSequentialGroup()
                                .addGroup(winFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(winFacturaLayout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel6))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, winFacturaLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11)))
                                .addGroup(winFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(winFacturaLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtImpuesto, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                                    .addGroup(winFacturaLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtSubtotal1))))
                            .addGroup(winFacturaLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(btnAgregarLibro)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, winFacturaLayout.createSequentialGroup()
                        .addGap(699, 699, 699)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(txtSubTotal2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, winFacturaLayout.createSequentialGroup()
                        .addGap(687, 687, 687)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtDescuento)))
                .addGap(32, 32, 32))
        );
        winFacturaLayout.setVerticalGroup(
            winFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(winFacturaLayout.createSequentialGroup()
                .addGroup(winFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(winFacturaLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, winFacturaLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(winFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(winFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGroup(winFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(winFacturaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(winFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAlumno)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(winFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(winFacturaLayout.createSequentialGroup()
                                .addGroup(winFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(winFacturaLayout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addGroup(winFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton3)
                                            .addGroup(winFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(lbl)
                                                .addComponent(txtIdLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(winFacturaLayout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addGroup(winFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnAgregarLibro)
                                            .addGroup(winFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel8)
                                                .addComponent(txtLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel9)
                                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(winFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(winFacturaLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(winFacturaLayout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addGroup(winFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel6)
                                            .addComponent(txtSubtotal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(29, 29, 29)
                                        .addGroup(winFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7)
                                            .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(29, 29, 29)
                                        .addGroup(winFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel10)
                                            .addComponent(txtSubTotal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(22, 22, 22)
                                        .addGroup(winFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel11)
                                            .addComponent(txtImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, winFacturaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(winFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(lblTotalFactura))
                                .addGap(50, 50, 50))))
                    .addGroup(winFacturaLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(winFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        winListaLibros.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                winListaLibrosWindowOpened(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Lista de libros");

        tblLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLibrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLibros);

        javax.swing.GroupLayout winListaLibrosLayout = new javax.swing.GroupLayout(winListaLibros.getContentPane());
        winListaLibros.getContentPane().setLayout(winListaLibrosLayout);
        winListaLibrosLayout.setHorizontalGroup(
            winListaLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(winListaLibrosLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(winListaLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        winListaLibrosLayout.setVerticalGroup(
            winListaLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(winListaLibrosLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setText("Total a pagar");

        txtTotalFactura.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setText("Paga con");

        txtPagaCon.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtPagaCon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPagaConKeyReleased(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setText("Vuelto");

        txtVuelto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtVuelto.setText("jTextField1");

        btnCobrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/comprobar.png"))); // NOI18N
        btnCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCobrarActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar.png"))); // NOI18N

        javax.swing.GroupLayout winCobroLayout = new javax.swing.GroupLayout(winCobro.getContentPane());
        winCobro.getContentPane().setLayout(winCobroLayout);
        winCobroLayout.setHorizontalGroup(
            winCobroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(winCobroLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(winCobroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(winCobroLayout.createSequentialGroup()
                        .addGroup(winCobroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel13))
                        .addGap(54, 54, 54)
                        .addGroup(winCobroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtVuelto, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(txtPagaCon)
                            .addComponent(txtTotalFactura)))
                    .addGroup(winCobroLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(btnCobrar)
                        .addGap(37, 37, 37)
                        .addComponent(jButton5)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        winCobroLayout.setVerticalGroup(
            winCobroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(winCobroLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(winCobroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtTotalFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(winCobroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtPagaCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(winCobroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtVuelto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(winCobroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCobrar)
                    .addComponent(jButton5))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/caja-registradora.png"))); // NOI18N
        jButton1.setText("Nueva ");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carpetas.png"))); // NOI18N
        jButton2.setText("Registro  de facturas");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(39, 39, 39))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       winFactura.setTitle("Nueva Factura");
       CargarAlumnos();;;
       generar_Numero_Factura();
               txtNumFactura.setEnabled(false);
       txtNumFactura.setText(NumFactura);;
       winFactura.setSize(1000, 600);
       
       txtFecha.setEnabled(false);
       txtDescripcion.setText("");
       txtIdLibro.setText("");
       txtLibro.setText("");
       txtAlumno.setText("");
       
       txtFecha.setText(fecha);
       winFactura.setLocationRelativeTo(panel);
       winFactura.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cboAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAlumnosActionPerformed
         if (cboAlumnos.getSelectedIndex() > 0) {
             BDfactura.conectarBD();
            String sql = "select * from alumnos where Nombre=" + cboAlumnos.getSelectedItem().toString();
            ResultSet rs =  BDfactura.seleccionar(sql);
            try {
                if (rs.next()) {
                    txtAlumno.setText(rs.getString("Nombre") );
                }
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
             BDfactura.desconectarBD();
        }
    }//GEN-LAST:event_cboAlumnosActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          if (txtIdLibro.getText().equals("")) {
            winListaLibros.setSize(700, 400);
           winListaLibros.setLocationRelativeTo(panel);
            winListaLibros.setVisible(true);
        } else {

        }
    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void winListaLibrosWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_winListaLibrosWindowOpened
       BDlibro.conectarBD();
       ResultSet rs = BDlibro.buscarTodosLibros();
        tblLibros.setModel(BDfactura.cargarEnTabla(rs));
       BDlibro.desconectarBD();
    }//GEN-LAST:event_winListaLibrosWindowOpened

    private void tblLibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLibrosMouseClicked
        if (evt.getClickCount() == 2) {
            int fila = tblLibros.getSelectedRow();
            txtIdLibro.setText(tblLibros.getValueAt(fila, 0).toString());
            txtLibro.setText(tblLibros.getValueAt(fila, 1).toString());
            winListaLibros.dispose();
        }
    }//GEN-LAST:event_tblLibrosMouseClicked

    private void btnAgregarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarLibroActionPerformed
       CargarTablaFactura(); // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarLibroActionPerformed

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
     winCobro.setTitle("Cobro");
      winCobro.setSize(500, 450);
      
       txtTotalFactura.setText(Double.toString(TotalFactura));
       txtVuelto.setText("0");
       winCobro.setLocationRelativeTo(tblFactura);
       winCobro.setVisible(true);
    }//GEN-LAST:event_btnProcesarActionPerformed

    private void txtDescuentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescuentoKeyReleased
       
        if(txtDescuento.getText().equals("")){
             lblTotalFactura.setText(Double.toString(SubTotal_1));
             txtSubTotal2.setText(Double.toString(SubTotal_1));
        }else{
            try{
            
            Descuento = Double.parseDouble(txtDescuento.getText())/100;
            SubTotal_2=SubTotal_1-(SubTotal_1*Descuento);
            txtSubTotal2.setText(Double.toString(SubTotal_2));

            }catch(Exception e){}
               lblTotalFactura.setText(Double.toString(SubTotal_2));}
    }//GEN-LAST:event_txtDescuentoKeyReleased

    private void txtImpuestoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImpuestoKeyReleased
         if(txtImpuesto.getText().equals("")){
             
            
             lblTotalFactura.setText(txtSubTotal2.getText());
        }else{
            try{
            
            Impuesto = Double.parseDouble(txtImpuesto.getText())/100;
            TotalFactura=Double.parseDouble(txtSubTotal2.getText())+(SubTotal_2*Impuesto);
            lblTotalFactura.setText(Double.toString(TotalFactura));

            }catch(Exception e){}
               
         }  
    }//GEN-LAST:event_txtImpuestoKeyReleased

    private void btnCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCobrarActionPerformed
         double total = Double.parseDouble(txtTotalFactura.getText());
        double pagaCon=Double.parseDouble(txtPagaCon.getText());
       if (pagaCon>=total) {
        Factura factura= new Factura();
       factura.setDescripcion(txtDescripcion.getText());
       factura.setIdAlumno(cboAlumnos.getSelectedItem().toString());
       factura.setFecha(txtFecha.getText());
       factura.setTotalG(Double.parseDouble(txtTotalFactura.getText().toString()));
       
       for (int i = 0; i < tblFactura.getRowCount(); i++) {
                DetalleFactura detalle = new DetalleFactura();
          
                
                detalle.setNumFactura(Integer.parseInt(txtNumFactura.getText().toString()));
                detalle.setNombre(tblFactura.getValueAt(i, 0).toString());
                detalle.setPrecio(Double.parseDouble(tblFactura.getValueAt(i, 1).toString()));
                detalle.setCantidad(Integer.parseInt(tblFactura.getValueAt(i, 2).toString()));
                detalle.setTotal(Double.parseDouble(tblFactura.getValueAt(i, 3).toString()));
                factura.getDetalleFactura().add(detalle);
       
       }
       BDfactura.guardarFactura(factura);
       
            winCobro.dispose();
            winFactura.dispose();
       DefaultTableModel tableModel =(DefaultTableModel) tblFactura.getModel();
        tableModel.setRowCount(0);
       
       }


        
    }//GEN-LAST:event_btnCobrarActionPerformed

    private void txtPagaConKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPagaConKeyReleased
        try {
            
           
            double pagacon= Double.parseDouble(txtPagaCon.getText());
            double vuelto = pagacon - TotalFactura;
            if(vuelto<0){
                 txtVuelto.setText("$"+ vuelto);
                txtVuelto.setForeground(Color.red);
                
            }else {
                txtVuelto.setForeground(Color.black);
                
            }
            txtVuelto.setText("$"+ vuelto);
        } catch (NumberFormatException e) {
        }  
    }//GEN-LAST:event_txtPagaConKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarLibro;
    private javax.swing.JButton btnCobrar;
    private javax.swing.JButton btnProcesar;
    private javax.swing.JComboBox<String> cboAlumnos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lblAlumno;
    private javax.swing.JLabel lblTotalFactura;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tblFactura;
    private javax.swing.JTable tblLibros;
    private javax.swing.JTextField txtAlumno;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIdLibro;
    private javax.swing.JTextField txtImpuesto;
    private javax.swing.JTextField txtLibro;
    private javax.swing.JTextField txtNumFactura;
    private javax.swing.JTextField txtPagaCon;
    private javax.swing.JTextField txtSubTotal2;
    private javax.swing.JTextField txtSubtotal1;
    private javax.swing.JTextField txtTotalFactura;
    private javax.swing.JTextField txtVuelto;
    private javax.swing.JDialog winCobro;
    private javax.swing.JDialog winFactura;
    private javax.swing.JDialog winListaLibros;
    // End of variables declaration//GEN-END:variables

public void CargarAlumnos(){
 BDfactura.conectarBD();
 cboAlumnos.removeAllItems();
 BDfactura.cargarIdAlumnos(cboAlumnos);
 BDfactura.desconectarBD();


}
    
public void Generar_fecha(){
    String d;
     String m;
     String a;
     
     d=Integer.toString(fe.get(Calendar.DAY_OF_MONTH));
     m=Integer.toString(fe.get(Calendar.MONTH)+1);
     a=Integer.toString(fe.get(Calendar.YEAR));

     fecha=d+"/"+m+"/"+a;
   
   }
 
public void generar_Numero_Factura(){
 BDfactura.conectarBD();
 String  numf= BDfactura.obtenerNumeroFactura();
 NumFactura=numf;
 
 BDfactura.desconectarBD();
 
 }
 
 public void CargarTablaFactura(){
  DefaultTableModel tableModel =(DefaultTableModel) tblFactura.getModel();
        tableModel.setRowCount(0);
        String vector[] = new String[5];
        if(txtIdLibro.getText().equals("")||txtLibro.getText().equals("")||txtCantidad.getText().equals("")){
             JOptionPane.showMessageDialog(rootPane, "No hay datos agregados", "ERROR", JOptionPane.ERROR_MESSAGE);
       
        }else{
            JOptionPane.showMessageDialog(rootPane, "Cargado con exito");
            Libro libro = BDlibro.buscarLibro(Integer.parseInt(txtIdLibro.getText()));
            DetalleFactura defa = new DetalleFactura();
          
           
            defa.setNombre(libro.getNombre());
            defa.setPrecio(libro.getPrecio());
              int Cant =Integer.parseInt(txtCantidad.getText());
            defa.setCantidad(Cant);
            double totalValor ;
            totalValor  = libro.getPrecio()*Cant;
            defa.setTotal(totalValor);
            df.add(defa);
            
            for(int i =0;i< df.size();i++){
         
            vector[0]=df.get(i).getNombre();
            vector[1]=Double.toString(df.get(i).getPrecio());
            vector[2]=Integer.toString(df.get(i).getCantidad());
            vector[3]=Double.toString(df.get(i).getTotal());
            
             tableModel.addRow(vector);
                      tblFactura.setModel(tableModel);
                      tableModel.fireTableDataChanged();
            }
                 
                 
                 
               
               
                
                
                
                double subtotal_1 = 0;
                
                for (int i = 0; i < tblFactura.getRowCount(); i++) {
                    subtotal_1 += Double.parseDouble(tblFactura.getValueAt(i, 3).toString());
                   
                }
                
                SubTotal_1=subtotal_1;
                txtSubtotal1.setText(Double.toString(SubTotal_1));
                txtSubTotal2.setText(Double.toString(SubTotal_1));
        }
 
 TotalFactura=SubTotal_1;
 lblTotalFactura.setText(Double.toString(TotalFactura));
 txtIdLibro.setText("");
 txtLibro.setText("");
 txtCantidad.setText("");
 }

}
