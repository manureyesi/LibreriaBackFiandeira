package es.fiandeira.maestroRangos.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MAESTROS_RANGOS")
public class MaestrosRangos implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -2028904119543238579L;

	@Id
	@Column(name = "ID_RANGO", unique = true, nullable = false)
	private Long id;
	
	@Column(name = "NOMBRE", nullable = false, unique = true)
	private String nombre;
	
	@Column(name = "DESCRIPCION", nullable = true)
	private String descripcion;

	/**
	 * 
	 */
	public MaestrosRangos() {
	}

	/**
	 * @param id
	 * @param nombre
	 * @param descripcion
	 */
	public MaestrosRangos(Long id, String nombre, String descripcion) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
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
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MaestrosRangos [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", descripcion=");
		builder.append(descripcion);
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
