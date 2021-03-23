package actor;

import akka.actor.*;
import domain.Ingrediente;
import domain.StatusDrink;
import domain.drinks.AguaDivertida;
import domain.drinks.Condessa;
import domain.drinks.Drinks;

public class BartenderActor extends AbstractActor {

    private int driksAtivos = 0;

    @Override
    public Receive createReceive() {
        return receiveBuilder().
                match(Ingrediente.class,ingrediente -> {
                    log("Bartender: recebi o ingrediente "+ ingrediente.toString());
                    getSender().tell(StatusDrink.PROXIMO_INGREDIENTE, getSelf());

                })
                .match(Drinks.class, drink -> {

                    ActorRef assistente = getContext().actorOf(Props.create(AssistenteActor.class,drink.pegarIngredientes()),
                            drink.getClienteSolicitante());
                    driksAtivos++;
                    getContext().watch(assistente);
                    assistente.tell(StatusDrink.PROXIMO_INGREDIENTE, getSelf());

                })
                .matchEquals(StatusDrink.FINALIZADO,statusDrink -> {
                    driksAtivos--;
                    log("Finalizei Drink! Tenho mais " + driksAtivos + " na lista");
                    getContext().unwatch(getSender());
                    getSender().tell(Terminated.class, getSender());
                }).build();
    }

    public void log(String log){
        System.out.println(log);
    }

}
