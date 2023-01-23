package iterator;

public class Usuario {
    private String nombre;
    private int edad;

    private Usuario(){}

    public Usuario(String nombre,int edad){
        this.nombre = nombre;
        this.edad = edad;
    }


    public int getEdad(){
        return edad;
    }

    public String getNombre() {
        return nombre;
    }
}
