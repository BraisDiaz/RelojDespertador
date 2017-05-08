
package relojdespertador;

import java.sql.Time;
import javax.swing.JOptionPane;

/**
 *
 * @author Brais Núñez
 */
public class RelojDespertador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Time horaActual, alarma;
        
        int opcion;
        int opcion2;
    do {

        opcion = Integer.parseInt(JOptionPane.showInputDialog("1.Configurar Hora \n 2. \n 3. \n 4 \n 5. \n 0.Salir"));

    switch(opcion){

        case 1:Botonera.configHr();
               
                do{
                    opcion2 = Integer.parseInt(JOptionPane.showInputDialog("1.Aumentar hora \n 2.Aumentar minutos \n 0.Salir"));
                    
                    switch(opcion2){
                        
                        case 1:Botonera.plusHr();
                        
                            break;
                            
                        case 2: Botonera.plusMin();
                        
                        default:
                            
                            break;
                    }
                    
                }while(opcion2!=0);
            
            break;

        case 2:Botonera.plusHr();

            break;

        case 3:Botonera.plusMin();

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
    

