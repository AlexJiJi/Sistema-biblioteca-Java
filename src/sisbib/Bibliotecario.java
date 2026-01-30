package sisbib;
public class Bibliotecario {

    String nombre = "s/d";
    String codigo = "s/d";
    private String actividad = "s/d";

    public Bibliotecario(String nuevoNombre, String nuevoCodigo, String nuevaActividad) {
        this.nombre = nuevoNombre;
        this.codigo = nuevoCodigo;
        this.actividad=nuevaActividad;
    }
    
    
    String getNombre(){
        return ("NOMBRE: "+nombre);
    }
    String getCodigo(){
        return ("CODIGO: "+codigo);
    }
    String getActividad(){
        return ("ACTIVIDAD: "+actividad);
    }
    
    void getInfo (){
        System.out.println(getNombre());
        System.out.println(getCodigo());
        System.out.println(getActividad());
    }
}
