package progra22;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
        int numero;
        Scanner leer=new Scanner(System.in);

        System.out.println("Introduce el numero");
        numero=leer.nextInt();

        if(par(numero))
            System.out.println("El numero es par ");
        else
            System.out.println("El numero es impar");

    }
    public static boolean impar (int numero){
        if (numero==0)
            return false;

        else
            return par (numero-1);


    }
    public static boolean par (int numero){
        if (numero==0)
            return true ;
        else
            return impar(numero-1);
    }

}
