package Ejercicio5.ObserverMemento;

public class Client {
    public static void main(String[] args) {
        Repositorio repositorio = new Repositorio();
        Git git = new Git();
        Desarrollador carlos =new Desarrollador("Carlos","Carl123");
        Desarrollador mortadelo = new Desarrollador("Mortedelo","Brut89");
        Desarrollador filemon=new Desarrollador("Filemon","BlacKNoir");
        repositorio.subscription(carlos);
        repositorio.subscription(mortadelo);
        repositorio.subscription(filemon);

        Commit commit = new Commit();
        commit.addCodigo("public static void main(String[] args) {}");
        repositorio.setCommit(commit);
        git.createCommit(repositorio.newMemento("First Commit","6/3/2023"));
        commit.addCodigo("New Palabra()");
        repositorio.setCommit(commit);
        git.createCommit(repositorio.newMemento("Second Commit","7/3/2023"));
        commit.addCodigo("New Personaje()");
        repositorio.setCommit(commit);
        git.createCommit(repositorio.newMemento("Third Commit","8/4/2023"));
        commit.addCodigo("return this.personaje");
        repositorio.setCommit(commit);
        git.createCommit(repositorio.newMemento("Fourth Commit","21/4/2023"));
        commit.addCodigo("new Place()");
        repositorio.setCommit(commit);
        git.createCommit(repositorio.newMemento("Fifth Commit","29/05/2023"));

        System.out.println("Restaurar First Commit");
        commit = repositorio.restoreCommit(git.getCommit("6/3/2023"));
        commit.showInfo();

        repositorio.removeDev(carlos);
        repositorio.removeDev(mortadelo);
        repositorio.removeDev(filemon);
        repositorio.subscription(new Desarrollador("Victor","EaterMatterLad"));
        repositorio.subscription(new Desarrollador("Mateo","Bussy888"));
        repositorio.subscription(new Desarrollador("Luciano","Lutyvr02"));

        System.out.println("Restaurar Fifth Commit");
        commit = repositorio.restoreCommit(git.getCommit("29/05/2023"));
        commit.showInfo();
    }
}
