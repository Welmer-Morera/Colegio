/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.PooledConnection;
import javax.swing.JOptionPane;

 class PoolConexionMySql {

    MysqlConnectionPoolDataSource ds_con;
    PooledConnection pool;

    

    PoolConexionMySql() {
        String url = null;
        String user = null;
        String password = null;

        url = "jdbc:mysql://localhost:3306/colegio";
        user = "root";
        password = "root";

        try {
            ds_con = new MysqlConnectionPoolDataSource();
            ds_con.setURL(url);
            ds_con.setUser(user);
            ds_con.setPassword(password);
            pool = ds_con.getPooledConnection();
            System.out.println("Unica conexión establecida");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error al intentar conectar con el servidor\nIntente nuevamente", "Error conexion", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
            Logger.getLogger(PoolConexionMySql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Connection getConexion() {
        try {
            return pool.getConnection();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Se perdio la conexión con el servidor :(", "Conexion al servidor", JOptionPane.ERROR_MESSAGE);
            System.err.println(ex);
        }
        return null;
    }
}