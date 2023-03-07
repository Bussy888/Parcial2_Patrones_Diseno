package Ejercicio5.ObserverMemento;

public interface IGithub {
    void subscription(IUser user);
    void removeDev(IUser user);
    void notify(String mensaje);
}
