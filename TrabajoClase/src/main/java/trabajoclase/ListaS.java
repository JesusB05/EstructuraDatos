package trabajoclase;

/**
 *
 * @author Jesús
 */
public class ListaS {

    private Node<Persona> cabeza;

    public ListaS() {
    }

    public void insertar(Persona value) {
        Node<Persona> nuevoNodo = new Node<Persona>(value);
        if (cabeza == null) {
            cabeza = nuevoNodo;

        } else if (cabeza.getValue().getId() > nuevoNodo.getValue().getId()) {
            nuevoNodo.setNext(cabeza);
            cabeza = nuevoNodo;
        } else if (cabeza.getValue().getId() < nuevoNodo.getValue().getId() && cabeza.getNext() == null) {
            cabeza.setNext(nuevoNodo);

        } else {
            Node<Persona> aux = cabeza;
            while (aux.getNext() != null && aux.getNext().getValue().getId() < nuevoNodo.getValue().getId()) {
                aux = aux.getNext();
            }
            nuevoNodo.setNext(aux.getNext());
            aux.setNext(nuevoNodo);
        }
    }

    public void imprimirLista() {
      Node<Persona> aux = cabeza;
      while(aux!=null){
          System.out.println(aux.getValue().toString());
          aux=aux.getNext();
      }
    }
    
    public void eliminarPersona(int idBuscado){
        boolean encuentra=false;
        
        if(cabeza==null){
            System.out.println("No hay datos en la lista");
        }else{
            Node<Persona> aux = cabeza;
            while(aux.getNext()!=null){
                if(aux.getNext().getValue().getId()==idBuscado){
                   System.out.println("Datos eliminados" + aux.getNext().getValue().toString());
                   aux.setNext(aux.getNext().getNext());
                   encuentra=true;
                }else{
                    aux=aux.getNext();
                }
            }
                if(encuentra==false){
                   System.out.println("No hay ninguna persona en la lista con el ID"); 
                }
            }
        }
}
