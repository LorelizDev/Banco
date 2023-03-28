package Banco;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Cliente> clientes = new ArrayList<>();

        System.out.println("\n--------Cliente 1--------\n");

        Long idCliente1 = 1l;
        String nombreCompleto1 = "Ricardo Gómez";
        String telefono1 = "12345678";
        String email1 = "ricardo@gmail.com";        
        LocalDate fecha1 = LocalDate.of(2022, 04, 15);
        Cuenta cuenta1 = new Cuenta(1, true, 500.0f);
        Cuenta cuenta2 = new Cuenta(2, true, 350.0f);
        Float ingresoMensual1 = 2000.0f;
        Prestamo prestamo1 = new Prestamo(1, 2000f);

        Prestamo[] prestamos1 = {prestamo1};
        Cuenta[] cuentas1 = {cuenta1, cuenta2};     
        
        Cliente Cliente1 = tipoCliente(idCliente1, nombreCompleto1, telefono1, email1, fecha1, cuentas1, ingresoMensual1, prestamos1);
        
        System.out.println("El balance total de cuentas del cliente es: " + Cliente1.calculoDeBalance());
        System.out.println("El prestamo al que el cliente puede aplicar es de: " + Cliente1.calculoDePrestamo());
        clientes.add(Cliente1);

        System.out.println("\n--------Cliente 2--------\n");

        Long idCliente2 = 2l;
        String nombreCompleto2 = "Pedro Pérez";
        String telefono2 = "56781234";
        String email2 = "pedro@gmail.com";        
        LocalDate fecha2 = LocalDate.of(2021, 05, 30);
        Cuenta cuenta3 = new Cuenta(1, true, 350.0f);
        Cuenta cuenta4 = new Cuenta(2, true, 550.0f);
        Float ingresoMensual2 = 1000.0f;
        Prestamo prestamo2 = new Prestamo(1, 5000f);

        Prestamo[] prestamos2 = {prestamo2};
        Cuenta[] cuentas2 = {cuenta3, cuenta4};     
        
        Cliente Cliente2 = tipoCliente(idCliente2, nombreCompleto2, telefono2, email2, fecha2, cuentas2, ingresoMensual2, prestamos2);
        
        System.out.println("El balance total de cuentas del cliente es: " + Cliente2.calculoDeBalance());
        System.out.println("El prestamo al que el cliente puede aplicar es de: " + Cliente2.calculoDePrestamo());
        clientes.add(Cliente2);

        System.out.println("\n--------Cliente 3--------\n");

        Long idCliente3 = 3l;
        String nombreCompleto3 = "María Casas";
        String telefono3 = "11223344";
        String email3 = "maria@gmail.com";        
        LocalDate fecha3 = LocalDate.of(2022, 01, 16);
        Cuenta cuenta5 = new Cuenta(1, true, 100.0f);
        
        Cliente Cliente3 = tipoCliente(idCliente3, nombreCompleto3, telefono3, email3, fecha3, cuenta5);
        
        System.out.println("El balance total de cuentas del cliente es: " + Cliente3.calculoDeBalance());
        System.out.println("El prestamo al que el cliente puede aplicar es de: " + Cliente3.calculoDePrestamo());
        clientes.add(Cliente3);

        System.out.println("\n--------Cartera de clientes--------\n");

        System.out.println(clientes);

        System.out.println("\n--------Eliminar un Cliente--------\n");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el id que desea eliminar: ");
        Long idBuscado = sc.nextLong();
        

        for (int i = 0; i < clientes.size(); i++) {
            if (idBuscado == clientes.get(i).getIdCliente()) {
                clientes.remove(i);
            }
        }

        sc.close();

        System.out.println(clientes);
        
    }
    

    public static Cliente tipoCliente(Long idCliente, String nombreCompleto, String telefono, String email, LocalDate fecha, Cuenta cuenta) {
        return new Estudiante(idCliente, nombreCompleto, telefono, email, fecha, cuenta);
    }


    public static Cliente tipoCliente(Long idCliente, String nombreCompleto, String telefono, String email, LocalDate fechaDeAlta, Cuenta[] cuentas, Float ingresoMensual, Prestamo[] prestamos) {

        LocalDate momentoActual = LocalDate.now();
        long antiguedad = ChronoUnit.MONTHS.between(fechaDeAlta, momentoActual);
        
        if (ingresoMensual >= 2000.0f && antiguedad >= 12) {

            return new ClienteA(idCliente, nombreCompleto, telefono, email, fechaDeAlta, cuentas, ingresoMensual, prestamos);

        } else {
            
            return new ClienteB(idCliente, nombreCompleto, telefono, email, fechaDeAlta, cuentas, ingresoMensual, prestamos);
        }
    }
}