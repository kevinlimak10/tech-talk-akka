package domain;

public class Coco implements Ingrediente {
    private int tempoEspera = 25000;


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
        return "Coco";
    }
}
