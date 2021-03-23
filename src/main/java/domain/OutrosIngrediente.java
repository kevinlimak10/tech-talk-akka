package domain;

public class OutrosIngrediente implements Ingrediente {
    private String descricao;

    public OutrosIngrediente(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString(){
        return descricao;
    }

    @Override
    public void fazerAcao() {

    }
}
