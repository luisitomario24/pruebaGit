package Polimorfisme;

public class Main {
    public static void main(String[] args) {
        //Creacion de el array de todos los vehiculos que tenemos en clases
        Vehiculo misVehiculos[]=new Vehiculo[4];

        //Poliformismo , en esta parte vamos llamand nuestros vehiculos y poniendo sus atributos
        misVehiculos[0]=new Vehiculo("12gtd","toyota","2005");
        misVehiculos[1]=new VehiculoTurismo("JG56","mazda","2008",4);
        misVehiculos[2]=new VehiculoDeportivo("dewd4","ferrari","1987",500);
        misVehiculos[3]=new VehiculoFurgoneta("889GYI","Ford","2000",3000);

        //bucle for each para mostar todo eso de arriba
        for(Vehiculo vehiculos :misVehiculos){
            System.out.println(vehiculos.mostrarDatos());
            System.out.println("");

        }
    }

}


