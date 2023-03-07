package Ejercicio1;

public class Tesis {
    private String nombreArchivo;
    private String cambios;

    public Tesis(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getCambios() {
        return cambios;
    }

    public void setCambios(String cambios) {
        this.cambios = cambios;
    }
    public void showInfo(){
        System.out.println("_____TESIS_____");
        System.out.println("Nombre de Archivo: "+nombreArchivo);
        System.out.println("Cabios Realizados: "+cambios);
    }
}
