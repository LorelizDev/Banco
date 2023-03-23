package Banco;

import java.time.LocalDate;

public class ClienteA extends Cliente implements ClienteService {


    public ClienteA(Long idCliente, String nombreCompleto, String telefono, String email, LocalDate fechaDeAlta, Cuenta[] cuentas, Float ingresoMensual, Prestamo[] prestamos) {
        
        super(idCliente, nombreCompleto, telefono, email, fechaDeAlta, cuentas, ingresoMensual, prestamos);
    }


    @Override
    public float calculoDePrestamo() {
        /* Fijarnos su ingreso mensual, multiplicarlo por 5 o por 10, segun corresponda.
        Fijarnos si tiene prestamos asociados y restar el total de prestamos, del calculo obtenido antes */
        
        Prestamo[] prestamos = getPrestamos();        
        float deudaTotal = 0f;

        for(int i = 0; i < prestamos.length; i++){
            deudaTotal += prestamos[i].getSaldo();
        }
        return getIngresoMensual() * 10 - deudaTotal;
    }

    @Override
    public float calculoDeBalance() {
        Cuenta[] cuentas = getCuentas();
        float saldoTotal = 0f;

        for(int i = 0; i < cuentas.length; i++){
            saldoTotal += cuentas[i].getBalance();
        }
        return saldoTotal;
    }
    

}
