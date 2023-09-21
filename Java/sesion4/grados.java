package sesion4;
import java.util.Scanner;
public class grados {
    public static void main(String[ ] args) {
        double temperatura;
        Scanner teclado= new Scanner(System.in);
        System.out.print("Introduce la temperatura en Fahrenheit: ");
        temperatura=teclado.nextDouble();
        double Celsius;
        Celsius=((temperatura-32)*5)/9;

    
        System.out.printf("Su temperatura en Fahrenheit es %f y pasado a Celsius es %f" ,temperatura,Celsius);
            teclado.close();
        }
}