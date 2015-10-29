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
		name = Puja.CONSULTAR_POR_PUJADOR,
		query = "SELECT * FROM PUJAS " +
				"INNER JOIN SUBASTAS ON PUJAS.ID_SUBASTA = SUBASTAS.ID " +
				"INNER JOIN PRODUCTOS ON SUBASTAS.ID_PRODUCTO = PRODUCTOS.ID " +
				"WHERE PUJAS.ID_PUJADOR =  :" + Puja.CONSULTAR_POR_PUJADOR_PARAMETRO,
		resultClass = Puja.class
	),
	@NamedNativeQuery(
			name = Puja.CONSULTAR_POR_SUBASTA,
			query = "SELECT * FROM PUJAS " +
					"INNER JOIN SUBASTAS ON PUJAS.ID_SUBASTA = SUBASTAS.ID " +
					"INNER JOIN PRODUCTOS ON SUBASTAS.ID_PRODUCTO = PRODUCTOS.ID " +
					"WHERE SUBASTAS.ID =  :" + Puja.CONSULTAR_POR_SUBASTA_PARAMETRO,
			resultClass = Puja.class
		)
})

@Entity
@Table(name="PUJAS")
public class Puja {
	public static final String CONSULTAR_POR_PUJADOR = "consultarPorPujador";
	public static final String CONSULTAR_POR_PUJADOR_PARAMETRO = "pujador";
	public static final String CONSULTAR_POR_SUBASTA = "consultarPorSubasta";
	public static final String CONSULTAR_POR_SUBASTA_PARAMETRO = "idSubasta";
	
	public static final String ESTADO_MAXIMA = "maxima";
	public static final String ESTADO_SUPERADA = "superada";
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="ID_PUJADOR")
	private long idPujador;
	/*@Column(name="ID_SUBASTA")
	private int idSubasta;*/
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_SUBASTA", nullable = false)
	private Subasta subasta;
	private double puja;
	private Date fecha;
	private String estado;
	
	public Puja() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Puja(long idPujador, Subasta subasta, double puja, Date fecha,
			String estado) {
		super();
		this.idPujador = idPujador;
		this.subasta = subasta;
		this.puja = puja;
		this.fecha = fecha;
		this.estado = estado;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getIdPujador() {
		return idPujador;
	}
	public void setIdPujador(long idPujador) {
		this.idPujador = idPujador;
	}
	public Subasta getSubasta() {
		return subasta;
	}
	public void setSubasta(Subasta subasta) {
		this.subasta = subasta;
	}
	public double getPuja() {
		return puja;
	}
	public void setPuja(double puja) {
		this.puja = puja;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Puja [id=" + id + ", idPujador=" + idPujador + ", subasta="
				+ subasta + ", puja=" + puja + ", fecha=" + fecha + ", estado="
				+ estado + "]";
	}
}
