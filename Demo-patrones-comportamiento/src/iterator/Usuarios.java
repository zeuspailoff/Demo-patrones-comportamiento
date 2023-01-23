package iterator;

import java.util.ArrayList;

public class Usuarios implements UsuarioIterator{

    private ArrayList<Usuario> usuarios= new ArrayList<Usuario>();
    private int position = 0;

    public void Crear(Usuario usuario){

    }

    @Override
    public boolean hayMas() {

        return position< usuarios.size();
    }

    @Override
    public void reiniciar() {
        position = 0;

    }

    @Override
    public Usuario siguiente() {
        Usuario usuario = usuarios.get(position);
        position = position + 1;

        return usuario;
    }
}
