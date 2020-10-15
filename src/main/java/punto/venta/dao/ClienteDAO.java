/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.venta.dao;

import punto.venta.misclases.Cliente;
import punto.venta.misclases.Producto;
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
public class ClienteDAO {

    Conexion SQL = new Conexion();
    BitacoraDAO bita = new BitacoraDAO();
    Confirmacion confirma;
    Date d = new Date();
    DateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");

    public boolean almacena(String[] a) throws ClassNotFoundException, SQLException {
        Connection conn = SQL.conectarMySQL();
        Statement s = conn.createStatement();
        int rs = s.executeUpdate("INSERT INTO `Cliente`(`nombre`, `direccion`, `telefono`, `limiteCredito`, `eliminado`) "
                + "VALUES ('" + a[0] + "','" + a[1] + "','" + a[2] + "','" + a[3] + "', false)");

        String mensajeBita = "Registro al cliente " + a[0];
        bita.registrarBitacora(mensajeBita);
        System.out.println("imprime");
        return true;
    }

    public ArrayList<Cliente> getClientes() throws ClassNotFoundException, SQLException {

        ArrayList<Cliente> listado = new ArrayList<Cliente>();

        Connection conn = SQL.conectarMySQL();
        Statement s = conn.createStatement();
        ResultSet res = s.executeQuery("Select * from cliente where eliminado = false");

        while (res.next()) {

            Cliente cli = new Cliente();
            cli.setId(res.getString(1));
            cli.setNombres(res.getString(2));
            cli.setDireccion(res.getString(3));
            cli.setTelefono(res.getString(4));
            cli.setLimiteCredito(res.getString(5));

            listado.add(cli);

        }

        return listado;
    }

    public void modificarDatosCliente(Cliente c) {
        try {

            Connection conn = SQL.conectarMySQL();
            Statement s = conn.createStatement();
            String update = "UPDATE `Cliente` SET `nombre`='" + c.getNombres() + "',`direccion`='" + c.getDireccion() + "',`telefono`='" + c.getTelefono() + "',`limiteCredito`=" + c.getLimiteCredito() + " WHERE idCliente = " + c.getId();

            boolean modificar = s.execute(update);
            Utilidades.confirma(confirma, "Datos del cliente modificados correctamente");

            String mensajeBita = "Modificó los datos del cliente " + c.getNombres();
            bita.registrarBitacora(mensajeBita);
        } catch (SQLException e) {
            Utilidades.confirma(confirma, "Hubo un error con la conexion a la base de datos");
        } catch (ClassNotFoundException ex) {
            Utilidades.confirma(confirma, "Hubo un error en el sistema");
        }
    }

    public void eliminarDatosCliente(Cliente c) {
        try {

            Connection conn = SQL.conectarMySQL();
            Statement s = conn.createStatement();
            String update = "UPDATE `Cliente` SET `eliminado`= true WHERE idCliente = " + c.getId();
            boolean modificar = s.execute(update);
            Utilidades.confirma(confirma, "Datos del cliente eliminados");
            String mensajeBita = "Elimino los datos del cliente " + c.getNombres();
            bita.registrarBitacora(mensajeBita);
        } catch (SQLException e) {
            Utilidades.confirma(confirma, "Hubo un error en la conexion a la base de datos");
        } catch (ClassNotFoundException ex) {
            Utilidades.confirma(confirma, "Error en el sistema");
        }
    }
    // Compras a credito, para eso es este metodo para ver las tickets a credito
     public ResultSet obtenerTicketsCliente(String idCliente, boolean finalizado){
        try {
            Conexion SQL = new Conexion();
            Connection conn = SQL.conectarMySQL();
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM `ventas` WHERE idCliente = "+idCliente+" and tipoCompra = 'credito' and devocompleta = false and finalizada = "+finalizado + " GROUP BY idTicket");
            
            rs.last();
            if (rs.getRow() == 0) {
                rs=null;
                System.out.println("No hay");
                
            } else {
                rs.beforeFirst();
                System.out.println("Si hay");
                
            }
            
            return rs;
        } catch (ClassNotFoundException ex) {
             Utilidades.confirma(confirma, "Hubo un error con el sistema");
        } catch (SQLException ex) {
             Utilidades.confirma(confirma, "Hubo un error con la conexión a la base de datos");
        }
     return null;
    }
     
       public ResultSet getVentasPorTicketCliente(String idTicket, String idCliente, String fecha) {
        ResultSet datos = null;

        try {

            Connection conn = SQL.conectarMySQL();
            Statement s = conn.createStatement();
            String sql = "";

            sql = "SELECT idVenta,nombre,precioVenta,cantidad,importe FROM `Ventas` WHERE idTicket = " + idTicket + " and idCliente = "+idCliente + " and fecha = '"+fecha+"'";
            datos = s.executeQuery(sql);
            System.out.println(sql);
            
        } catch (SQLException ex) { 
          Utilidades.confirma(confirma, "Hubo un error con la conexión a la base de datos");
        } catch (ClassNotFoundException ex) {
          Utilidades.confirma(confirma, "Hubo un error con el sistema");
        }

        return datos;

    }
       
      public double obtenerDeudaCliente(String idCliente){
      ResultSet datos = null;
      double suma=0;
          try {

            Connection conn = SQL.conectarMySQL();
            Statement s = conn.createStatement();
            String sql = "";

            sql = "SELECT sum(importe) as importe FROM `ventas` WHERE idCliente = "+idCliente+" and tipoCompra = \"credito\" and finalizada = false";
            datos = s.executeQuery(sql);
            datos.next();
            suma=datos.getDouble("importe");
            
        } catch (SQLException ex) { 
          Utilidades.confirma(confirma, "Hubo un error con la conexión a la base de datos");
        } catch (ClassNotFoundException ex) {
          Utilidades.confirma(confirma, "Hubo un error con el sistema");
        }
          return suma;
      } 
      
      public ResultSet getAbonos(String idTicket, String idCliente, String fecha) {
        ResultSet datos = null;

        try {

            Connection conn = SQL.conectarMySQL();
            Statement s = conn.createStatement();
            String sql = "SELECT * FROM `credito` WHERE idTicket = " + idTicket + " and idCliente = "+idCliente + " and fecha = '"+fecha+"'";
            System.out.println(sql);
            datos = s.executeQuery(sql);
          
            
        } catch (SQLException ex) { 
          Utilidades.confirma(confirma, "Hubo un error con la conexión a la base de datos");
        } catch (ClassNotFoundException ex) {
          Utilidades.confirma(confirma, "Hubo un error con el sistema");
        }

        return datos;

    }
      
      public double getSaldoCliente(String idCliente){
          double creditos=0;
          double abonos=0;
          double total=0;
          
            try {
            Conexion SQL = new Conexion();
            Connection conn = SQL.conectarMySQL();
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery("SELECT sum(importe) as importe FROM `ventas` WHERE idCliente = "+idCliente+" and tipoCompra = 'credito' and devocompleta = false and finalizada = false");
            rs.last();
            if (rs.getRow() == 0) {
               total=0;
                
            } else {
                rs.beforeFirst();
                rs.next();
                creditos= rs.getDouble("importe");
                ResultSet rs2 = s.executeQuery("SELECT sum(abonado) as abonado FROM `credito` WHERE idCliente = "+idCliente+" and finalizado = false");
                rs2.next();
                abonos=rs2.getDouble("abonado");
                total = creditos - abonos;
                System.out.println("Creditos " + creditos + " abonos " + abonos);
            }
            
     
        } catch (ClassNotFoundException ex) {
             Utilidades.confirma(confirma, "Hubo un error con el sistema");
        } catch (SQLException ex) {
             Utilidades.confirma(confirma, "Hubo un error con la conexión a la base de datos");
        }
          
          return total;
      }
      
      
      public void liquidarAdeudo(String idCliente,String nombre,String monto){
      int idUsuario=UsuarioDAO.getIdUsuario();
           
        Connection conn = null;
        try {
            conn = SQL.conectarMySQL();
            conn.setAutoCommit(false);
            Statement s = conn.createStatement();
            int rs = s.executeUpdate("INSERT INTO `credito`(`idCliente`, `idTicket`, `fecha`, `monto`, `abonado`, `fechaAbono`,`idUsuario`) VALUES "
                    + " (" + idCliente + "," + "0" + ",'"+formatoFecha.format(d)+"', 0 , " + monto + ", '" + formatoFecha.format(d) + "',"+idUsuario+" )");
            int rs2 = s.executeUpdate("UPDATE `ventas` SET `finalizada`= true where idCliente =" + idCliente);
            int rs3 = s.executeUpdate("UPDATE `credito` SET `finalizado`= true where idCliente =" +idCliente );
            String mensajeBita = "Se liquidaron todos los adeudos del cliente " + nombre;
            bita.registrarBitacora(mensajeBita);
            
            conn.commit();
            Utilidades.confirma(confirma, "Se liquido el adeudo total del cliente");
        } catch (ClassNotFoundException ex) {
            Utilidades.confirma(confirma, "Hubo un error en el sistema");
        } catch (SQLException ex) {
            System.out.println(ex.getLocalizedMessage());
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException exe) {
                    System.out.println(exe.toString());
                }
            }
            Utilidades.confirma(confirma, "Hubo un error con la conexion a la base de datos");
        }

    }
      
      
      
}
