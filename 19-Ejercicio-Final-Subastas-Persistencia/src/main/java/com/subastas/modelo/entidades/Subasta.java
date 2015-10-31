package com.subastas.modelo.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

@NamedNativeQueries({
	@NamedNativeQuery(
		name = Subasta.CONSULTAR_POR_ESTADO,
		query = "SELECT * FROM SUBASTAS " +
			"INNER JOIN PRODUCTOS ON SUBASTAS.ID_PRODUCTO = PRODUCTOS.ID " +
			"WHERE SUBASTAS.ESTADO = :" + Subasta.CONSULTAR_POR_ESTADO_PARAMETRO,
		resultClass = Subasta.class
	),
	@NamedNativeQuery(
		name = Subasta.CONSULTAR_POR_SUBASTADOR,
		query = "SELECT * FROM SUBASTAS " +
			"INNER JOIN PRODUCTOS ON SUBASTAS.ID_PRODUCTO = PRODUCTOS.ID " +
			"WHERE SUBASTAS.ID_SUBASTADOR = :" + Subasta.CONSULTAR_POR_SUBASTADOR_PARAMETRO,
		resultClass = Subasta.class
	)
})

@Entity
@Table(name="SUBASTAS")
public class Subasta {
	public static final String CONSULTAR_POR_ESTADO = "consultarPorEstado";
	public static final String CONSULTAR_POR_ESTADO_PARAMETRO = "estado";
	public static final String CONSULTAR_POR_SUBASTADOR = "consultarPorSubastador";
	public static final String CONSULTAR_POR_SUBASTADOR_PARAMETRO = "subastador";
	
	public static final String ESTADO_ACTIVA = "activa";
	public static final String ESTADO_FINALIZADA = "finalizada";
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="ID_SUBASTADOR")
	private long idSubastador;
	@Column(name="FECHA_FIN")
	private Date fechaFin;
	@Column(name="FECHA_INICIO")
	private Date fechaInicio;
	/*@Column(name="ID_PRODUCTO")
	private int idProducto;*/
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_PRODUCTO", nullable = false)
	private Producto producto;
	
	private String estado;
	
	public Subasta() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Subasta(long idSubastador, Date fechaFin, Date fechaInicio,
			 Producto producto, String estado) {
		super();
		this.idSubastador = idSubastador;
		this.fechaFin = fechaFin;
		this.fechaInicio = fechaInicio;
		this.producto = producto;
		this.estado = estado;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getIdSubastador() {
		return idSubastador;
	}
	public void setIdSubastador(long idSubastador) {
		this.idSubastador = idSubastador;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "Subasta [id=" + id + ", idSubastador=" + idSubastador
				+ ", fechaFin=" + fechaFin + ", fechaInicio=" + fechaInicio
				+ ", producto=" + producto + ", estado=" + estado + "]";
	}
	
}
