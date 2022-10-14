
package Tareas.Tarea2;

public class Pila<T>{
    private Node<T> top;
    int talla=0;
    
    public void push(T value){
      Node<T> newNode = new Node<T>(value);//Nuevo nodo con el valor null
      if(top==null){
          top=newNode;//Si el top null ese top es el nuevo top
      }else{
          newNode.setNext(top);// El nuevo nodo se le asigna el valor del siguiente
          top=newNode;//el top va hacer el nuevo nodo.
      }
    }
    public T pop(){ //va a retornar cualquier tipo
        Node<T> pop_value = top; //auxiliar tipo nodo donde guarda el valor del viejo top
        if(top!=null){
            talla++;
            top=top.getNext();// se actualiza el top
            
         return pop_value.getValue(); //devuelve el valor que tiene la variable
         
        }else{
            System.out.println("No hay productos en la pila de camisas");
            return null; // si está vacia devuelve null
            
        }
    }   
        
}
