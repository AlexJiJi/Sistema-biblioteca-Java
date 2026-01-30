package sisbib;

public class Biblioteca {

    String nombre = "s/d";
    private String tipoDeBiblioteca = "s/d";
    private int capacidadDeVolumenes = 0;
    private String director = "s/d";
    private String horario = "s/d";
    Piso pisos[] = new Piso[4];

    public Biblioteca(String nuevoNombre, String nuevoTipo, int nuevoCapVolumenes, String nuevoDirector, String nuevoHorario) {
        nombre = nuevoNombre;
        tipoDeBiblioteca = nuevoTipo;
        capacidadDeVolumenes = nuevoCapVolumenes;
        director = nuevoDirector;
        horario = nuevoHorario;

        pisos[0] = new Piso("1", "LECTURA GENERAL");
        pisos[1] = new Piso("2", "MATEMATICAS y COMPUTACION");
        pisos[2] = new Piso("2", "DERECHO Y PSICOLOGIA");
        pisos[3] = new Piso("4", "CONTABILIAD");
    }

    String getNombre() {
        return ("NOMBRE: " + nombre);
    }

    String getTipoDeBiblioteca() {
        return ("TIPO :" + tipoDeBiblioteca);
    }

    String getCapacidadDeVolumenes() {
        return ("CAPACIDAD DE VOLUMENES: " + capacidadDeVolumenes);
    }

    String getDirector() {
        return ("DIRECTOR: " + director);
    }

    String getHorario() {
        return ("HORARIO " + horario);
    }

    void getInfo() {
        System.out.println("\nINFORMACION DE LA BIBLIOTECA");
        System.out.println(getNombre());
        System.out.println(getTipoDeBiblioteca());
        System.out.println(getCapacidadDeVolumenes());
        System.out.println(getDirector());
        System.out.println(getHorario());
        System.out.println("\nPISOS");
        for (int i = 0; i < 4; i++) {
            System.out.println("Piso " + (i + 1) + ":");
            pisos[i].getInfo();
            System.out.println("");
        }

    }
}
