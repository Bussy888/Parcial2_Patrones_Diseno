package Ejercicio3;

public class SortPocos implements IStrategy{
    @Override
    public void ordenamiento(int cantidad) {
        System.out.println("La cantidad actual de celulares es: "+cantidad);
        System.out.println("Se debe aplicar el algoritmo para pocos celulares (BUBBLE SORT)");

    }
}
