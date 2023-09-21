package examen1;
import java.util.Scanner;

public class posi {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Secuencia de numeros:");
        int num = teclado.nextInt();
        int positivo = 0;
        int negativo = 0;
        while (num != 0) {
            if (num > 0) {
                positivo = positivo + 1;
            } else {
                negativo = negativo + 1;
            }
            num = teclado.nextInt();
        }
    if(positivo>negativo){
        System.out.println("Hay mas positivos");
    }
    else if(negativo>positivo){
        System.out.println("Hay mas negativos");
    }
    else{
        System.out.println("Hay los mismos");
    }
    teclado.close();
    }
}
