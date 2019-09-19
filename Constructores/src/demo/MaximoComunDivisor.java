
package demo;

/**
 * Máximo común divisor
 * @author ROBERT
 */
 //Maximo Comun Divisor
public class MaximoComunDivisor {
    
    int n1,n2;
    
    public MaximoComunDivisor(int n1, int n2){
        this.n1=n1;
        this.n2=n2;
    }
        
    public void mostrarDatos()
    {
        System.out.println("1er Número Ingresado: "+n1);
        System.out.println("2do Número Ingresado: "+n2);
    }
    
    public void mostrarResultados()
    {
        while(n1!=n2){
            if(n1>n2){
                n1=n1-n2;
            }else{
                n2=n2-n1;
            }
        }
        System.out.println("el MCD es: "+n1);
        System.out.println("-----------------------");
    }
}