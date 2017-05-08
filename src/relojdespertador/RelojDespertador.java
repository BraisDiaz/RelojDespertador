
package relojdespertador;

import java.time.LocalTime;
import javax.swing.JOptionPane;

/**
 *
 * @author Brais Núñez
 */
public class RelojDespertador {

    static LocalTime horaActual, alarma;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                     
        int opcion;
//        int opcion2;
        
    do {

        opcion = Integer.parseInt(JOptionPane.showInputDialog("1.Configurar hora \n 2.Aumentar hora \n 3.Aumentar minutos \n 4 \n 5. \n 0.Salir"));

    switch(opcion){

        case 1:Botonera.configHr();
               
//                do{
//                    opcion2 = Integer.parseInt(JOptionPane.showInputDialog("1.Aumentar hora \n 2.Aumentar minutos \n 0.Salir"));
//                    
//                    switch(opcion2){
//                        
//                        case 1:Botonera.plusHr();
//                        
//                            break;
//                            
//                        case 2: Botonera.plusMin();
//                        
//                        default:
//                            
//                            break;
//                    }
//                    
//                }while(opcion2!=0);
            
            break;

        case 2:Botonera.plusHr(horaActual);

            break;

        case 3:Botonera.plusMin(horaActual);

            break;

        case 4:;

            break;
            
        case 5:;
        
            break;
        
        default:
            
            break;

    }

          }while(opcion!=0);
    }
        
        
        
    }
    

