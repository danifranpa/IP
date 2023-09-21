package examen3;

public class testhora1 {
    public static void main(String[] args) {

        hora1 c2 = new hora1(2);

        System.out.printf("hora: %d\nminutos: %d\nsegundos: %d", c2.gethora(), c2.getminutos(), c2.getsegundos());
        System.out.printf("\nsegundos desde media noche: %d\n", c2.segundosdesdemedianoche());
        System.out.println(c2.toString());

    }
}
