package Ejercicio6.ObserverStrategyMediator;

public class Client {
    public static void main(String[] args) {
        String informe = "codigo";
        Informar informar;
        ChatDeComunicacion chat = new ChatDeComunicacion();
        Developer d1 = new Developer("HARDY","Michael Hardy").setCanal(chat);
        Developer d2 = new Developer("CardiC", "Tobias Forge").setCanal(chat);
        Developer d3 = new Developer("Red","Morgan Wallen");
        Developer d4 = new Developer("MShadows","Matt Shadows");

        chat.suscription(d1);
        chat.suscription(d2);
        chat.suscription(d3);
        chat.suscription(d4);
        if(informe.equals("codigo")){
            informar = new Informar(new Codigo());
        }else{
            informar = new Informar(new Backlog());
        }
        chat.send1aTodos(informar.crearInforme(d1),d1);


    }
}
