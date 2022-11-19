package trabajoclase;

public class ListaDobleC {

    private Node<Persona> cabeza;
    private Node<Persona> tail;

    public void insertar(Persona value) {
        Node<Persona> nuevoNodo = new Node<Persona>(value);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            tail = cabeza;
            tail.setNext(cabeza);
            cabeza.setBack(tail);

        } else if (cabeza.getValue().getId() > nuevoNodo.getValue().getId()) {
            nuevoNodo.setNext(cabeza);
            cabeza = nuevoNodo;
            tail.setNext(cabeza);
            cabeza.setBack(tail);

        } else if (tail.getValue().getId() <= value.getId()) {
            nuevoNodo.setBack(nuevoNodo);
            tail.setNext(nuevoNodo);
            tail = nuevoNodo;
            tail.setNext(cabeza);
            cabeza.setBack(tail);

        } else {
            Node<Persona> aux = cabeza;
            while (aux.getNext().getValue().getId() < value.getId()) {
                aux = aux.getNext();
            }
            nuevoNodo.setNext(aux.getNext());
            aux.setNext(nuevoNodo);
            nuevoNodo.setBack(aux);
            aux.getNext().setBack(nuevoNodo);
            nuevoNodo.setBack(aux);

        }
    }

    public void imprimirLista() {
        Node<Persona> aux = cabeza;
        while (aux != tail) {
            System.out.println(aux.getValue().toString());
            aux = aux.getNext();
        }
        System.out.println(tail.getValue().toString());
    }

    public boolean existe(int id) {
        Node<Persona> aux = cabeza;
        boolean esta = false;
        if (cabeza == null) {
            System.out.println("No hay datos en la lista");
        } else if(tail.getValue().getId()==id){
            esta=true;
        }else {
            while (aux.getNext() != null && esta==false) {
                if (aux.getNext().getValue().getId() == id) {
                    esta = true;
                } else {
                    aux = aux.getNext();
                }
            }

        }
        return esta;
    }
    
     public void modifica(Persona p) {
      
        if (cabeza == null) {
            System.out.println("No hay datos en la lista");
        } else if(cabeza.getValue().getId() == p.getId()){
            cabeza.getValue().setNombre(p.getNombre());
        } else if(tail.getValue().getId() == p.getId()){
            tail.getValue().setNombre(p.getNombre());
        } else{
            Node<Persona> aux = cabeza;
            while (aux.getNext().getValue().getId() == p.getId() || aux.getNext()==cabeza) {
                    aux = aux.getNext();
                }
            if(aux.getNext().getValue().getId() == p.getId()){
                aux.getNext().getValue().setNombre(p.getNombre());
            }else{
                System.out.println("El ID no existe");
            }

        }
        
    }
     
     public void elimina(int value) {
        Node<Persona> aux=cabeza;
        if (cabeza == null) {
            System.out.println("No hay datos en la lista");
      
        }else{
           while(aux.getValue().getId() != value && aux.getNext() != cabeza){
              aux=aux.getNext(); 
        }
            if(aux.getValue().getId() == value){
            aux=aux.getNext();
            aux.setBack(aux.getBack().getBack());
            aux=aux.getBack();
            aux.setNext(aux.getNext().getNext());
            }else{
                System.out.println("El ID no existe");
            }    
}
}
}
