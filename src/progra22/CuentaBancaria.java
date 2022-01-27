package progra22;

import java.util.Calendar;

public class CuentaBancaria {
    //variables
    protected int numero;
    protected String nombreCliente;
    protected double saldo;
    protected double tasa;

    protected Calendar creacion;

    //constructor padre
    public CuentaBancaria(int numero,String nombreCliente,double tasa){
        this.numero = numero;
        this.nombreCliente = nombreCliente;
        //inicializamos con un saldo el dia de 500
        this.saldo = 500;
        this.tasa = tasa;
        this.creacion=Calendar.getInstance();
    }
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public String getNombreCliente() {
        return nombreCliente;
    }
    public int getNumero(){
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    public double getTasa(){
        return tasa;
    }
    public Calendar getCreacion(){
        return creacion;
    }
    public boolean Retirar(double monto){
        //Hay que evaluar si hay monto en la cuenta para retirar
        if(saldo>monto){
            //si hay dinero suficiente para retirar pues se le retiral al monto
            saldo-=monto;
            return true;
        }else
            return false;

    }
    public void Depositar(double monto){
        //Si el if no tiene parentesis no ocpa else , osea la linea de abajo en el print ese vendria siendo el else si no se cumple
        //el if
        if(monto>0)
            saldo+=monto;
            System.out.println("Su deposito debe ser mayor que 0 -"+monto+" lps");

    }

    @Override
    public String toString() {
        return "{numero=" + numero +
                ", nombreCliente='" + nombreCliente + '\'' +
                ", saldo=" + saldo +
                ", tasa=" + tasa +'}';
    }
}
