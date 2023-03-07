package Ejercicio4;

public class Usuario extends Persona {
    public Usuario(ICanal canal){
        super(canal);
    }
    @Override
    public void send(String msg) {

        this.canal.send(msg,this);
    }

    @Override
    public void received(String msg) {
        this.showInfo();
        System.out.println("Mensaje recibido --> "+msg+"\n");
    }
}
