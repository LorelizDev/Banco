package Banco;

import java.time.LocalDate;

public class ClienteB extends Cliente implements ClienteService {

    public ClienteB(Long idCliente, String nombreCompleto, String telefono, String email, LocalDate fechaDeAlta, Cuenta[] cuentas, Float ingresoMensual, Prestamo[] prestamos) {
        
        super(idCliente, nombreCompleto, telefono, email, fechaDeAlta, cuentas, ingresoMensual, prestamos);
    }
    
    @Override
    public float calculoDePrestamo() {
        
        Prestamo[] prestamos = getPrestamos();        
        float deudaTotal = 0f;

        for(int i = 0; i < prestamos.length; i++){
            deudaTotal += prestamos[i].getSaldo();
        }
        return getIngresoMensual() * 5 - deudaTotal;
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
