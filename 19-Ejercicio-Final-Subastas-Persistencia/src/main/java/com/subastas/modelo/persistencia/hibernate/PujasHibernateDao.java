package com.subastas.modelo.persistencia.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.hibernate.type.DoubleType;

import com.subastas.modelo.entidades.Puja;
import com.subastas.modelo.persistencia.PujasDao;

public class PujasHibernateDao extends AbstractHibernateDao<Integer,Puja> implements PujasDao{

	public PujasHibernateDao(SessionFactory sf) {
		super(sf);
	}

	public Puja consultar(Integer id) {
		return (Puja) getSf().getCurrentSession().get(Puja.class, id);
	}

	public List<Puja> consultar(long idPujador) {
		
		/*String sql = "SELECT * FROM PUJAS " +
				"INNER JOIN SUBASTAS ON PUJAS.ID_SUBASTA = SUBASTAS.ID " +
				"INNER JOIN PRODUCTOS ON SUBASTAS.ID_PRODUCTO = PRODUCTOS.ID " +
				"WHERE PUJAS.ID_PUJADOR = " + idPujador;
		SQLQuery query = getSf().getCurrentSession().createSQLQuery(sql);
		query.addEntity(Puja.class);*/
		
		Query query = getSf().getCurrentSession().getNamedQuery(Puja.CONSULTAR_POR_PUJADOR)
				.setLong(Puja.CONSULTAR_POR_PUJADOR_PARAMETRO, idPujador);
		
		return query.list();
	}

	public List<Puja> consultarPorSubasta(int idSubasta) {
		Query query = getSf().getCurrentSession().getNamedQuery(Puja.CONSULTAR_POR_SUBASTA)
				.setLong(Puja.CONSULTAR_POR_SUBASTA_PARAMETRO, idSubasta);
		
		return query.list();
	}

	public double consultarPujaMaximaDeSubasta(int idSubasta) {
		
		String sql = "SELECT max(puja) as maximaPuja FROM PUJAS " +
				"INNER JOIN SUBASTAS ON PUJAS.ID_SUBASTA = SUBASTAS.ID " +
				"WHERE PUJAS.ID_SUBASTA = " + idSubasta;
		SQLQuery query = getSf().getCurrentSession().createSQLQuery(sql);
		query.addScalar("maximaPuja", new DoubleType());
		
		return (Double) query.uniqueResult();
	}

}
