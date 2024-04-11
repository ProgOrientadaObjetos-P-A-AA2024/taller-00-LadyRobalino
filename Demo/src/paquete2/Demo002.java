package paquete2;

import java.util.Scanner;
import paquete3.Informacion;
import paquete4.Palabra;
import paquete1.Mensaje;

public class Demo002 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nume;
        int num = Informacion.obtenerHabitantes();
        String cadena1 = Mensaje.obtenerMensaje();
        /* Primero ubicamos el nombre 
        de la clase que importamos anteriormente seguido de un punto,  
        despues el nombre de el metodo con sus parametros y al final punto y
        coma.*/
        System.out.println("Ingrese un numero ENTRE 1 Y 5 para presentar la "
                + "cadena original, caso contrario se presentara en mayusculas:");
        nume = teclado.nextInt();
        if (nume == 1 || nume == 2 || nume == 3 || nume == 4 || nume == 5) {
            System.out.printf("%s con %d\n",
                     cadena1, num);
        } else {
            System.out.printf("%s CON %d\n",
                     cadena1.toUpperCase(), num);
        }
    }
}
