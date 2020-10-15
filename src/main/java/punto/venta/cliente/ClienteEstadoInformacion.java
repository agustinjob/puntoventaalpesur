/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.venta.cliente;

import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import punto.venta.dao.ClienteDAO;
import punto.venta.dialogos.Abono;
import punto.venta.dialogos.Confirmacion;
import punto.venta.dialogos.LiquidarAdeudo;
import punto.venta.misclases.Cliente;
import punto.venta.misclases.Credito;
import punto.venta.utilidades.Utilidades;

/**
 *
 * @author agus_
 */
public class ClienteEstadoInformacion extends javax.swing.JPanel {

    String idCliente;
    NumberFormat formatoImporte = NumberFormat.getCurrencyInstance();
    ClienteDAO objCliente = new ClienteDAO();
    Credito cre = new Credito();
    Confirmacion confir;
    Cliente cli;
    double total;
    double totalAbonos;
    double saldo;
    
    
    public ClienteEstadoInformacion() {
        initComponents();
        ImageIcon abo = new ImageIcon("src/main/java/iconos/oro.png");
        ImageIcon liq = new ImageIcon("src/main/java/iconos/ticket.png");
        
        btnAbonar.setIcon(abo);
        btnLiquidar.setIcon(liq);
        comboLiquidadas.setVisible(false);
    }

    public void llenarDatos(Cliente c){
        limpiarTabla(tablaTickets);
        limpiarTabla(tablaProductos);
        limpiarTabla(tablaAbonos);
        totalAbonos=0;
        total=0;
    lblNombre.setText(c.getNombres());
    btnLiquidar.setEnabled(false);
    btnAbonar.setEnabled(false);
  
    lblCredito.setText(formatoImporte.format(Double.parseDouble(c.getLimiteCredito())));
    idCliente = c.getId();
    cli=c;
   saldo=objCliente.getSaldoCliente(idCliente);
   if(saldo>0){
   btnLiquidar.setEnabled(true);
   }
  
     lblSaldo.setText(formatoImporte.format(saldo));
    ResultSet res =objCliente.obtenerTicketsCliente(idCliente, false);
    String tickets[]= new String[2];
    if(res!=null){
        try {
            DefaultTableModel modelTicket= (DefaultTableModel) tablaTickets.getModel();
            
            while(res.next()){
                tickets[0]=res.getString("idTicket");
                tickets[1]=res.getString("fecha");
                modelTicket.addRow(tickets);
            }   
        
        } catch (SQLException ex) {
           Utilidades.confirma(confir, "Hubo un error con la conexión a la base de datos");
        }
    }
    
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
    
    public void llenaTablaAbonos(String idTicket, String fecha){
    
        DefaultTableModel m2 = (DefaultTableModel) tablaAbonos.getModel();
        limpiarTabla(tablaAbonos);
        String x[] = new String[2];
        ResultSet abonos = objCliente.getAbonos(idTicket, idCliente, fecha);
        if(abonos!=null){
            try {
                while(abonos.next()){
                   x[0]= abonos.getString("abonado");
                   x[1]= abonos.getString("fechaAbono");
                  
                   m2.addRow(x);
                   totalAbonos = totalAbonos + Double.parseDouble(x[0]);
                }   
                
           cre.setMonto(total);
            } catch (SQLException ex) {
                Utilidades.confirma(confir, "Hubo un error en la conexión a la base de datos");
            }
        }
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblCredito = new javax.swing.JLabel();
        panelBotones = new javax.swing.JPanel();
        btnAbonar = new javax.swing.JButton();
        btnLiquidar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        comboLiquidadas = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaAbonos = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaTickets = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setText("Estado de cuenta");

        lblNombre.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(102, 102, 102));
        lblNombre.setText("Agustín Job");

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 0));
        jLabel2.setText("Productos");

        lblSaldo.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        lblSaldo.setText("$0.00");

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 0));
        jLabel4.setText("Límite de crédito:");

        lblCredito.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        lblCredito.setText("$0.00");

        panelBotones.setBackground(new java.awt.Color(233, 247, 247));

        btnAbonar.setBackground(new java.awt.Color(255, 255, 255));
        btnAbonar.setText("Abonar");
        btnAbonar.setPreferredSize(new java.awt.Dimension(150, 35));
        btnAbonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbonarActionPerformed(evt);
            }
        });
        panelBotones.add(btnAbonar);

        btnLiquidar.setBackground(new java.awt.Color(255, 255, 255));
        btnLiquidar.setText("Liquidar adeudo");
        btnLiquidar.setPreferredSize(new java.awt.Dimension(150, 35));
        btnLiquidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLiquidarActionPerformed(evt);
            }
        });
        panelBotones.add(btnLiquidar);

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descripción del producto", "Precio venta", "Cantidad", "Importe"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaProductos);
        if (tablaProductos.getColumnModel().getColumnCount() > 0) {
            tablaProductos.getColumnModel().getColumn(0).setResizable(false);
            tablaProductos.getColumnModel().getColumn(0).setPreferredWidth(150);
            tablaProductos.getColumnModel().getColumn(1).setResizable(false);
            tablaProductos.getColumnModel().getColumn(1).setPreferredWidth(50);
            tablaProductos.getColumnModel().getColumn(2).setResizable(false);
            tablaProductos.getColumnModel().getColumn(2).setPreferredWidth(50);
            tablaProductos.getColumnModel().getColumn(3).setResizable(false);
            tablaProductos.getColumnModel().getColumn(3).setPreferredWidth(50);
        }

        comboLiquidadas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "no liquidadas", "ya liquidadas" }));
        comboLiquidadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboLiquidadasActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 0));
        jLabel3.setText("Total:");

        lblTotal.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        lblTotal.setText("$0.00");

        tablaAbonos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Monto", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tablaAbonos);
        if (tablaAbonos.getColumnModel().getColumnCount() > 0) {
            tablaAbonos.getColumnModel().getColumn(0).setResizable(false);
            tablaAbonos.getColumnModel().getColumn(1).setResizable(false);
        }

        tablaTickets.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ticket", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaTickets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaTicketsMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tablaTickets);
        if (tablaTickets.getColumnModel().getColumnCount() > 0) {
            tablaTickets.getColumnModel().getColumn(0).setResizable(false);
            tablaTickets.getColumnModel().getColumn(0).setPreferredWidth(20);
            tablaTickets.getColumnModel().getColumn(1).setResizable(false);
            tablaTickets.getColumnModel().getColumn(1).setPreferredWidth(100);
        }

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 0));
        jLabel6.setText("Tickets");

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 0));
        jLabel8.setText("Saldo actual:");

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 0));
        jLabel5.setText("Abonos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBotones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(comboLiquidadas, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(330, 330, 330)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblTotal))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(64, 64, 64)
                                        .addComponent(jLabel6)
                                        .addGap(358, 358, 358)
                                        .addComponent(jLabel2)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 102, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSaldo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCredito)
                .addGap(263, 263, 263))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSaldo)
                    .addComponent(jLabel4)
                    .addComponent(lblCredito)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboLiquidadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(lblTotal)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbonarActionPerformed
   double resto = total - totalAbonos;
        Abono objAb= new Abono(cre,resto,this,cli);
        objAb.setVisible(true);
        
    }//GEN-LAST:event_btnAbonarActionPerformed

    private void tablaTicketsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaTicketsMouseClicked
        btnLiquidar.setEnabled(true);
   btnAbonar.setEnabled(true);
        total =0;
        int row = tablaTickets.getSelectedRow();
        DefaultTableModel m = (DefaultTableModel) tablaTickets.getModel();
        String idTicket = (String) m.getValueAt(row, 0);
        String fecha = (String) m.getValueAt(row, 1);
        
        //Tabla abonos
        llenaTablaAbonos(idTicket,fecha);
       // Llenado de datos del credito
        cre.setIdTicket(Integer.parseInt(idTicket));
        cre.setFecha(fecha);
        cre.setIdCliente(Integer.parseInt(idCliente));
        
        DefaultTableModel m2 = (DefaultTableModel) tablaProductos.getModel();
        limpiarTabla(tablaProductos);
        String x[] = new String[4];
        ResultSet productos = objCliente.getVentasPorTicketCliente(idTicket, idCliente, fecha);
        
        if(productos!=null){
            try {
                while(productos.next()){
                   x[0]= productos.getString("nombre");
                   x[1]= productos.getString("precioVenta");
                   x[2]= productos.getString("cantidad");
                   x[3]= productos.getString("importe");
                   m2.addRow(x);
                   total = total + Double.parseDouble(x[3]);
                }   
               
           cre.setMonto(total);
            } catch (SQLException ex) {
                Utilidades.confirma(confir, "Hubo un error en la conexión a la base de datos");
            }
        }
         lblTotal.setText(formatoImporte.format(total));
    }//GEN-LAST:event_tablaTicketsMouseClicked

    private void btnLiquidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLiquidarActionPerformed
        LiquidarAdeudo liqui = new LiquidarAdeudo(saldo+"",cli,this);
        liqui.setVisible(true);
        
    }//GEN-LAST:event_btnLiquidarActionPerformed

    private void comboLiquidadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboLiquidadasActionPerformed
      String tipo = (String) comboLiquidadas.getSelectedItem();
      if(tipo.equalsIgnoreCase("ya liquidadas")){
      
      }else{
      
      }
    }//GEN-LAST:event_comboLiquidadasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbonar;
    private javax.swing.JButton btnLiquidar;
    private javax.swing.JComboBox<String> comboLiquidadas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblCredito;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JTable tablaAbonos;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTable tablaTickets;
    // End of variables declaration//GEN-END:variables
}
