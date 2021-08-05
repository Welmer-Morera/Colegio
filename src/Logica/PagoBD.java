/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author welmer
 */
public class PagoBD extends Conexion  {
    
    
      public ResultSet buscarFacturas(){
        try{ 
            obj_Procedimiento = getConexion().prepareCall("{call Mostar_Facturas}"); 
            rs= obj_Procedimiento.executeQuery();
        }
    
        catch(SQLException ex){
            Logger.getLogger(PagoBD.class.getName()).log(Level.SEVERE, null, ex);
                         }
 
    return rs;
}
      
       public boolean  guardarFactura( Pago pago){
       boolean rpta=false;
       try {
       conectarBD();
     obj_Procedimiento = getConexion().prepareCall("{call  Agregar_Factura(?,?,?)}");
     obj_Procedimiento.setString(1,pago.getDescripcion());
     obj_Procedimiento.setString(2, pago.getCliente());
     obj_Procedimiento.setDouble(3,pago.getMonto());
     
     
            rpta= obj_Procedimiento.executeUpdate()==1  ;
            desconectarBD();
       }
       catch(SQLException ex){
           System.out.println(ex.toString());
           desconectarBD();
       }
     
     
       return rpta;        
   } 
      
      
}
