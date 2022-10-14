
package Tareas.Tarea2;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //------Recursividad-------
        //Recursividad r = new Recursividad();
        //System.out.println(r.factorial2(3));
        //System.out.println(Recursividad.calc(1, 5));
        
        //------Pilas-------
        Pila<String> pila = new Pila<String>();
        pila.push("Polo, " + "Rojo, " + "Costa Rica, "+ "Lacoste, "+ "Talla: S");
        pila.push("Sport, " + "Azul, " + "Costa Rica, " + "Puma, "+ "Talla: M");
        pila.push("Formal, " + "verde, " + "Costa Rica, " + "Lacoste, "+ "Talla: L");
        
        System.out.println(pila.pop());
        System.out.println(pila.pop());
        System.out.println(pila.pop());
        System.out.println("El total de tallas son: "+ pila.talla);
        
        
        //-----Colas--------
        
    }
    
    
}
