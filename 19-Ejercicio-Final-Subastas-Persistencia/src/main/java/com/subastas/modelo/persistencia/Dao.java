package com.subastas.modelo.persistencia;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation=Propagation.REQUIRED)
public interface Dao<K, E> {
	void insertar(E entidad);
	void actualizar(E entidad);
	//void borrar(E entidad);
	//List<E> consultar();
	E consultar(K id);
}
