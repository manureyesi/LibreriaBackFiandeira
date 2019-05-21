package es.fiandeira.rangos.models;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "RANGOS")
public class Rangos implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -4820979292970600220L;

	@EmbeddedId
	private RangosPK rangosPK;

	/**
	 * Rangos
	 */
	public Rangos() {
	}

	/**
	 * Rangos
	 * @param rangosPK
	 */
	public Rangos(RangosPK rangosPK) {
		this.rangosPK = rangosPK;
	}

	/**
	 * @return the rangosPK
	 */
	public RangosPK getRangosPK() {
		return rangosPK;
	}

	/**
	 * @param rangosPK the rangosPK to set
	 */
	public void setRangosPK(RangosPK rangosPK) {
		this.rangosPK = rangosPK;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rangos [rangosPK=");
		builder.append(rangosPK);
		builder.append("]");
		return builder.toString();
	}
	
}
