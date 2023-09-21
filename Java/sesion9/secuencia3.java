import java.util.Scanner;

public class secuencia3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca el ISBN: ");
		int isbn=0;
		int resultado=0;
		for(int i=1;i<=10;i++) {
			isbn=teclado.nextInt();
			resultado+=isbn*i;
		}
		if(resultado%11==0) {
			System.out.println("El ISBN es correcto");
		}else {
			System.out.println("El ISBN es incorrecto");
		}
        teclado.close();
	}

}



/*
 * Recorrer el numero 1234567892
 * posicion= posicion +1 sacas cada numero
 * cada numero lo multiplicas por i + 1
 * resultado=producto+resultado
 * if (resultado % 11 ==0){
 * print esta correcto el ISBN}
 * else{No esta correcto}
 */