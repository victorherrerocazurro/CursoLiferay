package com.subastas.modelo.persistencia.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.subastas.modelo.entidades.Subasta;
import com.subastas.modelo.persistencia.SubastasDao;

public class SubastasHibernateDao extends AbstractHibernateDao<Integer,Subasta> implements SubastasDao {

	public SubastasHibernateDao(SessionFactory sf) {
		super(sf);
	}

	public Subasta consultar(Integer id) {
		return (Subasta) getSf().getCurrentSession().get(Subasta.class, id);
	}

	public List<Subasta> consultar(String estado) {
		/*String sql = "SELECT * FROM SUBASTAS " +
				"INNER JOIN PRODUCTOS ON SUBASTAS.ID_PRODUCTO = PRODUCTOS.ID " +
				"WHERE SUBASTAS.ESTADO = '" + estado + "'";
		SQLQuery query = getSf().getCurrentSession().createSQLQuery(sql);
		query.addEntity(Subasta.class);*/
		
		Query query = getSf().getCurrentSession().getNamedQuery(Subasta.CONSULTAR_POR_ESTADO)
				.setString(Subasta.CONSULTAR_POR_ESTADO_PARAMETRO, estado);
		
		return query.list();
	}

	public List<Subasta> consultarPorSubastador(long idSubastador) {
		/*String sql = "SELECT * FROM SUBASTAS " +
				"INNER JOIN PRODUCTOS ON SUBASTAS.ID_PRODUCTO = PRODUCTOS.ID " +
				"WHERE SUBASTAS.ID_SUBASTADOR = " + idSubastador;
		SQLQuery query = getSf().getCurrentSession().createSQLQuery(sql);
		query.addEntity(Subasta.class);*/
		
		Query query = getSf().getCurrentSession().getNamedQuery(Subasta.CONSULTAR_POR_SUBASTADOR)
				.setLong(Subasta.CONSULTAR_POR_SUBASTADOR_PARAMETRO, idSubastador);
		
		return query.list();
	}
	
}
