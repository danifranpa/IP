package sesion18;

import java.util.Scanner;

public class ejer5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] palabras=new String[5];
		String mayor="";
		for(int i=0;i<5;i++) {
			System.out.print("Introduce una palabra: ");
			palabras[i]=teclado.nextLine();
			if(palabras[i].length()>mayor.length()) {
				mayor=palabras[i];
			}
		}
		System.out.printf("Mayor cadena: %s",mayor);
        teclado.close();
	}

}
