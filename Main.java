package Banco;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Cliente> clientes = new ArrayList<>();

        System.out.println("\n--------Cliente 1--------\n");

        LocalDate fecha1 = LocalDate.of(2022, 04, 15);

        Cuenta cuenta1 = new Cuenta(1, true, 500.0f);
        Cuenta cuenta2 = new Cuenta(2, true, 350.0f);
        Prestamo prestamo1 = new Prestamo(1, 2000f);

        Prestamo[] prestamos1 = {prestamo1};
        Cuenta[] cuentas1 = {cuenta1, cuenta2};

        ClienteA ClienteA1 = new ClienteA(1l, "Ricardo Gómez", "12345678", "ricardo@gmail.com ", fecha1, cuentas1, 2000.0f, prestamos1);

        System.out.println("El balance total de cuentas del cliente es: " + ClienteA1.calculoDeBalance());
        System.out.println("El prestamo al que el cliente puede aplicar es de: " + ClienteA1.calculoDePrestamo());

        clientes.add(ClienteA1);

        System.out.println("\n--------Cliente 2--------\n");

        LocalDate fecha2 = LocalDate.of(2021, 05, 30);

        Cuenta cuenta3 = new Cuenta(1, true, 350.0f);
        Cuenta cuenta4 = new Cuenta(2, true, 550.0f);
        Prestamo prestamo2 = new Prestamo(1, 5000f);

        Prestamo[] prestamos2 = {prestamo2};
        Cuenta[] cuentas2 = {cuenta3, cuenta4};

        ClienteB ClienteB1 = new ClienteB(2l, "Pedro Pérez", "56781234", "pedro@gmail.com ", fecha2, cuentas2, 1000.0f, prestamos2);

        System.out.println("El balance total de cuentas del cliente es: " + ClienteB1.calculoDeBalance());
        System.out.println("El prestamo al que el cliente puede aplicar es de: " + ClienteB1.calculoDePrestamo());

        clientes.add(ClienteB1);

        System.out.println("\n--------Cartera de clientes--------\n");

        System.out.println(clientes);
    }
}
