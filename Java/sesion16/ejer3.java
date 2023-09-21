package sesion16;

import java.util.Scanner;

public class ejer3 {
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
        double[] invertido = new double[v.length];
        int j=0,i=0;
        for ( i = v.length-1; i >=0; i--) {
            
            invertido[j]=v[i];
			j++; 

        }
        System.out.printf("Este es el valor minimo: %f", invertido[i]);
    }
}
