package trabajoclase;

/**
 *
 * @author Jesús
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //-----Recursividad----
        int[] arr = {12, 43, 64, 2, 3};
        //System.out.println(Recursividad.factorial(3));
        //System.out.println(Recursividad.encontrarMax(arr,1,arr[0]));

        //-----Pilas--------
        /*Stack<Integer> Pila = new Stack<Integer>();
        Pila.push(1);
        Pila.push(2);
        Pila.push(3);
        System.out.println(Pila.pop());
        System.out.println(Pila.pop());
        System.out.println(Pila.pop());
        System.out.println(Pila.pop());*/
        
        //Ejercicio 3 pilas
        Stack<Integer> Pila2 = new Stack<Integer>();
        Pila2.push(1);
        Pila2.push(2);
        Pila2.push(3);
        System.out.println(Pila2.encuentra(3));
    }

}
