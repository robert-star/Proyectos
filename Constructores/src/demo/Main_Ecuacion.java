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
public class Main_Ecuacion {
    public static void main(String[] args) {
        Ecuacion ecuacion01 = new Ecuacion(1,4,4);
        System.out.println("Coef a: "+ecuacion01.getA());
        System.out.println("Coef b: "+ecuacion01.getB());
        System.out.println("Coef c: "+ecuacion01.getC());
        System.out.println("-------------------------");
        System.out.println("Resultado: "+ecuacion01.discriminante());
        ecuacion01.restriccion();
        System.out.println("Raiz1: "+ecuacion01.raiz1());
        System.out.println("Raiz1: "+ecuacion01.raiz2());
    }
}
