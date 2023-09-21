import java.util.Scanner;

public class encontrar2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Meter numero entero:");
        int n = teclado.nextInt();
        int digito = teclado.nextInt();
        while (n != 0) {
            if (n % 10 == digito) break;
            n = n / 10;
        }
        if (n != 0) System.out.println("El digito si esta contenido en el numero");
        else System.out.println("El digito no esta contenido en el numero");
        teclado.close();
    }
}
