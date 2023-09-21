package sesion8;
import java.util.Scanner;
public class ejercicio3 {
  public static void main(String[]args){
   
    Scanner teclado = new Scanner(System.in);
    int numero, i;
   
    System.out.print("Ingresa un numero para sacar su tabla de multipicar: ");
    numero = teclado.nextInt();
   
    for(i = 0; i <= 10; i++){
      teclado.close();
    System.out.println(numero+"*"+i+"="+numero*i);
    }
    }
}
