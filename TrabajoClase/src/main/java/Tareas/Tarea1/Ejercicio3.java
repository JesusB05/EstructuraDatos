package Tareas.Tarea1;

public class Ejercicio3 {
    
    public static int[] devolver(int v[],int cont){
    
    if (cont <= v.length-1) {
        System.out.println("Dame un numero: ");
        v[cont] = new java.util.Scanner(System.in).nextInt();
        return devolver(v,cont+1);
            }
    return v;
    
}  
    public static int encontrarMax(int[] numeros,int indice,int max){
    if (indice != numeros.length) {
        if (numeros[indice] > max) {
            System.out.println("\n");
            System.out.print(max);
            System.out.print(" ");
            System.out.println(numeros[indice]);
            max = encontrarMax(numeros,indice + 1,numeros[indice]);   
        }
        else{
            System.out.println("\n");
            System.out.print(max);
            System.out.print(" ");
            System.out.println(numeros[indice]);
            max = encontrarMax(numeros,indice + 1,max);
        }
        
    }
    System.out.println("\n");
    return max;
}
}
