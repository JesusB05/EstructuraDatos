
package trabajoclase;

/**
 *
 * @author Jesús
 */
public class Queue<T> {
    private Node<T> head;
    private Node<T> tail;
    
    public void enqueue(T value){
        Node<T> newNode = new Node<T>(value);
        if (head==null){
            head=newNode;
            tail=newNode;
        }else{
            tail.setNext(newNode);
            tail=newNode;
        }
    }
    
}
