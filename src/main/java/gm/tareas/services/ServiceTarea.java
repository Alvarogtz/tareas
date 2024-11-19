package gm.tareas.services;

import gm.tareas.model.Tarea;
import gm.tareas.repository.ITareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTarea implements IServiceTarea{

    @Autowired
    private ITareaRepository tareaRepository;

    @Override
    public List<Tarea> listarTareas() {
       return tareaRepository.findAll();
    }

    @Override
    public Tarea buscarTareaPorId(Integer idTarea) {
        return tareaRepository.findById(idTarea).orElse(null);
    }

    @Override
    public void guardarTarea(Tarea tarea) {
        tareaRepository.save(tarea);
    }

    @Override
    public void eliminarTarea(Tarea tarea) {
        tareaRepository.delete(tarea);
    }
}
