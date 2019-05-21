package es.fiandeira.usuario.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import es.fiandeira.usuario.models.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	@Query("Usuarios u FROM Usuario u  WHERE u.id = :idUsuario")
	Usuario buscarUsuarioPorId(@Param("idUsuario") Long idUsuario);
	
	@Query("Usuarios u FROM Usuario u  WHERE u.correo = :correo")
	List<Usuario> buscarUsuarioPorCorreo(@Param("correo") String correo);
	
}
