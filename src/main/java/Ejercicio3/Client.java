package Ejercicio3;

public class Client {
    public static void main(String[] args) {
        Tienda tienda = new Tienda("Phone Store");
        tienda.addCelular(new Celular("Hot 20S","Infinix","media",1200))
                .addCelular(new Celular("Galaxy S8","Samsung","media",800))
                .addCelular(new Celular("IPhone 14", "Apple","Alta",12000))
                .addCelular(new Celular("Galaxy s7","Samsung","Baja",700))
                .addCelular(new Celular("X3","Poco","Media",1000))
                .addCelular(new Celular("M3","Sony","Baja",500));
        if(tienda.getCelularList().size() <= 5){
            tienda.setStrategy(new SortPocos());
        }else {
            tienda.setStrategy(new SortMuchos());
        }
        tienda.ordenamiento();
    }
}
