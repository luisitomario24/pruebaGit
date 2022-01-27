package Trabajos;

public class Player {

    // Atributos
    private String nombre;
    private static String  password;
    private static int partidasGanadas;

    // Constructor
    public Player(String nombre, String password){
        this.nombre = nombre;
        this.password = password;
    }

    // Getters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public  String getNombre(){
        return nombre;
    }
    public void setPassword(String password){
        this.password = password;
    }

    public static String getPassword(){
        return password;
    }

    public void setPGanadas(int partidasGanadas){
        Player.partidasGanadas = partidasGanadas;
    }

    public String toString(){
        return "Nombre: " + nombre + "Gano: " + partidasGanadas;
    }

}
