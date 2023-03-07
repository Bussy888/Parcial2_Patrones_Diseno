package Ejercicio6.ObserverStrategyMediator;

public interface ICanal {
    ICanal suscription(Developer dev);
    ICanal removeSuscription(Developer dev);
    void send1a1(String mensaje, Persona emisor, Persona receptor );
    void send1aTodos(String mensaje, Persona persona);
}
