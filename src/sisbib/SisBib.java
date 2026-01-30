package sisbib;

import java.util.Scanner;

public class SisBib {

    static Scanner leer = new Scanner(System.in);

    static Biblioteca biblioteca;
    static Usuario Usuarios[] = new Usuario[10];
    static int NumUsuarios = 0;
    static Publicacion Publicaciones[] = new Publicacion[10];
    static int NumPublicaciones = 0;
    static Bibliotecario Bibliotecarios[] = new Bibliotecario[10];
    static int NumBibliotecarios = 0;
    static Prestamo Prestamos[] = new Prestamo[10];
    static int NumPrestamos = 0;
    static AlumnoServicio AlumnosServicio[] = new AlumnoServicio[10];
    static int NumAlumnosServicio=0;

    public static void main(String[] args) {
        int opcion = 0, capvol;
        String nnom, ntipo, ndire, nhor;
        System.out.println(" CREACION DE LA BIBLIOTECA ");
        System.out.print("Nombre de la Biblioteca: ");
        nnom = leer.nextLine();
        System.out.print("Tipo de Biblioteca: ");
        ntipo = leer.nextLine();
        System.out.print("Direccion de la Biblioteca: ");
        ndire = leer.nextLine();
        System.out.print("Horario de la Biblioteca: ");
        nhor = leer.nextLine();
        System.out.print("Capacidad de volumenes: ");
        capvol = leer.nextInt();
        biblioteca = new Biblioteca(nnom, ntipo, capvol, ndire, nhor);
        biblioteca.getInfo();

        do {
            System.out.println("\nBienvenido a la biblioteca "+biblioteca.nombre);
            System.out.println("""
                                  Elije una opcion:
                               1.- Crear Bibliotecario
                               2.- Listar Bibliotecario
                               3.- Crear Usuarios
                               4.- Listar Usuarios
                               5.- Crear Publicaciones
                               6.- Listar Publicaciones
                               7.- Crear Prestamos
                               8.- Listar Prestamos
                               9.- Crear Alumno Servicio
                               10.- Listar Alumnos Servicio
                               11.- Informacion de la Biblioteca
                               12.- Salir
                               """);
            opcion = leer.nextInt();
            switch (opcion) {
                case 1 ->
                    CrearBibliotecario();
                case 2 ->
                    ListarBibliotecario();
                case 3 ->
                    CrearUsuario();
                case 4 ->
                    ListarUsuarios();
                case 5 ->
                    CrearPublicaciones();
                case 6 ->
                    ListarPublicaciones();
                case 7 ->
                    CrearPrestamos();
                case 8 ->
                    ListarPrestamos();
                case 9 ->
                    CrearAlumnoServicio();
                case 10 ->
                    ListarAlumnosServicio();
                case 11 ->
                    biblioteca.getInfo();

            }

        } while (opcion != 12);
    }

    static void CrearBibliotecario() {
        String ncod, nnom, nact;
        System.out.println("\nCrear Bibliotecario");
        System.out.println("\nIntroduzca los datos del Bibliotecario");
        System.out.print("\nNombre: ");
        nnom = leer.nextLine();
        nnom = leer.nextLine();
        System.out.print("\nCodigo: ");
        ncod = leer.nextLine();
        System.out.print("\nActividad: ");
        nact = leer.nextLine();
        Bibliotecarios[NumBibliotecarios] = new Bibliotecario(nnom, ncod, nact);
        System.out.println("\nEl bibliotecario " + Bibliotecarios[NumBibliotecarios].nombre + " ha sido agregado correctamente");
        NumBibliotecarios++;

    }

    static void ListarBibliotecario() {
        System.out.println("  ** Lista de Bibliotecarios **");
        if (NumBibliotecarios == 0) {
            System.out.println("La lista de bibliotecarios esta vacia");
        } else {
            for (int i = 0; i < NumBibliotecarios; i++) {
                System.out.println("\nBibliotecario " + (i) + ":");
                Bibliotecarios[i].getInfo();
            }
        }
    }

    static void CrearUsuario() {
        int opcion = 0;
        String cod, nom, email, x1, x2;
        System.out.println("\nCrear Usuario");
        System.out.println("Que tipo de usuario quiere crear?:");
        System.out.println("""
                           1.- Usuario Alumno
                           2.- Usuario Profesor
                           3.- Usuario Externo
                           """);
        opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("\nCrear Usuario Alumno");
                System.out.println("\nIntroduzca los datos del Alumno");
                System.out.print("\nCodigo: ");
                cod = leer.nextLine();
                cod = leer.nextLine();
                System.out.print("\nNombre: ");
                nom = leer.nextLine();
                System.out.print("\nEmail: ");
                email = leer.nextLine();
                System.out.print("\nCarrera: ");
                x1 = leer.nextLine();
                Usuarios[NumUsuarios] = new Alumno(cod, nom, email, x1);
                System.out.println("\nEl alumno " + Usuarios[NumUsuarios].getNombre() + " ha sido agregado correctamente");
                NumUsuarios++;
                break;

            case 2:
                System.out.println("\nCrear Usuario Profesor");
                System.out.println("\nIntroduzca los datos del Profesor");
                System.out.print("\nCodigo: ");
                cod = leer.nextLine();
                cod = leer.nextLine();
                System.out.print("\nNombre: ");
                nom = leer.nextLine();
                System.out.print("\nEmail: ");
                email = leer.nextLine();
                System.out.print("\nDepartamento: ");
                x1 = leer.nextLine();
                Usuarios[NumUsuarios] = new Profesor(cod, nom, email, x1);
                System.out.println("\nEl profesor " + Usuarios[NumUsuarios].getNombre() + " ha sido agregado correctamente");
                NumUsuarios++;
                break;

            case 3:
                System.out.println("\nCrear Usuario Externo");
                System.out.println("\nIntroduzca los datos del Externo");
                System.out.print("\nCodigo: ");
                cod = leer.nextLine();
                cod = leer.nextLine();
                System.out.print("\nNombre: ");
                nom = leer.nextLine();
                System.out.print("\nEmail: ");
                email = leer.nextLine();
                System.out.print("\nDomicilio: ");
                x1 = leer.nextLine();
                System.out.print("\nTelefono: ");
                x2 = leer.nextLine();
                Usuarios[NumUsuarios] = new Externo(cod, nom, email, x1, x2);
                System.out.println("\nEl externo " + Usuarios[NumUsuarios].getNombre() + " ha sido agregado correctamente");
                NumUsuarios++;
                break;

            default:
                System.out.println("Opcion incorrecta");
        }
    }

    static void ListarUsuarios() {
        System.out.println("  ** Lista de Usuarios **");
        if (NumUsuarios == 0) {
            System.out.println("La lista de usuarios esta vacia");
        } else {
            for (int i = 0; i < NumUsuarios; i++) {
                System.out.println("\nUsuario " + (i) + ":");
                Usuarios[i].getInfo();
            }
        }
    }

    static void CrearPublicaciones() {
        String id, tit, x1, x2, x3, x4, x5;
        int opcion = 0;
        System.out.println("\nCrear Publicacion");
        System.out.println("Que tipo de publicacion quiere crear?:");
        System.out.println("""
                           1.- Libro
                           2.- Revisa
                           3.- Tesis
                           """);
        opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("\nCrear Libro");
                System.out.println("\nIntroduzca los datos del Libro");
                System.out.print("\nId: ");
                id = leer.nextLine();
                id = leer.nextLine();
                System.out.print("\nTitulo: ");
                tit = leer.nextLine();
                System.out.print("\nAutor: ");
                x1 = leer.nextLine();
                System.out.print("\nEditorial: ");
                x2 = leer.nextLine();
                Publicaciones[NumPublicaciones] = new Libros(id, tit, x1, x2);
                System.out.println("\nEl libro " + Publicaciones[NumPublicaciones].getTitulo() + " ha sido agregado correctamente");
                NumPublicaciones++;
                break;

            case 2:
                System.out.println("\nCrear Revista");
                System.out.println("\nIntroduzca los datos de la Revista");
                System.out.print("\nId: ");
                id = leer.nextLine();
                id = leer.nextLine();
                System.out.print("\nTitulo: ");
                tit = leer.nextLine();
                System.out.print("\nEditorial: ");
                x1 = leer.nextLine();
                System.out.print("\nFecha de publicacion: ");
                x2 = leer.nextLine();
                System.out.print("\nTipo de revista: ");
                x3 = leer.nextLine();
                Publicaciones[NumPublicaciones] = new Revistas(id, tit, x1, x2, x3);
                System.out.println("\nEl alumno " + Publicaciones[NumPublicaciones].getTitulo() + " ha sido agregado correctamente");
                NumPublicaciones++;
                break;

            case 3:
                System.out.println("\nCrear Tesis");
                System.out.println("\nIntroduzca los datos de la Tesis");
                System.out.print("\nId: ");
                id = leer.nextLine();
                id = leer.nextLine();
                System.out.print("\nTitulo: ");
                tit = leer.nextLine();
                System.out.print("\nNombre del alumno: ");
                x1 = leer.nextLine();
                System.out.print("\nNombre del director: ");
                x2 = leer.nextLine();
                System.out.print("\nCarrera: ");
                x3 = leer.nextLine();
                System.out.print("\nFecha de publicacion: ");
                x4 = leer.nextLine();
                System.out.print("\nEstado y Ciudad : ");
                x5 = leer.nextLine();
                Publicaciones[NumPublicaciones] = new Tesis(id, tit, x1, x2, x3, x4, x5);
                System.out.println("\nLa tesis " + Publicaciones[NumPublicaciones].getTitulo() + " ha sido agregado correctamente");
                NumPublicaciones++;
                break;

            default:
                System.out.println("Opcion incorrecta");
        }
    }

    static void ListarPublicaciones() {
        System.out.println("  ** Lista de Publicaciones **");
        if (NumPublicaciones == 0) {
            System.out.println("La lista de publicaciones esta vacia");
        } else {
            for (int i = 0; i < NumPublicaciones; i++) {
                System.out.println("\nPublicacion " + (i) + ":");
                Publicaciones[i].getInfo();
            }
        }
    }

    static void CrearPrestamos() {
        int b, u, p, dias;
        String fecha;

        if ((NumBibliotecarios == 0) || (NumPublicaciones == 0) || (NumUsuarios == 0)) {
            if (NumBibliotecarios == 0) {
                System.out.println("Se necesita por lo menos un Bibliotecario para realizar un prestamo");
            }
            if (NumPublicaciones == 0) {
                System.out.println("Se necesita por lo menos una Publicacion para realizar un prestamo");
            }
            if (NumUsuarios == 0) {
                System.out.println("Se necesita por lo menos un Usuario para realizar un prestamo");
            }

        } else {

            System.out.println("\nCrear prestamo");

            System.out.println("\nQuien esta haciendo el prstamo?:");
            ListarBibliotecario();
            System.out.println("Introduzca el numero del bibliotecario:");
            b = leer.nextInt();

            System.out.println("\nQuien solicita el prestamo?:");
            ListarUsuarios();
            System.out.println("Introduzca el numero del usuario:");
            u = leer.nextInt();

            System.out.println("\nQue publicacion quiere:");
            ListarPublicaciones();
            System.out.println("\nIntroduzca el numero de la publicacion:");
            p = leer.nextInt();

            System.out.println("\nIntroduzca la fecha de hoy: ");
            fecha = leer.nextLine();
            fecha = leer.nextLine();

            System.out.println("\nIntroduzca los dias por los que sera prestada la publicacion");
            dias = leer.nextInt();

            Prestamos[NumPrestamos] = new Prestamo(Usuarios[u], Publicaciones[p], Bibliotecarios[b], fecha, dias);
            System.out.println("Prestamo agregado correctamente...");
            NumPrestamos++;
        }

    }

    static void ListarPrestamos() {
        System.out.println("\n  ** Lista de Prestamos **");
        if (NumPrestamos == 0) {
            System.out.println("La lista de prestamos esta vacia");
        } else {
            for (int i = 0; i < NumPrestamos; i++) {
                System.out.println("\nPrestamo " + (i) + ":");
                Prestamos[i].getInfo();
            }
        }
    }

    static void CrearAlumnoServicio() {
        int b;
        String nom, cod, email;
        System.out.println("\nCrear Alumno de Servicio");
        if (NumBibliotecarios==0){
            System.out.println("Se requiere al menos un Bibliotecario para encargarse del Slumno de Servicio");
        }else{
            ListarBibliotecario();
            System.out.println("Introduzca el numero del bibliotecario encargado");
            b = leer.nextInt();
            
            System.out.println("Introduzca el nombre:");
            nom = leer.nextLine();
            System.out.println("Introduzca el codigo:");
            cod = leer.nextLine();
            System.out.println("Introduzca el email: ");
            email = leer.nextLine();
            
            AlumnosServicio[NumAlumnosServicio]= new AlumnoServicio(Bibliotecarios[b], nom, cod, email);
            NumAlumnosServicio++;
        }
    }

    static void ListarAlumnosServicio() {
        System.out.println("\n  ** Lista de Alumnos de Servicio **");
        if (NumAlumnosServicio == 0) {
            System.out.println("La lista de prestamos esta vacia");
        } else {
            for (int i = 0; i < NumAlumnosServicio; i++) {
                System.out.println("\nPrestamo " + (i) + ":");
                AlumnosServicio[i].getInfo();
            }
        }
    }

}
