package sesion3;
import java.util.Scanner;
public class sensacion_termica {
    
    public static void main(String[ ] args) {
        double velocidad, temperatura;
        Scanner teclado= new Scanner(System.in);
        System.out.print("Introduce la velocidad y la temperatura:");
        velocidad=teclado.nextDouble();
        temperatura=teclado.nextDouble();
        double ST;
        ST=-0.04544*(10.45+10*Math.sqrt(velocidad)-velocidad)*(33-temperatura)+33;

    
        System.out.printf("La ST con velocidad %f m/s y temperatura %f es ST %f" ,velocidad,temperatura,ST);
            teclado.close();
        }
}
