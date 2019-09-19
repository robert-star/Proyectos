
package demo;

/**
 *
 * @author ROBERT
 */
public class Gaseosa {
    
    String sabor;
    int presentacion;
    String envase;
    
    public Gaseosa(String sabor, int presentacion, String envase){
        this.sabor=sabor;
        this.presentacion=presentacion;
        this.envase=envase;
    }
    public void mostrarDatos(){
        System.out.println("Sabor: "+sabor);
        System.out.println("Presentacion: "+presentacion);
        System.out.println("Envase: "+envase);
    }
}