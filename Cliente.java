package Banco;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Cliente {
    
    private Long idCliente;
    private String nombreCompleto;
    private String telefono;
    private String email;
    private LocalDate fechaDeAlta;
    private Cuenta[] cuentas;
    private Float ingresoMensual;
    private Prestamo[] prestamos;

    public Cliente(){
    }

    public Cliente(Long idCliente, String nombreCompleto, String telefono, String email, LocalDate fechaDeAlta, Cuenta[] cuentas, Float ingresoMensual, Prestamo[] prestamos) {
        this.idCliente = idCliente;
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
        this.email = email;
        this.fechaDeAlta = fechaDeAlta;
        this.cuentas = cuentas;
        this.ingresoMensual = ingresoMensual;
        this.prestamos = prestamos;
    }

    public Cliente(Long idCliente, String nombreCompleto, String telefono, String email, LocalDate fechaDeAlta) {
        this.idCliente = idCliente;
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
        this.email = email;
        this.fechaDeAlta = fechaDeAlta;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }
    
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFechaDeAlta(LocalDate fechaDeAlta) {
        this.fechaDeAlta = fechaDeAlta;
    }

    public void setCuentas(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }

    public void setIngresoMensual(Float ingresoMensual) {
        this.ingresoMensual = ingresoMensual;
    }

    public void setPrestamos(Prestamo[] prestamos) {
        this.prestamos = prestamos;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }
    
    public String getTelefono() {
        return telefono;
    }
    
    public String getEmail() {
        return email;
    }
    
    public LocalDate getFechaDeAlta() {
        return fechaDeAlta;
    }
    
    public Cuenta[] getCuentas() {
        return cuentas;
    }
    
    public Float getIngresoMensual() {
        return this.ingresoMensual;
    }

    public Prestamo[] getPrestamos() {
        return this.prestamos;
    }

    public abstract float calculoDeBalance();

    public Long calculoAntiguedad() {
        LocalDate momentoActual = LocalDate.now();
        long antiguedad = ChronoUnit.MONTHS.between(getFechaDeAlta(), momentoActual);
        return antiguedad;
    }

    @Override
    public String toString() {
        return "{" +
            " idCliente='" + getIdCliente() + "'" +
            ", nombreCompleto='" + getNombreCompleto() + "'" +
            ", telefono='" + getTelefono() + "'" +
            ", email='" + getEmail() + "'" +
            ", fechaDeAlta='" + getFechaDeAlta() + "'" +
            ", antiguedad='" + calculoAntiguedad() + " meses'" +
            ", saldo en cuentas='" + calculoDeBalance() + "'" +
            ", ingresoMensual='" + getIngresoMensual() + "'" +
            ", tipoCliente='" + getClass().getName().substring(6) + "'" +
            "}";
    }

    public abstract float calculoDePrestamo();

}
