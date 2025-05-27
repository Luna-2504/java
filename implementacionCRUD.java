package co.edu.poli.actividad10.servicios;

import co.edu.poli.actividad10.modelo.ActividadAcademica;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class implementacionCRUD {
    private List<ActividadAcademica> listaActividades = new ArrayList<>();

    public String create(ActividadAcademica act) {
        if (read(act.getCodigo()) != null) {
            return "Ya existe una actividad con ese código";
        }
        listaActividades.add(act);
        return "Actividad creada";
    }

    public ActividadAcademica read(String codigo) {
        for (ActividadAcademica a : listaActividades) {
            if (a.getCodigo().equals(codigo)) {
                return a;
            }
        }
        return null;
    }

    public ActividadAcademica[] readAll() {
        return listaActividades.toArray(new ActividadAcademica[0]);
    }

    public String update(String codigo, ActividadAcademica act) {
        for (int i = 0; i < listaActividades.size(); i++) {
            if (listaActividades.get(i).getCodigo().equals(codigo)) {
                listaActividades.set(i, act);
                return "Actividad actualizada";
            }
        }
        return "Actividad no encontrada";
    }

    public String delete(String codigo) {
        for (int i = 0; i < listaActividades.size(); i++) {
            if (listaActividades.get(i).getCodigo().equals(codigo)) {
                listaActividades.remove(i);
                return "Actividad eliminada";
            }
        }
        return "Actividad no encontrada";
    }

    public String serializar(String rutaArchivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(rutaArchivo))) {
            oos.writeObject(readAll());
            return "Archivo guardado correctamente";
        } catch (IOException e) {
            e.printStackTrace();
            return "Error al guardar archivo";
        }
    }

    public String deserializar(String rutaArchivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(rutaArchivo))) {
            ActividadAcademica[] arr = (ActividadAcademica[]) ois.readObject();
            listaActividades.clear();
            for (ActividadAcademica a : arr) {
                listaActividades.add(a);
            }
            return "Archivo cargado correctamente";
        } catch (Exception e) {
            e.printStackTrace();
            return "Error al cargar archivo";
        }
    }
}
