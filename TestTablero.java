import java.util.Scanner;
public class TestTablero {

 public static void main(String[] args) {
  Scanner teclado=new Scanner(System.in);
  System.out.print("Filas y columnas");
  Tablero1 t=new Tablero1(teclado.nextInt(),teclado.nextInt());
  System.out.print("Jugadas:\n");
  t.setjugadas(teclado.nextInt());
  t.jugada(teclado);
 }
}