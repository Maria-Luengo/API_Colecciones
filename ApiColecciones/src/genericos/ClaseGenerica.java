package genericos;
/*
Nombre  Significado
    E   Element
    K   Key
    N   Number
    T   Type
    V   Value

*/

//entre <> indico el tipo
public class ClaseGenerica <T>{
    private T objeto;

    public ClaseGenerica(T objeto) {
        this.objeto = objeto;
    }
    
    //método para comprobar el tipo 
    public void obtenerTipo(){
        System.out.println("El tipo T es: "+objeto.getClass().getSimpleName());
    }
    
    
}
