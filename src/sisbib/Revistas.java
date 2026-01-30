package sisbib;

public class Revistas extends Publicacion {

    private String editorial = "s/d";
    private String fecha = "s/d";
    private String genero = "s/d";

    public Revistas(String nuevoID, String nuevoTitulo, String nuevaEditorial, String nuevaFecha, String nuevoGenero) {
        super(nuevoID, nuevoTitulo);
        editorial = nuevaEditorial;
        fecha = nuevaFecha;
        genero = nuevoGenero;
    }

    String getEditorial() {
        return ("EDITORIAL: " + editorial);
    }

    String getFecha() {
        return ("FECHA DE PUBLICACION: " + fecha);
    }

    String getGenero() {
        return ("GENERO: " + genero);
    }

    @Override
    void getInfo() {
        super.getInfo();
        System.out.println(getEditorial());
        System.out.println(getFecha());
        System.out.println(getGenero());
    }
}
