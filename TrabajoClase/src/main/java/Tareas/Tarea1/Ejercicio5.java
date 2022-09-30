package Tareas.Tarea1;

public class Ejercicio5 {

    public static int tablamultiplicar(int num) {
        int tabla= 2;
        if (num == 0) {
            System.out.println("Fin de la tabla");
            return 0;

        } else {
            System.out.println(tabla + "x" + num + "=" + tabla*num);
            tabla++;
            return tablamultiplicar(num-1);
        }

    }
}
