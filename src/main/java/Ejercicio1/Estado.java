package Ejercicio1;

public class Estado {
    private Tesis tesis;
    public void setEstado(Tesis tesis){
        this.tesis = new Tesis(tesis.getNombreArchivo());
        this.tesis.setCambios(tesis.getCambios());
    }
    public Memento newEstado(int nDeRevision){
        return new Memento(this.tesis,nDeRevision);
    }
    public Tesis restoreEstado(Memento memento){
        this.tesis = memento.getTesis();
        return this.tesis;
    }
}
