package Abstract;

public class Rectangulo extends Poligono{
    //Los rectangulos tiene dos lados el largo y el ancho pues esos son los lados 1,2
    private double  lado1;
    private double lado2;

    public Rectangulo(double lado1,double lado2){
        //Ya que ya conocemos e numero de lados del rectangulo podemos omitir llamaro aca asi que pues olo ponemos el valor
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;

    }

    public double getLado1() {

        return lado1;
    }

    public double getLado2() {

        return lado2;
    }

    @Override
    public String toString() {
        return super.toString()+ "lado1=" + lado1 + "lado2=" + lado2 ;

    }
    // cuando implementas un metodo abstracto aqui si lleva drogra como parametros y asi osea lo de adentro
    public double area(){
        //ancho por alto para calcular el area de un rectangulo
        return lado1*lado2;
    }
}
