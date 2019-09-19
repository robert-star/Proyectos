

package demo;

import javax.swing.JOptionPane;

/**
 *
 * @author ROBERT
 */
public class OperacionesMatematicasBasicas {
    //Atributos
    double n1;
    double n2;
    
    //Métodos
    public void leernumeros()
    {
        n1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese 1er número: ", "Operaciones de Matematicas Basicas",JOptionPane.PLAIN_MESSAGE));
        n2=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese 2do número: ", "Operaciones de Matematicas Basicas",JOptionPane.PLAIN_MESSAGE));
    }
    
    public double mostrarSuma()
    {
        return n1+n2;
    }
            
    public double mostrarResta()
    {
        return n1-n2;
    }

    public double mostrarMultiplicacion()
    {
        return n1*n2;
    }

    public double mostrarDivision()
    {
        return Math.rint(n1/n2*100d)/100;
    }
    
    public void mostrarResultado()
    {
        JOptionPane.showMessageDialog(null,
        "Los numeros ingresados son: "+this.n1+" y "+this.n2+"\n"+
        "-----------------------------\n"+
        "La suma es: "+this.mostrarSuma()+"\n"+
        "La resta es: "+this.mostrarResta()+"\n"+
        "La multiplicación es: "+this.mostrarMultiplicacion()+"\n"+
        "La división es: "+this.mostrarDivision()+"\n"+
        "-----------------------------",
        "Los Resultados son:",
        JOptionPane.PLAIN_MESSAGE);
    }
}
