package sisbib;

public class Tesis extends Publicacion {

    private String alumno = "s/d";
    private String director = "s/d";
    private String carrera = "s/d";
    private String fecha = "s/d";
    private String ciudad = "s/d";

    public Tesis(String nuevoID, String nuevoTitulo, String nuevoAlumno, String nuevDirector, String nuevaCarrera, String nuevaFecha, String nuevaCiudad) {
        super(nuevoID, nuevoTitulo);
        this.alumno = nuevoAlumno;
        this.director = nuevDirector;
        this.carrera = nuevaCarrera;
        this.fecha = nuevaFecha;
        this.ciudad = nuevaCiudad;
    }

    String getAlumno() {
        return ("ALUMNO: " + alumno);
    }

    String getDirector() {
        return ("DIRECTOR: " + director);
    }

    String getCarrera() {
        return ("CARRERA: " + carrera);
    }

    String getFecha() {
        return ("FECHA: " + fecha);
    }

    String getCiudad() {
        return ("CIUDAD: " + ciudad);
    }

    @Override
    void getInfo() {
        super.getInfo();
        System.out.println(getAlumno());
        System.out.println(getDirector());
        System.out.println(getCarrera());
        System.out.println(getFecha());
        System.out.println(getCiudad());
    }
}
