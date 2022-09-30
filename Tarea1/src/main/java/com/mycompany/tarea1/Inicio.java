package com.mycompany.tarea1;

import static com.mycompany.tarea1.Ejercicio1.invertirNumeroString;
import static com.mycompany.tarea1.Ejercicio3.devolver;
import static com.mycompany.tarea1.Ejercicio5.tablamultiplicar;
import java.util.Scanner;

public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejercicio 1
       /* int num; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número que desea invertir: ");
        num = sc.nextInt();
        sc.close();
        System.out.println("El número de forma invertida es:" + invertirNumeroString(num)); */

        //Ejercicio 2 
        //System.out.println(Ejercicio2.palabra2(0));
        
        
        //Ejercicio 3
       /*System.out.println("Digite el tamaño: ");
        int tamaño = new java.util.Scanner(System.in).nextInt();
        int vector[] = new int[tamaño];

        int vector2[] = devolver(vector, 0);
        for (int i = 0; i < vector2.length; i++) {
            System.out.println(vector2[i]);
        }
       System.out.println(Ejercicio3.encontrarMax(vector, tamaño, vector[0]));*/

        
        //Ejercicio 4
        //System.out.println(Ejercicio4.sumar2(12));
        
        //Ejercicio 5
        System.out.println(tablamultiplicar(10));
    }
}
