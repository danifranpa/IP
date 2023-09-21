package examen1;

import java.util.Scanner;

public class ultimo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Meter numero entero:");
        int num = teclado.nextInt();
        int z = 4;
        while (z > 4 && z < 14) {
            if (num % 2 == 0 && num % z == 0)
                break;
            z = z + 1;
        }
        if (num % 2 == 0 && num % z == 0)
            System.out.printf("Si hay un número par divisor de %d en el intervalo [4,14], el %d", num, z);
        else
            System.out.printf("No, no hay ningún número par divisor de %d en el intervalo [4,14]", num);
        teclado.close();
    }

}
