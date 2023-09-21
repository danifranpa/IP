import java.util.Scanner;

public class secuencia2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numero;
        System.out.print("Secuencia de numeros:");

        numero = teclado.nextDouble();
        int posicion = 1;

        double producto = 1;
        while (numero != 0) {

            if (posicion % 2 == 0)
                producto = numero * producto; 
        

        numero = teclado.nextDouble();
        posicion = posicion + 1;
        }
        System.out.printf("Tu producto es %f", producto);
        teclado.close();

    }

}