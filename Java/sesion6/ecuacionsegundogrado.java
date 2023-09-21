package sesion6;
import java.util.Scanner;

public class ecuacionsegundogrado {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a, b, c, resultado;
        System.out.print("Escribe 3 numeros");
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();

        resultado = (Math.pow(b, 2) - (4 * a * c));
        if (resultado >= 0) {
            System.out.printf("El resultado tiene esta solucion: %f", -b+Math.sqrt(resultado) / (2 * a));
            System.out.printf("El resultado tiene esta solucion: %f", -b-Math.sqrt(resultado) / (2 * a));
        } else if (resultado == 0) {
            System.out.printf("El resultado tiene esta solucion: %f", Math.sqrt(resultado) / (2 * a));
        } else {

            System.out.println("No tiene soluciones");
        }

        teclado.close();

    }
}