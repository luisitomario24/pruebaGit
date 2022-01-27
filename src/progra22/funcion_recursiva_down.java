package progra22;

public class funcion_recursiva_down {

    public  int suma(int n, int sum ){
        if (n>=1)
            return suma (n-1,sum+n);
        return sum;
    }

    public static void main(String[] args) {
        funcion_recursiva_down t=new funcion_recursiva_down();
        System.out.println(t.suma(10,0));
    }

}
