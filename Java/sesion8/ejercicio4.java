package sesion8;
import java.util.Scanner;
public class ejercicio4 {
  public static void main(String[]args){
   
    Scanner teclado = new Scanner(System.in);
    int base,exponente, i;
    int potencia = 1;
    System.out.print("Ingresa un numero y a lo que lo quieres elevar ");
    base = teclado.nextInt();
    exponente = teclado.nextInt();
    for(i = 1; i <= exponente; i++){
    
      potencia = potencia * base;
      teclado.close();
    }
    System.out.printf("Su potencia es %d",potencia);
        
    }
}
