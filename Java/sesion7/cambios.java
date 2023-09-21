package sesion7;
import java.util.Scanner;

public class cambios {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double Metodo,resultado1,resultado2,resultado3,numero;
        System.out.print("Selecciona el metodo: \n 1) Millas a Km \n 2) Metros a Yardas \n 3) Libras a kg");
        System.out.print("\nQue cantidad quieres cambiar: ");
        Metodo = teclado.nextDouble();
        numero = teclado.nextDouble();
        resultado1 = numero*1.609344;
        resultado2 = numero*1093.6133;
        resultado3 = numero*0.45359237;
        if (Metodo == 1) {
            System.out.printf("El resultado tiene esta solucion: %f Km",resultado1 );
        } else if (Metodo == 2) {
            System.out.printf("El resultado tiene esta solucion: %f yardas",resultado2 );
        } else {

            System.out.printf("No tiene soluciones %f kg",resultado3);
        }

        teclado.close();

    }
}
