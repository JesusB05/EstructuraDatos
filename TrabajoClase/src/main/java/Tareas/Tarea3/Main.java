package Tareas.Tarea3;

public class Main {
    public static void main(String[] args) {
         //Ejercicio Lista Simple
         /*Ejercicio1 Lista= new Ejercicio1();
         Lista.insertar(1);
         Lista.insertar(3);
         Lista.insertar(5);
         Lista.insertar(6);
         Lista.insertar(8);
         Lista.imprimirLista();
         Lista.buscar(5);*/
         
         //Ejercicio Lista circular
         Ejercicio2 ListaC= new Ejercicio2();
         ListaC.insertar(1);
         ListaC.insertar(3);
         ListaC.insertar(5);
         ListaC.insertar(6);
         ListaC.insertar(8);
         ListaC.imprimirLista();
         ListaC.eliminar(8);
         ListaC.imprimirLista();
         
    }
    
}
