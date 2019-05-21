package es.fiandeira.rangos.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class RangosPK implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -8849531611758784976L;

	@Column(name = "ID_USUARIO")
	private Long idUsuario;
	
	@Column(name = "ID_RANGO")
	private Long idRango;

	/**
	 * RangosPK
	 */
	public RangosPK() {
	}

	/**
	 * RangosPK
	 * @param idUsuario
	 * @param idRango
	 */
	public RangosPK(Long idUsuario, Long idRango) {
		this.idUsuario = idUsuario;
		this.idRango = idRango;
	}

	/**
	 * @return the idUsuario
	 */
	public Long getIdUsuario() {
		return idUsuario;
	}

	/**
	 * @param idUsuario the idUsuario to set
	 */
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	/**
	 * @return the idRango
	 */
	public Long getIdRango() {
		return idRango;
	}

	/**
	 * @param idRango the idRango to set
	 */
	public void setIdRango(Long idRango) {
		this.idRango = idRango;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RangosPK [idUsuario=");
		builder.append(idUsuario);
		builder.append(", idRango=");
		builder.append(idRango);
		builder.append("]");
		return builder.toString();
	}
	
}
