package Ejercicio1;

public class Client {
    public static void main(String[] args) {
        Revision revision = new Revision();
        Estado estado = new Estado();

        Tesis tesis = new Tesis("ChatGPT");

        tesis.setCambios("Se ha creado el primer borrador");
        estado.setEstado(tesis);
        revision.createRevision("1",estado.newEstado(1));

        tesis.setCambios("Se ha actualizado el resumen y la bibliografia");
        estado.setEstado(tesis);
        revision.createRevision("2",estado.newEstado(2));

        tesis.setCambios("Se ha realizado la tercera actualizacion de la tesis");
        estado.setEstado(tesis);
        revision.createRevision("3",estado.newEstado(3));

        tesis.setCambios("Se ha realizado la cuarta actualizacion de la tesis");
        estado.setEstado(tesis);
        revision.createRevision("4",estado.newEstado(4));

        tesis.setCambios("Se ha realizado la quinta actualizacion de la tesis");
        estado.setEstado(tesis);
        revision.createRevision("5",estado.newEstado(5));

        try{
            tesis = estado.restoreEstado(revision.getRevision("3"));
            tesis.showInfo();
        } catch (Exception e2){
            System.out.println(e2.getMessage());
        }



    }
}
