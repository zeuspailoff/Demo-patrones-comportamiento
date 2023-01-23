package iterator;

public class Main {
    public static void main(String[] args) {

        Usuarios usuarios = new Usuarios();
        usuarios.Crear(new Usuario("uno",5));
        usuarios.Crear(new Usuario("dos",5));
        usuarios.Crear(new Usuario("tres",5));

        while (usuarios.hayMas()){
            Usuario usuario = usuarios.siguiente();
            System.out.println("Usuario es: " + usuario.getNombre());

        }
    }
}