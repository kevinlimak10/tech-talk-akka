package domain.drinks;

import domain.Ingrediente;
import domain.Laranja;
import domain.OutrosIngrediente;

import java.util.ArrayList;
import java.util.List;

public class AguaDivertida extends Drinks{

    private List<Ingrediente> ingredientes;

    public AguaDivertida(String nomeCliente) {
        super(nomeCliente);
        this.ingredientes = new ArrayList<>();
        this.ingredientes.add(new OutrosIngrediente("200 ml de Agua"));
        this.ingredientes.add(new OutrosIngrediente("1 dose de vodka"));
        this.ingredientes.add(new OutrosIngrediente("gelo a gosto"));
        this.ingredientes.add(new Laranja());//1 pedaço de casca de laranja apertado para soltar o sumo e a goma

    }

    @Override
    public List<Ingrediente> pegarIngredientes() {
        return ingredientes;
    }

}
