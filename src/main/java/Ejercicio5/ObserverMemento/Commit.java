package Ejercicio5.ObserverMemento;

import java.util.ArrayList;
import java.util.List;

public class Commit {
    private List<String> lineasCodigo = new ArrayList<>();

    public void addCodigo(String codigo){
        lineasCodigo.add(codigo);
    }

    public List<String> getLineasCodigo(){
        List<String> list1 = new ArrayList<>();
        for(String i : lineasCodigo){
            list1.add(i);
        }
        return list1;
    }

    public void setLineasCodigo(List<String> lineasCodigo){
        this.lineasCodigo = lineasCodigo;
    }

    public void showInfo(){
        System.out.println("New Commit: ");
        for(String aux : lineasCodigo){
            System.out.println(aux);
        }
    }
}
