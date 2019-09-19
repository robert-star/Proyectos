
package demo;

public class Persona {
    
    public String nombre;
    
    public Persona(String nombre)
    {
        this.nombre = nombre;
    }
    
    public void mostrarSaludo()
    {
        System.out.println("Hola: "+nombre+" bienvenido al curso de P.O.O");
    }
}
