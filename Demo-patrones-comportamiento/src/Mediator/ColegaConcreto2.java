package Mediator;

public class ColegaConcreto2 extends Colega {
    @Override
    void recibe() {
        System.out.println("he recivido mensaje, soy colegaconcreto2");
    }

    @Override
    void envia() {
        System.out.println("soy colegaconcreto2, envio mensaje");
        mediator.reenvia(this);

    }
}
