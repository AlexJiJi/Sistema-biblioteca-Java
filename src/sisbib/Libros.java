package sisbib;
public class Libros extends Publicacion{

    private String autor = "s/d";
    private String editorial = "s/d";
    
    public Libros (String nuevoID, String nuevoTitulo, String nuevoAutor, String nuevoEditorial){
        super(nuevoID, nuevoTitulo);
        autor=nuevoAutor;
        editorial=nuevoEditorial;
    }
   
    
    String getAutor (){
        return ("AUTOR: "+autor);
    }
    String getEditorial (){
        return ("EDITORIAL: "+editorial);
    }
    
    @Override
    void getInfo (){
        super.getInfo();
        System.out.println(getAutor());
        System.out.println(getEditorial());
    }
}
