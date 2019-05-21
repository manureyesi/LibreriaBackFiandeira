package es.fiandeira.token.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import es.fiandeira.token.models.Token;

@Repository
public interface TokenRepository extends JpaRepository<Token, Long> {

	@Query("SELECT u FROM Token u  WHERE u.id = :idToken")
	public Token buscarTokenPorIdToken (@Param("idToken") final Long idToken);
	
	@Query("SELECT u FROM Token u  WHERE u.token = :token")
	public Token buscarTokenPorToken (@Param("token") final String token);
	
	@Query("SELECT u FROM Token u  WHERE u.idUsuario = :idUsuario")
	public Token buscarTokenPorIdUsuario (@Param("idUsuario") final Long idUsuario);
	
}
