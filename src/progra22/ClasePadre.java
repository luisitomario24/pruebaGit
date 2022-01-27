package progra22;

public class ClasePadre {
    //Atributos
    String nombre ="Luis";
    int edad;
    String apellido="Mejia";
    String carrera ="Programacion";

    public ClasePadre (String nombre ,int edad,String carrera,String apellido) {
        this.nombre = nombre;
        this.edad = edad;
        this.apellido = apellido;
        this.carrera = carrera;

    }
    public void mayorEdad(){
        if(edad>18)
            System.out.println("Hola ya tienes mas de 18 años rey ");
        else
            System.out.println("no pos no tienes mas de 18 años ");
    }
}
