package Logica;
import java.util.*;

public interface Repositorio<T>{
    void insertar(T objeto);
    void eliminar(int id);
    ArrayList<T> listarTodo();
    T buscarPorId(int id);
}
