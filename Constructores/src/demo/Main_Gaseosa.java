/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demo;
/**
 *
 * @author ROBERT
 */
public class Main_Gaseosa {
    
    public static void main(String args[])
    {
        Gaseosa gaseosa01 = new Gaseosa("Mandarina",500,"Vidrio");
        gaseosa01.mostrarDatos();
        System.out.println("-----------------------");
        Gaseosa gaseosa02 = new Gaseosa("Fresa",1,"Plastico");
        gaseosa02.mostrarDatos();       
    }
}
