package Banco;

public abstract class Cliente {
    
    private Integer id;
    private String nombreCompleto;
    private String telefono;
    private String email;
    private String fechaDeAlta;
    private Cuenta[] cuentas;

    public Cliente(Integer id, String nombreCompleto, String telefono, String email, String fechaDeAlta, Cuenta[] cuentas) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
        this.email = email;
        this.fechaDeAlta = fechaDeAlta;
        this.cuentas = cuentas;
    }

    public Cliente(){

    }

    public void setId(Integer id) {
        this.id = id;
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

    public void setFechaDeAlta(String fechaDeAlta) {
        this.fechaDeAlta = fechaDeAlta;
    }

    public void setCuentas(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }

    public Integer getId() {
        return id;
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
    
    public String getFechaDeAlta() {
        return fechaDeAlta;
    }
    
    public Cuenta[] getCuentas() {
        return cuentas;
    }    
}
