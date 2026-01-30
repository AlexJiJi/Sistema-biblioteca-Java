package sisbib;

public class Profesor extends Usuario {

    private String departamento = "s/d";

    public Profesor(String nuevoCodigo, String nuevoNombre, String nuevoEmail, String nuevoDepartamento) {
        super(nuevoCodigo, nuevoNombre, nuevoEmail);
        this.departamento = nuevoDepartamento;
    }

    String getDepartamento() {
        return ("DEPARTAMENTO: " + departamento);
    }

    @Override
    public void getInfo() {
        System.out.println("-Profesor");
        super.getInfo();
        System.out.println(getDepartamento());
    }
}
