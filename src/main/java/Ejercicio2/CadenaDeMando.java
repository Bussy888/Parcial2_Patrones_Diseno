package Ejercicio2;

public class CadenaDeMando implements IEjercito{
    private IEjercito next;
    @Override
    public void setNext(IEjercito ejercito) {
        next = ejercito;
    }

    @Override
    public IEjercito next() {
        return next;
    }

    @Override
    public void orden(Orden orden) {
        Cabo cabo = new Cabo();
        Coronel coronel = new Coronel();
        Teniente teniente = new Teniente();
        General general = new General();

        this.setNext(cabo);
        cabo.setNext(coronel);
        coronel.setNext(teniente);
        teniente.setNext(general);

        this.next.orden(orden);
    }
}
