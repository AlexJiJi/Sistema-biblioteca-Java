package sisbib;

public class Externo extends Usuario {

    private String domicilio = "s/d";
    private String numeroTelefono = "s/d";

    public Externo(String nuevoCodigo, String nuevoNombre, String nuevoEmail, String nuevoDomicilio, String nuevoTelefono) {
        super(nuevoCodigo, nuevoNombre, nuevoEmail);
        this.domicilio = nuevoDomicilio;
        this.numeroTelefono = nuevoTelefono;
    }

    String getDomicilio() {
        return ("DOMICILIO: " + domicilio);
    }

    String getTelefono() {
        return ("TELEFONO: " + numeroTelefono);
    }

    @Override
    public void getInfo() {
        System.out.println("Alumno Externo");
        super.getInfo();
        System.out.println(getDomicilio());
        System.out.println(getTelefono());
    }
}
