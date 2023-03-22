package Banco;

public class ClienteB extends Cliente implements ClienteService {
    
    private Float ingresoMensual;
    private Float prestamo;
    
    public ClienteB() {
    }

    public ClienteB(Integer id, String nombreCompleto, String telefono, String email, String fechaDeAlta, Cuenta[] cuentas,Float ingresoMensual, Float prestamo) {
        
        super(id, nombreCompleto, telefono, email, fechaDeAlta, cuentas);
        this.ingresoMensual = ingresoMensual;
        this.prestamo = prestamo;
    }

    public void setIngresomensula(Float ingresoMensual) {
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
        return prestamo = ingresoMensual * 5;
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
