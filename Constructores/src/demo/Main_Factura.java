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
public class Main_Factura {
    
    public static void main(String args[]){
        Factura factura01 = new Factura(9998,"29/08/2019","UGEL HUÁNUCO");
        factura01.mostrarDatos();
        Factura factura02 = new Factura(9999,"30/08/2019","DIRESA HUÁNUCO");
        factura02.mostrarDatos();
    }
}
