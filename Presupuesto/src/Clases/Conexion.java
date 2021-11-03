package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    Connection con;
    public Connection getConnection(){
        try {
            String dataBase = "jdbc:mysql://localhost:3306/sistemacontable?serverTimezone=UTC";
            con = DriverManager.getConnection(dataBase, "root", "");
            return con;
        } catch (SQLException e) {
            System.out.println("Error en conectar a la base de datos sistemacontable");
            System.out.println(e.toString());
        }
        return null;
    }
    
}
