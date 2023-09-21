package sesion10;
import java.util.Scanner;
public class ejercicio2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce numeros: ");
		int num=teclado.nextInt();
		while(!(num%5==0 || num%2==1) && num>=0) {
			num=teclado.nextInt();
            break;
		}
		if(num>=0) {
			System.out.println("Hay algún múltiplo de 5 o un impar");
    
		}else {
			System.out.println("No hay ningún múltiplo de 5 ni ningún impar");
		}
		teclado.close();
	}

}