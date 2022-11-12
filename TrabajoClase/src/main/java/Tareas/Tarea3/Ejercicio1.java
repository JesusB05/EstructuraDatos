package Tareas.Tarea3;

public class Ejercicio1 {

    private Node<Integer> cabeza;

    public Ejercicio1() {
    }

    public void insertar(Integer value) {
        Node<Integer> nuevoNodo = new Node<Integer>(value);
        if (cabeza == null) {
            cabeza = nuevoNodo;

        } else if (cabeza.getValue() > nuevoNodo.getValue()) {
            nuevoNodo.setNext(cabeza);
            cabeza = nuevoNodo;
        } else if (cabeza.getValue() < nuevoNodo.getValue() && cabeza.getNext() == null) {
            cabeza.setNext(nuevoNodo);

        } else {
            Node<Integer> aux = cabeza;
            while (aux.getNext() != null && aux.getNext().getValue() < nuevoNodo.getValue()) { //valida todos los datos para acomodar los datos
                aux = aux.getNext();
            }
            nuevoNodo.setNext(aux.getNext());
            aux.setNext(nuevoNodo);
        }
    }

    public void buscar(Integer valorbuscado) {
        boolean encuentra = false;
        Node<Integer> aux = cabeza;
        if (cabeza == null) {
            System.out.println("No hay datos en la lista");

        } else {

            while (aux.getNext() != null && encuentra == false) {
                if (aux.getValue()== valorbuscado||aux.getNext().getValue()== valorbuscado) {
                    encuentra = true;
                } else {
                    aux = aux.getNext();
                }
            }if(aux.getNext()==null){
                System.out.println("No se econtro el valor buscado");
            
            }else if(aux.getValue() ==valorbuscado){
                System.out.println("Se encontro el valor:" + aux.getValue());
                System.out.println("No hay un valor anterior");
                
            }else{
                System.out.println("Se encontro el valor:" + aux.getNext().getValue());
                System.out.println("El valor anterior al buscado es:" + aux.getValue());
            }
        }
        }
    

    public void imprimirLista() {
        Node<Integer> aux = cabeza;
        while (aux != null) {
            System.out.println(aux.getValue());
            aux = aux.getNext();
        }
    }
  
}
