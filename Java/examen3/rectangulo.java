package examen3;

public class rectangulo {
    private int x, y, base, altura;

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
            base = altura_nuevo;
    }

}
