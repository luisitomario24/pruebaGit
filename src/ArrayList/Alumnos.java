package ArrayList;

public class Alumnos {
    private String nombre;
    private String usuario;
    private String contrasena;
    private String correo;
    private int numeroCuenta;
    private int anioIngreso;
    private String tipo;

    public Alumnos() {
    }

    public Alumnos(String nombre, String usuario, String contrasena, String correo, int numeroCuenta, int anioIngreso, String tipo) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.correo = correo;
        this.numeroCuenta = numeroCuenta;
        this.anioIngreso = anioIngreso;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "nombre=" + nombre + ", usuario=" + usuario + ", contrasena=" + contrasena + ", correo=" + correo + ", numeroCuenta=" + numeroCuenta + ", anioIngreso=" + anioIngreso + ", tipo=" + tipo + '}';
    }
}

