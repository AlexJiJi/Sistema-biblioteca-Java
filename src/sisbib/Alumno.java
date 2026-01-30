package sisbib;

public class Alumno extends Usuario {

    private String Carrera = "s/d";

    public Alumno(String nuevoCodigo, String nuevoNombre, String nuevoEmail, String nuevaCarrera) {
        super(nuevoCodigo, nuevoNombre, nuevoEmail);
        this.Carrera = nuevaCarrera;
    }

    String GetCarr() {
        return ("CARRERA: " + Carrera);
    }

    @Override
    public void getInfo() {
        System.out.println("-Alumno");
        super.getInfo();
        System.out.println(GetCarr());
    }
}
