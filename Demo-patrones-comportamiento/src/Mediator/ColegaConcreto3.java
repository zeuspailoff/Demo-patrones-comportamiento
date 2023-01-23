package Mediator;

public class ColegaConcreto3 extends Colega {
    @Override
    void recibe() {
        System.out.println("he recivido mensaje, soy colegaconcreto3");
    }

    @Override
    void envia() {
        System.out.println("soy colegaconcreto3, envio mensaje");
        mediator.reenvia(this);

    }
}