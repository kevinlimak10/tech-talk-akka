package actor;

import akka.actor.AbstractActor;
import domain.Ingrediente;
import domain.OutrosIngrediente;
import domain.StatusDrink;

import java.util.List;

public class AssistenteActor extends AbstractActor {

    List<Ingrediente> ingredientes;

    private int ingredientesPegados;

    public AssistenteActor(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public Receive createReceive() {
        return receiveBuilder().
                matchEquals(StatusDrink.PROXIMO_INGREDIENTE,status ->{
                   buscarIngrediente();
                }).
                build();
    }

    private void buscarIngrediente() {
        log("Sou o assistente: "+ getContext().getSelf().path().name() +"> "+ " peguei "+ this.ingredientesPegados + " ingredientes");
        if (ingredientesPegados == ingredientes.size()) {
            getSender().tell(StatusDrink.FINALIZADO, getSelf());
            log("Sou o assistente: "+ getContext().getSelf().path().name() +">"+ " peguei todos os ingredientes");
        }else {

            Ingrediente ingrediente = ingredientes.get(ingredientesPegados);
            log("Sou o assistente: "+ getContext().getSelf().path().name() +"> "+ " vou pegar o " + ingrediente.toString());
            if (ingrediente.equals(OutrosIngrediente.class)) {
                System.out.println(ingrediente.toString());
            } else {
                ingrediente.fazerAcao();
            }
            getSender().tell(ingrediente, getSelf());
        }
        ingredientesPegados++;
    }

    public void log(String log){
        System.out.println(log);
    }
}
