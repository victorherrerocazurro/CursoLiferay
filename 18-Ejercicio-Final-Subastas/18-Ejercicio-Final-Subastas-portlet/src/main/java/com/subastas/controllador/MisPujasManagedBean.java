package com.subastas.controllador;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.portlet.PortletRequest;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.util.PortalUtil;
import com.subastas.model.Subasta;
import com.subastas.service.SubastaLocalServiceUtil;

@ManagedBean(name="misPujas")
public class MisPujasManagedBean {

	private List<Subasta> pujas;
	
	public MisPujasManagedBean() {

		PortletRequest request = (PortletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
		
		try {
			
			User user = PortalUtil.getUser(request);

			if(user != null){
				
				
				pujas = SubastaLocalServiceUtil.buscarSubastasPorPujador(user.getUserId());
				
				/*System.out.println("LOGIN ------------------> " + user.getLogin());
				long id = CounterLocalServiceUtil.increment(Subasta.class.getName());
				
				Subasta subasta = SubastaLocalServiceUtil.createSubasta(id);
				
				subasta.setUserId(user.getUserId());
				subasta.setCompanyId(user.getCompanyId());
				subasta.setGroupId(user.getGroupId());
				
				SubastaLocalServiceUtil.addSubasta(subasta);
				
				Subasta subasta2 = SubastaLocalServiceUtil.getSubasta(id);
				
				System.out.println("SUBASTA -------------------> " + subasta2.getUserId());*/
			}
			
			
			
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Subasta> getPujas() {
		return pujas;
	}

	public void setPujas(List<Subasta> pujas) {
		this.pujas = pujas;
	}
	
}
