package Ejercicio7;

import Ejercicio2.Cabo;

public class PersonalBancario implements IPersonalBancario{
    private  IPersonalBancario next;
    @Override
    public void setNext(IPersonalBancario next) {
        this.next=next;
    }

    @Override
    public IPersonalBancario next() {
        return next;
    }

    @Override
    public void pago(double porcentaje) {
        Cajero cajero = new Cajero();
        AgenteCredito agente = new AgenteCredito();
        Supervisor supervisor = new Supervisor();
        Encargado encargado = new Encargado();

        this.setNext(cajero);
        cajero.setNext(agente);
        agente.setNext(supervisor);
        supervisor.setNext(encargado);
        this.next.pago(porcentaje);
    }

    @Override
    public void setPorcentaje(double porcentaje) {

    }
}
