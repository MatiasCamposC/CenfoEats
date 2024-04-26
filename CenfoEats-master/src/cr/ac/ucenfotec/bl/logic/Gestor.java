package cr.ac.ucenfotec.bl.logic;

import java.util.ArrayList;
import cr.ac.ucenfotec.bl.entities.*;
import cr.ac.ucenfotec.bl.entities.ClienteDao;
import cr.ac.ucenfotec.bl.entities.RepartidorDao;

public class Gestor {

    private static ArrayList<Cliente> Cliente = new ArrayList<Cliente>();

    private static ArrayList<Repartidor> Repartidor = new ArrayList<Repartidor>();

    public String registrarCliente(int cedula, String nombre, String apellido1, String apellido2, int telefono, int tipo) throws Exception{
        String msj = "El Cliente se registró correctamente";
        try {
            Cliente objCliente = new
                    Cliente(cedula, nombre, apellido1, apellido2, telefono, tipo);

            ClienteDao.insertar(objCliente);

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return msj = "El Cliente se registró correctamente";

    }

    public String registrarRepartidor(int cedula, String nombre, String apellido1, String apellido2, int telefono, int tipo, String horario, String zona, String transporte) throws Exception{
        String msj = "El Repartidor se registró correctamente";
        try {
            Repartidor objRepartidor = new
                    Repartidor(cedula, nombre, apellido1, apellido2, telefono, tipo, horario, zona, transporte);

            RepartidorDao.insertar(objRepartidor);

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return msj = "El Repartidor se registró correctamente";

    }
}