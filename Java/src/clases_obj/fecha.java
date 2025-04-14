package clases_obj;

public class fecha {
    private int dia;
    private int mes;
    private int anio;

    public fecha(){
        this.dia=26;
        this.mes=6;
        this.anio=2011;
    }
    public fecha(int dia, int mes, int anio){
        this.dia=dia;
        this.anio=anio;
        this.mes=mes;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String valida(int dia, int mes, int anio) {
        if (dia > 0 && dia <= 31) {
            if (mes > 0 && mes <= 12) {
                if (anio > 0) {
                    return "Fecha valida";
                } else {
                    return "fecha no valida";
                }
            } else {
                return "fecha no valida";
            }
        } else {
            return "fecha no valida";
        }
    }
    public int diaMes(int mes){
        int[] meses={31,28,31,30,31,30,31,31,30,31,30,31};
        return meses[mes-1];
    }
    public void corta(){
        System.out.println(this.dia+"-"+this.mes+"-"+this.anio);
    }
    public void larga(){
        System.out.println("dia "+this.dia+" de mes "+this.mes+" de año "+this.anio);
    }
    public void siguiente(){
        this.dia=this.dia+1;
    }
    public void anterior(){
        this.dia=this.dia-1;
    }
    public String igualQue(int dia, int mes, int anio) {
        if (this.dia==dia) {
            if (this.mes==mes) {
                if (this.anio==anio) {
                    return "Fecha igual";
                } else {
                    return "fecha desigual";
                }
            } else {
                return "fecha desigual";
            }
        } else {
            return "fecha desigual";
        }
    }
    public void menorQue(int dia, int mes, int anio){
        if(this.anio>=anio){
            if(this.mes>=mes){
                if(this.dia>dia){
                    System.out.println("fecha por parametro es menor");
                }
                else{
                    System.out.println("la fecha por parametro no es menor");
                }
            }
            else{
                System.out.println("la fecha por parametro no es menor");
            }
        }
        else{
            System.out.println("la fecha por parametro no es menor");
        }
    }
    public void mayorQue(int dia, int mes, int anio){
        if(this.anio<=anio){
            if(this.mes<=mes){
                if(this.dia<dia){
                    System.out.println("fecha por parametro es mayor");
                }
                else{
                    System.out.println("la fecha por parametro no es mayor");
                }
            }
            else{
                System.out.println("la fecha por parametro no es mayor");
            }
        }
        else{
            System.out.println("la fecha por parametro no es mayor");
        }
    }

    public static void main(String[] args) {
        fecha f1=new fecha();
        fecha f2=new fecha(05, 01, 2008);
    }
}

