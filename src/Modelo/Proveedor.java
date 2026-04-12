package Modelo;


public class Proveedor extends Persona{
    private String producto;
    private String rubro;

    public Proveedor() {
    }

    public Proveedor(String nombre, String telefono, String direccion, String producto, String rubro) {
        super(nombre, telefono, direccion);
        this.producto = producto;
        this.rubro = rubro;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    
}
