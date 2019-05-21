package es.fiandeira.rangos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import es.fiandeira.rangos.models.Rangos;
import es.fiandeira.rangos.models.RangosPK;

@Repository
public interface RangosRepository extends JpaRepository<Rangos, RangosPK> {

	@Query("SELECT u FROM Rangos u WHERE u.rangosPK.idUsuario = :idUsuario")
	public List<Rangos> buscarRangosPorIdUsuario(@Param("idUsuario") Long idUsuario);
	
}
