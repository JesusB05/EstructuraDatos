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
        /*Stack<Integer> Pila2 = new Stack<Integer>();
        Pila2.push(1);
        Pila2.push(2);
        Pila2.push(3);
        System.out.println(Pila2.encuentra(3));*/
        //Colas
       /*Queue<Integer> Cola = new Queue<Integer>();
        Cola.enqueue(1);
        Cola.enqueue(2);
        Cola.enqueue(4);
        System.out.println(Cola.dequeue());
        System.out.println(Cola.dequeue().getValue());*/
        
        
        //Llenar cola con 100 elementos
        /*Queue<Integer> prueba = new Queue<Integer>();
        for (int i = 0; i < 100; i++) {
            prueba.enqueue(i);
        }

        int temp = prueba.findbyindex(6).getValue();
        Queue<Integer> prueba2 = new Queue<Integer>();
        prueba2.enqueue(temp);
        for (int i = 0; i < 100; i++) {
            prueba2.enqueue(i);*/
        
         //-----Listas Simple-------
         /*ListaS Lista= new ListaS();
         Lista.insertar(new Persona(1, "P"));
         Lista.insertar(new Persona(2, "P"));
         Lista.insertar(new Persona(3, "P"));
         Lista.insertar(new Persona(5, "P"));
         Lista.insertar(new Persona(4, "P"));
         Lista.imprimirLista();
        Lista.eliminarPersona(3);*/
         
          //-----Listas Simple Circular-------
        /*ListaSimpleC Listac= new ListaSimpleC();
         Listac.insertar(new Persona(1, "P"));
         Listac.insertar(new Persona(4, "P"));
         Listac.insertar(new Persona(5, "P"));
         Listac.insertar(new Persona(2, "P"));
         Listac.imprimirLista();*/
         
         ListaDobleC Listadc= new ListaDobleC();
         Listadc.insertar(new Persona(1, "P"));
         Listadc.insertar(new Persona(4, "P"));
         Listadc.insertar(new Persona(5, "P"));
         Listadc.insertar(new Persona(2, "P"));
         Listadc.imprimirLista();
         //Listadc.existe(5);
         //Listadc.modifica(new Persona(5,"F"));
         Listadc.elimina(5);
         Listadc.imprimirLista();
         
      
        
        }
       

}
