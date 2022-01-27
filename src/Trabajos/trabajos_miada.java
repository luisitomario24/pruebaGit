package Trabajos;

import java.util.Scanner;

public class trabajos_miada {
    public static void main(String[] args) {
       /*
       Solicitar cantidad de preguntas,tema de la que las queremos hacer
       */
        int preguntas=0;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de preguntas que desea contestar ");
        preguntas=leer.nextInt();

       for(int conteoPreguntas=0;conteoPreguntas<preguntas;conteoPreguntas++){
           System.out.println("Que dia es hoy ?");
       }



    }
}
