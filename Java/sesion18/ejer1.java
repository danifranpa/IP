package sesion18;

import java.util.Scanner;

public class ejer1 {
    public static boolean ch(String a) {
        int i = 0;
        while (i < a.length()) {
            if (a.charAt(i) == 'c')
                if (a.charAt(i + 1) == 'h')
                    return true;
            i++;

        }
        return false;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Palabra: ");
        String a = teclado.next();
        if (ch(a))
            System.out.println("El digito si tiene ch");
        else
            System.out.println("El digito no tiene ch");
        teclado.close();
    }

}
