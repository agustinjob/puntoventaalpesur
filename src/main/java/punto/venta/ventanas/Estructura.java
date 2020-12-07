/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.venta.ventanas;

import punto.venta.producto.ProductoEstructura;
import punto.venta.inventario.InventarioEstructura;
import punto.venta.usuario.UsuarioEstructura;
import punto.venta.cliente.ClienteEstructura;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import punto.venta.dao.UsuarioDAO;
import punto.venta.dialogos.Confirmacion;
import punto.venta.dialogos.EntradaEfectivo;
import punto.venta.dialogos.SalidaEfectivo;
import punto.venta.utilidades.Utilidades;
import static punto.venta.ventanas.VentasEstructura.tipoPrecio;

/**
 *
 * @author agus_
 */
public class Estructura extends javax.swing.JFrame implements ActionListener, KeyListener {

    VentasEstructura objVentas = new VentasEstructura();
    InventarioEstructura inventarios = new InventarioEstructura();
    ClienteEstructura clientes = new ClienteEstructura();
    UsuarioEstructura usuarios = new UsuarioEstructura();
    ProductoEstructura productos = new ProductoEstructura();
    TransferirEstructura transferir = new TransferirEstructura();
    CorteEstructura corte = new CorteEstructura();
    NubeEstructura nube = new NubeEstructura();
    Confirmacion confir;

    public Estructura() {
        initComponents();
        setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        btnVentas.addActionListener(this);
        btnInventario.addActionListener(this);
        btnCliente.addActionListener(this);
        btnUsuario.addActionListener(this);
        btnProductos.addActionListener(this);
        btnTransferir.addActionListener(this);
        btnCorte.addActionListener(this);
        btnNube.addActionListener(this);
        btnConfiguracion.addActionListener(this);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        contenedor.add(objVentas);
        objVentas.setEstructura(this);
        inicializarIconos();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        caja = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnVentas = new javax.swing.JButton();
        btnCliente = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnTransferir = new javax.swing.JButton();
        btnUsuario = new javax.swing.JButton();
        btnCorte = new javax.swing.JButton();
        btnNube = new javax.swing.JButton();
        btnConfiguracion = new javax.swing.JButton();
        nombreUsuario = new javax.swing.JLabel();
        contenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Cambria", 2, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Punto de venta");

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        btnVentas.setBackground(new java.awt.Color(0, 51, 102));
        btnVentas.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnVentas.setForeground(new java.awt.Color(255, 255, 255));
        btnVentas.setText("Ventas");
        btnVentas.setAlignmentX(0.5F);
        btnVentas.setBorder(null);
        btnVentas.setMargin(new java.awt.Insets(3, 14, 2, 14));
        btnVentas.setPreferredSize(new java.awt.Dimension(135, 35));
        jPanel2.add(btnVentas);

        btnCliente.setBackground(new java.awt.Color(0, 51, 102));
        btnCliente.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCliente.setText("Clientes");
        btnCliente.setBorder(null);
        btnCliente.setPreferredSize(new java.awt.Dimension(135, 35));
        jPanel2.add(btnCliente);

        btnProductos.setBackground(new java.awt.Color(0, 51, 102));
        btnProductos.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnProductos.setForeground(new java.awt.Color(255, 255, 255));
        btnProductos.setText("Productos");
        btnProductos.setBorder(null);
        btnProductos.setPreferredSize(new java.awt.Dimension(135, 35));
        jPanel2.add(btnProductos);

        btnInventario.setBackground(new java.awt.Color(0, 51, 102));
        btnInventario.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnInventario.setForeground(new java.awt.Color(255, 255, 255));
        btnInventario.setText("Inventario");
        btnInventario.setBorder(null);
        btnInventario.setPreferredSize(new java.awt.Dimension(135, 35));
        jPanel2.add(btnInventario);

        btnTransferir.setBackground(new java.awt.Color(0, 51, 102));
        btnTransferir.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnTransferir.setForeground(new java.awt.Color(255, 255, 255));
        btnTransferir.setText("Transferir");
        btnTransferir.setBorder(null);
        btnTransferir.setPreferredSize(new java.awt.Dimension(135, 35));
        jPanel2.add(btnTransferir);

        btnUsuario.setBackground(new java.awt.Color(0, 51, 102));
        btnUsuario.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuario.setText("Usuario");
        btnUsuario.setBorder(null);
        btnUsuario.setPreferredSize(new java.awt.Dimension(135, 35));
        jPanel2.add(btnUsuario);

        btnCorte.setBackground(new java.awt.Color(0, 51, 102));
        btnCorte.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnCorte.setForeground(new java.awt.Color(255, 255, 255));
        btnCorte.setText("Corte");
        btnCorte.setBorder(null);
        btnCorte.setPreferredSize(new java.awt.Dimension(135, 35));
        jPanel2.add(btnCorte);

        btnNube.setBackground(new java.awt.Color(0, 51, 102));
        btnNube.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnNube.setForeground(new java.awt.Color(255, 255, 255));
        btnNube.setText("Nube");
        btnNube.setBorder(null);
        btnNube.setPreferredSize(new java.awt.Dimension(135, 35));
        jPanel2.add(btnNube);

        btnConfiguracion.setBackground(new java.awt.Color(0, 51, 102));
        btnConfiguracion.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnConfiguracion.setForeground(new java.awt.Color(255, 255, 255));
        btnConfiguracion.setText("Configuración");
        btnConfiguracion.setBorder(null);
        btnConfiguracion.setPreferredSize(new java.awt.Dimension(135, 35));
        jPanel2.add(btnConfiguracion);

        nombreUsuario.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        nombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        nombreUsuario.setText("jLabel1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(caja, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(caja, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(nombreUsuario)
                        .addGap(16, 16, 16)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        contenedor.setBackground(new java.awt.Color(102, 102, 255));
        contenedor.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void actionPerformed(ActionEvent e) {
        Object evt = e.getSource();

        if (evt.equals(btnVentas)) {

            inventarios.setVisible(false);
            objVentas.setVisible(true);
            objVentas.llenarCombo();
            clientes.setVisible(false);
            usuarios.setVisible(false);
            productos.setVisible(false);
            transferir.setVisible(false);
            nube.setVisible(false);
            corte.setVisible(false);
            contenedor.add(objVentas);
            contenedor.validate();

            Utilidades.im("Entro a btnVentas");

        } else if (evt.equals(btnInventario)) {

            objVentas.setVisible(false);
            nube.setVisible(false);
            inventarios.setVisible(true);
            clientes.setVisible(false);
            usuarios.setVisible(false);
            productos.setVisible(false);
            transferir.setVisible(false);
            corte.setVisible(false);
            inventarios.asignaPrimerContenedor();
            contenedor.add(inventarios);
            contenedor.validate();

        } else if (evt.equals(btnCliente)) {

            objVentas.setVisible(false);
            nube.setVisible(false);
            inventarios.setVisible(false);
            clientes.setVisible(true);
            usuarios.setVisible(false);
            productos.setVisible(false);
            transferir.setVisible(false);
            corte.setVisible(false);
            clientes.ocultarEstadoInformacion();
            contenedor.add(clientes);
            contenedor.validate();

        } else if (evt.equals(btnUsuario)) {
            objVentas.setVisible(false);
            nube.setVisible(false);
            inventarios.setVisible(false);
            clientes.setVisible(false);
            usuarios.setVisible(true);
            productos.setVisible(false);
            transferir.setVisible(false);
            corte.setVisible(false);
            contenedor.add(usuarios);
            contenedor.validate();

        } else if (evt.equals(btnProductos)) {
            objVentas.setVisible(false);
            nube.setVisible(false);
            inventarios.setVisible(false);
            clientes.setVisible(false);
            usuarios.setVisible(false);
            productos.setVisible(true);
            transferir.setVisible(false);
            corte.setVisible(false);
            contenedor.add(productos);
            contenedor.validate();

        } else if (evt.equals(btnTransferir)) {
            objVentas.setVisible(false);
            nube.setVisible(false);
            inventarios.setVisible(false);
            clientes.setVisible(false);
            usuarios.setVisible(false);
            productos.setVisible(false);
            transferir.setVisible(true);
            transferir.limpiarDatos();
            transferir.llenarCombo();
            corte.setVisible(false);
            contenedor.add(transferir);
            contenedor.validate();

        } else if (evt.equals(btnCorte)) {
            objVentas.setVisible(false);
            nube.setVisible(false);
            inventarios.setVisible(false);
            clientes.setVisible(false);
            usuarios.setVisible(false);
            productos.setVisible(false);
            transferir.setVisible(false);
            corte.setVisible(true);
            contenedor.add(corte);
            contenedor.validate();

        } else if (evt.equals(btnNube)) {
            objVentas.setVisible(false);
            nube.setVisible(true);
            inventarios.setVisible(false);
            clientes.setVisible(false);
            usuarios.setVisible(false);
            productos.setVisible(false);
            transferir.setVisible(false);
            corte.setVisible(false);
            contenedor.add(nube);
            contenedor.validate();
        }
    }

    public void inicializarIconos() {
        ImageIcon registradora = new ImageIcon("src/main/java/iconos/comprar.png");
        //src/main/java/iconos/comprar.png
        ImageIcon cc = new ImageIcon("src/main/java/iconos/cancelar.png");
        ImageIcon bc = new ImageIcon("src/main/java/iconos/boton_cerrar.png");
        ImageIcon c = new ImageIcon("src/main/java/iconos/productos.png");
        ImageIcon b = new ImageIcon("src/main/java/iconos/clientes.png");
        ImageIcon d = new ImageIcon("src/main/java/iconos/inventario.png");
        ImageIcon gg = new ImageIcon("src/main/java/iconos/carro_cobrar.png");
        ImageIcon h = new ImageIcon("src/main/java/iconos/corte.png");
        ImageIcon i = new ImageIcon("src/main/java/iconos/reportes.png");
        ImageIcon j = new ImageIcon("src/main/java/iconos/intercambiar.png");
        ImageIcon f = new ImageIcon("src/main/java/iconos/usuario.png");
        ImageIcon e = new ImageIcon("src/main/java/iconos/ticket.png");
        ImageIcon nubeIcon = new ImageIcon("src/main/java/iconos/servidorChico.png");
        ImageIcon configuracion = new ImageIcon("src/main/java/iconos/engranajes.png");

        btnVentas.setIcon(gg);
        btnCliente.setIcon(b);
        btnProductos.setIcon(c);
        btnInventario.setIcon(d);
        btnNube.setIcon(nubeIcon);
        btnUsuario.setIcon(f);
        btnCorte.setIcon(h);
        btnConfiguracion.setIcon(configuracion);

        btnTransferir.setIcon(j);
        caja.setIcon(registradora);
        String tipo = UsuarioDAO.getTipo();
        nombreUsuario.setText(Utilidades.regresarNombre());
        if (tipo.equalsIgnoreCase("Empleado")) {

            btnCliente.setEnabled(false);
            btnProductos.setEnabled(false);
            btnTransferir.setEnabled(false);
            btnUsuario.setEnabled(false);

            btnCliente.setVisible(false);
            btnProductos.setVisible(false);
            btnTransferir.setVisible(false);
            btnUsuario.setVisible(false);
            btnInventario.setEnabled(false);
            btnInventario.setVisible(false);
            btnNube.setEnabled(false);
            btnNube.setVisible(false);

        }

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Estructura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estructura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estructura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estructura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estructura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnConfiguracion;
    private javax.swing.JButton btnCorte;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnNube;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnTransferir;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JButton btnVentas;
    private javax.swing.JLabel caja;
    private javax.swing.JPanel contenedor;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel nombreUsuario;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Key typed"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Key pressed " + e.getKeyCode());
        if (e.getKeyCode() == 122) {

            if (VentasEstructura.tipoPrecio == 1) {
                Utilidades.confirma(confir, "Se ha activado el precio de mayoreo");
                VentasEstructura.tipoPrecio = 2;
            } else {
                Utilidades.confirma(confir, "Se ha desactivado el precio de mayoreo");
                VentasEstructura.tipoPrecio = 1;
            }
        }

        if (e.getKeyCode() == 118) {
            EntradaEfectivo objeto = new EntradaEfectivo();
            objeto.setVisible(true);
        }
        if (e.getKeyCode() == 119) {
            SalidaEfectivo objeto = new SalidaEfectivo();
            objeto.setVisible(true);
        }
        if (e.getKeyCode() == 123) {
            objVentas.realizaCobro();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Key resleased");
    }

}
