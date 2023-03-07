package Ejercicio6.ObserverStrategyMediator;

public class Backlog implements IEstructurador {

    @Override
    public String mensaje(Developer dev) {
        String informar = "Nombre:"+ dev.getNombre()+" Nickname:"+dev.getNickname()+" Quiere tomar una tarea del Backlog ";
        return informar;
    }
}
