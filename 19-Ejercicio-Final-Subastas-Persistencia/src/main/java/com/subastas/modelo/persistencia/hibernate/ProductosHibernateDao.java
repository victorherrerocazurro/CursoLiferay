package com.subastas.modelo.persistencia.hibernate;

import org.hibernate.SessionFactory;

import com.subastas.modelo.entidades.Producto;
import com.subastas.modelo.persistencia.ProductosDao;


public class ProductosHibernateDao extends AbstractHibernateDao<Integer,Producto> implements ProductosDao {

	public ProductosHibernateDao(SessionFactory sf) {
		super(sf);
	}

	public Producto consultar(Integer id) {
		return (Producto) getSf().getCurrentSession().get(Producto.class, id);
	}
	
}
