package Polimorfisme;

public class VehiculoTurismo extends Vehiculo {
    private int numero_Puertas;


    public VehiculoTurismo(String matricula, String marca, String modelo,int numero_Puertas) {
        super(matricula, marca, modelo);
        this.numero_Puertas =numero_Puertas;
    }
    public int  getnumero_Puertas(){
        return numero_Puertas;

    }

    public String mostrarDatos(){
        return"matricula: "+matricula+"\nMarca"+marca+"\nModelo: "+modelo+"El numetro de puertas del vehiculo es de: "+numero_Puertas ;
    }










    //Si tenemos un metodo que ya diga algo
    //return super.mostrarDatos()+"Hola";
}
