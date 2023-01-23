package State;

public class EstadoHacerFoto extends Estado{
    public EstadoHacerFoto(Telefono telefono){
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "MOVIL DESBLOQUEADO";
    }

    @Override
    public String abrisCamara() {
        return "YA ABIERTA ";
    }

    @Override
    public String hacerFoto() {
        telefono.cambiaEstado(new EstadoBloqueado(telefono));
        return "FOTO HECHA ";
    }

}