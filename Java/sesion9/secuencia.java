import java.util.Scanner;

public class secuencia {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double numero;
    System.out.print("Secuencia de numeros:");
    numero = teclado.nextDouble();
    double min = 0;
    while (numero < 0) {

      if (numero < min) {

        min = numero;

      }

      numero = teclado.nextDouble();
    }
    System.out.printf("El numero mas pequeño es %f", min);
    teclado.close();
  }
}
