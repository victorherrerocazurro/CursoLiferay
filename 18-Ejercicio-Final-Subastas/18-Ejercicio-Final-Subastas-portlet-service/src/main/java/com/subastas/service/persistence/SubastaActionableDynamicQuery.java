package com.subastas.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.subastas.model.Subasta;

import com.subastas.service.SubastaLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class SubastaActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public SubastaActionableDynamicQuery() throws SystemException {
        setBaseLocalService(SubastaLocalServiceUtil.getService());
        setClass(Subasta.class);

        setClassLoader(com.subastas.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("id");
    }
}
