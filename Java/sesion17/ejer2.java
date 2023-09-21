package sesion17;

import java.util.Scanner;

public class ejer2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Palabra 1: ");
        String a = teclado.next();
        System.out.print("Palabra 2: ");
        String b = teclado.next();

        if (a.length() == b.length()) {
            int i = 0;
            while (i < a.length()) {
                if (a.charAt(i) != b.charAt(i))
                    break;
                    i++;
            }
            if (i < a.length()) System.out.printf("ambas cadenas son diferentes");
            else System.out.printf("ambas cadenas son iguales");
        }
        else System.out.printf("ambas cadenas son diferentes");
        teclado.close();
    }
}

