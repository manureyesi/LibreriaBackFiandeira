package es.fiandeira.token.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "TOKEN")
public class Token implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -670448809495690063L;
	
	@Id
	@GenericGenerator(name = "IDGenerator", strategy = "increment")
	@GeneratedValue(generator = "IDGenerator")
	@Column(name = "ID_TOKEN", unique = true, nullable = false)
	private Long id;
	
	@Column(name = "TOKEN", nullable = false, unique = true)
	private String token;
	
	@Column(name = "TOKEN_REFRESCO", nullable = false, unique = true)
	private String tokenRefresco;
	
	@Column(name = "FECHA_EXPIRACION", nullable = false)
	private Date fechaExpiracion;
	
	@Column(name = "FECHA_EXPIRACION_TOKEN_REFRESCO", nullable = false)
	private Date fechaExpiracionTokenRefresco;
	
	@Column(name = "ID_APP", nullable = true)
	private String idApp;
	
	@Column(name = "ID_USUARIO", nullable = false)
	private Long idUsuario;
	
	@Column(name = "INVALIDADO", nullable = false)
	private Boolean invalidado;
	
	@Column(name = "IP", nullable = false)
	private String ip;
	
	@Column(name = "REFRESCABLE", nullable = false)
	private Boolean refrescable;
	
	@Column(name = "HORAS_VALIDEZ", nullable = false)
	private Integer horasValidez;

	/**
	 * Token
	 */
	public Token() {
	}

	/**
	 * Token
	 * @param id
	 * @param token
	 * @param tokenRefresco
	 * @param fechaExpiracion
	 * @param fechaExpiracionTokenRefresco
	 * @param idApp
	 * @param idUsuario
	 * @param invalidado
	 * @param ip
	 * @param refrescable
	 * @param horasValidez
	 */
	public Token(Long id, String token, String tokenRefresco, Date fechaExpiracion, Date fechaExpiracionTokenRefresco,
			String idApp, Long idUsuario, Boolean invalidado, String ip, Boolean refrescable, Integer horasValidez) {
		this.id = id;
		this.token = token;
		this.tokenRefresco = tokenRefresco;
		this.fechaExpiracion = fechaExpiracion;
		this.fechaExpiracionTokenRefresco = fechaExpiracionTokenRefresco;
		this.idApp = idApp;
		this.idUsuario = idUsuario;
		this.invalidado = invalidado;
		this.ip = ip;
		this.refrescable = refrescable;
		this.horasValidez = horasValidez;
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
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}

	/**
	 * @return the tokenRefresco
	 */
	public String getTokenRefresco() {
		return tokenRefresco;
	}

	/**
	 * @param tokenRefresco the tokenRefresco to set
	 */
	public void setTokenRefresco(String tokenRefresco) {
		this.tokenRefresco = tokenRefresco;
	}

	/**
	 * @return the fechaExpiracion
	 */
	public Date getFechaExpiracion() {
		return fechaExpiracion;
	}

	/**
	 * @param fechaExpiracion the fechaExpiracion to set
	 */
	public void setFechaExpiracion(Date fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}

	/**
	 * @return the fechaExpiracionTokenRefresco
	 */
	public Date getFechaExpiracionTokenRefresco() {
		return fechaExpiracionTokenRefresco;
	}

	/**
	 * @param fechaExpiracionTokenRefresco the fechaExpiracionTokenRefresco to set
	 */
	public void setFechaExpiracionTokenRefresco(Date fechaExpiracionTokenRefresco) {
		this.fechaExpiracionTokenRefresco = fechaExpiracionTokenRefresco;
	}

	/**
	 * @return the idApp
	 */
	public String getIdApp() {
		return idApp;
	}

	/**
	 * @param idApp the idApp to set
	 */
	public void setIdApp(String idApp) {
		this.idApp = idApp;
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
	 * @return the invalidado
	 */
	public Boolean getInvalidado() {
		return invalidado;
	}

	/**
	 * @param invalidado the invalidado to set
	 */
	public void setInvalidado(Boolean invalidado) {
		this.invalidado = invalidado;
	}

	/**
	 * @return the ip
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * @param ip the ip to set
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}

	/**
	 * @return the refrescable
	 */
	public Boolean getRefrescable() {
		return refrescable;
	}

	/**
	 * @param refrescable the refrescable to set
	 */
	public void setRefrescable(Boolean refrescable) {
		this.refrescable = refrescable;
	}

	/**
	 * @return the horasValidez
	 */
	public Integer getHorasValidez() {
		return horasValidez;
	}

	/**
	 * @param horasValidez the horasValidez to set
	 */
	public void setHorasValidez(Integer horasValidez) {
		this.horasValidez = horasValidez;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Token [id=");
		builder.append(id);
		builder.append(", token=");
		builder.append(token);
		builder.append(", tokenRefresco=");
		builder.append(tokenRefresco);
		builder.append(", fechaExpiracion=");
		builder.append(fechaExpiracion);
		builder.append(", fechaExpiracionTokenRefresco=");
		builder.append(fechaExpiracionTokenRefresco);
		builder.append(", idApp=");
		builder.append(idApp);
		builder.append(", idUsuario=");
		builder.append(idUsuario);
		builder.append(", invalidado=");
		builder.append(invalidado);
		builder.append(", ip=");
		builder.append(ip);
		builder.append(", refrescable=");
		builder.append(refrescable);
		builder.append(", horasValidez=");
		builder.append(horasValidez);
		builder.append("]");
		return builder.toString();
	}
	
}
