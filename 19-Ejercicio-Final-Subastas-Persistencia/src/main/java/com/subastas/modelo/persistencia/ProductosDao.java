package com.subastas.modelo.persistencia;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.subastas.modelo.entidades.Producto;

@Transactional(propagation=Propagation.REQUIRED)
public interface ProductosDao extends Dao<Integer, Producto> {
	
}
