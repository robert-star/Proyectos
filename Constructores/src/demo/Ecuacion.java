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
public class Ecuacion {
    private float a;
    private float b;
    private float c;
    
    public Ecuacion(float a, float b, float c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    /**
     * @return the a
     */
    public float getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(float a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public float getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * @return the c
     */
    public float getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(float c) {
        this.c = c;
    }
    
    public float discriminante(){
        float discriminante;
        discriminante = (float)Math.pow(this.getB(), 2)-4*this.getA()*this.getC();
        return discriminante;
    }
    
    public void restriccion(){
        if(this.discriminante()>0){
            System.out.println("Hay 2 soluciones reales distintas");
        }else if(this.discriminante()==0){
            System.out.println("Hay 2 soluciones reales iguales");
        }else if(this.discriminante()<0){
            System.out.println("No existe solucion real compleja");
        }
    }
    
    public float raiz1(){
        float raiz1;
        raiz1=(float)(((-this.getB())+(Math.sqrt(this.discriminante())))/(2*this.getA()));
        return raiz1;
    }
    
    public float raiz2(){
        float raiz2;
        raiz2=(float)(((-this.getB())-(Math.sqrt(this.discriminante())))/(2*this.getA()));
        return raiz2;
    }
}
