package com.subastas;

import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.subastas.modelo.entidades.Producto;
import com.subastas.modelo.entidades.Puja;
import com.subastas.modelo.entidades.Subasta;
import com.subastas.modelo.persistencia.PujasDao;
import com.subastas.modelo.persistencia.SubastasDao;

public class PujasHibernateDaoTest {

	private static PujasDao pujasDao;
	private static SubastasDao subastasDao;
	
	private long idPujador = 3;
	private int subastasPujador3 = 3; 
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
		pujasDao = context.getBean(PujasDao.class);
		subastasDao = context.getBean(SubastasDao.class);
	}

	@Test
	public void pujasPujadortest() {
		List<Puja> pujas = pujasDao.consultar(idPujador);
		
		for (Puja puja : pujas) {
			System.out.println(puja);
		}
		
		Assert.assertEquals(subastasPujador3, pujas.size());
	}
	
	@Test
	public void nuevaPujatest() {

		Subasta subasta = subastasDao.consultar(1);
		
		Puja puja = new Puja(1, subasta , 3, new Date(), Puja.ESTADO_MAXIMA);
		pujasDao.insertar(puja);
	}

}
