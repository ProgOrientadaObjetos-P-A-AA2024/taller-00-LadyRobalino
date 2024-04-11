
package paquete2;
import paquete3.Informacion;
import paquete4.Palabra;

public class Demo {
    public static void main(String[] args) {
        String cadena1 = Palabra.obtenerPalabra(); /* Primero ubicamos el nombre 
        de la clase que importamos anteriormente seguido de un punto,  
        despues el nombre de el metodo con sus parametros y al final punto y
        coma.*/
        int num = Informacion.obtenerHabitantes();
        System.out.printf("%s, una ciudad llena de arte y naturaleza con %d\n" 
                ,cadena1, num);
        
    }
    
}
