package Ejercicio5.ObserverMemento;

import Ejercicio4.ICanal;
import Ejercicio4.Persona;

import java.util.ArrayList;
import java.util.List;

public class Repositorio implements IGithub {
    private Commit commit;
    private String nombre;
    private List<IUser> desarroladoresList = new ArrayList<>();

    public Commit restoreCommit(Memento memento) {
        this.commit = memento.getCommit();
        System.out.println("Restaurando Commit: "+memento.getFecha());
        System.out.println("Descripcion: "+memento.getDescripcion());
        System.out.println();
        notify("Commit Restaurado de Fecha: "+memento.getFecha()+" con Descripcion: "+memento.getDescripcion());
        return this.commit;
    }
    public Memento newMemento(String descripcion, String fecha){
        return new Memento(commit,descripcion,fecha);

    }

    public void setCommit(Commit commit) {
        System.out.println("Realizando Commit...");
        this.commit = commit;
        this.commit.setLineasCodigo(commit.getLineasCodigo());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<IUser> getDesarroladoresList() {
        return desarroladoresList;
    }

    public void setDesarroladoresList(List<IUser> desarroladoresList) {
        this.desarroladoresList = desarroladoresList;
    }

    @Override
    public void subscription(IUser user) {
        desarroladoresList.add(user);
    }

    @Override
    public void removeDev(IUser user) {
        desarroladoresList.remove(user);

    }

    @Override
    public void notify(String mensaje) {
        System.out.println("-> Enviando Notificaciones");
        this.desarroladoresList.stream().forEach(a -> a.recibir(mensaje));
    }
}
