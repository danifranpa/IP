package sesion7;
import java.util.Scanner;
public class notas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double p,t;
        System.out.print("Mete tu nota de teoria y practica: ");
        p = teclado.nextDouble();
        t = teclado.nextDouble();
        if(p>=9 && t>=9){
            System.out.printf("Tienes un Sobresaliente" );
        }
        else 
            if(p>=7.5 && t>=7.5) System.out.printf("Tienes un Notable" );
            else 
               if(p>=5 && t>=5)  System.out.printf("Tienes un Suficiente" );
               else System.out.printf("Tienes un Insuficiente" );
        
        teclado.close();
    }
}

// !(p>=9 && t>=9) ==  !(p>=9)  ||  !(t>=9) == p<9 || t<9 