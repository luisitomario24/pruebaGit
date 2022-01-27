package progra22;

import java.util.Scanner;

public class FactorialR {

    public static int factorial(int n){
        if (n==0)
            return 1;
        else
            return n*factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int n=leer.nextInt();
        System.out.println(factorial(n));
    }
}
