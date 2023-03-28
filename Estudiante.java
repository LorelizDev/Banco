package Banco;

import java.time.LocalDate;

public class Estudiante extends Cliente {
    
    private Cuenta cuenta;
    private Float balance;

    public Estudiante() {
    }

    public Estudiante(Long idCliente, String nombreCompleto, String telefono, String email, LocalDate fechaDeAlta, Cuenta cuenta) {
        
        super(idCliente, nombreCompleto, telefono, email, fechaDeAlta);
        this.cuenta = cuenta;
    }

    public Cuenta getCuenta() {
        return this.cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public float calculoDeBalance() {
        this.balance = cuenta.getBalance();
        return this.balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    @Override
    public float calculoDePrestamo() {
        return 0f;
    }

}
