package domain.drinks;

import domain.Ingrediente;
import domain.Maca;
import domain.OutrosIngrediente;

import java.util.ArrayList;
import java.util.List;

public class GimTonicaMacaVerde extends Drinks{

    private List<Ingrediente> ingredientes;

    public GimTonicaMacaVerde(String nomeCliente) {
        super(nomeCliente);
        this.ingredientes = new ArrayList<>();
        this.ingredientes.add(new OutrosIngrediente("50 ml de gim (uma dose)"));
        this.ingredientes.add(new OutrosIngrediente("120 ml de água tônica"));
        this.ingredientes.add(new OutrosIngrediente("10 ml de suco de limão."));
        this.ingredientes.add(new Maca());//20 ml de xarope de maçã-verde;
    }

    @Override
    public List<Ingrediente> pegarIngredientes() {
        return ingredientes;
    }

}
