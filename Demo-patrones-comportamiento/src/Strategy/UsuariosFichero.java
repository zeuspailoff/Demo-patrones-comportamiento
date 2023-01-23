package Strategy;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class UsuariosFichero implements Usuarios{
    private String ficherosUsuarios = "usuarios.txt";
    private PrintStream fichero;

    public UsuariosFichero() {
        try{
            fichero = new PrintStream(ficherosUsuarios);

        }catch (Exception e){
            System.out.println("no puedo abrirlo:  "+ e.getMessage());
        }

    }
    @Override
    public void crear (String nombre){
        fichero.println(nombre);

    }
    @Override
    public ArrayList<String> listar() {
        ArrayList<String> usuarios = new ArrayList();
        try {
            Scanner scanner = new Scanner(new File(ficherosUsuarios));
            while (scanner.hasNext()) {
                usuarios.add(scanner.next());
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
        return usuarios;

    }
}
