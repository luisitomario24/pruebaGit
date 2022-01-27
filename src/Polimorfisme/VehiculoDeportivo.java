package Polimorfisme;

public class VehiculoDeportivo extends Vehiculo{

    private int cilindrada;

    public VehiculoDeportivo(String maricula,String marca,String modelo,int cilindrada){
        super(maricula,marca,modelo);
        this.cilindrada=cilindrada;

    }
    public int getCilindrada(){
        return cilindrada;
    }
    public String mostrarDatos(){
        return"matricula: "+matricula+"\nMarca"+marca+"\nModelo: "+modelo+"\nLa cilindrada del vehiculo es de: "+cilindrada;
    }
}
