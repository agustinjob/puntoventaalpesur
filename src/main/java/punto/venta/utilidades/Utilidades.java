/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.venta.utilidades; 

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import punto.venta.dao.UsuarioDAO;
import punto.venta.dialogos.Confirmacion;
import punto.venta.misclases.Usuario;

/**
 *
 * @author agus_
 */
public class Utilidades {

  
    public static void im(String mensaje){
    System.out.println(mensaje);
    }
    
     public static String regresarNombre(){
     String nombres[]= UsuarioDAO.getNombre().split(" ");
     return "Atiende: "+nombres[0];
    }
    
     public static boolean hayVacios(String a[]) {
        boolean bandera = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i].equalsIgnoreCase("")) {
                bandera = true;
            }

        }
        return bandera;
    }

    public static Double[] hayNulosACero(String a[]) {
        Double x[] = new Double[a.length];

        for (int i = 0; i < a.length; i++) {
            if (a[i] == null) {
                x[i] = 0.0;
            } else {
                x[i] = Double.parseDouble(a[i]);
            }

        }
        return x;
    }

    public static void resizeColumnWidth(JTable table) {
        final TableColumnModel columnModel = table.getColumnModel();
        System.out.println("Si entro");
        for (int column = 0; column < table.getColumnCount(); column++) {
            int width = 15; // Min width
            for (int row = 0; row < table.getRowCount(); row++) {
                TableCellRenderer renderer = table.getCellRenderer(row, column);
                Component comp = table.prepareRenderer(renderer, row, column);
                width = Math.max(comp.getPreferredSize().width + 1, width);
            }
            if (width > 300) {
                width = 300;
            }
            columnModel.getColumn(column).setPreferredWidth(width);
        }
    }
    
    public static void capturaPantalla(String nombre) throws AWTException, IOException{
     BufferedImage captura = new Robot().createScreenCapture(
           new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()) );
        String Nombre;
 
         Date d = new Date();
    DateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
    DateFormat formatoHora = new SimpleDateFormat("HH");
    
     // Guardar Como JPEG
     String nombreC ="C:\\capturas\\"+ nombre +"-"+formatoFecha.format(d)+" "+formatoHora.format(d)+" hrs" ;
     File file = new File(nombreC + ".jpg");
     ImageIO.write(captura, "jpg", file);
     JOptionPane.showMessageDialog(null, "Captura realizada");
    }
    
    public static void confirma(Confirmacion x,String mensaje){
      x = new Confirmacion(mensaje);
           x.setFocusable(true);
           x.setVisible(true);
    }
    
 /*   public static void jo(String mensaje){
    UIManager UI=new UIManager();
    UI.put("OptionPane.background", Color.white);
   // UI.put("Panel.background", Color.white);
  

    JOptionPane.showMessageDialog(null,mensaje,"SetColor",JOptionPane.INFORMATION_MESSAGE);
    }*/
}


