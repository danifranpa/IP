package sesion13;
import java.util.Scanner;
public class escalera {
    
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    for (int i = 1; i <= 6; i++) {
      for (int j = 1; j <= i; j++) {

        System.out.print("*");
      }
      System.out.println("");
    }
teclado.close();
  }
}
