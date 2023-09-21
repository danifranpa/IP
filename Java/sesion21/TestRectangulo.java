

public class TestRectangulo {
    public static void main(String[] args) {

        Rectangulo c1 = new Rectangulo();

        System.out.printf("c1 ( %d, %d) radio %d,%d\n",
                c1.getX(), c1.getY(), c1.getbase(), c1.getaltura());

        System.out.printf("Área c1 %.2f\n", c1.calculaArea());

        Rectangulo c2 = new Rectangulo(5, 4);

        System.out.printf("c2 ( %d, %d) radio %d,%d\n",
                c2.getX(), c2.getY(), c2.getbase(), c2.getaltura());

        System.out.printf("Área c2 %.2f\n", c2.calculaArea());

        Rectangulo c3 = new Rectangulo(7, 9, 1, 3);

        System.out.printf("c3 ( %d, %d) radio %d,%d\n",
                c3.getX(), c3.getY(), c3.getbase(), c3.getaltura());

        System.out.printf("Área c3 %.2f\n", c3.calculaArea());

        Rectangulo c4 = new Rectangulo(c3);

        System.out.printf("c4 ( %d, %d) radio %d,%d\n",
                c4.getX(), c4.getY(), c4.getbase(), c4.getaltura());

        System.out.printf("Área c4 %.2f\n", c4.calculaArea());

    }

}
