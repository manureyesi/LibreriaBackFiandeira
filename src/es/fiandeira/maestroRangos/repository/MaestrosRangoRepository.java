package es.fiandeira.maestroRangos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import es.fiandeira.maestroRangos.models.MaestrosRangos;

@Repository
public interface MaestrosRangoRepository extends JpaRepository<MaestrosRangos, Long> {

	@Query("SELECT u FROM MaestrosRangos u WHERE u.id = :id")
	public MaestrosRangos buscarMaestroRangoPorId(@Param("id") Long id);
	
}
