
package trabajoclase;

/**
 *
 * @author Jesús
 */
public class Stack<T>{
    private Node<T> top;
    
    
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
            top=top.getNext();// se actualiza el top
         return pop_value.getValue(); //devuelve el valor que tiene la variable
         
        }else{
            return null; // si está vacia devuelve null
        }
    }
    
     public boolean encuentra(T x){
      boolean encontrar = false;
      
      while (encontrar != true && top != null){ //mientras encontrar sea diferente de true y top diferente de null sigue el ciclo
          if(x == top.getValue()){ // si x es igual al valor del top
              encontrar = true;
          }else{
              top = top.getNext(); // avanza al siguiente top
          }
      }
    return encontrar; // si no cumple con el fin devuelve false
    
    }
}
