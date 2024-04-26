package cr.ac.ucenfotec.bl.entities;

import java.sql.*;
import java.util.ArrayList;

public class RepartidorDao {

    public RepartidorDao() {
    }
    public static void insertar(Repartidor objRepartidor) throws Exception {
        try {
            Connection conn;
            PreparedStatement stmt;
            String query, connStr;
            Class.forName("com.mysql.cj.jdbc.Driver");
            connStr = "jdbc:mysql://localhost:3306/Usuarios?user=root&password=root&useSSL=false";
            conn = DriverManager.getConnection(connStr);
            query = "insert into Repartidor(cedula, nombre, apellido1, apellido2, telefono, tipo, horario, zona, transporte) values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
            stmt = conn.prepareStatement(query);
            stmt.setInt(1, objRepartidor.getCedula());
            stmt.setString(2, objRepartidor.getNombre());
            stmt.setString(3, objRepartidor.getApellido1());
            stmt.setString(4, objRepartidor.getApellido2());
            stmt.setInt(5, objRepartidor.getTelefono());
            stmt.setInt(6,objRepartidor.getTipo());
            stmt.setString(7, objRepartidor.getHorario());
            stmt.setString(8, objRepartidor.getZona());
            stmt.setString(9, objRepartidor.getTransporte());

            stmt.executeUpdate();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}

