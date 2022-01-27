package progra22;

import java.util.Scanner;

public class funcionesRECURSIVAS {
    public static void print(int numero){
        if (numero>1)
            print(numero-1);
        System.out.println(numero);
    }

    public static void printMismo(int numero,int repetir ){
        if(repetir>0){
            System.out.println(numero );
            printMismo(numero,repetir);
        }


    }
    public static int sumaUp(int numero){
        if(numero>=1){
            return sumaUp(numero-1)+numero;


        }   return 0;
    }//Poliformismo por que estamos alterando
    public static int sumaDown(int numero){
        return sumaDown(numero,0);
    }
    public static int sumaDown(int numero,int suma){
        if(numero>=1)
            return sumaDown(numero-1,suma+numero);
        return suma;
    }

    public static int potUp(int base, int exponente ){
        if(exponente>0)
            return potUp(base,exponente-1)*base ;

        return 1;
    }
    public static int potDown(int base, int exponente){
        return potDown(base, exponente,1);
    }
    private static int potDown(int base, int exponente,int producto){
        if(exponente>0)
            return potDown(base,exponente-1,producto+base);
        return producto;
    }
    //Ver si una palabra es palindomo o no lo es
    public static boolean esPalindromo(String palabra){
        return esPalindromo(palabra,0,palabra.length()-1);

    }
    private static boolean esPalindromo(String palabra,int inicio,int fin){
        if(inicio<fin){
            if(palabra.charAt(inicio)==palabra.charAt(fin))
            return esPalindromo(palabra,inicio+1,fin-1);
            return false;
        }
        return true;

    }
    //Metodo para crear la torre de asteriscos
    public static boolean torreASTERISCOS(int filas ) {
        if (filas == 0)
            return false;
        else
            return true;
    }
    //Metodo de succession fibonacci
    public  static int funcionFibonacci(int numero ) {
        if (numero == 0 || numero == 1)
            return numero;
        else
            return funcionFibonacci(numero- 1) + funcionFibonacci(numero- 2);
    }
    public static void piramide(int i, int j) {
        if(i>0)
        {
            System.out.print("*");
            piramide(--i,j);
        }else {
            if(j>0) {
                i=j;
                System.out.println("");
                piramide(i,--j);
            }
        }
    }


}
