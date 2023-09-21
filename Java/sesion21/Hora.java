public class Hora{
    private int hora, minutos, segundos;

    //metodos
    public int getHora(){
        return hora;
    }
    public int getMin(){
        return minutos;
    }
    public int getSeg(){
        return segundos;
    }
    public void setHora(int hora_nuevo){
        if(hora_nuevo >= 0 && hora_nuevo < 60) hora = hora_nuevo;
    }
    public void setMin(int min_nuevo){
        if(min_nuevo >= 0 && min_nuevo < 60) minutos = min_nuevo;
    }
    public void setSeg(int seg_nuevo){
        if(seg_nuevo >= 0 && seg_nuevo < 60) segundos = seg_nuevo;
    }    
    public int segundosDesdeMedianoche(){
        int x = this.getHora()*3600 + this.getMin()*60 + this.getSeg(); 
        return x;
    }
    public boolean equals(Hora obj){
        if(this == obj) return true;
        if (obj instanceof Hora){
            Hora r = (Hora) obj;
            return (this.getHora() == r.getHora() &&
                    this.getMin() == r.getMin() &&
                    this.getSeg() == r.getSeg());
        }
        else return false;
    }
    public String toString(){
        return String.format("%d : %d : %d", this.getHora(), this.getMin(), this.getSeg());
    }

    //constructor por defecto
    public Hora(){
        this(0,0,0);
    }
    //constructor copia
    public Hora(Hora copia){
        setHora(copia.getHora());
        setMin(copia.getMin());
        setSeg(copia.getSeg());
    }
    //constructor parametro para la hora
    public Hora(int h){
        this(h, 0, 0);
    }
    //constructor tres parametros
    public Hora(int h, int m, int s){
        setHora(h);
        setMin(m);
        setSeg(s);
    }
}