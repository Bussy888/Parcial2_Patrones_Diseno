package Ejercicio1;

public class Memento {
    private Tesis tesis;
    private int nDeRevision;

    public Memento(Tesis tesis, int nDeRevision){
        this.tesis = tesis;
        this.nDeRevision = nDeRevision;
    }
    public Tesis getTesis(){
        return  tesis;
    }
}
