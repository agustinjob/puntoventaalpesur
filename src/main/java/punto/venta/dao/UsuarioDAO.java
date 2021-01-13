/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.venta.dao;

import punto.venta.misclases.Producto;
import punto.venta.misclases.Usuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import punto.venta.dialogos.Confirmacion;
import punto.venta.utilidades.Utilidades;


/**
 *
 * @author job
 */
public class UsuarioDAO {
    Conexion SQL = new Conexion();
    int i = 0;
    Date d = new Date();
    DateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd");
    DateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
    private static int idUsuario;
    private static String nombre;
    private static String tipo;
    private static String hora;
    private static String fecha;
  
     BitacoraDAO bita = new BitacoraDAO();
    Confirmacion confir;
  
    public void almacena( String [] a) throws ClassNotFoundException, SQLException {
        Connection conn = SQL.conectarMySQL();
        Statement s = conn.createStatement();
        
       
        int rs = s.executeUpdate("INSERT INTO `Usuario`(`nombre`, `direccion`, `username`, `password`, `tipoUsuario`, `telefono`, `eliminado`, `fecha`, `enSesion`, `hora`)"
                + "VALUES ('" + a[0] + "','" + a[1]+ "','" + a[2] + "','" + a[3] + "','" + a[4] + "','" + a[5] + "', false ,'"+formatoFecha.format(d)+"', false ,'"+formatoHora.format(d)+"')");
           String mensajeBita ="Registro al usuario " + a[0];
            bita.registrarBitacora(mensajeBita);
    }
 
    public ArrayList<Usuario> getDatosUsuarios(){
     Conexion SQL = new Conexion();
        Connection conn;
        ArrayList<Usuario> listado = new ArrayList<Usuario>();
        try {
             conn = SQL.conectarMySQL();
             Statement s = conn.createStatement();
             ResultSet res = s.executeQuery("SELECT * FROM usuario where eliminado = false");
             
           while (res.next()) {

                Usuario u = new Usuario();
                u.setIdUsuario(res.getInt(1));
                u.setNombre(res.getString(2));
                u.setTipo(res.getString(6));
                u.setDireccion(res.getString(3));
                u.setTelefono(res.getString(7));
                u.setUsername(res.getString(4));
                u.setPassword(res.getString(5));

                listado.add(u);

            }
           
        } catch (ClassNotFoundException ex) {
            Utilidades.confirma(confir, "Hubo un error en el sistema");
        } catch (SQLException ex) {
            Utilidades.confirma(confir, "Hubo un error en la base de datos");
        }
        
        return listado;
       
    }

    public ResultSet obtenerUsuario(String email, String password) throws ClassNotFoundException, SQLException {
        Conexion SQL = new Conexion();
        Connection conn = SQL.conectarMySQL();
        Statement s = conn.createStatement();
        ResultSet rs = s.executeQuery("SELECT * FROM usuario where username= '" + email + "' and password= '" + password + "'");
        
        rs.last();
        if (rs.getRow() == 0) {
            rs=null;
            System.out.println("No hay");
    
        } else {
            rs.beforeFirst();
            rs.next();
            setIdUsuario(rs.getInt(1));
            setNombre(rs.getString(2));
            setTipo(rs.getString(6));
            setHora(formatoHora.format(rs.getTime("hora")));
            setFecha(formatoFecha.format(rs.getDate("fecha")));
            System.out.println("Si hay y el id es=" + getIdUsuario());
            Utilidades.im("Para el ID desde la BD " + rs.getInt(1));
            rs.beforeFirst();
          
        }

        return rs;
    }
    
    public boolean obtenerEmail(String email) throws ClassNotFoundException, SQLException {
        Conexion SQL = new Conexion();
        Connection conn = SQL.conectarMySQL();
        Statement s = conn.createStatement();
        ResultSet rs = s.executeQuery("SELECT * FROM usuario where email= '" + email + "'");
        boolean found;
        rs.last();
        if (rs.getRow() == 0) {
            System.out.println("No hay");
            found = false;
        } else {
            System.out.println("Si hay");
            found = true;
        }

        return found;
    }
    
    public void modificarDatosUsuario(Usuario u){
     Connection conn;
        try {
            conn = SQL.conectarMySQL();
            Statement s = conn.createStatement();
        int rs = s.executeUpdate("UPDATE `Usuario` SET `nombre`='"+u.getNombre()+"',`direccion`='"+u.getDireccion()+"',`username`='"+u.getUsername()+"',`password`='"+u.getPassword()+"',"
                + "`tipoUsuario`= '"+u.getTipo()+"' ,`telefono`='"+u.getTelefono()+"' WHERE idUsuario = "+ u.getIdUsuario());
           Utilidades.confirma(confir, "Datos del usuario modificados correctamente");
           String mensajeBita ="Modifico los datos del usuario " + u.getNombre();
           bita.registrarBitacora(mensajeBita);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }
    
    public void modificarFechaYhoraSesionUsuario(){
    Connection conn;
        try {
            conn = SQL.conectarMySQL();
            Statement s = conn.createStatement();
            int rs1 = s.executeUpdate("UPDATE `Usuario` SET enSesion = false");
            int rs = s.executeUpdate("UPDATE `Usuario` SET fecha='"+formatoFecha.format(d)+"', hora = '"+formatoHora.format(d)+"' , enSesion = true WHERE idUsuario = "+ idUsuario);
         } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
      public void eliminarDatosUsuario(Usuario u){
     Connection conn;
        try {
            conn = SQL.conectarMySQL();
            Statement s = conn.createStatement();
        int rs = s.executeUpdate("UPDATE `Usuario` SET `eliminado`= true WHERE idUsuario = "+ u.getIdUsuario());
     String mensajeBita ="Elimino los datos del usuario " + u.getNombre();
            bita.registrarBitacora(mensajeBita);
            Utilidades.confirma(confir, "Datos del usuario eliminados correctamente");
        } catch (ClassNotFoundException ex) {
           Utilidades.confirma(confir, "Hubo un error en el sistema");
        } catch (SQLException ex) {
           Utilidades.confirma(confir, "Hubo un error con la conexion a la base de datos");
        }
        
         
        
    }

    /**
     * @return the idUsuario
     */
    public static int getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param aIdUsuario the idUsuario to set
     */
    public static void setIdUsuario(int aIdUsuario) {
        idUsuario = aIdUsuario;
    }

    /**
     * @return the nombre
     */
    public static String getNombre() {
        return nombre;
    }

    /**
     * @param aNombre the nombre to set
     */
    public static void setNombre(String aNombre) {
        nombre = aNombre;
    }

    /**
     * @return the tipo
     */
    public static String getTipo() {
        return tipo;
    }

    /**
     * @param aTipo the tipo to set
     */
    public static void setTipo(String aTipo) {
        tipo = aTipo;
    }

    /**
     * @return the hora
     */
    public static String getHora() {
        return hora;
    }

    /**
     * @param aHora the hora to set
     */
    public static void setHora(String aHora) {
        hora = aHora;
         System.out.println("Desde el SET " + aHora);
    }

    /**
     * @return the fecha
     */
    public static String getFecha() {
        return fecha;
    }

    /**
     * @param aFecha the fecha to set
     */
    public static void setFecha(String aFecha) {
        fecha = aFecha;
    }

   
    
  
}
