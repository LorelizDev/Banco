package Banco;

public class Prestamo {
    
    private Integer idPrestamo;
    private Float saldo;

    public Prestamo(){
    }

    public Prestamo(Integer idPrestamo, Float saldo) {
        this.idPrestamo = idPrestamo;
        this.saldo = saldo;
    }

    public void setidPrestamo(Integer idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public Integer getidPrestamo() {
        return idPrestamo;
    }

    public Float getSaldo() {
        return saldo;
    }


    @Override
    public String toString() {
        return "{" +
            " idPrestamo='" + getidPrestamo() + "'" +
            ", saldo='" + getSaldo() + "'" +
            "}";
    }

}

