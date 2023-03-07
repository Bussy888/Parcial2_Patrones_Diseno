package Ejercicio2;

public class Orden {
    String tipo;
    String descripcion;

    public Orden(String tipo, String descripcion) {
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void showInfo(){
        System.out.println("_____NUEVA ORDEN_____");
        System.out.println("TIPO DE ORDEN: "+tipo);
        System.out.println("DESCRIPCION: "+descripcion);
    }
}
