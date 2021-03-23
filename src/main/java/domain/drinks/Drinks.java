package domain.drinks;

import domain.Ingrediente;

import java.util.List;

public abstract class Drinks {

    private String clienteSolicitante;

    public Drinks(String clienteSolicitante) {
        this.clienteSolicitante = clienteSolicitante;
    }

    public String getClienteSolicitante() {
        return clienteSolicitante;
    }

    public void setClienteSolicitante(String clienteSolicitante) {
        this.clienteSolicitante = clienteSolicitante;
    }

    public abstract List<Ingrediente> pegarIngredientes();
}
