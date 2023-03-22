package Banco;

public class Prestamo {
    
    private Integer id;
    private Float total;
    private Float saldo;

    public Prestamo(Integer id, Float total, Float saldo) {
        this.id = id;
        this.total = total;
        this.saldo = saldo;
    }
    
    public Prestamo(){
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public Integer getId() {
        return id;
    }

    public Float getTotal() {
        return total;
    }

    public Float getSaldo() {
        return saldo;
    }
}
