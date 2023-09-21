public class TestHora {
    public static void main(String[] args) {
        Hora h = new Hora(15);
        System.out.printf("hora: %d\nminutos: %d\nsegundos: %d", h.getHora(), h.getMin(), h.getSeg());
        System.out.printf("\nsegundos desde media noche: %d\n", h.segundosDesdeMedianoche());
        System.out.println(h.toString());
    }
}
