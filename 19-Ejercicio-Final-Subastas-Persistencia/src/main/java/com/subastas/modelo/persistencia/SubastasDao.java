package com.subastas.modelo.persistencia;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.subastas.modelo.entidades.Subasta;

@Transactional(propagation=Propagation.REQUIRED)
public interface SubastasDao extends Dao<Integer, Subasta> {
	//Consultar subastas activas
	List<Subasta> consultar(String estado);
	//Consultar subastas creadas por un usuario
	List<Subasta> consultarPorSubastador(long idSubastador);
}
