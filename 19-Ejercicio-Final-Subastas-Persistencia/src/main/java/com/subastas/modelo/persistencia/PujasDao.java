package com.subastas.modelo.persistencia;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.subastas.modelo.entidades.Puja;

@Transactional(propagation=Propagation.REQUIRED)
public interface PujasDao extends Dao<Integer, Puja>  {
	//Pujas realizadas por un usuario
	List<Puja> consultar(long idPujador);

	//Pujas asociadas a una subasta
	List<Puja> consultarPorSubasta(int idSubasta);

	double consultarPujaMaximaDeSubasta(int idSubasta);
}
