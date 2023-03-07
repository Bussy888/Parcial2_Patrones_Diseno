package Ejercicio7;

public class Cajero implements IPersonalBancario{
    private IPersonalBancario next;
    private Prestamo prestamo;
    private double porcentaje;
    @Override
    public void setNext(IPersonalBancario next) {
        this.next = next;
    }

    @Override
    public IPersonalBancario next() {
        return next;
    }

    @Override
    public void pago(double porcentaje) {
        System.out.println("#CAJERO");
        System.out.println(porcentaje*100+ "% Pagado");
        if(porcentaje>=0 && porcentaje <= 0.25){
            System.out.println("El cajero registro su pago");
        }else{
            System.out.println("El cajero no puede hacerse cargo de este pago");
            this.next.pago(porcentaje);
        }
    }

    public double getPorcentaje(Prestamo prestamo) {
        this.prestamo=prestamo;
        return this.prestamo.porcentaje();
    }

    @Override
    public void setPorcentaje(double porcentaje) {
        this.porcentaje=porcentaje;
    }

}
