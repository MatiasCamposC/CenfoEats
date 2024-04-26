package cr.ac.ucenfotec.bl.entities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class RepartidorDao {

    private static RepartidorDao instance;
    private Connection conn;

    private RepartidorDao() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String connStr = "jdbc:mysql://localhost:3306/Cenfoeats?user=root&password=root&useSSL=false";
            conn = DriverManager.getConnection(connStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static RepartidorDao getInstance() {
        if (instance == null) {
            synchronized (RepartidorDao.class) {
                if (instance == null) {
                    instance = new RepartidorDao();
                }
            }
        }
        return instance;
    }

    public void insertar(Repartidor objRepartidor) throws Exception {
        try {
            String query = "INSERT INTO Repartidor (cedula, nombre, apellido1, apellido2, telefono, tipo, horario, zona, transporte) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, objRepartidor.getCedula());
            stmt.setString(2, objRepartidor.getNombre());
            stmt.setString(3, objRepartidor.getApellido1());
            stmt.setString(4, objRepartidor.getApellido2());
            stmt.setInt(5, objRepartidor.getTelefono());
            stmt.setInt(6, objRepartidor.getTipo());
            stmt.setString(7, objRepartidor.getHorario());
            stmt.setString(8, objRepartidor.getZona());
            stmt.setString(9, objRepartidor.getTransporte());

            stmt.executeUpdate();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}

