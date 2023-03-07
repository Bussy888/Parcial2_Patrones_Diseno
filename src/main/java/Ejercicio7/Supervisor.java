package Ejercicio7;

public class Supervisor implements IPersonalBancario{
    private IPersonalBancario next;
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
        System.out.println("#SUPERVISOR");
        System.out.println(porcentaje*100+ "% Pagado");
        if(porcentaje>=0.51 && porcentaje <= 0.99){
            System.out.println("El supervisor registro su pago y te ofrece nuevos prestamos");
        }else{
            System.out.println("El supervisor no puede hacerse cargo de este pago");
            this.next.pago(porcentaje);
        }
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    @Override
    public void setPorcentaje(double porcentaje) {
        this.porcentaje=porcentaje;
    }
}
