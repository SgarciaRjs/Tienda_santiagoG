package com.mycompany.practica1sem1;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class Practica1SEM1 {

    public static void main(String[] args) {
      
// Crea un metodo para leer los datos del usuario 
    Scanner entrada = new Scanner(System.in);
    
// Variables para almacenarlos datos
    String nombreTrabajador;
    double salarioSemanal;
    double salarioMensual;
    double deducciones;
    double salarioNeto;
    
// Constante para el valor de las deduciones
    final double PORCENTAJE_DEDUCCIONES = 9.34;
    
// Se solicita el nombre del trabajador
    System.out.print("Ingrese el nombre del trabajador: ");
        nombreTrabajador = entrada.nextLine();
 
// Calcular el salario semanal( 4 semanas en un mes )
     System.out.print("Ingrese el salario semanal ");
       salarioSemanal  = entrada.nextDouble();
       
// Calcula el salario mensual 
    salarioMensual = salarioSemanal * 4;
    
// Calcula las deducciones (9.34%)
    deducciones = salarioMensual * (PORCENTAJE_DEDUCCIONES / 100);
    
// Calcula el salario neto ( salario mensual - deducciones )
    salarioNeto = salarioMensual - deducciones;
    
// Mostar los resultados
    System.out.println("\n Estimado" + nombreTrabajador +
            ",el salario de este mes se muestra de la siguiente manera");
    System.out.println(" Salario bruto :" + salarioMensual);
    System.out.println(" deducciones :" + deducciones);
    System.out.println(" Salario Neto :" + salarioNeto);
    
// Se cierra el scanner
    entrada.close();

    }
}
