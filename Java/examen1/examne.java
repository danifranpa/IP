package examen1;
import java.util.Scanner;

public class examne {
    public static boolean encontrarlo(Scanner t) {
        System.out.println("Secuencia de numeros:");
        int num = t.nextInt();
        while (num >= 0) {
            if (num % 2 == 1 || num % 5 == 0)
                return true;
            num = t.nextInt();

        }
        return false;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        if(encontrarlo(teclado))
        System.out.println("Multiplo");
        else
            System.out.println("No multiplo");
        teclado.close();
}
}