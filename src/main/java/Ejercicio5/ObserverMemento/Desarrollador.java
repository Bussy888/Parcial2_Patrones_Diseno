package Ejercicio5.ObserverMemento;

public class Desarrollador implements IUser{

    private String nombre;
    private String nickname;



    public Desarrollador(String nombre, String nickname) {
        this.nombre = nombre;
        this.nickname = nickname;
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
        System.out.println("DESARROLLADOR-> Nombre: "+nombre+" Nickname: "+nickname);
    }


    @Override
    public void recibir(String mensaje) {
        showInfo();
        System.out.println("Nueva Notificacion:"+mensaje);
    }

}
