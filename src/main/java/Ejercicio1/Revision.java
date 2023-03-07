package Ejercicio1;

import java.util.HashMap;
import java.util.Map;

public class Revision {
    private Map<String, Memento> mementos = new HashMap<>();

    public Revision createRevision(String nDeRevision, Memento memento){
        System.out.println("Revision "+nDeRevision+" Hecha");
        memento.getTesis().showInfo();
        mementos.put(nDeRevision, memento);
        return this;
    }
    public Memento getRevision(String key) throws Exception{
        if(mementos.containsKey(key)){
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("SE HA RESTAURADO A LA REVISON #"+key);
            return mementos.get(key);
        } else{
            throw new Exception("NO EXISTE ESA REVISION");
        }
    }
}
