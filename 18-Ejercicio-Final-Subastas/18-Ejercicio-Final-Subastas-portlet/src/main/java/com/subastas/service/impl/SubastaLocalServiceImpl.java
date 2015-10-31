package com.subastas.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.subastas.model.Subasta;
import com.subastas.service.base.SubastaLocalServiceBaseImpl;
import com.subastas.service.persistence.SubastaUtil;

/**
 * The implementation of the subasta local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.subastas.service.SubastaLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.subastas.service.base.SubastaLocalServiceBaseImpl
 * @see com.subastas.service.SubastaLocalServiceUtil
 */
public class SubastaLocalServiceImpl extends SubastaLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.subastas.service.SubastaLocalServiceUtil} to access the subasta local service.
     */
	
	public List<Subasta> buscarSubastasPorPujador(long pujadorId) throws SystemException{
		return SubastaUtil.findBypujador(pujadorId);
	}
}
