package sesion14;

import java.util.Scanner;

public class basico3 {

    public static int[] leeVectores(Scanner t) {
        System.out.print("Introduce el tamaño del vector:");
        int tamaño = t.nextInt();
        int vector[] = new int[tamaño];
        System.out.print("Introduce los componentes:");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = t.nextInt();
            
        }
        return vector;

    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] v=leeVectores(teclado);
        for (int i = 0; i < v.length; i++) {
            System.out.printf("%d ", v[i]);
        }
        System.out.println();
    }
}