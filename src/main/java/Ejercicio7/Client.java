package Ejercicio7;

public class Client {
    public static void main(String[] args) {
        PersonalBancario personal = new PersonalBancario();
        Persona carlos = new Persona("Carlos");
        Prestamo prestamo = new Prestamo();
        carlos.pedirPrestamo(2000, prestamo,personal);
        carlos.pagar(100);
        carlos.pagar(500);
        carlos.pagar(1000);
        carlos.pagar(1000);

    }
}
