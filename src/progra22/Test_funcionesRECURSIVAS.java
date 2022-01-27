package progra22;

import java.util.Scanner;

import static progra22.funcionesRECURSIVAS.piramide;

public class Test_funcionesRECURSIVAS {
    public static void main(String[] args) {
        //funcionesRECURSIVAS.print(10);

        Scanner leer=new Scanner (System.in);
        int opcion=0;
       while(opcion!=7) {
           System.out.println("");
           System.out.print("""
                   ---Menu--
                   1-PRINT
                   2-Print Mismo
                   3-Suma Up
                   4-Suma down
                   5-potUp
                   6-putDown
                   7-Palabra Palindroma 
                   8-Function Fibonacci
                   9-Torre de asteriscos
                   Ingresa una option --> """);
           opcion = leer.nextInt();
           switch(opcion){
               case 1:
                   funcionesRECURSIVAS.print(10);

                   break;
               case 2:
                   funcionesRECURSIVAS.printMismo(2,3);
                   break;
               case 3:
                   funcionesRECURSIVAS.sumaUp(2);
                   break;

                   case 4:
                       funcionesRECURSIVAS.sumaDown(3);
                       break;

                       case 5:
                           funcionesRECURSIVAS.potUp(9,2);
                           break;

                           case 6:
                               funcionesRECURSIVAS.potDown(2,4);

                               break;

                               case 7:
                                   funcionesRECURSIVAS.esPalindromo("luis");

                   case 8:
                       System.out.println("\n---Function Fibonacci--- ");
                       System.out.println("Ingrese el numero de elementos  de la serie");
                       int limite = leer.nextInt();

                       for (int i = 0; i < limite; i++) {
                           System.out.println(funcionesRECURSIVAS.funcionFibonacci(i) + ", ");
                       }
                       funcionesRECURSIVAS.funcionFibonacci(1);
                       break;
               case 9:
                   Scanner scanner = new Scanner(System.in);
                   System.out.println("Ingrese le calor de i");
                   int i=scanner.nextInt();

                   int j=i;
                   piramide(i,j);

                   break;




           }




       }
    }
}
