public class TestFecha {
    public static void main(String[] args) {
        Fecha inicial = new Fecha(14, 4, 2006);
        Fecha b = new Fecha(12,4,1994);
        Fecha c = new Fecha(b);
        System.out.println(inicial.esAnterior(b));
        System.out.println(b.toString());
        System.out.println(b.equals(c));
    }
}
