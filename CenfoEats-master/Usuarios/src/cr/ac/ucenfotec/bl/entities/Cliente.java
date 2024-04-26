package cr.ac.ucenfotec.bl.entities;

public class Cliente extends Usuario {


    public Cliente(int cedula, String nombre, String apellido1, String apellido2, int telefono, int tipo) {
        super(cedula, nombre, apellido1, apellido2, telefono, tipo);
    }

    public Cliente(){

    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cedula=" + cedula +
                ", nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", telefono=" + telefono +
                ", tipo=" + tipo +
                '}';
    }
}
