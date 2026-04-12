package Modelo;

public class Usuario {
    private String nombreUsuario;
    private String contrasena;
    private String rango;

    public Usuario() {
    }

    public Usuario(String nombreUsuario, String contrasena, String rango) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.rango = rango;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }
    
    
}
