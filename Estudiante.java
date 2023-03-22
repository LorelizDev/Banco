package Banco;

public class Estudiante extends Cliente {
    private Float balance;

    public Estudiante() {
    }

    public Estudiante(Integer id, String nombreCompleto, String telefono, String email, String fechaDeAlta, Cuenta[] cuentas, Float balance) {
        
        super(id, nombreCompleto, telefono, email, fechaDeAlta, cuentas);
        this.balance = balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    public Float getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nombreCompleto='" + getNombreCompleto() + "'" +
            ", telefono='" + getTelefono() + "'" +
            ", email='" + getEmail() + "'" +
            ", fechaDeAlta='" + getFechaDeAlta() + "'" +
            ", cuentas='" + getCuentas() + "'" +
            ", balance='" + getBalance() + "'" +
            "}";
    }  
}
