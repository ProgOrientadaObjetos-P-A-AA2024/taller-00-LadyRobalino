
package paquete1;

import paquete4.Palabra;

public class Mensaje {

    public static String obtenerMensaje() {
        return String.format("%s, una ciudad llena de arte y naturaleza", Palabra.obtenerPalabra());
    }
}
