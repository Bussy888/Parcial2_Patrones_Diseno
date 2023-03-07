package Ejercicio2;

public interface IEjercito {
    void setNext(IEjercito ejercito);
    IEjercito next();
    void orden(Orden orden);
}
