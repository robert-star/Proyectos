
package demo;

public class Main_Robot {
    
    public static void main(String args[])
    {
        Robot robot01 = new Robot("número 17",2.50,450);
        robot01.mostrarDatosRobot();
        System.out.println("-----------------------");
        Robot robot02 = new Robot("número 18",2,350);
        robot02.mostrarDatosRobot();
    }
}
