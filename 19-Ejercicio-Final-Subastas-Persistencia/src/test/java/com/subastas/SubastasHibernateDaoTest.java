package com.subastas;

import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.subastas.modelo.entidades.Subasta;
import com.subastas.modelo.persistencia.SubastasDao;

public class SubastasHibernateDaoTest {

	private static SubastasDao subastasDao;
	
	private long idSubastador = 2;
	private int subastasSubastador2 = 1; 
	
	private String estadoSubastas ="activa";
	private int subastasEstadoActiva = 4; 
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
		subastasDao = context.getBean(SubastasDao.class);
	}

	@Test
	public void subastasActivasTest() {
		List<Subasta> subastasActivas = subastasDao.consultar(estadoSubastas);
		
		for (Subasta subasta : subastasActivas) {
			System.out.println(subasta);
		}
		
		Assert.assertEquals(subastasEstadoActiva, subastasActivas.size());
	}
	
	@Test
	public void subastasSubastadorTest() {
		List<Subasta> subastasSubastador = subastasDao.consultarPorSubastador(idSubastador);
		
		for (Subasta subasta : subastasSubastador) {
			System.out.println(subasta);
		}
		
		Assert.assertEquals(subastasSubastador2, subastasSubastador.size());
	}

}
