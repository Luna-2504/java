package co.edu.poli.actividad10.servicios;

import co.edu.poli.actividad10.modelo.Taller;

public interface CRUD {

    String create(Taller tallercito);

    Taller readOne(String codigo);

    Taller[] readAll();

    String update(String codigo, Taller tallercito);

    Taller delete(String codigo);
}
