
package com.mycompany.tarea1;
        
public class Ejercicio1 {
 
     public static String invertirNumeroString(int num) {
        if (num < 10) {
            return String.valueOf(num);
        } else {
            return String.valueOf(num % 10) + invertirNumeroString(num / 10);
        }
    }
}

