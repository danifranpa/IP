package examen3;

public class hora1 {

    private int hora, minutos, segundos;

    public int gethora() {
        return hora;
    }

    public int getminutos() {
        return minutos;
    }

    public int getsegundos() {
        return segundos;
    }

    public void sethora(int hora_nuevo) {
        if (hora_nuevo >= 0 && hora_nuevo <= 60)
            hora = hora_nuevo;
    }

    public void setminutos(int minuto_nuevo) {
        if (minuto_nuevo >= 0 && minuto_nuevo <= 60)
            minutos = minuto_nuevo;
    }

    public void setsegundos(int segundo_nuevo) {
        if (segundo_nuevo >= 0 && segundo_nuevo <= 60)
            segundos = segundo_nuevo;
    }

    public hora1() {
        this(0, 0, 0);
        /*
         * sethora(0);
         * setminutos(0);
         * setsegundos(0);
         */

    }

    public hora1(hora1 c) {
        this(c.gethora(), c.getminutos(), c.getsegundos());
        /*
         * sethora(c.gethora());
         * setminutos(c.getminutos());
         * setsegundos(c.getsegundos());
         */
    }

    public hora1(int hora) {
        this(hora, 0, 0);
        /*
         * sethora(hora);
         * setminutos(0);
         * setsegundos(0);
         */
    }

    public hora1(int hora, int minutos, int segundos) {
        sethora(hora);
        setminutos(minutos);
        setsegundos(segundos);
    }

    public int segundosdesdemedianoche() {
        int x = this.gethora() * 3600 + this.getminutos() * 60 + this.getsegundos();
        return x;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj instanceof hora1) {
            hora1 c = (hora1) obj;
            return (this.gethora() == c.gethora() &&
                    this.getminutos() == c.getminutos() &&
                    this.getsegundos() == c.getsegundos());
        } else
            return false;
    }

    public String toString() {
        return String.format(" %d:%d:%d", this.gethora(), this.getminutos(), this.getsegundos());
    }

}