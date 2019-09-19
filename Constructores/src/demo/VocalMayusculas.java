

package demo;

/**
 *
 * @author ROBERT
 */
public class VocalMayusculas {
    
    char vocal_min;
    String vocal_may;
    
    public VocalMayusculas(char vocal_min){
        this.vocal_min=vocal_min;
    }
    
    public void mostrarVocalMinusculaIngresada(){
        System.out.println("La vocal minuscula ingresada es: "+vocal_min);
    }
    
    public void mostrarVocalMayusculas()
    {
        switch (vocal_min){
            case 'a' : vocal_may="en Mayusculas es : A"; 
            break;
            case 'e' : vocal_may="en Mayusculas es : E"; 
            break;
            case 'i' : vocal_may="en Mayusculas es : I"; 
            break;
            case 'o' : vocal_may="en Mayusculas es : O"; 
            break;
            case 'u' : vocal_may="en Mayusculas es : U"; 
            break;
            default: vocal_may="no se ingreso en minúscula o no es un dato correcto: Error!";
            break;
        }
        System.out.println("La vocal "+vocal_may);
        System.out.println("-----------------------------");
    }
    
}
