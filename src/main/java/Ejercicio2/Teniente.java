package Ejercicio2;

public class Teniente implements IEjercito{
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
        if(orden.getTipo().equals("Disciplina")){
            orden.showInfo();
            System.out.println("La orden sera asignada a un TENIENTE lo mas pronto posible");
            System.out.println();
        }else {
            System.out.println("No se le puede asignar esta orden a alguien de rango no adecuado");
            System.out.println("Esta orden sera transferida a un GENERAL");
            System.out.println();
            this.next.orden(orden);
        }
    }
}
