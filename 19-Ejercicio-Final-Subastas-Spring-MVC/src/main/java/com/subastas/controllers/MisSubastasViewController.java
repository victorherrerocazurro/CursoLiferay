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
import com.subastas.modelo.entidades.Producto;
import com.subastas.modelo.entidades.Puja;
import com.subastas.modelo.entidades.Subasta;
import com.subastas.modelo.persistencia.ProductosDao;
import com.subastas.modelo.persistencia.PujasDao;
import com.subastas.modelo.persistencia.SubastasDao;

@Controller(value="misSubastasViewController")
//@RequestMapping("view") //Solo necesario si se emplea DefaultAnnotationHandlerMapping
public class MisSubastasViewController {
private Logger log = Logger.getLogger(MisSubastasViewController.class.getName());
	
	@Autowired
	@Qualifier("subastasDao")
	private SubastasDao subastasDao;
	
	@Autowired
	@Qualifier("pujasDao")
	private PujasDao pujasDao;
	
	@Autowired
	@Qualifier("productosDao")
	private ProductosDao productosDao;
	
	@RenderMapping
	public String renderView(RenderRequest request, RenderResponse response, Model model) {
		
		log.info("Render View");
		
		User user;
		try {
			user = PortalUtil.getUser(request);
			
			if(user != null){
				List<Subasta> misSubastas = subastasDao.consultarPorSubastador(user.getUserId());
				
				model.addAttribute("misSubastas", misSubastas);
			}
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "missubastas/view";
	}
	
	@RenderMapping(params={"myaction=pujas"})
	public String renderViewPujasDeSubasta(RenderRequest request, RenderResponse response, 
			Model model, @RequestParam int idSubasta) {
		
		Subasta subasta = subastasDao.consultar(idSubasta);
		List<Puja> pujas = pujasDao.consultarPorSubasta(idSubasta);
		
		model.addAttribute("subasta", subasta);
		model.addAttribute("pujas", pujas);
		
		return "missubastas/pujas";
	}
	
	@RenderMapping(params={"myaction=nuevaSubasta"})
	public String renderViewNuevaSubasta(RenderRequest request, RenderResponse response, 
			Model model) {
		return "missubastas/nuevaSubasta";
	}
	
	@ActionMapping(params={"myaction=nuevaSubasta"})
	public void action(ActionRequest request, ActionResponse response, 
			@RequestParam String nombre, @RequestParam String descripcion, 
			@RequestParam long idSubastador,
			@RequestParam Date fechaInicio, @RequestParam Date fechaFin) {
		
		log.info("En el action nueva Subasta: nombre=" + nombre + " - descripcion=" + descripcion + " - idSubastador=" + idSubastador +
				" - estado=" + Subasta.ESTADO_ACTIVA + " - fechaInicio=" + fechaInicio + " - fechaFin=" + fechaFin);
		
		Producto producto = new Producto(nombre, descripcion);
		
		productosDao.insertar(producto);
		
		Subasta subasta = new Subasta(idSubastador, fechaFin, fechaInicio, producto, Subasta.ESTADO_ACTIVA);
		
		subastasDao.insertar(subasta);
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

	public ProductosDao getProductosDao() {
		return productosDao;
	}

	public void setProductosDao(ProductosDao productosDao) {
		this.productosDao = productosDao;
	}
	
}
