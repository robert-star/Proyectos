
package demo;

/**
 *
 * @author ROBERT
 */
public class Banco {
    
    private double capital;
    private double interes;
    private int periodos;
    private double importe;
    
    public Banco(double capital, double interes, int periodos){
        this.capital=capital;
        this.interes=interes;
        this.periodos=periodos;
    }
    
    public void mostrarDatos()
    {
        System.out.println("Capital: S/ "+capital);
        System.out.println("Interes: S/ "+interes);
        System.out.println("Perido: "+periodos);
        importe=Math.pow((capital*(1+interes)), periodos);
        System.out.println("El importe a pagar es: S/ "+importe);
        System.out.println("---------------------------");
    }
    
}
