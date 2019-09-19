
package demo;

/**
 *
 * @author ROBERT
 */
public class NumeroParImpar {
    
    int n;
    boolean r;
    
    public NumeroParImpar(int n)
    {
        this.n=n;
    }
    
    public void mostrarDato()
    {
        System.out.println("Número Ingresado: "+n);
    }
    
    public void mostrarResultado()
    {
        if(n%2==0){
            r=true;
        }else{
            r=false;
        }
        System.out.println("Resultado ¿Es Par?: "+r);
    }
}
