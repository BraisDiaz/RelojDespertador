
package relojdespertador;

/**
 *
 * @author Brais Núñez
 */

/**
* Contiene métodos para mostrar horas, minutos y encender y apagar los distintos led.
*/
public class Display {
    
    boolean ledClock, ledAlarm, ledSet;

    
    /**
    * Muestra la hora y minutos actuales.
    */
    public static void showHr(){
        
        System.out.println("Mostraría la hora y minutos actuales");
        
    }
    
    /**
    * Enciende los distintos led y actualiza el valor de cada uno de ellos.
    * @param showClock si está en true se enciende el led del reloj, false se apaga.
    * @param showAlarm si está en true se enciende el led de la alarma, false se apaga.
    * @param showSet si está en true se enciende el led del set, false se apaga.
    */
    public static void showLeds(boolean showClock, boolean showAlarm, boolean showSet){
        
    }    
}
