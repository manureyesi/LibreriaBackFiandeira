package es.fiandeira.rangos.models;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import es.fiandeira.maestroRangos.models.MaestrosRangos;

@Entity
@Table(name = "RANGOS")
public class Rangos implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -4820979292970600220L;

	@EmbeddedId
	private RangosPK rangosPK;

	@ManyToOne(optional=false)
	@JoinColumn(name = "ID_RANGO", referencedColumnName="ID_RANGO", insertable=false, updatable=false)
	private MaestrosRangos maestroRangos;
	
	/**
	 * Rangos
	 */
	public Rangos() {
	}

	/**
	 * @param rangosPK
	 */
	public Rangos(RangosPK rangosPK) {
		this.rangosPK = rangosPK;
	}

	/**
	 * @param rangosPK
	 * @param maestroRangos
	 */
	public Rangos(RangosPK rangosPK, MaestrosRangos maestroRangos) {
		this.rangosPK = rangosPK;
		this.maestroRangos = maestroRangos;
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

	/**
	 * @return the maestroRangos
	 */
	public MaestrosRangos getMaestroRangos() {
		return maestroRangos;
	}

	/**
	 * @param maestroRangos the maestroRangos to set
	 */
	public void setMaestroRangos(MaestrosRangos maestroRangos) {
		this.maestroRangos = maestroRangos;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rangos [rangosPK=");
		builder.append(rangosPK);
		builder.append(", maestroRangos=");
		builder.append(maestroRangos);
		builder.append("]");
		return builder.toString();
	}

}
