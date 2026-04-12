package Logica;
import Modelo.Producto;
import java.util.ArrayList;

public class Inventario extends javax.swing.JFrame{
    
    private static ArrayList<Producto> listaDeProductos = new ArrayList<>();
    
    public static void agregar(Producto p){
        listaDeProductos.add(p);
    }
    
    public static ArrayList<Producto> obtenerListaDeProductos(){
        return listaDeProductos;
    }
    
    public static Producto busquedaPorID(int idBusqueda){
        for(Producto p : listaDeProductos){
            if(p.getId().equals(idBusqueda)){
                return p;
            }
        }
        return null;
    }
    
    public static ArrayList<Producto> busquedaPorNombre(String nombreBusqueda){
        ArrayList<Producto> busqueda = new ArrayList<>();
        for(Producto p : listaDeProductos){
            if(p.getNombre().toLowerCase().contains(nombreBusqueda.toLowerCase())){
                busqueda.add(p);
            }
        }
        return busqueda;
    }
}
