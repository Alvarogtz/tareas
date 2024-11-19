package gm.tareas.services;

import gm.tareas.model.Tarea;
import gm.tareas.repository.ITareaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface IServiceTarea {
    public List<Tarea> listarTareas();
    public Tarea buscarTareaPorId(Integer idTarea);
    public void guardarTarea(Tarea tarea);
    public void eliminarTarea(Tarea tarea);
}
