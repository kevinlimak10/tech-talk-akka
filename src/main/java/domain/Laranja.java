package domain;

public class Laranja implements Ingrediente {

    private int tempoEspera = 10000;

    @Override
    public void fazerAcao() {
        try {
            Thread.sleep(tempoEspera);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString(){
        return "Laranja";
    }
}
