/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.venta.misclases;

import punto.venta.dao.TicketDAO;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.AttributeSet;
import javax.print.attribute.HashAttributeSet;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.standard.ColorSupported;
import javax.print.attribute.standard.PrinterName;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author job
 */
public class ImprimirTicket {
    
 Date d = new Date();
 DateFormat formatoFecha = new SimpleDateFormat("dd, MMM yyyy");
 DateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
 TicketDAO ticket = new TicketDAO();
 
    public void imprimirTicket(String prueba) {
        try {
            byte[] bytes = prueba.getBytes();
            //Formato de Documento
//DocFlavor docFormat = DocFlavor.INPUT_STREAM.AUTOSENSE;
            DocFlavor docFormat = DocFlavor.BYTE_ARRAY.AUTOSENSE;
//Lectura de Documento
            Doc document = new SimpleDoc(bytes, docFormat, null);
//Nombre de la impresora
            String printerName = "58mm Series Printer";
//Inclusion del nombre de impresora y sus atributos
            AttributeSet attributeSet = new HashAttributeSet();
            attributeSet.add(new PrinterName(printerName, null));
            attributeSet = new HashAttributeSet();
//Soporte de color o no
            attributeSet.add(ColorSupported.NOT_SUPPORTED);
//Busqueda de la impresora por el nombre asignado en attributeSet
            PrintService[] services = PrintServiceLookup.lookupPrintServices(docFormat, attributeSet);
            System.out.println("Imprimiendo en : " + services[0].getName());
            DocPrintJob printJob = services[0].createPrintJob();
//Envio a la impresora
            printJob.print(document, new HashPrintRequestAttributeSet());
        } catch (PrintException ex) {
           JOptionPane.showMessageDialog(null, "Hubo un problema con tu impresora, el ticket no se imprimirá, pero la venta si será registrada");
        } catch(ArrayIndexOutOfBoundsException ex){
          JOptionPane.showMessageDialog(null, "Hubo un problema con tu impresora, el ticket no se imprimirá, pero la venta si será registrada");
        }
        
    }
    
    public String convertirModeloAString(DefaultTableModel model, String total){
    int numTic = ticket.getNumero();
        String titulo = "        Punto de venta \n"
        + "     Fecha: "+formatoFecha.format(d)+"\n"
               + "        Hora: "+formatoHora.format(d)+" \n"
         +       "     Num. de Ticket: "+numTic+" \n"
                  +       "============================== \n"
         +       "Cant.   Descripcion      Importe  \n";
        
        int i=0;
        int indice=0;
        while(model.getRowCount()>i){
        String productos ="";
        String can =(String) model.getValueAt(i, 3);
        String pro =(String) model.getValueAt(i, 1);
        String impor =(String) model.getValueAt(i, 4);
        if(pro.length()>=15){
        indice = 15;
        }else{
        indice = pro.length();
        }
        productos = padRight(can,8)  + padRight(pro.substring(0, indice),17) +  "$" +impor +"\n";
        titulo = titulo + productos;
        i++;
        }
        String ultima =      "============================== \n"
         +        "       Total : $"+total+"           \n"
         +        "   Gracias por su preferencia  \n\n\n";
        titulo = titulo + ultima;
        return titulo;
    }
    // 6 cantidad
    // 2
    public static String padRight(String s, int n) {
     return String.format("%-" + n + "s", s);  
}
    public static String padLeft(String s, int n) {
    return String.format("%" + n + "s", s);  
}
   

}
