import actor.BartenderActor;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import domain.drinks.AguaDivertida;
import domain.drinks.Condessa;
import domain.drinks.GimTonicaMacaVerde;

public class Start {
    public static void main(String[] args) {


        ActorSystem system = ActorSystem.create("SistemaPrincipal");


        AguaDivertida aguaDivertida = new AguaDivertida("Mikasa");

        Condessa condessa = new Condessa("Brook");

        GimTonicaMacaVerde gimTonicaMacaVerde = new GimTonicaMacaVerde("JohnSnow");

        ActorRef bartender = system.actorOf(Props.create(BartenderActor.class), "BartenderActor");

        bartender.tell(aguaDivertida,ActorRef.noSender());
        bartender.tell(condessa,ActorRef.noSender());
        bartender.tell(gimTonicaMacaVerde,ActorRef.noSender());

    }
}
