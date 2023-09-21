package sesion8;
import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n,suma=0,i,m;
        System.out.print("De que numero a que numero quieres hacer el sumatorio:");
        n=teclado.nextInt();
        m=teclado.nextInt();
        for(i=m; i<=n; i++){
        suma=suma+i;
        teclado.close();
        } 
        
        System.out.printf("Su sumatorio es %d",suma);
    }
}
