
package relojdespertador;

import java.time.LocalTime;

/**
 *
 * @author Brais Núñez
 */

/**
 * Contiene los métodos para manejar la alarma, las horas y los minutos.
 */
public class Botonera {
    
    boolean alarmaActiva, setHr, setAlarma;
      
    /**
     * Activa la alarma.
     */
    public static void alarmaOn(){
        
    }
    /**
     * Desactiva la alarma.
     */
    public static void alarmaOff(){
        
    }
    /**
     * Entra en la configuración de la hora.
     */
    public static void configHr(){
        
        Display.showLeds(true, false, true);
        Display.showHr();
        
    }
    /**
     * Entra en la configuración de la alarma.
     */
    public static void configAlarma(){
        
    }
    /**
     * Aumenta los minutos.
     * @param auxHr recibe la hora actual de la hora local
     */
    public static void plusHr(LocalTime auxHr){
      
        auxHr.plusHours(1);
        Display.showHr();
        RelojDespertador.horaActual.plusHours(1);
       
    }
    /**
     * Aumenta las horas.
     * @param auxMin recibe los minutos actuales de la hora local
     */
    public static void plusMin(LocalTime auxMin){
        
        auxMin.plusMinutes(1);
        Display.showHr();
        RelojDespertador.horaActual.plusMinutes(1);
        
    }
    /**
     * Para la alarma.
     */
    public static void stopAlarma(){
        
    }    
}
