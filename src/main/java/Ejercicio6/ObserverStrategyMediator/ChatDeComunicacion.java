package Ejercicio6.ObserverStrategyMediator;

import java.util.ArrayList;
import java.util.List;

public class ChatDeComunicacion implements ICanal {
    private List<Developer> devs = new ArrayList<>();

    @Override
    public ICanal suscription(Developer dev) {
        devs.add(dev);
        return this;
    }

    @Override
    public ICanal removeSuscription(Developer dev) {
        devs.remove(dev);
        return this;
    }

    @Override
    public void send1a1(String mensaje, Persona emisor, Persona receptor) {
        System.out.print("De: ");
        emisor.showInfo();
        System.out.print("Para: ");
        for(Persona persona:devs){
            if(receptor.equals(persona)){
                persona.recibir(mensaje);
            }
        }
    }

    @Override
    public void send1aTodos(String mensaje, Persona persona) {
        System.out.print("De: ");
        persona.showInfo();
        for (Persona persona1 : devs){
            if (!persona.equals(persona1)){
                persona1.recibir(mensaje);
            }
        }
    }
}
