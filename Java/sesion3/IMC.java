package sesion3;
import java.util.Scanner;
public class IMC {
    public static void main(String[ ] args) {
        double peso, altura;
        Scanner teclado= new Scanner(System.in);
        System.out.print("Introduce el peso y la altura: ");
        peso=teclado.nextDouble();
        altura=teclado.nextDouble();
        double resultado;
        resultado=peso%Math.pow(altura, 2);

    
        System.out.printf("El IMC con peso %f kg y altura %f mes %f" ,peso,altura,resultado);
            teclado.close();
        }
}