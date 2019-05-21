package es.fiandeira.usuario.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "USUARIOS")
public class Usuario implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 6524631780164189774L;

	@Id
	@GenericGenerator(name = "IDGenerator", strategy = "increment")
	@GeneratedValue(generator = "IDGenerator")
	@Column(name = "ID", unique = true, nullable = false)
	private Long id;
	
	@Column(name = "NOMBRE", nullable = false)
	private String nombre;
	
	@Column(name = "APELLIDOS", nullable = true)
	private String apellidos;
	
	@Column(name = "CORREO", unique = true, nullable = false)
	private String correo;
	
	@Column(name = "SALT", nullable = false)
	private String salt;
	
	@Column(name = "PASSWORD_SALT", nullable = false)
	private String paswordSalt;

	/**
	 * Usuario
	 */
	public Usuario() {
	}

	/**
	 * Usuario
	 * @param nombre
	 * @param apellidos
	 * @param correo
	 * @param salt
	 * @param paswordSalt
	 */
	public Usuario(String nombre, String apellidos, String correo, String salt, String paswordSalt) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.correo = correo;
		this.salt = salt;
		this.paswordSalt = paswordSalt;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * @return the salt
	 */
	public String getSalt() {
		return salt;
	}

	/**
	 * @param salt the salt to set
	 */
	public void setSalt(String salt) {
		this.salt = salt;
	}

	/**
	 * @return the paswordSalt
	 */
	public String getPaswordSalt() {
		return paswordSalt;
	}

	/**
	 * @param paswordSalt the paswordSalt to set
	 */
	public void setPaswordSalt(String paswordSalt) {
		this.paswordSalt = paswordSalt;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Usuarios [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", correo=");
		builder.append(correo);
		builder.append(", salt=");
		builder.append(salt);
		builder.append(", paswordSalt=");
		builder.append(paswordSalt);
		builder.append("]");
		return builder.toString();
	}
	
}
