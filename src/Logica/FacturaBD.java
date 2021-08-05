/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

/**
 *
 * @author welmer
 */
public class FacturaBD extends Conexion {
     public String obtenerNumeroFactura() {
        conectarBD();
        String numFactura = "";
        rs = seleccionar("select ifnull(max(numFactura),0)+1 from factura");
        try {
            if (rs.next()) {
                numFactura = rs.getString(1);
            }
        } catch (SQLException ex) {
            desconectarBD();
            Logger.getLogger(FacturaBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        desconectarBD();
        return numFactura;
    }

    public void cargarIdAlumnos(JComboBox<String> cboAlumnos) {
        conectarBD();
        rs = seleccionar("select Nombre from alumnos");
        try {
            cboAlumnos.removeAllItems();
            cboAlumnos.addItem(".:Elegir:.");
            while (rs.next()) {
                cboAlumnos.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            desconectarBD();
            Logger.getLogger(FacturaBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        desconectarBD();
    }


    public void guardarFactura(Factura factura) {
        boolean rpta1 = false, rpta2 = false, rpta3 = false;

        try {
            //Obtenemos la conexion
            conectarBD();

            //Decimos que vamos a crear una transaccion
            getConexion().setAutoCommit(false);

            //Preparamos la inserccion 1
            obj_Procedimiento = getConexion().prepareCall("{CALL guardarFacturas(?,?,?,?)}");
            obj_Procedimiento.setString(1, factura.getDescripcion());
            obj_Procedimiento.setString(2, factura.getIdAlumno());
            obj_Procedimiento.setString(3, factura.getFecha());
             obj_Procedimiento.setDouble(4, factura.getTotalG());
            //Ejecutamos la sentencia y si nos devuelve el valor de 1 es porque
            //registro de forma correcta los datos
            rpta1 = obj_Procedimiento.executeUpdate() == 1 ? true : false;

            //Preparamos la inserccion 2 estudios realizados
            for (DetalleFactura d : factura.getDetalleFactura()) {
                obj_Procedimiento = getConexion().prepareCall("{CALL guardarDetalleFactura(?,?,?,?,?)}");
                obj_Procedimiento.setInt(1, d.getNumFactura());
                obj_Procedimiento.setString(parameterName, x);
                obj_Procedimiento.setString(2, d.getNombre());
                obj_Procedimiento.setDouble(3, d.getPrecio());
                obj_Procedimiento.setInt(4, d.getCantidad());
                obj_Procedimiento.setDouble(5, d.getTotal());
              
                
                rpta2 = obj_Procedimiento.executeUpdate() == 1 ? true : false;
            }
            String sql="";
            for (DetalleFactura d : factura.getDetalleFactura()) {
                stmt = conexion.createStatement();
                sql="update libros set Cantidad = Cantidad - "+
                        d.getCantidad() +" where Nombre ="+d.getNombre();
                rpta3 = stmt.executeUpdate(sql) == 1 ? true : false;
            }

            if (rpta1 && rpta2 && rpta3) {
                //Confirmamos la transaccion
                getConexion().commit();
                 System.out.println("todo bien");
            } else {
                //Negamos la transaccion
                getConexion().rollback();
                System.out.println("todo mall");
            }
            desconectarBD();
        } catch (SQLException e) {
            try {
                getConexion().rollback();
                 System.out.println(e.toString());
            } catch (SQLException ex) {
                 System.out.println("cc");
            }
            desconectarBD();
        } catch (Exception e) {
            try {
                 System.out.println("cct");
                getConexion().rollback();
            } catch (SQLException ex) {
                 System.out.println("ccc");
            }
            desconectarBD();
        }
    }
}
