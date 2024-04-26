package cr.ac.ucenfotec.bl.entities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ClienteDao {

    private static ClienteDao instance;
    private static Connection conn;

    private ClienteDao() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String connStr = "jdbc:mysql://localhost:3306/Cenfoeats?user=root&password=root&useSSL=false";
            conn = DriverManager.getConnection(connStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ClienteDao getInstance() {
        if (instance == null) {
            synchronized (ClienteDao.class) {
                if (instance == null) {
                    instance = new ClienteDao();
                }
            }
        }
        return instance;
    }

    public static void insertar(Cliente objCliente) throws Exception {
        try {
            String query = "insert into Cliente(cedula, nombre, apellido1, apellido2, telefono, tipo) values(?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, objCliente.getCedula());
            stmt.setString(2, objCliente.getNombre());
            stmt.setString(3, objCliente.getApellido1());
            stmt.setString(4, objCliente.getApellido2());
            stmt.setInt(5, objCliente.getTelefono());
            stmt.setInt(6, objCliente.getTipo());

            stmt.executeUpdate();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}