package com.subastas.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SubastaLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SubastaLocalService
 * @generated
 */
public class SubastaLocalServiceWrapper implements SubastaLocalService,
    ServiceWrapper<SubastaLocalService> {
    private SubastaLocalService _subastaLocalService;

    public SubastaLocalServiceWrapper(SubastaLocalService subastaLocalService) {
        _subastaLocalService = subastaLocalService;
    }

    /**
    * Adds the subasta to the database. Also notifies the appropriate model listeners.
    *
    * @param subasta the subasta
    * @return the subasta that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.subastas.model.Subasta addSubasta(
        com.subastas.model.Subasta subasta)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _subastaLocalService.addSubasta(subasta);
    }

    /**
    * Creates a new subasta with the primary key. Does not add the subasta to the database.
    *
    * @param id the primary key for the new subasta
    * @return the new subasta
    */
    @Override
    public com.subastas.model.Subasta createSubasta(long id) {
        return _subastaLocalService.createSubasta(id);
    }

    /**
    * Deletes the subasta with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the subasta
    * @return the subasta that was removed
    * @throws PortalException if a subasta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.subastas.model.Subasta deleteSubasta(long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _subastaLocalService.deleteSubasta(id);
    }

    /**
    * Deletes the subasta from the database. Also notifies the appropriate model listeners.
    *
    * @param subasta the subasta
    * @return the subasta that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.subastas.model.Subasta deleteSubasta(
        com.subastas.model.Subasta subasta)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _subastaLocalService.deleteSubasta(subasta);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _subastaLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _subastaLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.subastas.model.impl.SubastaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _subastaLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.subastas.model.impl.SubastaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _subastaLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _subastaLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _subastaLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.subastas.model.Subasta fetchSubasta(long id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _subastaLocalService.fetchSubasta(id);
    }

    /**
    * Returns the subasta with the primary key.
    *
    * @param id the primary key of the subasta
    * @return the subasta
    * @throws PortalException if a subasta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.subastas.model.Subasta getSubasta(long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _subastaLocalService.getSubasta(id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _subastaLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the subastas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.subastas.model.impl.SubastaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of subastas
    * @param end the upper bound of the range of subastas (not inclusive)
    * @return the range of subastas
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.subastas.model.Subasta> getSubastas(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _subastaLocalService.getSubastas(start, end);
    }

    /**
    * Returns the number of subastas.
    *
    * @return the number of subastas
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getSubastasCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _subastaLocalService.getSubastasCount();
    }

    /**
    * Updates the subasta in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param subasta the subasta
    * @return the subasta that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.subastas.model.Subasta updateSubasta(
        com.subastas.model.Subasta subasta)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _subastaLocalService.updateSubasta(subasta);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _subastaLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _subastaLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _subastaLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public java.util.List<com.subastas.model.Subasta> buscarSubastasPorPujador(
        long pujadorId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _subastaLocalService.buscarSubastasPorPujador(pujadorId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public SubastaLocalService getWrappedSubastaLocalService() {
        return _subastaLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedSubastaLocalService(
        SubastaLocalService subastaLocalService) {
        _subastaLocalService = subastaLocalService;
    }

    @Override
    public SubastaLocalService getWrappedService() {
        return _subastaLocalService;
    }

    @Override
    public void setWrappedService(SubastaLocalService subastaLocalService) {
        _subastaLocalService = subastaLocalService;
    }
}
