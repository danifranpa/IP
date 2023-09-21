

public class Rectangulo {

    private int x, y, base, altura;

    public Rectangulo() {
        this(0,0,1,1);
        /*setX(0);
        setY(0);
        setbase(1);
        setaltura(1);*/
    }
    public Rectangulo(Rectangulo c) {
        this(c.getX(), c.getY(), c.getbase(), c.getaltura());
		/*setX(c.getX());
        setY(c.getY());
	    setbase(c.getbase());
        setaltura(c.getaltura());*/
    }
    public Rectangulo(int base,int altura) {
	    this(0,0,base,altura);
        /*setX(0);
        setY(0);
	    setbase(base);
        setaltura(altura);*/
    }
    public Rectangulo(int x,int y,int base,int altura) {
	    setX(x);
        setY(y);
	    setbase(base);
        setaltura(altura);
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;

    }

    public int getbase() {
        return base;

    }

    public int getaltura() {
        return altura;

    }

    public void setX(int x_nuevo) {
        if (x_nuevo >= 0)
            x = x_nuevo;
    }

    public void setY(int y_nuevo) {
        if (y_nuevo >= 0)
            y = y_nuevo;
    }

    public void setbase(int base_nuevo) {
        if (base_nuevo >= 0)
            base = base_nuevo;
    }

    public void setaltura(int altura_nuevo) {
        if (altura_nuevo >= 0)
            altura = altura_nuevo;
    }

    public double calculaArea() {
        return getbase() * getaltura();

    }
}