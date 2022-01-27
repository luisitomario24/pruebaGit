package progra22;

public class ClaseHija extends ClasePadre{

    String tipo;
    public ClaseHija(String nombre, int edad, String carrera, String apellido, String tipo) {
        super(nombre, edad, carrera, apellido);
        this.tipo= tipo;
    }
    public static int suma(int numero1,int numero2){
        int suma=numero1+numero2;
        return suma;
    }
    public void imprimir(String nombre){
        System.out.println("mi nombre es "+nombre );
    }

    public static void main(String[] args) {
        //Upcasting
        ClasePadre cp=new ClaseHija("luis",17,"sistemas","mejia","no se xd");
        ((ClaseHija) cp).imprimir(cp.nombre);
        cp.mayorEdad();

        //downcasting
        //ClasePadre hola=new (ClasePadre)


    }



}
