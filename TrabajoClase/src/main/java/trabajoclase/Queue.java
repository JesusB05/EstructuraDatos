package trabajoclase;

/**
 *
 * @author Jesús
 */
public class Queue<T> {

    private Node<T> head;
    private Node<T> tail;

    public void enqueue(T value) {
        Node<T> newNode = new Node<T>(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    public Node<T> dequeue() {
        if (head == null) {
            System.out.println("La cola está vacia");
            return null;
        }else{
            Node<T> fistInQueue= head;
            head= head.getNext();
            return fistInQueue;
        }

    }

    public Node<T> findbyindex(int index) {
        if (head == null) {
            System.out.println("La cola está vacia");
            return null;

        } else {
            Node<T> temp = head;

            while (!temp.getNext().equals(null) && index != 0) {
                temp = temp.getNext();
                index--;
            }
            if (index == 0) {
                System.out.println("Se encontró el valor "+temp.getValue());
                return temp;
            } else {
                System.out.println("La cola no cuenta con esa cantidad de valores");
                return null;
            }
        }
    }

}
