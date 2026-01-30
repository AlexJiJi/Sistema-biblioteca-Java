package sisbib;

public class AlumnoServicio {

    Bibliotecario bibliotecario;
    String nombre = "s/d";
    String codigo = "s/d";
    private String email = "s/d";

    public AlumnoServicio(Bibliotecario bibliotecario, String nuevoNombre, String nuevoCodigo, String nuevoEmail) {
        this.bibliotecario = bibliotecario;
        this.nombre = nuevoNombre;
        this.codigo = nuevoCodigo;
        this.email = nuevoEmail;
    }

    String getNombre() {
        return ("NOMBRE: " + nombre);
    }

    String getCodigo() {
        return ("CODIGO: " + codigo);
    }

    String getEmail() {
        return ("EMAIL: " + email);
    }

    void getInfo() {

        System.out.println("NOMBRE: " + getNombre());
        System.out.println("CODIGO: " + getCodigo());
        System.out.println("EMAIL: " + getEmail());
        System.out.println("Este alumno fue agregado por: ");
        this.bibliotecario.getInfo();
    }
}
