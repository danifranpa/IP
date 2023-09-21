package sesion14;

import java.util.Scanner;

public class basico2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vector[] = { 5, 4, 3, 9, 0, 7 };
        int suma=0;
        int media =0;
        for (int i = 0; i < vector.length ; i++) {
            suma = vector[i] + suma;
            media= suma/vector.length;
        }
        System.out.printf("Tu media es:%d", media);
        teclado.close();
    }

}