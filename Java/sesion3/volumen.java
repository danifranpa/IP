package sesion3;
import java.util.Scanner;
public class volumen {
    
    public static void main(String[ ] args) {
        double valor;
        final double pi=3.1416;
        Scanner teclado= new Scanner(System.in);
        System.out.print("Introduce el valor : ");
        valor=teclado.nextDouble();
        double resultado;
        resultado=4.0/3.0*pi*Math.pow(valor, 3);

    
        System.out.printf("El volumen de la esfera de radio %f es %f",valor, resultado);
            teclado.close();
        }
}
