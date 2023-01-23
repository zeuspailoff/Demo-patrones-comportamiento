package Mediator;

public class ColegaConcreto1 extends Colega {
    @Override
    void recibe() {
        System.out.println("he recivido mensaje, soy colegaconcreto1");
    }

    @Override
    void envia() {
        System.out.println("soy colegaconcreto1, envio mensaje");
        mediator.reenvia(this);

    }
}
