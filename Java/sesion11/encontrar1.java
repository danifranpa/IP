import java.util.Scanner;

public class encontrar1 {
    public static boolean encontrarlo(Scanner t) {
        System.out.print("Secuencia de numeros y el digito a encontrar:");

        int n = t.nextInt();
        int digito = t.nextInt();
        
        while (n!=0){
            if (n % 10 == digito) return true;
            n = n / 10;
        }
        return false;
        
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        if (encontrarlo(teclado))
            System.out.println("El digito si esta contenido en el numero");
        else
            System.out.println("El digito no esta contenido en el numero");
        teclado.close();
    }
}