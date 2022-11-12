package Tareas.Tarea3;

public class Ejercicio2<T> {

    private Node<Integer> cabeza;
    private Node<Integer> tail;

    public void insertar(Integer value) {
        Node<Integer> nuevoNodo = new Node<Integer>(value);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            tail = cabeza;
            tail.setNext(cabeza);

        } else if (cabeza.getValue() > nuevoNodo.getValue()) {
            nuevoNodo.setNext(cabeza);
            cabeza = nuevoNodo;
            tail.setNext(cabeza);

        } else if (cabeza.getValue() < nuevoNodo.getValue() && cabeza.getNext() == null) {
            cabeza.setNext(nuevoNodo);

        } else if (tail.getValue() <= value) {
            tail.setNext(nuevoNodo);
            tail = nuevoNodo;
            tail.setNext(cabeza);

        } else {
            Node<Integer> aux = tail;
            while (aux.getNext().getValue() < value) {
                aux = aux.getNext();
            }
            nuevoNodo.setNext(aux.getNext());
            aux.setNext(nuevoNodo);
        }
    }

    public void imprimirLista() {
        Node<Integer> aux = cabeza;
        while (aux != tail) {
            System.out.println(aux.getValue());
            aux = aux.getNext();
        }
        System.out.println(tail.getValue());
    }

    public void eliminar(int valorbuscado) {
        Node<Integer> aux = cabeza;
        boolean encuentra = false;
        if (cabeza == null) {
            System.out.println("No hay datos en la lista");

        } else {
            while (aux.getNext() != null && encuentra == false) {
                if (tail.getValue() == valorbuscado) {
                    tail.setValue(null);
                    aux = tail;
                    tail.setNext(cabeza);
                    encuentra = true;
                } else {
                    aux = aux.getNext();
                }
            }if (encuentra==true) {
                    System.out.println("Se elimino el ultimo valor que coincide con la busqueda");
                   
                }else if(encuentra==false){
                    System.out.println("No se puede eliminar el ultimo valor porque no coincide con el buscado"); 
                }

            }
            
        }
        
    }
    
