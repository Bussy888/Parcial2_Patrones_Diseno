package Ejercicio2;

public class Client {
    public static void main(String[] args) {
        CadenaDeMando cadena = new CadenaDeMando();

        cadena.orden(new Orden("Limpieza","Limpiar e; inodoro de la oficina del general"));
        cadena.orden(new Orden("Desbloqueos", "Despejar las manifestaciones del centro"));
        cadena.orden(new Orden("Disciplina", "Dar disciplina a los cabos"));
        cadena.orden(new Orden("Entrevistas", "Entrevistar a los nuevos satinadores"));
    }
}
