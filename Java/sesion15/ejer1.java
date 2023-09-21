package sesion15;

import java.util.Scanner;

public class ejer1 {

    public static int[] leeVectores(Scanner t) {
        System.out.print("Introduce la longitud:");
        int longitud = t.nextInt();
        int vector[] = new int[longitud];
        System.out.print("Introduce los componentes:");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = t.nextInt();

        }
        return vector;

    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] vector1 = leeVectores(teclado);
        int[] vector2 = leeVectores(teclado);
        int producto = 0;
        for (int i = 0; i < vector1.length; i++) {

            producto = +vector1[i] * vector2[i];

        }
        System.out.printf("Producto escalar: %d\n", producto);
    }
}
