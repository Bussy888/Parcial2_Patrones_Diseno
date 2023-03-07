package Ejercicio5.ObserverMemento;

import java.util.HashMap;
import java.util.Map;

public class Git {
    private Map<String, Memento> commits = new HashMap<>();


    public void createCommit(Memento memento){
        commits.put(memento.getFecha(), memento);
    }

    public Memento getCommit(String hash){

        try{
            return commits.get(hash);

        } catch (Exception e){
            System.out.println("Commit no registrado");
            return null;
        }

    }
}
