
package practicasemana4java;

import java.util.Scanner;

public class PracticaSemana4Java {

    public static void main(String[] args) {
        
    boolean contrato;
    
    Info_Trabador trabaj = new Info_Trabador();
    
    Scanner leer = new Scanner(System.in);
    
        System.out.println("El contrato del docente es :");
        trabaj.setTipoContrato(leer.hasNextBoolean());
        
       contrato = trabaj.tipoContrato();
       
        System.out.println(""+contrato);
    }
    
}
