package Tareas.Tarea3;

import trabajoclase.*;

/**
 *
 * @author Jesús
 */
public class Node<T> {
    private T value; //el valor que se va usar y la T es un atributo de cualquier tipo
    private Node<T> next; // sería el siguiente valor.

    public Node() {
    }

    public Node(T value) {
        this.value = value;
    }
 
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
    
}
