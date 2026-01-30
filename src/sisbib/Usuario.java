package sisbib;

public abstract class Usuario {

    private String codigo = "s/d";
    private String nombre = "s/d";
    private String email = "s/d";

    public Usuario(String nuevoCodigo, String nuevoNombre, String nuevoEmail) {
        if (!nuevoCodigo.isBlank()) {
            this.codigo = nuevoCodigo;
        }
        if (!nuevoNombre.isBlank()) {
            this.nombre = nuevoNombre;
        }
        if (!nuevoEmail.isBlank()) {
            this.email = nuevoEmail;
        }
    }

    String getCodigo() {
        return ("CODIGO: " + codigo);
    }

    String getNombre() {
        return ("NOMBRE: " + nombre);
    }

    String getEmail() {
        return ("EMAIL: " + email);
    }

    public void getInfo() {
        System.out.println(getCodigo());
        System.out.println(getNombre());
        System.out.println(getEmail());
    }

}
