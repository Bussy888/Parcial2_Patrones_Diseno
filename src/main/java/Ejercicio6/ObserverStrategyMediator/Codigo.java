package Ejercicio6.ObserverStrategyMediator;

public class Codigo implements IEstructurador {
    @Override
    public String mensaje(Developer dev) {
        String informar = "Nombre:"+ dev.getNombre()+" Nickname:"+dev.getNickname()+". Esta subiendo codigo ";
        return informar;
    }
}
