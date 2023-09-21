package sesion6;
import java.util.Scanner;

public class valorpositivo {
    public static double valorpositivo1(double numero1) {

        if (numero1 > 50) {
            return numero1*2;
        }
        else if (numero1 > 0 ){ 
            return numero1*3;
        }
        else {
            return numero1;
        }
    }


public static void main(String[] args) {
    Scanner teclado= new Scanner(System.in);
    double numero;
    System.out.print("El numero");
    numero=teclado.nextDouble();
    System.out.printf("Tu numero sera %f",valorpositivo1(numero));
    teclado.close();
}
    }