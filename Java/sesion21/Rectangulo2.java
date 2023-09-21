

public class Rectangulo2 {

    private int x;

    private int y;

    private int base;

    private int altura;

    public Rectangulo2() {
       
        setX(0);
        setY(0);
        setBase(1);
        setAltura(1);
    }

    public int getX() {
        return x;
    }

    public void setX(int v) {
        x = v;
    }

    public int getY() {
        return y;
    }

    public void setY(int v) {
        y = v;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int v) {
        if (v > 0)
            base = v;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int v) {
        if (v > 0)
            altura = v;
    }

    public int calculaAreaa() {
        return getBase() * getAltura();
    }

    public int calculaPerimetroo() {
        return getBase() * 2 + getAltura() * 2;
    }
}
