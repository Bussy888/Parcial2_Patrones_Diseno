package Ejercicio5.ObserverMemento;

public class Memento {
    private Commit commit;
    private String descripcion;
    private String fecha;

    public Memento(Commit commit, String descripcion, String fecha) {
        this.commit = commit;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public void setCommit(Commit commit) {
        this.commit = commit;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    public Commit getCommit() {
        return commit;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFecha() {
        return fecha;
    }

}
