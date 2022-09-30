
package Tareas.Tarea1;

public class Ejercicio2 {
    
    public static int palabra2(int contador){
       String s= "mañana";
       
       if(contador==5){
          System.out.println(s.charAt((contador)));
          return 0;
           
       }else{
           
        System.out.println(s.charAt((contador)));
        contador ++;
        return palabra2(contador);
    }
    }
}
