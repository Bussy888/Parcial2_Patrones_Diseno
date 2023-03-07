package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private List<Celular> celularList = new ArrayList<>();
    private String nombre;
    private IStrategy strategy;


    public Tienda addCelular(Celular celular){
        this.celularList.add(celular);
        return this;
    }

    public Tienda(String nombre) {
        this.nombre = nombre;
    }

    public List<Celular> getCelularList() {
        return celularList;
    }

    public void setCelularList(List<Celular> celularList) {
        this.celularList = celularList;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public IStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void ordenamiento(){
        this.strategy.ordenamiento(this.celularList.size());
    }
}
