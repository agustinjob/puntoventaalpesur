/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.venta.inventario;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import org.jdesktop.swingx.autocomplete.ObjectToStringConverter;
import punto.venta.dao.ProductoDAO;
import punto.venta.dialogos.Confirmacion;
import punto.venta.misclases.Producto;
import punto.venta.utilidades.Utilidades;

/**
 *
 * @author agus_
 */
public class InventarioAgregar extends javax.swing.JPanel {

    ProductoDAO obj = new ProductoDAO();
    ArrayList<Producto> p = new ArrayList();
    Confirmacion confir;
    
    public InventarioAgregar() {
        initComponents();
        ImageIcon lupa = new ImageIcon("src/main/java/iconos/lupa.png");
        ImageIcon agregar = new ImageIcon("src/main/java/iconos/check.png");
        btnBuscar.setIcon(lupa);
        btnAgregar.setIcon(agregar);
        llenarCombo();
        AutoCompleteDecorator.decorate(comboProductos, ObjectToStringConverter.DEFAULT_IMPLEMENTATION);
    }

  public void llenarCombo() {

        try {
            p = obj.obtenerProductosSiHuboModificacion(p, true);
             comboProductos.removeAllItems();
             comboProductos.addItem("");
            int i = 0;
            while (i < p.size()) {
                comboProductos.addItem(p.get(i).getNombre());
                i++;
            }
        } catch (ClassNotFoundException ex) {
            Utilidades.confirma(confir, "Hubo un error en el sistema");
        } catch (SQLException ex) {
            Utilidades.confirma(confir, "Hubo un error en la conexion a la base de datos");
        }

    }
  
  public void limpiar(){
                txtCodigo.setText("");
                txtNombre.setText("");
                txtPrecioCosto.setText("");
                txtPrecioVenta.setText("");
                txtPrecioMayoreo.setText("");
                txtExistencia.setText("");
                txtAgregar.setText("");
  }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titu = new javax.swing.JLabel();
        codi = new javax.swing.JLabel();
        comboProductos = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();
        codiso = new javax.swing.JLabel();
        des = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtPrecioCosto = new javax.swing.JTextField();
        preco = new javax.swing.JLabel();
        preve = new javax.swing.JLabel();
        txtPrecioVenta = new javax.swing.JTextField();
        txtPrecioMayoreo = new javax.swing.JTextField();
        prema = new javax.swing.JLabel();
        exis = new javax.swing.JLabel();
        txtExistencia = new javax.swing.JTextField();
        txtAgregar = new javax.swing.JTextField();
        agrega = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        titu.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        titu.setForeground(new java.awt.Color(0, 0, 102));
        titu.setText("AGREGAR INVENTARIO");

        codi.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        codi.setText("Nombre o código:");

        comboProductos.setEditable(true);
        comboProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        btnBuscar.setBackground(new java.awt.Color(168, 168, 255));
        btnBuscar.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(null);
        btnBuscar.setPreferredSize(new java.awt.Dimension(130, 35));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtCodigo.setEditable(false);
        txtCodigo.setPreferredSize(new java.awt.Dimension(300, 30));

        codiso.setBackground(new java.awt.Color(255, 204, 153));
        codiso.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        codiso.setText("Código de barras:");

        des.setBackground(new java.awt.Color(255, 204, 153));
        des.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        des.setText("Descripción:");

        txtNombre.setEditable(false);
        txtNombre.setPreferredSize(new java.awt.Dimension(300, 30));

        txtPrecioCosto.setEditable(false);
        txtPrecioCosto.setPreferredSize(new java.awt.Dimension(300, 30));

        preco.setBackground(new java.awt.Color(255, 204, 153));
        preco.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        preco.setText("Precio costo:");

        preve.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        preve.setText("Precio venta:");

        txtPrecioVenta.setEditable(false);
        txtPrecioVenta.setPreferredSize(new java.awt.Dimension(300, 30));

        txtPrecioMayoreo.setEditable(false);
        txtPrecioMayoreo.setPreferredSize(new java.awt.Dimension(300, 30));

        prema.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        prema.setText("Precio mayoreo:");

        exis.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        exis.setText("Existencia:");

        txtExistencia.setEditable(false);
        txtExistencia.setPreferredSize(new java.awt.Dimension(300, 30));

        txtAgregar.setPreferredSize(new java.awt.Dimension(300, 30));

        agrega.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        agrega.setText("Agregar:");

        btnAgregar.setBackground(new java.awt.Color(168, 168, 255));
        btnAgregar.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnAgregar.setText("Agregar inventario");
        btnAgregar.setBorder(null);
        btnAgregar.setPreferredSize(new java.awt.Dimension(130, 35));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titu)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(codi)
                        .addGap(37, 37, 37)
                        .addComponent(comboProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(des)
                                    .addComponent(preco)
                                    .addComponent(preve))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtPrecioCosto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(codiso)
                                .addGap(18, 18, 18)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(prema)
                                    .addComponent(exis))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtPrecioMayoreo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(agrega)
                                .addGap(18, 18, 18)
                                .addComponent(txtAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(599, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titu)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(codi)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codiso))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(des)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(preco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(preve))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioMayoreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prema))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exis)
                    .addComponent(txtExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agrega))
                .addGap(40, 40, 40)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       String nombre = (String) comboProductos.getSelectedItem();
        if(nombre.equalsIgnoreCase("")){ 
              Utilidades.confirma(confir, "Por favor ingresa los datos solicitados");
        }else{
            String[] info = new String[7];
            Producto pro = obj.getDatosProducto(nombre, p);
            if(pro==null){

            }else{
                txtCodigo.setText(pro.getCodigo());
                txtNombre.setText(pro.getNombre());
                txtPrecioCosto.setText(pro.getpCosto()+"");
                txtPrecioVenta.setText(pro.getpVenta()+"");
                txtPrecioMayoreo.setText(pro.getpMayoreo()+"");
                txtExistencia.setText(pro.getCantidad()+"");
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       String a[] =  new String[3];
       a[0]= txtExistencia.getText();
       a[1]= txtAgregar.getText();
       a[2]= txtCodigo.getText();
      boolean ban= Utilidades.hayVacios(a);
      if(ban==false){
          try{
          double total = Double.parseDouble(a[0]) + Double.parseDouble(a[1]);
          obj.agregarInventarioProducto(total, a[2],a[1]);
          llenarCombo();
          limpiar();
          }catch(NumberFormatException e){
            Utilidades.confirma(confir, "Por favor revisa los datos agregados");
        
          }
        
      }else{
            Utilidades.confirma(confir, "Por favor ingresa la cantidad a agregar");
       }
    }//GEN-LAST:event_btnAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agrega;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel codi;
    private javax.swing.JLabel codiso;
    private javax.swing.JComboBox<String> comboProductos;
    private javax.swing.JLabel des;
    private javax.swing.JLabel exis;
    private javax.swing.JLabel preco;
    private javax.swing.JLabel prema;
    private javax.swing.JLabel preve;
    private javax.swing.JLabel titu;
    private javax.swing.JTextField txtAgregar;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtExistencia;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecioCosto;
    private javax.swing.JTextField txtPrecioMayoreo;
    private javax.swing.JTextField txtPrecioVenta;
    // End of variables declaration//GEN-END:variables
}
