package State;

public class EstadoDesbloqueado extends Estado{
    public EstadoDesbloqueado(Telefono telefono){
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "El telefono esta desbloqueado continua";
    }

    @Override
    public String abrisCamara() {
        telefono.cambiaEstado(new EstadoCamaraAbierta(telefono));
        return "camara abierta, puedes hacer la foto";
    }

    @Override
    public String hacerFoto() {
        return "abre la camara primero";
    }

}