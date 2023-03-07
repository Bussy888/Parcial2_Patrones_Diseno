package Ejercicio7;

public class Prestamo {
    private int total=1;
    private int deposito =0;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getDeposito() {
        return deposito;
    }

    public void setDeposito(int deposito) {
        int p = deposito + getDeposito();
        if(p <= total) {
            this.deposito += deposito;
        } else if (p == total) {
            this.deposito = total;
            System.out.println("Completaste el pago de tu prestamo");
        } else {
            System.out.println("Le sobro dinero su cambio es Bs."+ (p-total));
            this.deposito = total;
            System.out.println("Completaste el pago de tu prestamo");
        }
    }
    public double porcentaje(){
        return (double)deposito/total;
    }
}
