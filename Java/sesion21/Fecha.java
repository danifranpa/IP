public class Fecha{
    /** atributos dia, mes, año para indicar la fecha */
    private int dia, mes, año;
    /** metodos get para obtener los parametros */
    public int getDia(){
        return dia;
    }
    public int getMes(){
        return mes;
    }
    public int getAño(){
        return año;
    }
    /** metodos set para establecer el valor de los parámetros */
    public void setDia(int dia_nuevo){
        if(dia_nuevo >= 0 && dia_nuevo <= 31) dia = dia_nuevo;
    }
    public void setMes(int mes_nuevo){
        if(mes_nuevo >= 0 && mes_nuevo <= 12) mes = mes_nuevo;
    }
    public void setAño(int año_nuevo){
        if(año_nuevo >= 0) año = año_nuevo;
    }
    /** metodo para ver si la fecha nueva es anterior a la inicial
     * @return si la fecha introducida es anterior.  */
    public boolean esAnterior(Fecha fec){
        if (fec.getAño() > this.getAño()) return false;
        else if (fec.getAño() == getAño() && fec.getMes() > getMes()) return false;
        else if (fec.getMes() == getMes() && fec.getDia() > getDia()) return false;
        return true;
    }
    public boolean equals(Fecha obj){
        if(this == obj) return true;
        if(obj instanceof Fecha){
            Fecha f = (Fecha) obj;
            return (this.getDia() == f.getDia() &&
                    this.getMes() == f.getMes() &&
                    this.getAño() == f.getAño());
        }
        else return false;
    }
    public String toString(){
        return String.format("%d / %d / %d", this.getDia(), this.getMes(), this.getAño()); 
    }
    //constructores
    public Fecha(Fecha copia){
        this(copia.getDia(), copia.getMes(), copia.getAño());
        //setDia(copia.getDia());
        //setMes(copia.getMes());
        //setAño(copia.getAño());
    }
    //un parametro para cada año
    public Fecha(int año){
        this(1,1,año);
        //setDia(1);
        //setAño(1);
        //setAño(año);
    }    
    public Fecha(int dia, int mes, int año){
        setDia(dia);
        setMes(mes);
        setAño(año);
    }
}