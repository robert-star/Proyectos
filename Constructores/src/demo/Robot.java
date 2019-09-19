
package demo;

/**
 *
 * @author ROBERT
 */
public class Robot {
    
    private String nombre;
    private double altura;
    private double peso;
    
	//Constructor
    public Robot(String nombre, double altura, double peso)
    {
        this.nombre=nombre;
        this.altura=altura;
        this.peso=peso;
    }
    
    public void mostrarDatosRobot()
    {
        System.out.println("Hola soy el robot: "+nombre);
        System.out.println("Mido: "+altura+" m");
        System.out.println("Peso: "+peso+" k");
    }    
}
