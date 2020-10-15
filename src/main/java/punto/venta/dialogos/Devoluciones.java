    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.venta.dialogos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import punto.venta.dao.TicketDAO;
import punto.venta.dao.VentasDAO;
import punto.venta.utilidades.Utilidades;

/**
 *
 * @author agus_
 */
public class Devoluciones extends javax.swing.JFrame {

    Date d = new Date();
    DateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
    TicketDAO t = new TicketDAO();
    VentasDAO v = new VentasDAO();
    Confirmacion confir;
    String idTicket = "";
    String fecha,hora ="";

    public Devoluciones() {
        initComponents();
        setTitle("Devoluciones");
        setLocationRelativeTo(null);
        
        seleccionaFecha.setDate(d);
            //ancho,largo
        setSize(350,500);

    }

    public void limpiarTabla(JTable tabla) {
        try {
            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
            int filas = tabla.getRowCount();
            for (int i = 0; filas > i; i++) {
                modelo.removeRow(0);
            }
        } catch (Exception e) {
            Utilidades.confirma(confir, "Error al limpiar la tabla");
        }
    }

    public void actualizarTabla() {

        DefaultTableModel m = (DefaultTableModel) tablaTickets.getModel();
        limpiarTabla(tablaTickets);
        String x[] = new String[3];

        try {
            //llenar la tabla de tickets
            Date fecha = seleccionaFecha.getDate();
            ResultSet res = t.getTickets(fecha);
            res.last();
            if (res.getRow() == 0) {
                  Utilidades.confirma(confir, "No hay datos en esa fecha");
            } else {
                res.beforeFirst();
                while (res.next()) {

                    x[0] = res.getString("idTicket");
                    x[1] = res.getString("fecha");
                    x[2] = res.getString("hora");
                    m.addRow(x);
                }

            }
        } catch (SQLException ex) {
           Utilidades.confirma(confir, "Error con la conexión a la base de datos");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        seleccionaFecha = new com.toedter.calendar.JDateChooser();
        btnbuscar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTickets = new javax.swing.JTable();
        txtOcultar1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaVentas = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Devoluciones");

        seleccionaFecha.setBackground(new java.awt.Color(0, 0, 102));
        seleccionaFecha.setForeground(new java.awt.Color(255, 255, 255));
        seleccionaFecha.setDateFormatString("yyyy-MM-dd");
        seleccionaFecha.setFont(new java.awt.Font("Cambria", 1, 11)); // NOI18N
        seleccionaFecha.setPreferredSize(new java.awt.Dimension(170, 35));

        btnbuscar1.setBackground(new java.awt.Color(0, 0, 102));
        btnbuscar1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnbuscar1.setForeground(new java.awt.Color(255, 255, 255));
        btnbuscar1.setText("Buscar");
        btnbuscar1.setBorder(null);
        btnbuscar1.setPreferredSize(new java.awt.Dimension(150, 35));
        btnbuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscar1ActionPerformed(evt);
            }
        });

        tablaTickets.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tablaTickets.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        tablaTickets.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ticket", "Fecha", "Hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaTickets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaTicketseventoClickTablaTickets(evt);
            }
        });
        jScrollPane1.setViewportView(tablaTickets);
        if (tablaTickets.getColumnModel().getColumnCount() > 0) {
            tablaTickets.getColumnModel().getColumn(0).setResizable(false);
            tablaTickets.getColumnModel().getColumn(1).setResizable(false);
            tablaTickets.getColumnModel().getColumn(2).setResizable(false);
        }

        txtOcultar1.setText("Selecciona el articulo que quieres devolver");

        tablaVentas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tablaVentas.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        tablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Producto", "Cantidad", "Monto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaVentasdevolverCantidadDeArticulos(evt);
            }
        });
        jScrollPane2.setViewportView(tablaVentas);
        if (tablaVentas.getColumnModel().getColumnCount() > 0) {
            tablaVentas.getColumnModel().getColumn(0).setResizable(false);
            tablaVentas.getColumnModel().getColumn(1).setResizable(false);
            tablaVentas.getColumnModel().getColumn(2).setResizable(false);
            tablaVentas.getColumnModel().getColumn(3).setResizable(false);
        }

        jButton1.setBackground(new java.awt.Color(0, 0, 102));
        jButton1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Devolver todo");
        jButton1.setPreferredSize(new java.awt.Dimension(150, 35));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(seleccionaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnbuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtOcultar1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(seleccionaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOcultar1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int row = tablaTickets.getSelectedRow();
        if (row < 0) {
            Utilidades.confirma(confir, "Selecciona un ticket");
        } else {
            String id = (String) tablaTickets.getValueAt(row, 0);

            TicketDevolverTodo obj = new TicketDevolverTodo(id, this,fecha,hora);
            obj.setVisible(true);

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tablaVentasdevolverCantidadDeArticulos(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaVentasdevolverCantidadDeArticulos
        int row = tablaVentas.getSelectedRow();

        String codigo = (String) tablaVentas.getValueAt(row, 0);
        String nombre = (String) tablaVentas.getValueAt(row, 1);
        String cantidad = (String) tablaVentas.getValueAt(row, 2);
        String monto = (String) tablaVentas.getValueAt(row, 3);

        // Ticket obj = new Ticket(idTicket, codigo, nombre, cantidad, monto, this, ven);
        Ticket obj = new Ticket(idTicket, codigo, nombre, cantidad, monto, this, fecha, hora);
        obj.setVisible(true);
    }//GEN-LAST:event_tablaVentasdevolverCantidadDeArticulos

    private void tablaTicketseventoClickTablaTickets(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaTicketseventoClickTablaTickets
          setSize(840,500);
        int row = tablaTickets.getSelectedRow();
        DefaultTableModel m = (DefaultTableModel) tablaTickets.getModel();
        
        idTicket = (String) m.getValueAt(row, 0);
        fecha = (String) m.getValueAt(row, 1);
        hora = (String) m.getValueAt(row, 2);
        
        DefaultTableModel m2 = (DefaultTableModel) tablaVentas.getModel();
        limpiarTabla(tablaVentas);
        String x[] = new String[5];

        try {
            //llenar la tabla de tickets

            ResultSet res = v.getVentasPorTicket(idTicket,fecha,hora);
            res.last();
            if (res.getRow() == 0) {

            } else {
                res.beforeFirst();
                while (res.next()) {

                    x[0] = res.getString("codigo");
                    x[1] = res.getString("nombre");
                    x[2] = res.getString("cantidad");
                    x[3] = res.getString("importe");
                    m2.addRow(x);
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(Devoluciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tablaTicketseventoClickTablaTickets

    private void btnbuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscar1ActionPerformed
        actualizarTabla();
    }//GEN-LAST:event_btnbuscar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser seleccionaFecha;
    private javax.swing.JTable tablaTickets;
    private javax.swing.JTable tablaVentas;
    private javax.swing.JLabel txtOcultar1;
    // End of variables declaration//GEN-END:variables
}
