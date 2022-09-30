package Tareas.Repaso;

import javax.swing.JOptionPane;

/**
 *
 * @author Jesús
 */
// Esta sería una clase publica
public class Persona {

    // Estos son los atributos, en este ejemplo se usaron las private, public y protected
    private String nombre;
    protected String nacionalidad;
    public String cedula;
    private int edad;

    // Este es un constructor ya estan inicializados los valores de los atributos
    public Persona(String nombre, String nacionalidad, String cedula, int edad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.cedula = cedula;
        this.edad = edad;
    }

    // Este es otro constructor que es vacio
    public Persona() {
        this.nombre = "";
        this.nacionalidad = "";
        this.cedula = "";
        this.edad = 0;
    }

    // Estos son los Get y Set 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Estos son los metodos para realizar procesos
    public void pedir_datos() {
        this.cedula = JOptionPane.showInputDialog(null, "Digite su cedula");
        this.nombre = JOptionPane.showInputDialog(null, "Digite el nombre");
        this.nacionalidad = JOptionPane.showInputDialog(null, "Digite su nacionalidad");
        this.edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite su edad"));
    }

    public void mostrar_info() {

        JOptionPane.showMessageDialog(null, "La cédula es: " + this.cedula
        + ", su nombre es: " + this.nombre + ", su nacionalidad es: " + this.nacionalidad + " y su edad: " + this.edad);

    }

}
