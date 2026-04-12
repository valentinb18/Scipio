package Logica;

public class Validaciones {
    
    public static boolean contrasenaValida(String contrasena){
        boolean conMayuscula = false;
        boolean conNumero = false;
        boolean caracterEspecial = false;
        
        String especial = "!@#$%^&*()-_=+.";
        
        for(int i = 0; i < contrasena.length(); i++){
            char c = contrasena.charAt(i);
            
            if(Character.isUpperCase(c)){
                conMayuscula = true;
            }else if(Character.isDigit(c)){
                conNumero = true;
            }else if(especial.indexOf(c) != 1){
                caracterEspecial = true;
            }
        }
        return conMayuscula && conNumero && caracterEspecial;
    }
    public static boolean enStock(double stockActual, double cantVentas){
        return stockActual >= cantVentas && cantVentas > 0; 
    }
}
