/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.venta.ventanas;

import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import punto.venta.dao.CorteDAO;
import punto.venta.dao.Movimientos;
import punto.venta.dao.UsuarioDAO;
import punto.venta.utilidades.Utilidades;

/**
 *
 * @author agus_
 */
public class CorteEstructura extends javax.swing.JPanel {

    CorteDAO corted = new CorteDAO();
    NumberFormat formatoImporte = NumberFormat.getCurrencyInstance();
    DefaultTableCellRenderer dt = new DefaultTableCellRenderer();
    Movimientos mv = new Movimientos();
    
    DateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd");
    DateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");

    public CorteEstructura() {
        initComponents();
        corteDe.setVisible(false);
        deA.setVisible(false);
        ImageIcon ima = new ImageIcon("iconos/corte_dia.png");
        ImageIcon dinero = new ImageIcon("iconos/dinero_caja.png");
        ImageIcon entrada = new ImageIcon("iconos/entradas_dinero.png");
        ImageIcon salida = new ImageIcon("iconos/salida.png");
        ImageIcon ventaTotal = new ImageIcon("iconos/ventas_totales.png");
        ImageIcon gananciaTotal = new ImageIcon("iconos/ganacias.png");
        txtEntrada.setIcon(entrada);
        txtSalida.setIcon(salida);
        txtDinero.setIcon(dinero);
        btnCorte.setIcon(ima);
        txtVentasTotales.setIcon(ventaTotal);
        txtGananciaTotal.setIcon(gananciaTotal);
        panelEnsa.setVisible(false);
    }

    public void limpiarTodo(){
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        corteDe = new javax.swing.JLabel();
        Panelcor = new javax.swing.JPanel();
        txtDinero = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDinero = new javax.swing.JTable();
        txtVentasTotales = new javax.swing.JLabel();
        txtGananciaTotal = new javax.swing.JLabel();
        txtVentas = new javax.swing.JLabel();
        txtGanancia = new javax.swing.JLabel();
        panelEnsa = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaEntradas = new javax.swing.JTable();
        txtEntrada = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaSalidas = new javax.swing.JTable();
        txtSalida = new javax.swing.JLabel();
        txtVentasTotales1 = new javax.swing.JLabel();
        txtVentasCredito = new javax.swing.JLabel();
        deA = new javax.swing.JLabel();
        btnCorte = new javax.swing.JButton();
        panelTicket1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1401, 540));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(1365, 450));

        corteDe.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        corteDe.setForeground(new java.awt.Color(0, 0, 204));
        corteDe.setText("Corte de ...");

        Panelcor.setBackground(new java.awt.Color(255, 255, 255));

        txtDinero.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        txtDinero.setForeground(new java.awt.Color(102, 0, 51));
        txtDinero.setText("Dinero en Caja");

        tablaDinero.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        tablaDinero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Fondo de caja", "0.0"},
                {"Ventas", "0.0"},
                {"Entradas", "0.0"},
                {"Abonos", "0.0"},
                {"Salidas", "0.0"},
                {"Devoluciones", "0.0"},
                {"", "0.0"}
            },
            new String [] {
                "Descripción", "Monto"
            }
        ));
        jScrollPane1.setViewportView(tablaDinero);

        txtVentasTotales.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        txtVentasTotales.setForeground(new java.awt.Color(0, 0, 153));
        txtVentasTotales.setText("Ventas totales en efectivo");

        txtGananciaTotal.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        txtGananciaTotal.setForeground(new java.awt.Color(0, 0, 153));
        txtGananciaTotal.setText("Ganancia");

        txtVentas.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        txtVentas.setForeground(new java.awt.Color(0, 0, 153));
        txtVentas.setText("$ 0.0");

        txtGanancia.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        txtGanancia.setForeground(new java.awt.Color(0, 0, 153));
        txtGanancia.setText("$ 0.0");

        panelEnsa.setBackground(new java.awt.Color(255, 255, 255));

        tablaEntradas.setFont(new java.awt.Font("Lucida Console", 2, 10)); // NOI18N
        tablaEntradas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descripcion", "Monto"
            }
        ));
        jScrollPane3.setViewportView(tablaEntradas);

        txtEntrada.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        txtEntrada.setForeground(new java.awt.Color(0, 0, 255));
        txtEntrada.setText("Entradas de efectivo");

        tablaSalidas.setFont(new java.awt.Font("Lucida Console", 2, 10)); // NOI18N
        tablaSalidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Descripcion", "Monto"
            }
        ));
        jScrollPane2.setViewportView(tablaSalidas);

        txtSalida.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        txtSalida.setForeground(new java.awt.Color(255, 0, 0));
        txtSalida.setText("Salidas de Efectivo");

        javax.swing.GroupLayout panelEnsaLayout = new javax.swing.GroupLayout(panelEnsa);
        panelEnsa.setLayout(panelEnsaLayout);
        panelEnsaLayout.setHorizontalGroup(
            panelEnsaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEnsaLayout.createSequentialGroup()
                .addGroup(panelEnsaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEntrada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(panelEnsaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSalida)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        panelEnsaLayout.setVerticalGroup(
            panelEnsaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEnsaLayout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addGroup(panelEnsaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEnsaLayout.createSequentialGroup()
                        .addComponent(txtEntrada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEnsaLayout.createSequentialGroup()
                        .addComponent(txtSalida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        txtVentasTotales1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        txtVentasTotales1.setForeground(new java.awt.Color(0, 0, 153));
        txtVentasTotales1.setText("Ventas totales a credito");

        txtVentasCredito.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        txtVentasCredito.setForeground(new java.awt.Color(0, 0, 153));
        txtVentasCredito.setText("$ 0.0");

        javax.swing.GroupLayout PanelcorLayout = new javax.swing.GroupLayout(Panelcor);
        Panelcor.setLayout(PanelcorLayout);
        PanelcorLayout.setHorizontalGroup(
            PanelcorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelcorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelcorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelcorLayout.createSequentialGroup()
                        .addGroup(PanelcorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtVentasTotales)
                            .addComponent(txtGananciaTotal))
                        .addGap(29, 29, 29)
                        .addGroup(PanelcorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtGanancia, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(txtVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(60, 60, 60)
                        .addComponent(txtVentasTotales1)
                        .addGap(18, 18, 18)
                        .addComponent(txtVentasCredito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelcorLayout.createSequentialGroup()
                        .addGroup(PanelcorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDinero))
                        .addGap(37, 37, 37)
                        .addComponent(panelEnsa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(698, Short.MAX_VALUE))
        );
        PanelcorLayout.setVerticalGroup(
            PanelcorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelcorLayout.createSequentialGroup()
                .addGroup(PanelcorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelcorLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(txtDinero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelEnsa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(PanelcorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVentasTotales)
                    .addComponent(txtVentas)
                    .addComponent(txtVentasTotales1)
                    .addComponent(txtVentasCredito))
                .addGap(18, 18, 18)
                .addGroup(PanelcorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGanancia)
                    .addComponent(txtGananciaTotal))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        deA.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        deA.setForeground(new java.awt.Color(0, 0, 204));
        deA.setText("De las - a las -");

        btnCorte.setBackground(new java.awt.Color(102, 102, 255));
        btnCorte.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnCorte.setText("Hacer corte del día");
        btnCorte.setBorder(null);
        btnCorte.setPreferredSize(new java.awt.Dimension(200, 35));
        btnCorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorteActionPerformed(evt);
            }
        });

        panelTicket1.setBackground(new java.awt.Color(102, 0, 0));
        panelTicket1.setPreferredSize(new java.awt.Dimension(139, 29));

        jLabel2.setBackground(new java.awt.Color(204, 204, 0));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CORTE DEL DÍA");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout panelTicket1Layout = new javax.swing.GroupLayout(panelTicket1);
        panelTicket1.setLayout(panelTicket1Layout);
        panelTicket1Layout.setHorizontalGroup(
            panelTicket1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTicket1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(1201, Short.MAX_VALUE))
        );
        panelTicket1Layout.setVerticalGroup(
            panelTicket1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTicket1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCorte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deA)
                            .addComponent(corteDe, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Panelcor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelTicket1, javax.swing.GroupLayout.PREFERRED_SIZE, 1399, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(panelTicket1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deA, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(corteDe)
                            .addComponent(btnCorte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Panelcor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 1401, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 120, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCorteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorteActionPerformed
        Date d = new Date();
        String x[] = new String[6];
        x = corted.getDatosPorDia();
        Double y[] = new Double[6];
        y = Utilidades.hayNulosACero(x);

        tablaDinero.setValueAt("+ " + formatoImporte.format(y[0]), 0, 1);
        tablaDinero.setValueAt("+ " + formatoImporte.format(y[1]), 1, 1);
        tablaDinero.setValueAt("+ " + formatoImporte.format(y[3]), 2, 1);
        tablaDinero.setValueAt("+ " + formatoImporte.format(y[6]), 3, 1);
        tablaDinero.setValueAt("- " + formatoImporte.format(y[4]), 4, 1);
        tablaDinero.setValueAt("- " + formatoImporte.format(y[5]), 5, 1);
        Double total = y[0]+ y[6] + y[1] + y[3] - y[4] - y[5];
        tablaDinero.setValueAt(formatoImporte.format(total), 6, 1);

        double gananciaNeta = y[1] - y[2];
        Utilidades.im("GANACIA "+ y[2]);
        txtVentas.setText(formatoImporte.format(y[1]));

        //new DecimalFormat("#.##").format(gananciaNeta)
        txtGanancia.setText(formatoImporte.format(gananciaNeta));
        txtVentasCredito.setText(y[7]+"");
        corteDe.setText("Corte de " + UsuarioDAO.getNombre());
        deA.setText("De las " + UsuarioDAO.getHora() + " A las " + formatoHora.format(d));
        System.out.println("De las " + UsuarioDAO.getHora() + " A las " + formatoHora.format(d));
        corteDe.setVisible(true);
        deA.setVisible(true);

        //DefaultTableModel entrada = new DefaultTableModel();
        llenarTabla(1);
        llenarTabla(2);
        panelEnsa.setVisible(true);

    }//GEN-LAST:event_btnCorteActionPerformed
    public void ocultarPanel(){
    panelEnsa.setVisible(false);
    }
    public void llenarTabla(int tipo) {
        DefaultTableModel modelo = null;
        String tipoLLamada = "";
        if (tipo == 1) {
            modelo = (DefaultTableModel) tablaEntradas.getModel();
            limpiarTabla(tablaEntradas);
            tipoLLamada = "entrada_efectivo";
        } else {
            modelo = (DefaultTableModel) tablaSalidas.getModel();
            limpiarTabla(tablaSalidas);
            tipoLLamada = "salida_efectivo";
        }
        try {

            ResultSet rs = mv.getEntradasDelDia(tipoLLamada);
            String[] x = new String[2];

            if (rs == null) {
                System.out.println("Esta vacio");
            } else {

                while (rs.next()) {
                    x[0] = rs.getString(3);
                    x[1] = formatoImporte.format(Double.parseDouble(rs.getString(4)));
                    modelo.addRow(x);
                }
             
                if (tipo == 1) {
                    tablaEntradas.setModel(modelo);
                   
                } else {
                    tablaSalidas.setModel(modelo);
                }

            }
        } catch (Exception e) {

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
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panelcor;
    private javax.swing.JButton btnCorte;
    private javax.swing.JLabel corteDe;
    private javax.swing.JLabel deA;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel panelEnsa;
    private javax.swing.JPanel panelTicket1;
    private javax.swing.JTable tablaDinero;
    private javax.swing.JTable tablaEntradas;
    private javax.swing.JTable tablaSalidas;
    private javax.swing.JLabel txtDinero;
    private javax.swing.JLabel txtEntrada;
    private javax.swing.JLabel txtGanancia;
    private javax.swing.JLabel txtGananciaTotal;
    private javax.swing.JLabel txtSalida;
    private javax.swing.JLabel txtVentas;
    private javax.swing.JLabel txtVentasCredito;
    private javax.swing.JLabel txtVentasTotales;
    private javax.swing.JLabel txtVentasTotales1;
    // End of variables declaration//GEN-END:variables
}
