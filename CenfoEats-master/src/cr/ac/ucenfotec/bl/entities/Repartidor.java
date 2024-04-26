package cr.ac.ucenfotec.bl.entities;

public class Repartidor extends Usuario{

    String horario;
    String zona;
    String transporte;

    public Repartidor(int cedula, String nombre, String apellido1, String apellido2, int telefono, int tipo, String horario, String zona, String transporte) {
        super(cedula, nombre, apellido1, apellido2, telefono, tipo);
        this.horario = horario;
        this.zona = zona;
        this.transporte = transporte;
    }

    public Repartidor(String horario, String zona, String transporte) {
        this.horario = horario;
        this.zona = zona;
        this.transporte = transporte;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getTransporte() {
        return transporte;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }

    @Override
    public String toString() {
        return "Repartidor{" +
                "horario='" + horario + '\'' +
                ", zona='" + zona + '\'' +
                ", transporte='" + transporte + '\'' +
                '}';
    }
}
