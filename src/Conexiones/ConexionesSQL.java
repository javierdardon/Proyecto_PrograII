/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier
 */
public class ConexionesSQL 
{
    Connection con;
    
    public Connection conexion()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/Colegio","nejado","12345");
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        }
        return con;
        
    }
}
