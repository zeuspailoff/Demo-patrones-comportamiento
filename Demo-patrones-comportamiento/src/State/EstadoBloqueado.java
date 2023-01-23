package State;

public class EstadoBloqueado extends Estado{
    public EstadoBloqueado(Telefono telefono){
        super(telefono);
    }

    @Override
    public String desbloquear() {
        telefono.cambiaEstado(new EstadoDesbloqueado(telefono));
        return "movil desbloqueado";
    }

    @Override
    public String abrisCamara() {
        return "La camara esta bloqueada Desbloque el movil antes ";
    }

    @Override
    public String hacerFoto() {
        return "La camara esta bloqueada Desbloque el movil antes ";
    }

}
