package Ejercicio7;

public class Persona {
    private String nombre;
    private int dinero;
    private IPersonalBancario personalBancario;
    private Prestamo prestamo;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
    public void pagar(int dinero){
        prestamo.setDeposito(dinero);
        double deposito = prestamo.getDeposito();
        double porcentaje = deposito/prestamo.getTotal();
        personalBancario.setPorcentaje(porcentaje);
        personalBancario.pago(porcentaje);
    }
    public void pedirPrestamo(int total, Prestamo prestamo,PersonalBancario personal){
        this.prestamo=prestamo;
        this.prestamo.setTotal(total);
        this.personalBancario=personal;
        this.personalBancario.setPorcentaje((double) prestamo.getDeposito()/prestamo.getTotal());
    }

}
