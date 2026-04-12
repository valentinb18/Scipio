package Logica;
import Modelo.Usuario;
import java.util.ArrayList;

public class GestionarUsuarios {
    private static ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    
    public static Usuario verificar(String nombre, String contra){
        for(Modelo.Usuario u : Logica.Datos.listadoUsuarios){
            if(u.getNombreUsuario().equalsIgnoreCase(nombre) && u.getContrasena().equals(contra)){
                return u;
            }
        }
        return null;
    }
}
