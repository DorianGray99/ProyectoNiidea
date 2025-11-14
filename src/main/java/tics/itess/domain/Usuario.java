package tics.itess.domain;


public class Usuario {
     private String nombre;
    private String numeroControl;

    public Usuario(String nombre, String numeroControl) {
        this.nombre = nombre;
        this.numeroControl = numeroControl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroControl() {
        return numeroControl;
    }

    public void setNumeroControl(String numeroControl) {
        this.numeroControl = numeroControl;
    }
}
