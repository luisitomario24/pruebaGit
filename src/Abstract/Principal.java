package Abstract;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    //lo que está en medio es de la clase que queremos crear el arreglo y lo que le sigue es el objeto que creamos para añadir o restar
    static ArrayList<Poligono>poligono=new ArrayList<Poligono>();
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        //Aqui solo llamamos al metodo para llenar poligonos
        llenarPoligono();
        //Mostrar el area y los datos de cada poligono
        mostrarResultados();

    }
    //method donde pedimos al usuario que nos digite un polígono
    public static void llenarPoligono() {
        int opcion;
        char respuesta;
        do {
            //bucle do while interno para verification que el usuario no ingrese una option fuera de rectangle y triangulo
            do {
                System.out.println("Digite que poligono desea");
                System.out.println("1.Triangulo");
                System.out.println("2.Rectangulo");
                System.out.println("Opcion: ");
                opcion = leer.nextInt();

                //Aqui verificamos que la opcion seleccionada sea valida
            } while (opcion < 1 || opcion > 2);

            switch (opcion) {
                case 1:
                    //Lenar un triangulo
                    llenarTriangulo();
                    break;
                case 2:
                    //Llenar un rectangulo
                    llenarRectangulo();
                    break;
            }
            System.out.println("desea digitar otro poligono ? teclee s o n: ");
            respuesta = leer.next().charAt(0);
            System.out.println("");
            //Aqui evaluamos si el usuario dijo que si o que no a la hora de que querer escribir otro polígono
        } while (respuesta == 's' || respuesta == 'S');
    }
        public static void  llenarTriangulo(){
            double lado1,lado2,lado3;

            System.out.println("Digite el lado 1 del triangulo: ");
            lado1=leer.nextDouble();
            System.out.println("Digite el lado 2 del triangulo: ");
            lado2=leer.nextDouble();
            System.out.println("Digite el lado 3 del triangulo: ");
            lado3=leer.nextDouble();
            Triangulo triangulo=new Triangulo(lado1,lado2,lado3);


            //Guardamos un triangulo dentro de nuestro arreglo de poligonos
            poligono.add(triangulo);
        }
        public static void llenarRectangulo(){
            double lado1,lado2;

            System.out.println("Digite el lado 1");
            lado1= leer.nextDouble();
            System.out.println("digite el lado 2");
            lado2=leer.nextDouble();

            Rectangulo rectangulo=new Rectangulo(lado1,lado2);
            poligono.add(rectangulo);
    }
    public static void mostrarResultados(){
        //de la clase poligono que es el padre y tambien mostramos nuestro array
        for(Poligono poli:poligono){
            //la manera de mostrar datos es con el metodo que habiamos creado el to string asi que lo llamamos con la palabra esa rara que no sacamos ahi
            System.out.println(poli.toString());
            System.out.println("Area"+poli.area());
            System.out.println("");
        }

    }

}
