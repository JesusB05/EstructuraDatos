
package trabajoclase;

/**
 *
 * @author Jesús
 */
public class Stack<T>{
    private Node<T> top;
    
    
    public void push(T value){
      Node<T> newNode = new Node<T>(value);
      if(top==null){
          top=newNode;
      }else{
          newNode.setNext(top);
          top=newNode;
      }
    }
    public T pop(){
        Node<T> pop_value = top;
        if(top!=null){
            top=top.getNext();
         return pop_value.getValue();
         
        }else{
            return null;
        }
    }
    
     public boolean encuentra(T x){
      boolean encontrar = false;
      
      while (encontrar != true && top != null){
          if(x == top.getValue()){
              encontrar = true;
          }else{
              top = top.getNext();
          }
      }
    return encontrar;
    
    }
}
