package Ejercicio7;

public class Encargado implements IPersonalBancario{
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
        System.out.println("#ENCARGADO DE PRESTAMOS");
        System.out.println(porcentaje*100+ "% Pagado");
        if(porcentaje >= 1){
            System.out.println("El encargado de prestamos de prestamos le devuelve todos sus documentos");

        }else{
            System.out.println("El encargado de prestamos no puede hacerse cargo de este pago");
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
