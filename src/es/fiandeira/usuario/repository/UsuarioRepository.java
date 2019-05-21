package es.fiandeira.usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import es.fiandeira.usuario.models.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	@Query("SELECT u FROM Usuario u  WHERE u.id = :idUsuario")
	public Usuario buscarUsuarioPorId(@Param("idUsuario") final Long idUsuario);
	
	@Query("SELECT u FROM Usuario u  WHERE u.correo = :correo")
	public Usuario buscarUsuarioPorCorreo(@Param("correo") final String correo);
	
}
