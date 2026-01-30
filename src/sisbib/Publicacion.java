package sisbib;

public abstract class Publicacion {

    String ID = "s/d";
    private String titulo = "s/d";

    public Publicacion(String nuevoID, String nuevoTitulo) {
        if (!nuevoID.isBlank()) {
            this.ID = nuevoID;
        }
        if (!nuevoTitulo.isBlank()) {
            this.titulo = nuevoTitulo;
        }
    }

    String getID() {
        return ("ID: " + ID);
    }

    String getTitulo() {
        return ("TITULO: " + titulo);
    }

    void getInfo() {
        System.out.println(getID());
        System.out.println(getTitulo());
    }
}
