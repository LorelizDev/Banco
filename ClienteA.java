package Banco;

public class ClienteA extends Cliente implements ClienteService {
    
    private Float ingresoMensual;
    private Float prestamo;
    
    public ClienteA() {
    }

    public ClienteA(Integer id, String nombreCompleto, String telefono, String email, String fechaDeAlta, Cuenta[] cuentas,Float ingresoMensual, Float prestamo) {
        
        super(id, nombreCompleto, telefono, email, fechaDeAlta, cuentas);
        this.ingresoMensual = ingresoMensual;
        this.prestamo = prestamo;
    }

    public void setIngresomensual(Float ingresoMensual) {
        this.ingresoMensual = ingresoMensual;
    }

    public void setPrestamo(Float prestamo) {
        this.prestamo = prestamo;
    }

    public Float getIngresoMensual() {
        return ingresoMensual;
    }

    public Float getPrestamo() {
        return prestamo;
    }

    @Override
    public float calculoDePrestamo() {
        return prestamo = ingresoMensual * 10;
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
            ", ingresoMensual='" + getIngresoMensual() + "'" +
            ", prestamo='" + getPrestamo() + "'" +
            "}";
    }   
}
