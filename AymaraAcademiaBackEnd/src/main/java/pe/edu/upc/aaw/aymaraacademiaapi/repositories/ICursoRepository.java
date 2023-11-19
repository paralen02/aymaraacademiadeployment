package pe.edu.upc.aaw.aymaraacademiaapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.aymaraacademiaapi.entities.Curso;
import java.util.List;

@Repository
public interface ICursoRepository extends JpaRepository<Curso, Integer> { }