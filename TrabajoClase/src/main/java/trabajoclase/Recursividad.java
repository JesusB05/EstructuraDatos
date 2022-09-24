package trabajoclase;

/**
 *
 * @author Jesús
 */
public class Recursividad {
    
    static int[] arr= {12,43,64,2,3};
    
    public static int factorial(int n){
        if(n==0){
           return 1; 
        }
        else{
            System.out.println(n);
          return n * factorial(n-1);  
        }
        
    }
    
    public static int encontrarMax(int[] numeros,int indice, int max){
        if(indice!=numeros.length){
            
            if(numeros[indice]>max){
                System.out.println("\n");
                System.out.println(max);
                System.out.println(numeros[indice]);
                max=encontrarMax(numeros,indice + 1,numeros[indice]);
            }
            else{
                System.out.println("\n");
                System.out.println(max);
                System.out.println(numeros[indice]);
                max=encontrarMax(numeros,indice + 1,max);
            }
            
        }
        System.out.println("\n");
        return max;
    }
    
}
