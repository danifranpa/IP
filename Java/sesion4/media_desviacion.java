package sesion4;
import java.util.Scanner;

public class media_desviacion {

    public static void main(String[] args) {
        double n1,n2,n3,n4;
        Scanner teclado= new Scanner(System.in);
        System.out.print("Introduce 4 numeros: ");
        n1=teclado.nextDouble();
        n2=teclado.nextDouble();
        n3=teclado.nextDouble();
        n4=teclado.nextDouble();
        
        double media;
        media=((n1+n2+n3+n4)/4.0);
        double desviacion;
        desviacion=Math.sqrt( ( Math.pow(n1-media,2) + Math.pow(n2-media,2) + Math.pow(n3-media,2)+ Math.pow(n4-media,2)) /4.00);
        System.out.printf("La media de los 4 numeros es %f", media);
        System.out.printf("La desviacion es %f", desviacion);
   
        teclado.close();
    
    
    
    }
}