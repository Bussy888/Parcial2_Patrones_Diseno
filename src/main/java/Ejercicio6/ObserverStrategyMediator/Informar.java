package Ejercicio6.ObserverStrategyMediator;

public class Informar {
    private IEstructurador estructurador;

    public  Informar(IEstructurador estructurador){
        this.estructurador=estructurador;
    }

    public String crearInforme(Developer dev){
        return this.estructurador.mensaje(dev);
    }
}
