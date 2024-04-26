package cr.ac.ucenfotec.bl.entities;

import java.sql.*;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class ClienteDao {

    public ClienteDao() {
    }
    public static void insertar(Cliente objCliente) throws Exception {
        try {
            Connection conn;
            PreparedStatement stmt;
            String query, connStr;
            Class.forName("com.mysql.cj.jdbc.Driver");
            connStr = "jdbc:mysql://localhost:3306/Usuarios?user=root&password=root&useSSL=false";
            conn = DriverManager.getConnection(connStr);
            query = "insert into Cliente(cedula, nombre, apellido1, apellido2, telefono, tipo) values(?, ?, ?, ?, ?, ?)";
            stmt = conn.prepareStatement(query);
            stmt.setInt(1, objCliente.getCedula());
            stmt.setString(2, objCliente.getNombre());
            stmt.setString(3, objCliente.getApellido1());
            stmt.setString(4, objCliente.getApellido2());
            stmt.setInt(5, objCliente.getTelefono());
            stmt.setInt(6,objCliente.getTipo());

            stmt.executeUpdate();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
