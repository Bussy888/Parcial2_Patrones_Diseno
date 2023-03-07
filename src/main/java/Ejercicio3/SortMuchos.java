package Ejercicio3;

import java.util.Collections;
import java.util.List;

public class SortMuchos implements IStrategy{
    @Override
    public void ordenamiento(int cantidad) {
        System.out.println("La cantidad actual de celulares es: "+cantidad);
        System.out.println("Se debe aplicar el algoritmo para muchos celulares (QUICK SORT)");

    }


}
