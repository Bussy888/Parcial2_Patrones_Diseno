package Ejercicio4;

public class Client {
    public static void main(String[] args) {
        Whatsapp whatsapp = new Whatsapp();

        Usuario user1 = new Usuario(whatsapp);
        user1.setNickname("usuario1");
        user1.setNombre("Blake Shelton");

        Usuario user2 = new Usuario(whatsapp);
        user2.setNickname("usuario2");
        user2.setNombre("Elvis Presley");

        Usuario user3 = new Usuario(whatsapp);
        user3.setNickname("usuario3");
        user3.setNombre("Juan Alberto");
        Usuario user4 = new Usuario(whatsapp);
        user4.setNickname("usuario4");
        user4.setNombre("Warren Zeiders");
        Usuario user5 = new Usuario(whatsapp);
        user5.setNickname("usuario5");
        user5.setNombre("Riley Thomas");
        Usuario user6 = new Usuario(whatsapp);
        user6.setNickname("usuario6");
        user6.setNombre("Morgan Wallen");
        Usuario user7 = new Usuario(whatsapp);
        user7.setNickname("usuario7");
        user7.setNombre("Cody Jinks");
        Usuario user8 = new Usuario(whatsapp);
        user8.setNickname("usuario8");
        user8.setNombre("John Price");
        Usuario user9 = new Usuario(whatsapp);
        user9.setNickname("usuario9");
        user9.setNombre("Chris Young");
        Usuario user10 = new Usuario(whatsapp);
        user10.setNickname("usuario10");
        user10.setNombre("Michael Hardy");

        whatsapp.addPersonaToChat(user1).addPersonaToChat(user2)
                .addPersonaToChat(user3).addPersonaToChat(user4)
                .addPersonaToChat(user5).addPersonaToChat(user6)
                .addPersonaToChat(user7).addPersonaToChat(user8)
                .addPersonaToChat(user9).addPersonaToChat(user10);

        user1.send("Hola Elvis Presley!");
        user10.send("Hola a todos!");
    }
}
