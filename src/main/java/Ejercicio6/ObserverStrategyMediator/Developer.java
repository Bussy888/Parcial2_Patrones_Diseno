package Ejercicio6.ObserverStrategyMediator;

public class Developer implements Persona{
    private String nickname;
    private String nombre;
    protected ICanal canal;

    @Override
    public void recibir(String mensaje) {
        showInfo();
        System.out.println("Nueva notficacion-> "+mensaje);
    }


    @Override
    public void showInfo() {
        System.out.println("DEVELOPER-> Nombre:"+nombre+" Nickname: "+nickname);
    }


    public Developer(String nickname, String nombre) {
        this.nickname = nickname;
        this.nombre = nombre;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ICanal getCanal() {
        return canal;
    }

    public Developer setCanal(ICanal canal) {
        this.canal = canal;
        return this;
    }
}
