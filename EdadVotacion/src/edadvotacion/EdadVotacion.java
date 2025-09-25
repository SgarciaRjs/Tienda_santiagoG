package edadvotacion;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class EdadVotacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Para votar tiene que sere mayor a 18");
        int edad = entrada.nextInt();
        
        if (edad <= 18){
                 System.out.println("No puede votar");
                 
        }
        
        if (edad >= 18){
                 System.out.println("puede votar");
        }
    }
}
