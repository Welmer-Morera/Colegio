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
public class LibroBD  extends Conexion{
    public ResultSet buscarTodosLibros()//Devuelve el reslutado de una consulta,
            //"llama al prod¿cdure buscar todos devuleve un resulset  con todo"
    {
        try//
        {
            obj_Procedimiento = getConexion() .prepareCall("{call Buscar_Libros}");
            rs = obj_Procedimiento.executeQuery();
            
        } catch (SQLException ex) 
        {
            Logger.getLogger(LibroBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
      public Libro buscarLibro(int idLibro)
    {//Declaramos un objeto de tipo cliente 
        Libro libro=  null;//no lo encuentra
        try {
        conectarBD();
         obj_Procedimiento = getConexion() .prepareCall("{call Buscar_Libro(?)}");
         //enviar los parametros.
         obj_Procedimiento.setInt(1,idLibro);
       
            rs = obj_Procedimiento.executeQuery();//Consulta"devuelve un resulset"
             
            if(rs.next())//si es rs.next devuelve el valor
            {//Asigna todos los valores.
                libro= new Libro();
            
                 libro.setIdLibro(rs.getInt(1));
                 libro.setNombre(rs.getString(2));
                 libro.setCantidad(rs.getInt(3));
                 libro.setPrecio(rs.getDouble(4));
                 
              
            }
            desconectarBD();
        }
        catch (SQLException ex)
        {
            System.out.println(ex.toString());
             desconectarBD();
        }
        return libro;
}
}
