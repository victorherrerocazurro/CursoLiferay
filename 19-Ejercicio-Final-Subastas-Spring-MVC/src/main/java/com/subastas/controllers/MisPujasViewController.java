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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.util.PortalUtil;
import com.subastas.modelo.entidades.Puja;
import com.subastas.modelo.entidades.Subasta;
import com.subastas.modelo.persistencia.PujasDao;
import com.subastas.modelo.persistencia.SubastasDao;

@Controller(value="misPujasViewController")
//@RequestMapping("view") //Solo necesario si se emplea DefaultAnnotationHandlerMapping
public class MisPujasViewController {
private Logger log = Logger.getLogger(MisPujasViewController.class.getName());
	
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
		
		User user;
		try {
			user = PortalUtil.getUser(request);
			
			if(user != null){
				List<Puja> misPujas = pujasDao.consultar(user.getUserId());
				
				model.addAttribute("misPujas", misPujas);
			}
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "mispujas/view";
	}
	
	@RenderMapping(params={"myaction=rePujar"})
	public String renderViewRePujar(RenderRequest request, RenderResponse response, 
			Model model, @RequestParam int idSubasta) {
		
		//TODO Cargar la subasta y la maxima puja de esa subasta
		Subasta subasta = subastasDao.consultar(idSubasta);
		
		model.addAttribute("subasta", subasta);
		
		double pujaMaxima = pujasDao.consultarPujaMaximaDeSubasta(idSubasta);
		
		model.addAttribute("pujaMaxima", pujaMaxima);
		
		return "mispujas/nuevaPuja";
	}
	
	@ActionMapping(params={"myaction=rePujar"})
	public void action(ActionRequest request, ActionResponse response, 
			@RequestParam int idSubasta, @RequestParam long idPujador, @RequestParam double puja) {
		
		log.info("En el action pujar: idSubasta=" + idSubasta + " - idPujador=" + idPujador + " - puja=" + puja);
		
		Subasta subasta = subastasDao.consultar(idSubasta);
		
		Puja nuevaPuja = new Puja(idPujador, subasta, puja, new Date(), Puja.ESTADO_MAXIMA);
		
		pujasDao.insertar(nuevaPuja);
		
		response.setRenderParameter("myaction", "rePujar");
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
