package es.fiandeira.rangos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import es.fiandeira.rangos.models.Rangos;
import es.fiandeira.rangos.models.RangosPK;

public interface RangosRepository extends JpaRepository<Rangos, RangosPK> {

	@Query("SELECT u FROM Rangos u WHERE u.RangosPK.idUsuario = :idUsuario")
	List<Rangos> buscarRangosPorIdUsuario(@Param("idUsuario") Long idUsuario);
	
}
