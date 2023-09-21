import java.util.Scanner;

public class Conversor {
    public static void main(String[ ] args) {
    final double Milla=1.609344;
    final double KM=1093.6133;
    final double Nudo=1.852;
    final double Libra=0.45359237;
    double valor;
    Scanner teclado= new Scanner(System.in);
    System.out.print("Introduce el valor : ");
    valor=teclado.nextDouble();
    double resultado1;
    double resultado2;
    double resultado3;
    double resultado4;
    resultado1=Milla*valor;
    resultado2=KM*valor;
    resultado3=Nudo*valor;
    resultado4=Libra*valor;

    System.out.printf("El valor de %f millas es %f km\n",valor, resultado1);
    System.out.printf("El valor de %f km es %f yardas\n",valor, resultado2);
    System.out.printf("El valor de %f Nudo es %f km/h\n",valor, resultado3);
    System.out.printf("El valor de %f Libra es %f kg\n",valor, resultado4);
		teclado.close();
    }
}


	

	
