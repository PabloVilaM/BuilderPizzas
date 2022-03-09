package com.dam1;

public class Pizzas {
    private boolean relleno;
    private boolean salsaBool;
    private boolean cebolla;
    private boolean sinGluten;
    private boolean extraQueso;
    private boolean piña;
    private boolean champiñones;
    private boolean jamon;

    private int tipoMasa;
    private int tamaño;
    private int salsa;
    private int recojida;

    //Masas
    private static final int NORMAL = 0;
    private static final int FINA = 1;
    private static final int INTEGRAL = 2;
    private static final int MASA_PAN = 3;

    //Tamaño
    private static final int PEQUEÑA = 0;
    private static final int MEDIANA = 1;
    private static final int FAMILIAR = 2;

    //Salsa
    private static final int BARBACOA = 0;
    private static final int TOMATE = 1;
    private static final int CARBONARA = 2;

    //Recojida
    private static final int TIENDA = 0;
    private static final int PARALLEVAR = 1;

    //Esto es la "default"
    public Pizzas(){
        relleno = true;
        salsaBool = true;
        cebolla = true;
        sinGluten = false;
        extraQueso = false;
        piña = false;
        champiñones = false;
        jamon = true;
        tipoMasa = 1;
        tamaño = 2;
        salsa = 1;
        recojida = 1;
    }

    //Ahora parametrizado
    public Pizzas(boolean rellen, boolean salsaBoo, boolean ceboll, boolean sinGlute, boolean extraQues,
                  boolean piñ, boolean champiñone,boolean jamo, int tipoMas, int tamañ, int sals,int recojid){
        relleno = rellen;
        salsaBool = salsaBoo;
        cebolla = ceboll;
        sinGluten = sinGlute;
        extraQueso = extraQues;
        piña = piñ;
        champiñones = champiñone;
        jamon = jamo;
        tipoMasa = tipoMas;
        tamaño = tamañ;
        salsa = sals;
        recojida = recojid;

    }

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    public boolean isSalsaBool() {
        return salsaBool;
    }

    public void setSalsaBool(boolean salsaBool) {
        this.salsaBool = salsaBool;
    }

    public boolean isCebolla() {
        return cebolla;
    }

    public void setCebolla(boolean cebolla) {
        this.cebolla = cebolla;
    }

    public boolean isSinGluten() {
        return sinGluten;
    }

    public void setSinGluten(boolean sinGluten) {
        this.sinGluten = sinGluten;
    }

    public boolean isExtraQueso() {
        return extraQueso;
    }

    public void setExtraQueso(boolean extraQueso) {
        this.extraQueso = extraQueso;
    }

    public boolean isPiña() {
        return piña;
    }

    public void setPiña(boolean piña) {
        this.piña = piña;
    }

    public boolean isChampiñones() {
        return champiñones;
    }

    public void setChampiñones(boolean champiñones) {
        this.champiñones = champiñones;
    }

    public boolean isJamon() {
        return jamon;
    }

    public void setJamon(boolean jamon) {
        this.jamon = jamon;
    }

    public int getTipoMasa() {
        return tipoMasa;
    }

    public void setTipoMasa(int tipoMasa) {
        this.tipoMasa = tipoMasa;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getSalsa() {
        return salsa;
    }

    public void setSalsa(int salsa) {
        this.salsa = salsa;
    }

    public int getRecojida() {
        return recojida;
    }

    public void setRecojida(int recojida) {
        this.recojida = recojida;
    }

    @Override
    public String toString() {
        return "Pizzas{" +
                "relleno=" + relleno +
                ", salsaBool=" + salsaBool +
                ", cebolla=" + cebolla +
                ", sinGluten=" + sinGluten +
                ", extraQueso=" + extraQueso +
                ", piña=" + piña +
                ", champiñones=" + champiñones +
                ", jamon=" + jamon +
                ", tipoMasa=" + tipoMasa +
                ", tamaño=" + tamaño +
                ", salsa=" + salsa +
                ", recojida=" + recojida +
                '}';
    }
}
