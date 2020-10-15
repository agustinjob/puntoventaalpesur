/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.venta.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author job
 */
public class BitacoraDAO {
    Conexion SQL = new Conexion();
    Date d = new Date();
    DateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
    DateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
    int idUsuario = UsuarioDAO.getIdUsuario();
    
     public void registrarBitacora(String descripcion) throws ClassNotFoundException, SQLException{
    Connection conn = SQL.conectarMySQL();
        Statement s = conn.createStatement();
        int rs = s.executeUpdate("INSERT INTO `Bitacora`(`descripcion`, `fecha`, `hora`, `idUsuario`) VALUES ('"+descripcion+"','"+formatoFecha.format(d)+"','"+formatoHora.format(d)+"',"+idUsuario+" )");
    }  
     
     public ResultSet getDatosBitacoraHoy(){
     
          try {

            Connection conn = SQL.conectarMySQL();
            Statement s = conn.createStatement();
            
            ResultSet datos = s.executeQuery("SELECT nombre,descripcion,bi.fecha,bi.hora FROM `Bitacora` as bi, Usuario as usu where bi.fecha ='"+formatoFecha.format(d)+"' and usu.idUsuario = bi.idUsuario");

             return datos;
        } catch (ClassNotFoundException | SQLException e) {

        }
       
        return null;
     }
     
     public ResultSet getDatosBitacoraPorRangoDeFecha(){
     return null;
     }
     
      public ResultSet getDatosBitacoraPorRango(Date inicio, Date fin){
     
          try {

            Connection conn = SQL.conectarMySQL();
            Statement s = conn.createStatement();
            
            ResultSet datos = s.executeQuery("SELECT u.nombre,bi.descripcion,bi.fecha,bi.hora FROM `Bitacora` as bi,  Usuario as u where bi.fecha >='"+formatoFecha.format(inicio)+"' and bi.fecha<='"+formatoFecha.format(fin)+"' and bi.idUsuario = u.idUsuario");
             return datos;
        } catch (ClassNotFoundException | SQLException e) {

        }
       
        return null;
     }
     
   
    
}
