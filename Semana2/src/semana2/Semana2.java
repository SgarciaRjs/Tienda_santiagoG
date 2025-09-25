package semana2;

import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author santi
 */
public class Semana2 {

    /**
     1. Nota sea menor a 12 -> = no aprobo el examen
     2. Nota menor igual a 11 -> mensaje = no aprobo el examen
     3. Nota mayor a 11 y menor o igual a 20 -> mensaje = aprobo el mensaje
     4. Nota mayor a 11 
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Para votar tiene que ser mayor a 18");
        int Nota = entrada.nextInt();
     
        if (Nota <= 11)
                System.out.println("No aprobo el examen");
        
        if (Nota >= 12)
                System.out.println("aprobo el examen");
        
        if (Nota == 20)
                System.out.println("aprobo con la nota maxima");
        
        
    }
    
}
