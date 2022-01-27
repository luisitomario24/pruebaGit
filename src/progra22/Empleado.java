package progra22;

import java.util.Scanner;

public class Empleado {
    //Scanner leer=new Scanner(System.in);

    /*Ejercicio de clases
    Para este ejercicio debemos crear una clase que contenga el nombre del usuario,
    tanto como el apellido, code, y las horas trabajadas en una empresa. Una vez ingresada
    esta info debera ser impresa y si el empleado trabajo más de 8 horas mencionar las horas extra hacer mention de ello

    */
        private static Scanner teclado;
        private static String nombre ;
        private static String apellido;
        private static String codigo;
        private static int horasTrabajadas;


        //Metodo para interrogar al usuario

    public static  void inicializar(){
        //Declaracion del scanner
        teclado =new Scanner(System.in);

        System.out.println("Ingrese el nombre del empleado ");
        nombre=teclado.next();

        System.out.println("Ingrese el apellido del empleado ");
        apellido=teclado.next();

        System.out.println("Ingrese el codigo del empleado ");
        codigo=teclado.next();

        System.out.println("Ingrese la cantidad  de horas trabajadas ");
        horasTrabajadas=teclado.nextInt();
    }
    public static void imprimir (){
        //Lo que hago alla abajo es esto mismo slo que mas practica las ondas esas de % s y asi
        //son como quien dice el code de las variables de tipo string y asi
        // System.out.println(nombre+""+apellido+""+codigo+""+horasTrabajadas);
        System.out.printf("""
                   nombre: %s
                   apellido: %s
                   codigo: %s
                   horasTrabajadas:%d
                    """,nombre,apellido,codigo,horasTrabajadas);
    }
    public static void  horasTrabajadas(){
        if (horasTrabajadas>8){

            System.out.println("trabajo horas extras ");

        } else {

            System.out.println("no trabajo horas extras ");
        }

    }

    public static void main(String[] args) {
        inicializar();
        imprimir();
        horasTrabajadas();


    }



    }


