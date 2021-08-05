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
 * 
 */
public class AlumnoBD extends Conexion   {
      public ResultSet buscarAlumnos(){
        try{ 
            obj_Procedimiento = getConexion().prepareCall("{call Mostrar_Alumnos}"); 
            rs= obj_Procedimiento.executeQuery();
        }
    
        catch(SQLException ex){
            Logger.getLogger(AlumnoBD.class.getName()).log(Level.SEVERE, null, ex);
                         }
 
    return rs;
}
      
   public boolean  guardarAlumno( Alumno alumno){
       boolean rpta=false;
       try {
       conectarBD();
     obj_Procedimiento = getConexion().prepareCall("{call  Agregar_Alumno(?,?,?)}");
     obj_Procedimiento.setInt(1,alumno.getCedula());
     obj_Procedimiento.setString(2, alumno.getNombre());
     obj_Procedimiento.setInt(3,alumno.getEdad());
     
     
            rpta= obj_Procedimiento.executeUpdate()==1  ;
            desconectarBD();
       }
       catch(SQLException ex){
           System.out.println(ex.toString());
           desconectarBD();
       }
     
     
       return rpta;        
   } 
   
   public boolean  editarAlumno( Alumno alumno){
       boolean rpta=false;
       try {
       conectarBD();
     obj_Procedimiento = getConexion().prepareCall("{call  Editar_Alumno(?,?,?)}");
     obj_Procedimiento.setInt(1,alumno.getCedula());
     obj_Procedimiento.setString(2, alumno.getNombre());
     obj_Procedimiento.setInt(3,alumno.getEdad());
     
            rpta= obj_Procedimiento.executeUpdate()==1  ;
            desconectarBD();
       }
       catch(SQLException ex){
           System.out.println(ex.toString());
       desconectarBD();
       }
     
     
       return rpta;        
   } 
   
   public boolean eliminarAlumno(int idCliente){
       boolean rpta= false;
       try{
           conectarBD();
       obj_Procedimiento = getConexion().prepareCall("{call Eliminar_Alumno(?)}{");
       obj_Procedimiento.setInt(1,idCliente);
       rpta = obj_Procedimiento.executeUpdate()==1;
       }
       catch(SQLException ex){
       System.out.print(ex.toString());}
       desconectarBD();
       return rpta;
   }
}