package Ejercicio7;

public interface IPersonalBancario {

    void setNext(IPersonalBancario next);
    IPersonalBancario next();
    void pago(double porcentaje);
    void setPorcentaje(double porcentaje);
}
