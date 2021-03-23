package domain.drinks;

import domain.Coco;
import domain.Ingrediente;
import domain.OutrosIngrediente;

import java.util.ArrayList;
import java.util.List;

public class Condessa extends Drinks{

    private List<Ingrediente> ingredientes;

    public Condessa(String nomeCliente) {
        super(nomeCliente);
        this.ingredientes = new ArrayList<>();
        this.ingredientes.add(new OutrosIngrediente("90 ml de uma vodka de sua preferência"));
        this.ingredientes.add(new OutrosIngrediente("pedras de gelo"));
        this.ingredientes.add(new OutrosIngrediente("rodela de limão ou folhas de hortelã"));
        this.ingredientes.add(new Coco());////90 ml de água de coco
    }

    @Override
    public List<Ingrediente> pegarIngredientes() {
        return ingredientes;
    }

}
