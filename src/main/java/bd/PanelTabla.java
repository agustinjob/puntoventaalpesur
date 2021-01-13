/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import punto.venta.dialogos.Confirmacion;
import punto.venta.utilidades.Utilidades;
import static punto.venta.ventanas.VentasEstructura.txtTotal;

/**
 *
 * @author agus_
 */
public class PanelTabla extends javax.swing.JPanel implements ActionListener,KeyListener {

    DefaultTableModel md;
    String data[][] = {};
    String cabeza[] = {"Código de barras", "Descripcion de producto", "Precio venta", "Cant", "importe", "Existencia", "Precio Costo"};
    int filas;
    DefaultTableCellRenderer dt = new DefaultTableCellRenderer();
    public double total = 0.0d;
    public int numeroArticulos = 0;
    Confirmacion confir;
    JTextField txtTotalOb;
    public PanelTabla(JTextField txtTotalOb) {
        initComponents();
         md = new DefaultTableModel();
        this.txtTabla.setModel(md);
        md = new DefaultTableModel(data, cabeza) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 3 || column == 4 || column == 2 ? true : false;
            }
        };
     this.txtTotalOb=txtTotalOb;
          centrarValoresTabla();
          addKeyListener(this);
    }
    
        public void centrarValoresTabla() {
        JTableHeader tablaCabe = txtTabla.getTableHeader();
        DefaultTableCellRenderer render = (DefaultTableCellRenderer) txtTabla.getTableHeader().getDefaultRenderer();
        render.setHorizontalAlignment(SwingConstants.CENTER);
        tablaCabe.setDefaultRenderer(render);
        txtTabla.setModel(md);
        dt.setHorizontalAlignment(SwingConstants.CENTER);
        txtTabla.getColumnModel().getColumn(0).setCellRenderer(dt);

        txtTabla.getColumnModel().getColumn(1).setCellRenderer(dt);
        txtTabla.getColumnModel().getColumn(2).setCellRenderer(dt);
        txtTabla.getColumnModel().getColumn(3).setCellRenderer(dt);
        txtTabla.getColumnModel().getColumn(4).setCellRenderer(dt);
        txtTabla.getColumnModel().getColumn(5).setCellRenderer(dt);

        txtTabla.getColumnModel().getColumn(6).setWidth(0);
        txtTabla.getColumnModel().getColumn(6).setMinWidth(0);
        txtTabla.getColumnModel().getColumn(6).setMaxWidth(0);
        txtTabla.setRowHeight(30);
    }

    public JTable getTabla(){
        return txtTabla;
    }

    public void sumarDeUno() {

        String temp = (String) md.getValueAt(txtTabla.getSelectedRow(), 3);
        double cantidad = Double.parseDouble(temp) + 1;
        md.setValueAt(cantidad + "", txtTabla.getSelectedRow(), 3);
        actualizarImporteTabla();
    }

    public void restarDeUno() {

        String temp = (String) md.getValueAt(txtTabla.getSelectedRow(), 3);
        double cantidad = Double.parseDouble(temp) - 1;
        md.setValueAt(cantidad + "", txtTabla.getSelectedRow(), 3);
        actualizarImporteTabla();
    }
    
     public void actualizarImporteTabla() {
        DefaultTableModel tm = (DefaultTableModel) txtTabla.getModel();
        numeroArticulos = 0;
        total = 0;
        for (int i = 0; i < tm.getRowCount(); i++) {
            double precio = Double.parseDouble((String) tm.getValueAt(i, 2));
            double cantidad = Double.parseDouble((String) tm.getValueAt(i, 3));
            double inventario = Double.parseDouble((String) tm.getValueAt(i, 5));
            numeroArticulos = (int) (numeroArticulos + cantidad);
            if (cantidad > inventario) {
                Utilidades.confirma(confir, "La cantidad de productos a vender es mayor que el número de productos en inventario");
                tm.removeRow(i);
            } else {
                double suma = precio * cantidad;
                tm.setValueAt(suma + "", i, 4);
                total = total + suma;
            }

        }
        Utilidades.im("Eliminando " + total);
        txtTotalOb.setText(total + "");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtTabla = new javax.swing.JTable();

        jScrollPane1.setBorder(null);

        txtTabla.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtTabla.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        txtTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Pruieba Producto", "10", "10", "10", "10"}
            },
            new String [] {
                "Código de barras ", "Descripción del Producto", "Precio Venta", "Cant", "Importe", "Existencia"
            }
        ));
        txtTabla.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        txtTabla.setAutoscrolls(false);
        txtTabla.setColumnSelectionAllowed(true);
        txtTabla.setDropMode(javax.swing.DropMode.ON);
        txtTabla.setGridColor(new java.awt.Color(255, 255, 255));
        txtTabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        txtTabla.setShowHorizontalLines(false);
        txtTabla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTablaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(txtTabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTablaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTablaKeyPressed

        try {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                int row = txtTabla.getSelectedRow();
                int column = txtTabla.getSelectedColumn();
                double preci = Double.parseDouble(txtTabla.getValueAt(row, 2) + "");
                if (column == 3) {// por cantidad
                    String can = (String) txtTabla.getValueAt(row, column);
                    double canti = Double.parseDouble(can);
                    double totalImporte = canti * preci;
                    txtTabla.setValueAt(totalImporte + "", row, 4);
                }

                if (column == 4) {// por importe
                    String imp = (String) txtTabla.getValueAt(row, column);
                    double impor = Double.parseDouble(imp);
                    double totalCanti = impor / preci;
                    txtTabla.setValueAt(totalCanti + "", row, 3);

                }
                actualizarImporteTabla();

            }

            if (evt.getKeyCode() == 107) {
                sumarDeUno();
            }

            if (evt.getKeyCode() == 109) {
                restarDeUno();
            }
            if (evt.getKeyCode() == 127) {
                eliminaCelda(1);
            }
        } catch (NumberFormatException exc) {
            Utilidades.confirma(confir, "Haz ingresado una letra u otro caracter en lugar de un número. Por favor revisa los datos ingresados");
        }

      
    }//GEN-LAST:event_txtTablaKeyPressed

    public void setTotal(double total){
    this.total=total;
    }
    
    public double getTotal(){
    return total;
    }
    
    public void setNumArticulos(int numArticulos){
    this.numeroArticulos=numArticulos;
    }
    
    public int getNumArticulos(){
    return numeroArticulos;
    }
    
    public void eliminaCelda(int tipoEliminacion) {
        System.out.println("antes del model");
        DefaultTableModel tm = (DefaultTableModel) txtTabla.getModel();
        System.out.println("despues del modelo en tipo eliminacion");
        if (tipoEliminacion == 1) {
            if (txtTabla.getSelectedRow() >= 0) {
                if (txtTabla.getValueAt(txtTabla.getSelectedRow(), 0) == null) {
                    JOptionPane.showMessageDialog(this, "La fila que selecciono ,no cuenta con ningún producto", "Alexito", JOptionPane.WARNING_MESSAGE);
                } else {

                    double resta = Double.parseDouble((String) tm.getValueAt(txtTabla.getSelectedRow(), 4));
                    Utilidades.im("Total " + total);
                    total = total - resta;
                    tm.removeRow(txtTabla.getSelectedRow());
                    txtTotal.setText(total + "");
                }
            } else {
                Utilidades.confirma(confir, "No haz seleccionado ninguna fila");
                
            }

        } else {

            int r = 0;
            while (tm.getRowCount() > r) {
                tm.removeRow(r);
            }

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable txtTabla;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
