

public class TestRectangulo2 {
    public static void main(String[] args) {

        Rectangulo2 c1 = new Rectangulo2();

        System.out.printf("c1 ( %d, %d) radio %d,%d\n",
                c1.getX(), c1.getY(), c1.getBase(), c1.getAltura());

        System.out.printf("Área c1 %d\n", c1.calculaAreaa());
        System.out.printf("Perimetro c1 %d\n", c1.calculaPerimetroo());
    }
}
