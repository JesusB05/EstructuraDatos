
package Tareas.Tarea2;

public class Recursividad {
    
     public static double calc(double x, int n){
        if(n==0){
            return 1;
        }else{
            return Math.pow(-1, n)*Math.pow(x, 2 * n)/factorial(2*n)+calc(x,n-1); 
        }
    }
    
      public static int factorial(int n){
        if(n<=1){
           return 1; 
        }
        else{
          return n * factorial(n-1);  
        }
        
    }
}
