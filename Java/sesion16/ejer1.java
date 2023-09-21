package sesion16;

import java.util.Scanner;

public class ejer1 {
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
        int mayores = 0;
        double v[] = leeVectores(teclado);
        System.out.println("Introduce el valor: ");
        double valor = teclado.nextDouble();
        for (int i = 0; i < v.length; i++) {
            if (v[i] > valor) {
                mayores++;
            }

        }
        System.out.printf("Hay estos mayores que el valor dado %d", mayores);
    }
}
