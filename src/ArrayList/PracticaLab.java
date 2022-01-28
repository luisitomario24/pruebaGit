package ArrayList;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PracticaLab {
    public static ArrayList<Alumnos> lista = new ArrayList();
    //public static int indice;
    public static Alumnos administrador = new Alumnos();
    public static Alumnos logueado = new Alumnos();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        administrador = new Alumnos("Administrador", "admin", "123", "administrador@unitec.edu", 11911105, 2019, "Administrador" );
        lista.add(administrador);
        do{
            opciones( menu() );
        }while(true);
    }


    public static int menu(){
        System.out.println("");
        System.out.println("");
        System.out.println("0. Salir");
        System.out.println("1. Log in\n" +
                "2. Log out\n" +
                "3. Crear alumnos\n" +
                "4. Editar alumnos\n" +
                "5. Eliminar alumno\n" +
                "6. Listar alumnos\n" +
                "7. Mi perfil\n" +
                "8. Administrador Random\n" +
                "Ingrese la opcion: ");
        return sc.nextInt();
    }

    public static void opciones(int opcion){
        if(opcion == 0)
            System.exit(0);
        else if(opcion == 1)
            login();
        else if(opcion == 2)
            logout();
        else if(opcion == 3)
            crearAlumnos();
        else if(opcion == 4)
            editarAlumno();
        else if(opcion == 5)
            eliminarAlumno();
        else if(opcion == 6)
            listarAlumnos();
        else if(opcion == 7)
            miPerfil();
        else if(opcion == 8)
            adminRandom();
    }

    public static void login(){
        boolean entro = false;
        System.out.println("Ingrese usuario: ");
        String usuario = sc.next();
        System.out.println("Ingrese contrasena: ");
        String contrasena = sc.next();
        // int i = 0;
        for (Alumnos alumnos : lista) {
            if(alumnos.getUsuario().equals(usuario) && alumnos.getContrasena().equals(contrasena)){
                logueado = alumnos;
                //indice = i;
                entro = true;
                break;
            }
            //   i++;
        }
        if(entro)
            System.out.println("Ingresado correctamente!");
        else
            System.out.println("Usuario y/o contrasena invalida!");
    }

    public static void logout(){
        logueado = new Alumnos();
    }

    public static void crearAlumnos(){
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        nombre = sc.nextLine();
        System.out.print("Usuario: ");
        String usuario = sc.next();
        System.out.print("Contrasena: ");
        String contrasena = sc.next();
        System.out.print("Correo: ");
        String correo = sc.next();
        System.out.print("Cuenta: ");
        int cuenta = sc.nextInt();
        System.out.print("Año: ");
        int anio = sc.nextInt();
        System.out.print("Tipo: ");
        String tipo = sc.next();
        lista.add(new Alumnos(nombre, usuario, contrasena, correo, cuenta, anio, tipo));
    }

    public static void editarAlumno(){
        System.out.print("Ingrese la posicion: ");
        int pos = sc.nextInt();
        System.out.println("1. Un atributo");
        System.out.println("2. Todos los atributos");
        System.out.print("Ingrese la opcion: ");
        int opcion = sc.nextInt();
        if(opcion == 1)
            editarUnAtributo(pos);
        else if(opcion == 2)
            editarAtributos(pos);
    }

    public static void editarUnAtributo(int pos){
        System.out.println("1. Nombre");
        System.out.println("2. Usuario");
        System.out.println("3. Contrasena");
        System.out.println("4. Correo");
        System.out.println("5. Cuenta");
        System.out.println("6. Año");
        System.out.println("7. Tipo");
        System.out.print("Ingrese la opcion: ");
        int opcion = sc.nextInt();
        if(opcion == 1){
            System.out.print("Nombre: ");
            lista.get(pos).setNombre(sc.next());
        }else if(opcion == 2){
            System.out.print("Usuario: ");
            lista.get(pos).setUsuario(sc.next());
        }else if(opcion == 3){
            System.out.print("Contrasena: ");
            lista.get(pos).setContrasena(sc.next());
        }else if(opcion == 4){
            System.out.println("Correo: ");
            lista.get(pos).setCorreo(sc.next());
        }else if(opcion == 5){
            System.out.print("Cuenta: ");
            lista.get(pos).setNumeroCuenta(sc.nextInt());
        }else if(opcion == 6){
            System.out.print("Año: ");
            lista.get(pos).setAnioIngreso(sc.nextInt());
        }else if(opcion == 7){
            System.out.println("Tipo: ");
            lista.get(pos).setTipo(sc.next());
        }
    }

    public static void editarAtributos(int pos){
        System.out.print("Nombre: ");
        lista.get(pos).setNombre(sc.next());
        System.out.print("Usuario: ");
        lista.get(pos).setUsuario(sc.next());
        System.out.print("Contrasena: ");
        lista.get(pos).setContrasena(sc.next());
        System.out.println("Correo: ");
        lista.get(pos).setCorreo(sc.next());
        System.out.print("Cuenta: ");
        lista.get(pos).setNumeroCuenta(sc.nextInt());
        System.out.print("Año: ");
        lista.get(pos).setAnioIngreso(sc.nextInt());
        System.out.println("Tipo: ");
        lista.get(pos).setTipo(sc.next());
    }

    public static void eliminarAlumno(){
        System.out.print("Posicion: ");
        lista.remove(sc.nextInt());
    }

    public static void listarAlumnos(){
        for (Alumnos alumnos : lista) {
            System.out.println(alumnos.toString());
        }
    }

    public static void miPerfil(){
        System.out.println("1. Editar");
        System.out.println("2. Imprimir");
        System.out.print("Ingrese la opcion: ");
        int opcion = sc.nextInt();
        if(opcion == 1){
            System.out.println("1. Usuario");
            System.out.println("2. Contrasena");
            System.out.println("3. Correo");
            System.out.print("Ingrese la opcion: ");
            int op = sc.nextInt();
            if(op == 1)
                lista.get(lista.indexOf(logueado)).setUsuario(sc.next());
            else if(op == 2)
                lista.get(lista.indexOf(logueado)).setContrasena(sc.next());
            else if(op == 3)
                lista.get(lista.indexOf(logueado)).setCorreo(sc.next());
        }else{
            System.out.println(logueado.toString());
        }
    }

    public static void adminRandom(){
        Random rd = new Random();
        int rand = rd.nextInt(lista.size());
        lista.get( lista.indexOf(administrador)  ).setTipo("Alumno");
        lista.get(rand).setTipo("administrador");
        administrador = lista.get(rand);
    }
}


