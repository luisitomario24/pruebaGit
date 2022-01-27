package Trabajos;

public class Funciones_Recursivas {
    public static void foo(int x ){
        if (x<10)
            foo(x+1);
        System.out.println("Recursion foo con c:"+x);

    }

    public static void main(String[] args){
       Funciones_Recursivas t=new Funciones_Recursivas();
       t.foo(0);


        //foo();
    }

}
