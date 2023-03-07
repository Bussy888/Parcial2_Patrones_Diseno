package Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Whatsapp implements ICanal{
    private List<Usuario> usuarios = new ArrayList<>();

    public Whatsapp addPersonaToChat(Usuario usuario){
        usuarios.add(usuario);
        return this;
    }

    @Override
    public void send(String mensaje, Persona persona) {
        for(Usuario user : usuarios){
            if(!persona.getNickname().equals(user.getNickname())){
                if(persona.getNickname().equals("usuario1") && user.getNickname().equals("usuario2")){
                    user.received(mensaje);
                }else if(persona.getNickname().equals("usuario10")){
                    user.received(mensaje);
                }

            }
        }
    }


}
