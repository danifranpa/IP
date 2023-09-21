package sesion14;

import java.util.Scanner;

public class basico4 {

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
        int contador =0;
        for (int i = 0; i < v.length; i++) {
            if(i!=v.length-1 && v[i]<v[i+1])
           contador++;

        }
        System.out.printf("Hay:%d ", contador);
        
    }

}
