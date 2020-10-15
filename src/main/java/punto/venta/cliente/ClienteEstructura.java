/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.venta.cliente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

/**
 *
 * @author agus_
 */
public class ClienteEstructura extends javax.swing.JPanel implements ActionListener {

    ClienteAgregar cAgregar = new ClienteAgregar();
    ClienteModificar cModificar = new ClienteModificar();
    ClienteEliminar cEliminar = new ClienteEliminar();
     ClienteEstadoEstructura cEstado = new ClienteEstadoEstructura();
    
    public ClienteEstructura() {
        initComponents();
        
       btnNuevo.addActionListener(this);
       btnModificar.addActionListener(this);
       btnEliminar.addActionListener(this);
       btnEstado.addActionListener(this);
       contenedor.add(cAgregar);
       configurarIconos();
       
    }

    public void configurarIconos(){
     ImageIcon icoNue = new ImageIcon("src/main/java/iconos/cliente_nuevo.png");
     ImageIcon icoMod = new ImageIcon("src/main/java/iconos/modificar_cliente.png");
     ImageIcon icoEli = new ImageIcon("src/main/java/iconos/eliminar_cliente.png");
     ImageIcon icoEsta = new ImageIcon("src/main/java/iconos/documentos.png");
     btnNuevo.setIcon(icoNue);
     btnModificar.setIcon(icoMod);
     btnEliminar.setIcon(icoEli);
     btnEstado.setIcon(icoEsta);
    }
    
    public void ocultarEstadoInformacion(){
    
    cEstado.ocultarEstado();
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBotones = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEstado = new javax.swing.JButton();
        contenedor = new javax.swing.JPanel();
        panelTicket = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        panelBotones.setBackground(new java.awt.Color(255, 255, 255));
        panelBotones.setLayout(new java.awt.GridLayout(1, 0));

        btnNuevo.setBackground(new java.awt.Color(0, 153, 153));
        btnNuevo.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnNuevo.setText("Nuevo Cliente");
        btnNuevo.setBorder(null);
        btnNuevo.setPreferredSize(new java.awt.Dimension(180, 35));
        panelBotones.add(btnNuevo);

        btnModificar.setBackground(new java.awt.Color(0, 153, 153));
        btnModificar.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnModificar.setText("Modificar Cliente");
        btnModificar.setBorder(null);
        btnModificar.setPreferredSize(new java.awt.Dimension(180, 35));
        panelBotones.add(btnModificar);

        btnEliminar.setBackground(new java.awt.Color(0, 153, 153));
        btnEliminar.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar Cliente");
        btnEliminar.setBorder(null);
        btnEliminar.setPreferredSize(new java.awt.Dimension(180, 35));
        panelBotones.add(btnEliminar);

        btnEstado.setBackground(new java.awt.Color(0, 153, 153));
        btnEstado.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnEstado.setText("Estado de Cuenta");
        btnEstado.setBorder(null);
        btnEstado.setPreferredSize(new java.awt.Dimension(180, 35));
        panelBotones.add(btnEstado);

        contenedor.setBackground(new java.awt.Color(204, 255, 204));
        contenedor.setLayout(new java.awt.BorderLayout());

        panelTicket.setBackground(new java.awt.Color(0, 153, 0));

        jLabel1.setBackground(new java.awt.Color(0, 204, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CLIENTES");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout panelTicketLayout = new javax.swing.GroupLayout(panelTicket);
        panelTicket.setLayout(panelTicketLayout);
        panelTicketLayout.setHorizontalGroup(
            panelTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTicketLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTicketLayout.setVerticalGroup(
            panelTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTicketLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 389, Short.MAX_VALUE))
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelTicket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEstado;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JPanel contenedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelTicket;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
      Object evt = e.getSource();
       
     if(evt.equals(btnNuevo)){
      cAgregar.setVisible(true);
      cModificar.setVisible(false);
      cModificar.ocultarFormulario();
      cEliminar.setVisible(false); 
      cEstado.setVisible(false);
      
      contenedor.add(cAgregar);
     }
     else if(evt.equals(btnModificar)){
      cAgregar.setVisible(false);
      cModificar.setVisible(true);
      cModificar.llenarCombo();
      cEliminar.setVisible(false); 
       cEstado.setVisible(false);
      contenedor.add(cModificar);
     }
     else if(evt.equals(btnEliminar)){
      cAgregar.setVisible(false);
      cModificar.setVisible(false);
      cModificar.ocultarFormulario();
      cEliminar.setVisible(true); 
      cEliminar.llenarCombo();
      cEstado.setVisible(false);
      
      contenedor.add(cEliminar);
      
     }if(evt.equals(btnEstado)){
      cAgregar.setVisible(false);
      cModificar.setVisible(false);
      cModificar.ocultarFormulario();
      cEliminar.setVisible(false);
      cEstado.setVisible(true);
      cEstado.ocultarEstado();
      
      contenedor.add(cEstado);
     }
    }
}
