/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.venta.usuario;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import org.jdesktop.swingx.autocomplete.ObjectToStringConverter;
import punto.venta.dao.UsuarioDAO;
import punto.venta.dialogos.Confirmacion;
import punto.venta.misclases.Usuario;
import punto.venta.utilidades.Utilidades;

/**
 *
 * @author agus_
 */
public class UsuarioEliminar extends javax.swing.JPanel {

    ArrayList<Usuario> lista = new ArrayList<Usuario>();
    UsuarioDAO obj = new UsuarioDAO();
    Usuario usu = new Usuario();
    Confirmacion confir;

    public UsuarioEliminar() {
        initComponents();
        llenarCombo();
        AutoCompleteDecorator.decorate(comboUsuario, ObjectToStringConverter.DEFAULT_IMPLEMENTATION);
    }

    public void llenarCombo() {

        lista = obj.getDatosUsuarios();
        comboUsuario.removeAllItems();
        comboUsuario.addItem("");
        int i = 0;
        while (i < lista.size()) {
            comboUsuario.addItem(lista.get(i).getNombre());
            i++;
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        comboUsuario = new javax.swing.JComboBox<>();
        btn4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel2.setText("Eliminar usuario");

        jLabel9.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel9.setText("Teclee el  nombre del usuario");

        comboUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        btn4.setBackground(new java.awt.Color(153, 153, 0));
        btn4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btn4.setText("Aceptar");
        btn4.setBorder(null);
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel2)))
                .addContainerGap(406, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(comboUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(336, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        String nombreU = (String) comboUsuario.getSelectedItem();
        int i = 0;
            if(nombreU.equalsIgnoreCase("")){
            Utilidades.confirma(confir , "Por favor ingresa los datos");
        }else{
            while(i<lista.size()){
                if(lista.get(i).getNombre().equalsIgnoreCase(nombreU)){
                    usu = lista.get(i);
                    break;
                }
                i++;
            }

            obj.eliminarDatosUsuario(usu);
            llenarCombo();
         
        }
    }//GEN-LAST:event_btn4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn4;
    private javax.swing.JComboBox<String> comboUsuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
