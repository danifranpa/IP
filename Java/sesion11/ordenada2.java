import java.util.Scanner;

public class ordenada2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Secuencia de numeros:");
        int numanterior = teclado.nextInt();
        int n = teclado.nextInt();
        while ((n > 0) && (n > numanterior)) {
            // Sgte par
            numanterior = n;
            n = teclado.nextInt();
        }
        if (n > 0)
            System.out.println("La secuencia NO está ordenada en orden ascendente");
        else
            System.out.println("La secuencia está ordenada en orden ascendente");
        teclado.close();
    }

}

