package progra22;

import java.util.Scanner;

public class SucesionFibonacci {
    public static void  main(String[] args) {

      piramideeee();

    }
    public static void piramideeee() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de veces que desea que se repita el asterisco (*):");
        int n = leer.nextInt();
        piramide(n, "*");
    }

    private static void piramide(int n, String  acumulador) {  // n es el número de elementos de la serie
        if (n >= 1) {
            System.out.println(acumulador);
            piramide(--n, acumulador + "*");

        }

    }
}






