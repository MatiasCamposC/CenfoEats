package cr.ac.ucenfotec.ui;

import cr.ac.ucenfotec.bl.logic.Gestor;
import cr.ac.ucenfotec.bl.entities.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static Gestor gestor = new Gestor();

    public static void main(String[] args) throws IOException, Exception {
        try {
            String opcion = "";
            while (!opcion.equals("s")) {
                System.out.println("Eliga el tipo de usuario que desea registrar");
                mostrarMenu();
                opcion = scanner.nextLine();
                ejecutarOpcion(opcion);
            }
        } catch (Exception e) {
            System.out.println("\u001B[31m" + e.toString() + "\nError 404 \u001b[0m");
        }

    }

    public static void mostrarMenu() {
        System.out.println("1. Registrarse como cliente");
        System.out.println("2. Registrarse como repartidor");
        System.out.println("Ingrese el digito correspondiente:");
    }

    public static void ejecutarOpcion(String opcion) throws Exception {
        switch (opcion) {
            case "1":
                registrarCliente();
                break;
            case "2":
                registrarRepartidor();
                break;
            default:
                System.out.println("Opción inválida. Inténtalo nuevamente.");
                break;
        }
    }



    public static void registrarCliente() throws Exception {
        int cedula;
        String nombre;
        String apellido1;
        String apellido2;
        int telefono;
        int tipo;


        System.out.print("Ingrese su cedula: ");
        cedula = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese su nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Ingrese su primer apellido: ");
        apellido1 = scanner.nextLine();
        System.out.print("Ingrese su segundo apellido: ");
        apellido2= scanner.nextLine();
        System.out.print("Ingrese su numero de telefono: ");
        telefono = Integer.parseInt(scanner.nextLine());
        tipo = 1;

        gestor.registrarCliente(cedula, nombre, apellido1, apellido2, telefono, tipo);

        System.out.println("¡Nuevo cliente registrada exitosamente!");
    }


    public static void registrarRepartidor() throws Exception {
        int cedula;
        String nombre;
        String apellido1;
        String apellido2;
        int telefono;
        int tipo;
        String horario;
        String zona;
        String transporte;


        System.out.print("Ingrese su cedula: ");
        cedula = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese su nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Ingrese su primer apellido: ");
        apellido1 = scanner.nextLine();
        System.out.print("Ingrese su segundo apellido: ");
        apellido2= scanner.nextLine();
        System.out.print("Ingrese su numero de telefono: ");
        telefono = Integer.parseInt(scanner.nextLine());
        tipo = 2;
        System.out.println("Cual es su horario de trabajo? (ej: 4:00 pm - 10:00 pm)");
        horario = scanner.nextLine();
        System.out.println("Cual es su zona de trabajo?");
        zona = scanner.nextLine();
        System.out.println("Que transporte utiliza para entregar pedidos?");
        transporte = scanner.nextLine();


        gestor.registrarRepartidor(cedula, nombre, apellido1, apellido2, telefono, tipo, horario, zona, transporte);

        System.out.println("¡Nuevo repartidor registrada exitosamente!");
    }

}