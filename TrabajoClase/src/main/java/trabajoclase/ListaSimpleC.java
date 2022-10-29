package trabajoclase;

/**
 *
 * @author Jesús
 */
public class ListaSimpleC {
    private Node<Persona> cabeza;
    private Node<Persona> tail;

    public ListaSimpleC() {
    }
    
    public void insertar(Persona value) {
        Node<Persona> nuevoNodo = new Node<Persona>(value);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            tail= cabeza;
            tail.setNext(cabeza);

        } else if (cabeza.getValue().getId() > nuevoNodo.getValue().getId()) {
            nuevoNodo.setNext(cabeza);
            cabeza = nuevoNodo;
            tail.setNext(cabeza);
            
        } else if (cabeza.getValue().getId() < nuevoNodo.getValue().getId() && cabeza.getNext() == null) {
            cabeza.setNext(nuevoNodo);
            
        }else if(tail.getValue().getId() <= value.getId()){
            tail.setNext(nuevoNodo);
            tail=nuevoNodo;
            tail.setNext(cabeza); 

        } else {
            Node<Persona> aux = tail;
            while (aux.getNext().getValue().getId() < value.getId()) {
                aux = aux.getNext();
            }
            nuevoNodo.setNext(aux.getNext());
            aux.setNext(nuevoNodo);
        }
    }

    public void imprimirLista() {
      Node<Persona> aux = cabeza;
      while(aux!=tail){
          System.out.println(aux.getValue().toString());
          aux=aux.getNext();
      }
      System.out.println(tail.getValue().toString());
    }
}
