package Abstract;

public abstract class Poligono {
    protected int numero_lados;

    public Poligono(int numero_lados) {
        this.numero_lados=numero_lados;
    }
    public int getNumero_lados() {
        return numero_lados;
    }
    @Override
    public String toString() {
        return "numero_lados=" + numero_lados;
    }
    //Clase abstracta por que no sabemos cuantos lados tiene el poligono y declaramos el metodo area de paso xd
    //A POR CIERTO LAS CLASES ABSTRACTAS NO TIENEN NADA DE DRGA XD
    //METODO PARA SACAR AREA
    public abstract double area();
}
