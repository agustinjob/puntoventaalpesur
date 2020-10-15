/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.venta.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Rodas
 */
public class Conexion {


    // Librería de MySQL
    public String driver = "com.mysql.jdbc.Driver";

    public String database = "puntodeventa";
  //  public String database = "recomendado-hos";
    // Host
//    public String hostname = "sql283.main-hosting";
      public String hostname = "localhost";
    // Puerto
    public String port = "3306";

    // Ruta de nuestra base de datos (desactivamos el uso de SSL con "?useSSL=false")
    public String url = "jdbc:mysql://"+hostname+":3306/"+database+"?zeroDateTimeBehavior=convertToNull";
    //public String url = "jdbc:mysql://localhost:3306/recomendado-hos?zeroDateTimeBehavior=convertToNull";
    // Nombre de usuario
    public String username = "root";
    //public String username = "root";
    // Clave de usuario
    public String password = "";
   //public String password = "";
    public Connection conectarMySQL() throws ClassNotFoundException {
        Connection conn = null;

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
           
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }

    public static void main(String[]Job) throws ClassNotFoundException, SQLException{
    
        UsuarioDAO obj = new UsuarioDAO();
        obj.obtenerUsuario("alejandro@hotmail.com", "12345");
    }

}
