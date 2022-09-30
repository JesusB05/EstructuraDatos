
package com.mycompany.tarea1;

public class Ejercicio4 {
    
    public static int sumar2(int num){
        if(num==1){
            System.out.println(num);
            return 1;
            
        } else {
            System.out.println(num);
            return num + sumar2(num-1);
        }
    }
    
    
}
