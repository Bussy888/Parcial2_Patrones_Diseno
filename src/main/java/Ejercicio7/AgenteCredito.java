package Ejercicio7;

public class AgenteCredito implements IPersonalBancario{
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
        System.out.println("#AGENTE DE CREDITO");
        System.out.println(porcentaje*100+ "% Pagado");
        if(porcentaje>=0.26 && porcentaje <= 0.50){
            System.out.println("El agente de credito registro su pago y le ofrece refinanciar su prestamo");
        }else{
            System.out.println("El agente de credito no puede hacerse cargo de este pago");
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
