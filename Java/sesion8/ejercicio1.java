package sesion8;
import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, suma=0, i;
        System.out.print("Que numero quieres hacer el sumatorio:");
        numero=teclado.nextInt();
        for(i=0; i<=numero; i++){
        suma=suma+i;
        teclado.close();
        } 
        
        System.out.printf("Su sumatorio es %d",suma);
    }
}