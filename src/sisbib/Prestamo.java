package sisbib;

public class Prestamo {

    Usuario usuario;
    Publicacion publicacion;
    Bibliotecario bibliotecario;
    private String fecha = "s/d";
    private int dias = 0;

    public Prestamo(Usuario usuario, Publicacion publicacion, Bibliotecario bibliotecario, String fecha, int dias) {
        this.usuario = usuario;
        this.publicacion = publicacion;
        this.bibliotecario = bibliotecario;
        this.fecha = fecha;
        this.dias = dias;
    }


    String getFechaDePrestamo() {
        return ("FECHA DE PRESTAMO: " + fecha);
    }

    String getDiasDePrestamo() {
        return ("DIAS DE PRESTAMO: " + dias);
    }

    public void getInfo() {
        System.out.println("    ** PRESTAMOS **");
        System.out.println(" -Datos del Usuario");
        usuario.getInfo();
        System.out.println(" -Datos de la Publicacion");
        publicacion.getInfo();
        System.out.println(" -Datos del Bibliotecario");
        bibliotecario.getInfo();
        System.out.println(" -Datos del Prestamo");
        System.out.println(getFechaDePrestamo());
        System.out.println();
        getDiasDePrestamo();
    }
}
