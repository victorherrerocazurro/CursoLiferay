package com.subastas.controllers;

import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.subastas.modelo.entidades.Puja;
import com.subastas.modelo.entidades.Subasta;
import com.subastas.modelo.persistencia.PujasDao;
import com.subastas.modelo.persistencia.SubastasDao;

@Controller(value="subastasViewController")
//@RequestMapping("view") //Solo necesario si se emplea DefaultAnnotationHandlerMapping
public class SubastasViewController {
	
	private Logger log = Logger.getLogger(SubastasViewController.class.getName());
	
	@Autowired
	@Qualifier("subastasDao")
	private SubastasDao subastasDao;
	
	@Autowired
	@Qualifier("pujasDao")
	private PujasDao pujasDao;
	
	@RenderMapping
	public String renderView(RenderRequest request, RenderResponse response, 
			Model model) {
		
		log.info("Render View");
		
		List<Subasta> subastasActivas = subastasDao.consultar(Subasta.ESTADO_ACTIVA);
		
		model.addAttribute("subastasActivas", subastasActivas);
		
		return "subastas/view";//Vista a mostrar
	}
	
	@RenderMapping(params={"myaction=nuevaPuja"})
	public String renderViewNuevaPuja(RenderRequest request, RenderResponse response, 
			Model model, @RequestParam int idSubasta) {
		
		log.info("Render View Nueva Puja");
		
		Subasta subasta = subastasDao.consultar(idSubasta);
		
		model.addAttribute("subasta", subasta);
		
		double pujaMaxima = pujasDao.consultarPujaMaximaDeSubasta(idSubasta);
		
		model.addAttribute("pujaMaxima", pujaMaxima);
		
		return "subastas/nuevaPuja";//Vista a mostrar
	}
	
	@ActionMapping(params={"myaction=pujar"})
	public void action(ActionRequest request, ActionResponse response, 
			@RequestParam int idSubasta, @RequestParam long idPujador, @RequestParam double puja) {
		
		log.info("En el action pujar: idSubasta=" + idSubasta + " - idPujador=" + idPujador + " - puja=" + puja);
		
		Subasta subasta = subastasDao.consultar(idSubasta);
		
		Puja nuevaPuja = new Puja(idPujador, subasta, puja, new Date(), Puja.ESTADO_MAXIMA);
		
		pujasDao.insertar(nuevaPuja);
		
		response.setRenderParameter("myaction", "nuevaPuja");
		response.setRenderParameter("idSubasta", String.valueOf(idSubasta));
		
	}

	public SubastasDao getSubastasDao() {
		return subastasDao;
	}

	public void setSubastasDao(SubastasDao subastasDao) {
		this.subastasDao = subastasDao;
	}

	public PujasDao getPujasDao() {
		return pujasDao;
	}

	public void setPujasDao(PujasDao pujasDao) {
		this.pujasDao = pujasDao;
	}

}
