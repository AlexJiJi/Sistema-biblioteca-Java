package sisbib;
public class Anaqueles {

    String ID = "s/d";
    private int capacidad = 0;
    private String categoria = "s/d";

    public Anaqueles(String ID, int capacidad, String categoria) {
        this.ID = ID;
        this.capacidad= capacidad;
        this.categoria = categoria;
    }
    
    String getID(){
        return ("ID: "+ID);
    }
    String getCapacidad(){
        return ("CAPACIDAD: "+capacidad);
    }
    String getCategoria(){
        return ("CATEGORIA: "+categoria);
    }
    
    void getInfo(){
        System.out.println(getID());
        System.out.println(getCapacidad());
        System.out.println(getCategoria());
    }
}
