package Banco;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n--------Cartera de clientes--------\n");

        System.out.println("\n--------Cliente 1--------\n");

        Cliente clienteA1 = new ClienteA(1, "José Pérez", "1123456789", "joseperez@gmail.com", "05-02-2022", null, 2500f, null);

        Cuenta cuentaAhorroA1 = new Cuenta(1, true, 5000f);
        Cuenta cuentaCorrienteA1 = new Cuenta(2, true, 2000f);
        Cuenta[] cuentasA1 = {cuentaAhorroA1, cuentaCorrienteA1};
        ((Cliente) clienteA1).setCuentas(cuentasA1);
        
        ((ClienteA) clienteA1).calculoDePrestamo();

        System.out.println(clienteA1.toString());

        System.out.println("\n--------Cliente 2--------\n");

        Cliente clienteB1 = new ClienteB(2, "Juan López", "1167892345", "juanlopez@gmail.com", "15-03-2022", null, 1200f, null);

        Cuenta cuentaAhorroB1 = new Cuenta(3, true, 1000f);
        Cuenta cuentaCorrienteB1 = new Cuenta(4, true, 100f);
        Cuenta[] cuentasB1 = {cuentaAhorroB1, cuentaCorrienteB1};
        ((Cliente) clienteB1).setCuentas(cuentasB1);
        
        ((ClienteB) clienteB1).calculoDePrestamo();

        System.out.println(clienteB1.toString());

        System.out.println("\n--------Cliente 3--------\n");

        Cliente clienteE1 = new Estudiante(3, "María Casas", "1167891234", "mariacasas@gmail.com", "05-03-2023", null, 10f);

        Cuenta cuentaAhorroE = new Cuenta(5, true, 10f);
        Cuenta[] cuentasE1 = {cuentaAhorroE};
        ((Cliente) clienteE1).setCuentas(cuentasE1);

        System.out.println(clienteE1.toString());
    }
}
