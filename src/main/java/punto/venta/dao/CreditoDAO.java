package punto.venta.dao;

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
import punto.venta.dialogos.Confirmacion;
import punto.venta.misclases.Credito;
import punto.venta.utilidades.Utilidades;

/**
 *
 * @author agus_
 */
public class CreditoDAO {

    Conexion SQL = new Conexion();
    BitacoraDAO bita = new BitacoraDAO();
    Confirmacion confirma;
    Date d = new Date();
    DateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
    
    
    
    public void almacena(Credito cre, boolean finalizado) {
        int idUsuario=UsuarioDAO.getIdUsuario();
        Connection conn = null;
        try {
            conn = SQL.conectarMySQL();
            conn.setAutoCommit(false);
            Statement s = conn.createStatement();
            int rs = s.executeUpdate("INSERT INTO `credito`(`idCliente`, `idTicket`, `fecha`, `monto`, `abonado`, `fechaAbono`,`idUsuario`) VALUES "
                    + " (" + cre.getIdCliente() + "," + cre.getIdTicket() + ",'" + cre.getFecha() + "'," + cre.getMonto() + ", " + cre.getAbonado() + ", '" + formatoFecha.format(d) + "',"+idUsuario+" )");
            String mensajeBita = "Se registró un abono de " + cre.getAbonado() + " en el ticket " + cre.getIdCliente();
            bita.registrarBitacora(mensajeBita);
            Utilidades.confirma(confirma, "Abono de $" + cre.getAbonado() + " realizado con éxito");
            if(finalizado==true){
            int rs2 = s.executeUpdate("UPDATE `ventas` SET `finalizada`= true where idTicket = " + cre.getIdTicket() + " and idCliente =" +cre.getIdCliente() + " and fecha = '"+cre.getFecha()+"'" );
            int rs3 = s.executeUpdate("UPDATE `credito` SET `finalizado`= true where idTicket = " + cre.getIdTicket() + " and idCliente =" +cre.getIdCliente() + " and fecha = '"+cre.getFecha()+"'" );
            }
            conn.commit();
        } catch (ClassNotFoundException ex) {
            Utilidades.confirma(confirma, "Hubo un error en el sistema");
        } catch (SQLException ex) {
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

    public ArrayList<Credito> getCreditos(int idCliente, boolean finalizado) throws ClassNotFoundException, SQLException {

        ArrayList<Credito> listado = new ArrayList<Credito>();
        Connection conn = SQL.conectarMySQL();
        Statement s = conn.createStatement();
        ResultSet res = s.executeQuery("Select * from ventas where finalizado = " + finalizado + " and tipoCompra='credito' and idCliente = " + idCliente);

        while (res.next()) {
            Credito cli = new Credito();
            cli.setIdCliente(res.getInt(1));
            cli.setIdTicket(res.getInt(2));
            cli.setFecha(res.getString(3));
            cli.setMonto(res.getDouble(4));
            cli.setAbonado(res.getDouble(5));
            cli.setFechaAbono(res.getString(6));
            listado.add(cli);
        }
        return listado;
    }
    // Es otro casi repetido que no ocupo hasta el momento

    public void abonarCuenta(double abono, String idTicket, String fecha, String idCliente, String monto) {
        try {
            Connection conn = SQL.conectarMySQL();
            Statement s = conn.createStatement();
            String update = "INSERT INTO `credito`(`idCliente`, `idTicket`, `fecha`, `monto`, `abonado`, `fechaAbono`) VALUES (" + idCliente + "," + idTicket + ",'" + fecha + "'," + monto + "," + abono + ",'" + formatoFecha.format(d) + "')";
            boolean modificar = s.execute(update);
            Utilidades.confirma(confirma, "Abono realizado con exito");
            String mensajeBita = "Se realizó un abono a la cuenta con ticket " + idTicket + "con fecha de " + fecha + " por el monto de $" + abono;
            bita.registrarBitacora(mensajeBita);
        } catch (SQLException e) {
            Utilidades.confirma(confirma, "Hubo un error con la conexion a la base de datos");
        } catch (ClassNotFoundException ex) {
            Utilidades.confirma(confirma, "Hubo un error en el sistema");
        }
    }
}
