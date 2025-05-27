package co.edu.poli.actividad10.servicios;

import co.edu.poli.actividad10.modelo.Taller;

public interface OperacionArchivo {
    
    String serializar(Taller[] tallercito, String path, String name);

    Taller[] deserializar(String path, String name);

    String create(Taller tallercito);

    Taller readOne(String codigo);  // Usamos String para código

    String update(String codigo, Taller tallercito);

    Taller delete(String codigo);

    Taller[] readAll();
}
