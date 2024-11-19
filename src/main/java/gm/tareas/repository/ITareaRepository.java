package gm.tareas.repository;

import gm.tareas.model.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITareaRepository extends JpaRepository<Tarea,Integer> {
}
