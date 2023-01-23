package State;

public class EstadoCamaraAbierta extends Estado{
    public EstadoCamaraAbierta(Telefono telefono){
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "YA LO DESBLOQUEASTE!! NO SABER USAR UN MOVIL?";
    }

    @Override
    public String abrisCamara() {
        return "YA ESTABA ABIERTA!!";
    }

    @Override
    public String hacerFoto() {
        telefono.cambiaEstado(new EstadoHacerFoto(telefono));
        return "YA ESTA";
    }

}
