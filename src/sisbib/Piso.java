package sisbib;

public class Piso {

    String nivel = "s/d";
    private String categoria = "s/d";
    Anaqueles anaquel[] = new Anaqueles[3];

    public Piso(String nuevoNivel, String nuevaCategoria) {
        this.nivel = nuevoNivel;
        this.categoria = nuevaCategoria;
        this.anaquel[0] = new Anaqueles("1", 5, "Infantil");
        this.anaquel[1] = new Anaqueles("2", 4, "Adolescentes");
        this.anaquel[2] = new Anaqueles("3", 5, "Adultos");
    }

    String getNivel() {
        return ("NIVEL: " + nivel);
    }

    String getCategoria() {
        return ("CATEGORIA: " + categoria);
    }

    void getInfo() {
        System.out.println(getNivel());
        System.out.println(getCategoria());
        System.out.println("\nAnaqueles");
        for (int i = 0; i < 3; i++) {
            System.out.println("Anaquel " + (i + 1) + ":");
            anaquel[i].getInfo();
            System.out.println("");
        }
    }
}
