package Ejercicio4;

public abstract class Persona {
    protected  ICanal canal;
    private String nombre;
    private String nickname;

    public Persona(ICanal canal){
        this.canal=canal;
    }

    public ICanal getCanal() {
        return canal;
    }

    public void setCanal(ICanal canal) {
        this.canal = canal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public void showInfo(){
        System.out.println("-------------------------");
        System.out.println("Nickname: "+nickname);
        System.out.println("Nombre: "+nombre);
        System.out.println("-------------------------");

    }
    public abstract void send(String msg);
    public abstract void received(String msg);
}
