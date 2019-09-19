

package demo;

/**
 *
 * @author ROBERT
 */
public class Factura {
    
    int numeroFactura;
    String fecha;
    String nombreCliente;
    
    public Factura(int numeroFactura, String fecha, String nombreCliente){
        this.numeroFactura=numeroFactura;
        this.fecha=fecha;
        this.nombreCliente=nombreCliente;
    }
    
    public void mostrarDatos()
    {
        System.out.println("El Número de Factura es: "+numeroFactura);
        System.out.println("Fecha Emitida: "+fecha);
        System.out.println("El Cliente es: "+nombreCliente);
        System.out.println("-----------------------------");
    }
}
