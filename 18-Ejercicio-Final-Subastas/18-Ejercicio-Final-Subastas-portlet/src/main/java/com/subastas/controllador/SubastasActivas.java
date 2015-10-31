package com.subastas.controllador;

import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;

import com.subastas.model.Subasta;

@ManagedBean(name="subastasActivas")
public class SubastasActivas {
	
	private List<Subasta> subastas;
	private List<String> estados = Arrays.asList(new String[]{"Nuevo","Activo","Finalizado"});
	private String estado;
	private String producto;
	
	public List<Subasta> getSubastas() {
		return subastas;
	}

	public void setSubastas(List<Subasta> subastas) {
		this.subastas = subastas;
	}

	public List<String> getEstados() {
		return estados;
	}

	public void setEstados(List<String> estados) {
		this.estados = estados;
	}
	
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}
	
	public String pujar(){
		return null;
	}
	
	public String buscarPorArticuloEstado(){
		return null;
	}
}
