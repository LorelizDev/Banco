package Banco;

public class Cuenta {
    
    private Integer idCuenta;
    private Boolean status;
    private Float balance;

    public Cuenta(){
    }

    public Cuenta(Integer idCuenta, Boolean status, Float balance) {
        
        this.idCuenta = idCuenta;
        this.status = status;
        this.balance = balance;
    }

    public void setidCuenta(Integer idCuenta) {
        this.idCuenta = idCuenta;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    public Integer getIdCuenta() {
        return idCuenta;
    }

    public Boolean getStatus() {
        return status;
    }

    public Float getBalance() {
        return balance;
    }


    @Override
    public String toString() {
        return "{" +
            " idCuenta='" + getIdCuenta() + "'" +
            ", status='" + getStatus() + "'" +
            ", balance='" + getBalance() + "'" +
            "}";
    }

}
