package Polimorfisme;

public class VehiculoFurgoneta extends Vehiculo {
    private int carga;

    public VehiculoFurgoneta (String matricula,String marca,String modelo,int carga ){
        super(matricula,marca,modelo);
        this.carga = carga;
    }
    public int getCarga(){

        return carga;
    }
    public String mostrarDatos(){
        return"matricula: "+matricula+"\nMarca"+marca+"\nModelo: "+modelo+"La carga que puede cargar este vehiculo es de:"+carga ;
    }


}
