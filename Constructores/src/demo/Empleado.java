
package demo;

/**
 *
 * @author ROBERT
 */
public class Empleado {
    
    String nombre;
    String cargo;
    double sueldo;
    
    public Empleado(String nombre, String cargo, double sueldo){
        this.nombre=nombre;
        this.cargo=cargo;
        this.sueldo=sueldo;
    }
    
    public void mostrarDatos()
    {
        System.out.println("Nombre: "+nombre);
        System.out.println("Cargo: "+cargo);
        System.out.println("Sueldo: "+sueldo);
        System.out.println("---------------------------");
    }
    
}
