package co.edu.poli.actividad10.modelo;

import java.io.Serializable;
import java.time.LocalDate;

public class Taller implements Serializable {

    private static final long serialVersionUID = 1L;

    private String codigo;
    private String nombre;
    private String duracion;
    private LocalDate fechaDeRealizacion;
    private String nivelPractivo;
    private String recursoExterno;
    private boolean asistio;

    public Taller(String codigo, String nombre, String duracion, LocalDate fechaDeRealizacion, String nivelPractivo, String recursoExterno, boolean asistio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.duracion = duracion;
        this.fechaDeRealizacion = fechaDeRealizacion;
        this.nivelPractivo = nivelPractivo;
        this.recursoExterno = recursoExterno;
        this.asistio = asistio;
    }

    // Getters y setters

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDuracion() { return duracion; }
    public void setDuracion(String duracion) { this.duracion = duracion; }

    public LocalDate getFechaDeRealizacion() { return fechaDeRealizacion; }
    public void setFechaDeRealizacion(LocalDate fechaDeRealizacion) { this.fechaDeRealizacion = fechaDeRealizacion; }

    public String getNivelPractivo() { return nivelPractivo; }
    public void setNivelPractivo(String nivelPractivo) { this.nivelPractivo = nivelPractivo; }

    public String getRecursoExterno() { return recursoExterno; }
    public void setRecursoExterno(String recursoExterno) { this.recursoExterno = recursoExterno; }

    public boolean isAsistio() { return asistio; }
    public void setAsistio(boolean asistio) { this.asistio = asistio; }

    @Override
    public String toString() {
        return "Taller{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", duracion='" + duracion + '\'' +
                ", fechaDeRealizacion=" + fechaDeRealizacion +
                ", nivelPractivo='" + nivelPractivo + '\'' +
                ", recursoExterno='" + recursoExterno + '\'' +
                ", asistio=" + asistio +
                '}';
    }
}
