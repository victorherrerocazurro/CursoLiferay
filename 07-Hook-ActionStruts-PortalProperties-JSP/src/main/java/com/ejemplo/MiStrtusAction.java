package com.ejemplo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.liferay.portal.kernel.struts.BaseStrutsAction;

public class MiStrtusAction extends BaseStrutsAction {

	@Override
	public String execute(HttpServletRequest arg0, HttpServletResponse arg1)
			throws Exception {
		
		System.out.println("Dentro del action");
		
		return "/portlet/NuevoStrutsAction/index.jsp";
	}
}