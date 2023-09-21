package sesion16;

import java.util.Scanner;

public class ejer2 {
    public static double[] leeVectores(Scanner t) {
        System.out.print("Introduce la longitud:");
        int longitud = t.nextInt();
        double vector[] = new double[longitud];
        System.out.print("Introduce los componentes:");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = t.nextDouble();

        }
        return vector;

    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double v[] = leeVectores(teclado);
        double minimo = v[0];
        for (int i = 0; i < v.length; i++) {
            if (i < v.length - 1 && v[i] < minimo)
                minimo = v[i];

        }
        System.out.printf("Este es el valor minimo: %f", minimo);
    }
}
