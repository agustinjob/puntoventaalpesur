/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.venta.ventanas;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import org.jdesktop.swingx.autocomplete.ObjectToStringConverter;
import punto.venta.dao.ProductoDAO;
import punto.venta.dao.TicketDAO;
import punto.venta.dialogos.Cobrar;
import punto.venta.dialogos.Confirmacion;
import punto.venta.dialogos.Devoluciones;
import punto.venta.dialogos.EntradaEfectivo;
import punto.venta.dialogos.InsVarios;
import punto.venta.dialogos.SalidaEfectivo;
import punto.venta.misclases.Producto;
import punto.venta.misclases.Usuario;
import punto.venta.utilidades.Utilidades;

/**
 *
 * @author job
 */
public class VentasEstructura extends javax.swing.JPanel implements ActionListener,KeyListener {

    DefaultTableModel md;
    String data[][] = {};
    String cabeza[] = {"Código de barras", "Descripcion de producto", "Precio venta", "Cant", "importe", "Existencia", "Precio Costo"};
    int filas;
    ProductoDAO obj = new ProductoDAO();
    ArrayList<Producto> p = new ArrayList();
    DefaultTableCellRenderer dt = new DefaultTableCellRenderer();
    static int tipoPrecio;
    private Usuario usu;
    public double total = 0.0d;
    public int numeroArticulos = 0;
    TicketDAO tick = new TicketDAO();
    Confirmacion confir;
    private Dimension dim;
    Estructura e;

    public VentasEstructura() {
        initComponents();
        btn1.setVisible(false);
        btn1.setEnabled(false);
        tipoPrecio = 1;
        md = new DefaultTableModel();
        this.txtTabla.setModel(md);
        txtCodigo.requestFocus();
        md = new DefaultTableModel(data, cabeza) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 3 || column == 4 || column == 2 ? true : false;
            }
        };
        inicializarIconos();
        txtTicket.setText("Folio del ticket: " + tick.getNumero());
        centrarValoresTabla();
      //  this.setFocusTraversalKeysEnabled(true);
     //   this.setFocusable(true);
      //  this.requestFocus();
        addKeyListener(this);
        Utilidades.im("Entro a ventas");
        Utilidades.im(""+this.hasFocus());
        
        
    }
    
public void setEstructura(Estructura e){
this.e=e;
}
    public void actualizaTicket(String tik) {
        txtTicket.setText("Folio del ticket: " + tik);
        txtTotal.setText("");
    }

    public void llenarCombo() {

        try {
            p = obj.obtenerProductosSiHuboModificacion(p, true);
            int i = 0;
            comboProductos.removeAllItems();
            comboProductos.addItem("");
            while (i < p.size()) {
                comboProductos.addItem(p.get(i).getNombre());
                i++;
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VentasEstructura.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(VentasEstructura.class.getName()).log(Level.SEVERE, null, ex);
        }

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

    public boolean revisarRepetidos(String codigo) {
        DefaultTableModel modelo = (DefaultTableModel) txtTabla.getModel();
        int i = 0;

        while (i < modelo.getRowCount()) {
            if (modelo.getValueAt(i, 0).equals(codigo) || modelo.getValueAt(i, 1).equals(codigo)) {
                String cantidad = (String) modelo.getValueAt(i, 3);
                double numero = Double.parseDouble(cantidad);
                String pre = (String) modelo.getValueAt(i, 2);
                double precio = Double.parseDouble(pre);
                numero = numero + 1;
                double to = precio * numero;
                modelo.setValueAt(numero + "", i, 3);
                modelo.setValueAt(to + "", i, 4);
                total = total + precio;
                txtTotal.setText(total + "");
                numeroArticulos = numeroArticulos + 1;
                return true;
            }
            i++;
        }
        return false;
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

        txtTotal.setText(total + "");
    }

    public boolean masCantidadQueInventario() {

        DefaultTableModel model = (DefaultTableModel) txtTabla.getModel();
        int i = 0;
        while (i < model.getRowCount()) {
            String cantidad = (String) model.getValueAt(i, 3);
            String inventario = (String) model.getValueAt(i, 5);
            String pVenta = (String) model.getValueAt(i, 2);
            System.out.println("Cantidad " + cantidad + " Inventario " + inventario);
            double can = Double.parseDouble(cantidad);
            double inv = Double.parseDouble(inventario);
            Double.parseDouble(pVenta);
            if (can > inv) {
                JOptionPane.showMessageDialog(null, "Revisa los datos, ingresaste más cantidad de un producto de lo que tienes en inventario");
                return true;
            }
            i++;
        }

        return false;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTicket = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        comboProductos = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtagregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTabla = new javax.swing.JTable();
        txtTicket = new javax.swing.JLabel();
        panelSuperiorBotones = new javax.swing.JPanel();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        panelDevo = new javax.swing.JPanel();
        btndevoluciones = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btnReiniciarFolio = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        btn8 = new javax.swing.JButton();
        txtTotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        panelTicket.setBackground(new java.awt.Color(102, 0, 102));
        panelTicket.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                panelTicketFocusGained(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 204, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VENTAS");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout panelTicketLayout = new javax.swing.GroupLayout(panelTicket);
        panelTicket.setLayout(panelTicketLayout);
        panelTicketLayout.setHorizontalGroup(
            panelTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTicketLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1221, Short.MAX_VALUE))
        );
        panelTicketLayout.setVerticalGroup(
            panelTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTicketLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1500, 40));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Nombre  producto:");

        comboProductos.setEditable(true);
        comboProductos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("Código:");

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        txtagregar.setBackground(new java.awt.Color(0, 51, 153));
        txtagregar.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        txtagregar.setForeground(new java.awt.Color(255, 255, 255));
        txtagregar.setBorder(null);
        txtagregar.setLabel("Agregar Producto");
        txtagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtagregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 16, Short.MAX_VALUE))
        );

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
        txtTabla.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        txtTicket.setText("Folio ticket:");

        panelSuperiorBotones.setBackground(new java.awt.Color(255, 255, 255));
        panelSuperiorBotones.setLayout(new java.awt.GridLayout(1, 8));

        btn3.setBackground(new java.awt.Color(0, 51, 153));
        btn3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("F11 Mayoreo");
        btn3.setBorder(null);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        panelSuperiorBotones.add(btn3);

        btn4.setBackground(new java.awt.Color(0, 51, 153));
        btn4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("F7 Entradas");
        btn4.setBorder(null);
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        panelSuperiorBotones.add(btn4);

        btn5.setBackground(new java.awt.Color(0, 51, 153));
        btn5.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setText("F8 Salidas");
        btn5.setBorder(null);
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        panelSuperiorBotones.add(btn5);

        btn6.setBackground(new java.awt.Color(0, 51, 153));
        btn6.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setText("DEL Borrar Art");
        btn6.setBorder(null);
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        panelSuperiorBotones.add(btn6);

        btn1.setBackground(new java.awt.Color(0, 51, 153));
        btn1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("INS Varios");
        btn1.setBorder(null);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        panelSuperiorBotones.add(btn1);

        panelDevo.setBackground(new java.awt.Color(255, 255, 255));
        panelDevo.setLayout(new java.awt.GridLayout(1, 0));

        btndevoluciones.setBackground(new java.awt.Color(0, 51, 153));
        btndevoluciones.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btndevoluciones.setForeground(new java.awt.Color(255, 255, 255));
        btndevoluciones.setText("Devoluciones");
        btndevoluciones.setBorder(null);
        btndevoluciones.setPreferredSize(new java.awt.Dimension(150, 35));
        btndevoluciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndevolucionesActionPerformed(evt);
            }
        });
        panelDevo.add(btndevoluciones);

        btn7.setBackground(new java.awt.Color(0, 51, 153));
        btn7.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setText("Eliminar Todo");
        btn7.setBorder(null);
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        panelDevo.add(btn7);

        btnReiniciarFolio.setBackground(new java.awt.Color(0, 51, 153));
        btnReiniciarFolio.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnReiniciarFolio.setForeground(new java.awt.Color(255, 255, 255));
        btnReiniciarFolio.setText("Reiniciar folio");
        btnReiniciarFolio.setBorder(null);
        btnReiniciarFolio.setPreferredSize(new java.awt.Dimension(150, 35));
        btnReiniciarFolio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarFolioActionPerformed(evt);
            }
        });
        panelDevo.add(btnReiniciarFolio);

        jPanel8.setBackground(new java.awt.Color(204, 204, 255));
        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn8.setBackground(new java.awt.Color(0, 51, 153));
        btn8.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setText("F12 Cobrar");
        btn8.setBorder(null);
        btn8.setPreferredSize(new java.awt.Dimension(130, 38));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        txtTotal.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(0, 0, 204));
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotal.setBorder(null);
        txtTotal.setEnabled(false);
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setText("$");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(txtTotal))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panelDevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(512, 512, 512))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtTicket)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1369, Short.MAX_VALUE)
                    .addComponent(panelTicket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelSuperiorBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 844, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelSuperiorBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelDevo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTicket))
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtagregarActionPerformed
        String nombre = (String) comboProductos.getSelectedItem();
        nombre = nombre.trim();
        if (nombre.equalsIgnoreCase("")) {
            Utilidades.confirma(confir, "Por favor ingresa el nombre del producto");
        } else {
            boolean bandera = revisarRepetidos(nombre);
            if (bandera == false) {
                String[] info = new String[7];
                info = obj.getProductoPorNombre(nombre, p, 1, tipoPrecio);

                if (info[0] == null) {

                    Utilidades.confirma(confir, "Producto no encontrado");
                } else {
                    double can = Double.parseDouble(info[5]);
                    if (can > 0) {
                        md.addRow(info);
                        total = total + (Double.parseDouble(info[2]) * Double.parseDouble(info[3]));
                        txtTotal.setText(total + "");
                        numeroArticulos = numeroArticulos + 1;
                    } else {
                        Utilidades.confirma(confir, "El producto esta registrado pero su invenario esta en 0, por favor agregar más producto en la sección correspondiente");
                    }

                }
            }
            comboProductos.setSelectedIndex(0);
        }
        e.requestFocus();

    }//GEN-LAST:event_txtagregarActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed

        String nombre = txtCodigo.getText();
        if (nombre.equalsIgnoreCase("")) {

            Utilidades.confirma(confir, "Por favor ingresa un código");
        } else {
            boolean bandera = revisarRepetidos(nombre);
            if (bandera == false) {
                String[] info = new String[7];
                info = obj.getProductoPorNombre(nombre, p, 1, tipoPrecio);
                if (info[0] == null) {
                    Utilidades.confirma(confir, "Producto no encontrado");
                } else {
                    double can = Double.parseDouble(info[5]);
                    if (can > 0) {
                        md.addRow(info);

                        total = total + (Double.parseDouble(info[2]) * Double.parseDouble(info[3]));

                        txtTotal.setText(total + "");
                        numeroArticulos = numeroArticulos + 1;
                    } else {
                        Utilidades.confirma(confir, "El producto esta registrado pero su invenario esta en 0, por favor agregar más producto en la sección correspondiente");

                    }
                }

            }
            txtCodigo.setText("");
        }

    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        InsVarios objeto = new InsVarios(md, tipoPrecio);
        objeto.setVisible(true);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if (tipoPrecio == 1) {
            Utilidades.confirma(confir, "Se ha activado el precio de mayoreo");
            tipoPrecio = 2;
        } else {
            Utilidades.confirma(confir, "Se ha desactivado el precio de mayoreo");
            tipoPrecio = 1;
        }
      
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        EntradaEfectivo objeto = new EntradaEfectivo();
        objeto.setVisible(true);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        SalidaEfectivo objeto = new SalidaEfectivo();
        objeto.setVisible(true);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        eliminaCelda(1);

        if (numeroArticulos > 0)
            numeroArticulos = numeroArticulos - 1;
        
        e.requestFocus();
    }//GEN-LAST:event_btn6ActionPerformed

    private void txtTablaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTablaKeyPressed
       
try{      
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
        if(evt.getKeyCode() == 127){
          eliminaCelda(1);
        }
}catch(NumberFormatException exc){
  Utilidades.confirma(confir, "Haz ingresado una letra u otro caracter en lugar de un número. Por favor revisa los datos ingresados");
}

if (txtTabla.getSelectedRow() >= 0) {
}else{
e.requestFocus();
}

    }//GEN-LAST:event_txtTablaKeyPressed

    
     public void sumarDeUno(){
      
      String temp = (String) md.getValueAt(txtTabla.getSelectedRow(), 3);
      double cantidad = Double.parseDouble(temp) + 1;
      md.setValueAt(cantidad+"",txtTabla.getSelectedRow() , 3);
      actualizarImporteTabla();
    }
     
      public void restarDeUno(){
      
      String temp = (String) md.getValueAt(txtTabla.getSelectedRow(), 3);
      double cantidad = Double.parseDouble(temp) - 1;
      md.setValueAt(cantidad+"",txtTabla.getSelectedRow() , 3);
      actualizarImporteTabla();
    }
     
    private void btnReiniciarFolioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarFolioActionPerformed
        try {
            tick.modificarEstatus();
            txtTicket.setText("Folio ticket: " + tick.getNumero());// TODO add your handling code here:
        } catch (ClassNotFoundException ex) {
            Utilidades.confirma(confir, "Ocurrio un error con el sistema");
        }
    }//GEN-LAST:event_btnReiniciarFolioActionPerformed

    private void btndevolucionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndevolucionesActionPerformed
        Devoluciones obj = new Devoluciones();
        obj.setVisible(true);
    }//GEN-LAST:event_btndevolucionesActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        eliminaCelda(2);
        numeroArticulos = 0;
        total = 0;
        txtTotal.setText("");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
       realizaCobro();
       e.requestFocus();
    }//GEN-LAST:event_btn8ActionPerformed

    
    public void realizaCobro(){
            DefaultTableModel tm = (DefaultTableModel) txtTabla.getModel();

        if (tm.getRowCount() <= 0) {
            Utilidades.confirma(confir, "Por favor ingresa productos para realizar el cobro");
        } else {
            try{
            if (!masCantidadQueInventario()) {
                Cobrar obj = new Cobrar(this,md);
                obj.setVisible(true);
                String info = txtTotal.getText();
                Cobrar.txtn2.setText(info);
                obj.numArticulos.setText(numeroArticulos + "");
            }
            }catch(NumberFormatException e){
                Utilidades.confirma(confir, "Ingresaste una letra u otro caracter en lugar de un número. Por favor revisa la información ingresada");
            }
        }
    }
    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void panelTicketFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_panelTicketFocusGained
        System.out.println("Quien lo gano " + evt.getComponent().getName());
        System.out.println("Quien lo perde " + evt.getOppositeComponent().getName());
    }//GEN-LAST:event_panelTicketFocusGained

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        System.out.println("Dio Click");
        txtTabla.clearSelection();
        e.requestFocus();
    }//GEN-LAST:event_formMouseClicked
    public void inicializarIconos() {
        System.out.println("Si entro aca");

        ImageIcon e = new ImageIcon("src/main/java/iconos/ticket.png");
        ImageIcon f = new ImageIcon("src/main/java/iconos/usuario.png");
        ImageIcon enter = new ImageIcon("src/main/java/iconos/check.png");
        ImageIcon aa = new ImageIcon("src/main/java/iconos/documentos.png");
        ImageIcon bb = new ImageIcon("src/main/java/iconos/lupa.png");
        ImageIcon ccc = new ImageIcon("src/main/java/iconos/estrella.png");
        ImageIcon dd = new ImageIcon("src/main/java/iconos/ganancias_dinero.png");
        ImageIcon ee = new ImageIcon("src/main/java/iconos/salida_dinero.png");
        ImageIcon ff = new ImageIcon("src/main/java/iconos/bote_basura.png");
        ImageIcon gg = new ImageIcon("src/main/java/iconos/carro_cobrar.png");
        ImageIcon iconoCap = new ImageIcon("src/main/java/iconos/ico_cap.png");

        btn1.setIcon(aa);
        btnReiniciarFolio.setIcon(e);
        btndevoluciones.setIcon(aa);
        btn3.setIcon(ccc);
        btn4.setIcon(dd);
        btn5.setIcon(ee);
        btn6.setIcon(ff);
        btn7.setIcon(ff);
        btn8.setIcon(gg);
        txtagregar.setIcon(enter);

        try {
            llenarCombo();
        } catch (Exception ClassNotFoundException) {
        }
        AutoCompleteDecorator.decorate(comboProductos, ObjectToStringConverter.DEFAULT_IMPLEMENTATION);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btnReiniciarFolio;
    private javax.swing.JButton btndevoluciones;
    private javax.swing.JComboBox<String> comboProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelDevo;
    private javax.swing.JPanel panelSuperiorBotones;
    private javax.swing.JPanel panelTicket;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTable txtTabla;
    private javax.swing.JLabel txtTicket;
    public static javax.swing.JTextField txtTotal;
    private javax.swing.JButton txtagregar;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
       Utilidades.im("1");
    }

    @Override
    public void keyTyped(KeyEvent e) {
         Utilidades.im("2");
    }

    @Override
    public void keyPressed(KeyEvent e) {
       Utilidades.im("Tecla presionada " + e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
      Utilidades.im("1");
    }
}
