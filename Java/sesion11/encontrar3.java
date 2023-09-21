import java.util.Scanner;

public class encontrar3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Meter un numero:");
        int num = teclado.nextInt();
        int digito = teclado.nextInt();

        while (num != 0 && num % 10 == digito) {
            num = num / 10;
        }
        if (num != 0)
            System.out.println("El digito si esta contenido en el numero");
        else
            System.out.println("El digito no esta contenido en el numero");
        teclado.close();
    }

}

/* Esta mal  */
