import java.util.Scanner;

public class ordenada3 {
    public static boolean secuencia(Scanner t) {
        System.out.print("Secuencia de numeros:");
        int numanterior = t.nextInt();
        int n = t.nextInt();
        while (n > 0) {
            if (n < numanterior)
            return false;
            numanterior = n;
            n = t.nextInt();

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        if (secuencia(teclado))
            System.out.println("La secuencia está ordenada en orden ascendente");
        else
            System.out.println("La secuencia NO está ordenada en orden ascendente");
        teclado.close();
    }
}