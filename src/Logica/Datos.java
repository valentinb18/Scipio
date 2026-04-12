package Logica;
import Modelo.*;
import java.util.ArrayList;

public class Datos {
    public static ArrayList<Producto> listadoLubricantes = new ArrayList<>();
    public static ArrayList<Cliente> listadoClientes = new ArrayList<>();
    public static ArrayList<Proveedor> listadoProveedores = new ArrayList<>();
    public static ArrayList<Venta> listadoVentas = new ArrayList<>();
    public static ArrayList<Usuario> listadoUsuarios = new ArrayList<>();
    static{
        listadoUsuarios.add(new Usuario("valentin", "Valentin898_", "Administrador"));
    }
}
