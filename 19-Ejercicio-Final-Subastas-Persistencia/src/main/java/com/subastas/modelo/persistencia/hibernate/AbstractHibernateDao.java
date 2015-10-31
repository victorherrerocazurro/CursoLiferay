package com.subastas.modelo.persistencia.hibernate;

import org.hibernate.SessionFactory;

import com.subastas.modelo.persistencia.Dao;

public abstract class AbstractHibernateDao<K, E>  implements Dao<K, E>{
	private SessionFactory sf;

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	protected SessionFactory getSf() {
		return sf;
	}

	public AbstractHibernateDao(SessionFactory sf) {
		this.sf = sf;
	}

	public void insertar(E entidad) {
		getSf().getCurrentSession().persist(entidad);		
	}

	public void actualizar(E entidad) {
		getSf().getCurrentSession().update(entidad);		
	}	
}
