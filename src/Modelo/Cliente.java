package Modelo;

public class Cliente extends Persona{
    private String cuit;
    private String ciudad;

    public Cliente() {
    }
    
    public Cliente(String cuit, String ciudad, String nombre, String telefono, String direccion) {
        super(nombre, telefono, direccion);
        this.cuit = cuit;
        this.ciudad = ciudad;
    }   

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    
          
}
