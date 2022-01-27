package progra22;

import java.util.Calendar;

public class CuentaAhorro extends CuentaBancaria {
    //Variables propias de las clases
    private Calendar ultimaModificacion;
    public static final double tasaAhorro=0.03;
    public int numero;


    public CuentaAhorro(int numero, String nombreCliente) {
        super(numero, nombreCliente,tasaAhorro);
        ultimaModificacion=Calendar.getInstance();
    }
    public Calendar getultimaModificacion() {
        return ultimaModificacion;
    }
    public boolean estadoCuenta(){
        //Este metodo sirve para ver el estado de la cuenta de vanco en los ultimos 6 meses
        Calendar hoy=Calendar.getInstance();
        hoy.add(Calendar.MONTH,-6);
        return hoy.before(ultimaModificacion);
    }
    public String toString(){
        //Llamamos el mostrar datos del padre con el super
        return super.toString()+"Estado:"+estadoCuenta();
    }
    //Sobreescrimos el metodo agregandole mas cositis
    public boolean retirar(double monto){
        //Aqui primero evaluamos si la cuenta esta activa
        if(estadoCuenta()){
            return super.Retirar(monto);

        }
        //osea si la cuenta esta inactiva tira false o si no tiene el dinero para retirarlo
        return false;
    }
    //Aca esta la sobreescritura
    public void depositar(double monto){
        if(!estadoCuenta())
            //se cobra interes si la cuenta estuvo incativa xd
            monto-=monto*0.1;
        super.Depositar(monto);
    }
}
