package sesion5;
import java.util.Scanner;

public class aceleracion {
    public static void main(String[] args) {

    double tiempo;
    Scanner teclado= new Scanner(System.in);
    System.out.print("Ingrese el tiempo a tardar: ");
    tiempo=teclado.nextDouble();
    double aceleracion;
    aceleracion=((100*1000)/3600)/tiempo;
    System.out.printf("Con tiempo %f su aceleracion sera %f", tiempo,aceleracion);
    teclado.close();
}
}



