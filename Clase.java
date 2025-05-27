package co.edu.poli.actividad10.modelo;

import java.io.Serializable;

public class Clase implements Serializable {

    private String codigo;
    private String nombre;
    private String fecha;
    private int duracion;
    private int numeroSesion;

    public Clase(String codigo, String nombre, String fecha, int duracion, int numeroSesion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fecha = fecha;
        this.duracion = duracion;
        this.numeroSesion = numeroSesion;
    }

    // Getters y setters (si quieres, pero no son obligatorios aquí)

    @Override
    public String toString() {
        return "Clase{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fecha='" + fecha + '\'' +
                ", duracion=" + duracion +
                ", numeroSesion=" + numeroSesion +
                '}';
    }
}
