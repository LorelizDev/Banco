package Banco;

public class Cuenta {
    
    private Integer id;
    private Boolean status;
    private Float balance;

    public Cuenta(Integer id, Boolean status, Float balance) {
        
        this.id = id;
        this.status = status;
        this.balance = balance;
    }

    public Cuenta(){
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    public Integer getId() {
        return id;
    }

    public Boolean getStatus() {
        return status;
    }

    public Float getBalance() {
        return balance;
    }
}
