package co.edu.poli.actividad10.modelo;

import java.io.Serializable;

public class Recurso implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String nombre;
    private String proveedor;

    public Recurso() {}

    public Recurso(int id, String nombre, String proveedor) {
        this.id = id;
        this.nombre = nombre;
        this.proveedor = proveedor;
    }

    public Recurso(String nombre) {
        this.nombre = nombre;
    }

    // Getters y setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getProveedor() { return proveedor; }
    public void setProveedor(String proveedor) { this.proveedor = proveedor; }

    @Override
    public String toString() {
        return "Recurso{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", proveedor='" + proveedor + '\'' +
                '}';
    }
}
