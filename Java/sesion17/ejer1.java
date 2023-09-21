package sesion17;

import java.util.Scanner;

public class ejer1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Palabra: ");
         String c = teclado.next();
         int vocales = 0;
         for (int i=0; i<c.length(); i++){
            if(c.charAt(i)=='a' || c.charAt(i)=='e' || c.charAt(i)=='i' || c.charAt(i)=='o' || c.charAt(i)=='u')
            vocales+=1;
         }
        
        System.out.printf("Hay estas vocales en la palabra:%d", vocales);
        teclado.close();
    }
}