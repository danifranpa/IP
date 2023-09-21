package sesion15;

import java.util.Scanner;

public class ejer5 {

    public static double[] leeVectores(Scanner t) {
        System.out.print("Introduce la longitud:");
        int longitud = t.nextInt();
        double vector[] = new double[longitud];
        System.out.print("Introduce los componentes:");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = t.nextInt();

        }
        return vector;

    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double v[] = leeVectores(teclado);
        
        for (int i = 0; i < v.length; i++) {
            if(v[i]<v[i+1] && i<v.length-1) System.out.printf("%d < %d",v[i],v[i+1]);
            else System.out.println("No se ha encontrado un componente mayor que el siguiente");
        }
    }
}