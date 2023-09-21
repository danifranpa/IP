package examen1;

import java.util.Scanner;

public class pruebas {
  public static boolean encontrarlo(int x) {
    int z = 4;
    while (x > 4 && x < 14) {
      if (x % 2 == 0 && x % z == 0)
        return true;
      z = z + 1;
    }
    return false;

  }

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.printf("Meter numero entero:");
    int num = teclado.nextInt();
    if (encontrarlo(num))
      System.out.printf("Si hay un número par divisor de %d en el intervalo [4,14]", num);
    else
      System.out.printf("No hay un número par divisor de %d en el intervalo [4,14]", num);
    teclado.close();
  }

}
