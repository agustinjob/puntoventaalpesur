/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.venta.pruebas;

import punto.venta.dao.ClienteDAO;
import punto.venta.dialogos.Confirmacion;
import punto.venta.utilidades.Utilidades;

/**
 *
 * @author agus_
 */
public class PruebasCliente {
    public static void main(String [] Job){
        Confirmacion confir = null;
        ClienteDAO obj = new ClienteDAO();
        
        Utilidades.confirma(confir,"RES= "+ obj.obtenerDeudaCliente("7") );
    }
    
}
