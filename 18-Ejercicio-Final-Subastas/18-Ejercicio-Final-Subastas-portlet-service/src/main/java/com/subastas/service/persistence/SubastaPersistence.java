package com.subastas.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.subastas.model.Subasta;

/**
 * The persistence interface for the subasta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SubastaPersistenceImpl
 * @see SubastaUtil
 * @generated
 */
public interface SubastaPersistence extends BasePersistence<Subasta> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link SubastaUtil} to access the subasta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the subastas where producto = &#63;.
    *
    * @param producto the producto
    * @return the matching subastas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.subastas.model.Subasta> findByproducto(
        java.lang.String producto)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the subastas where producto = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.subastas.model.impl.SubastaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param producto the producto
    * @param start the lower bound of the range of subastas
    * @param end the upper bound of the range of subastas (not inclusive)
    * @return the range of matching subastas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.subastas.model.Subasta> findByproducto(
        java.lang.String producto, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the subastas where producto = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.subastas.model.impl.SubastaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param producto the producto
    * @param start the lower bound of the range of subastas
    * @param end the upper bound of the range of subastas (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching subastas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.subastas.model.Subasta> findByproducto(
        java.lang.String producto, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first subasta in the ordered set where producto = &#63;.
    *
    * @param producto the producto
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching subasta
    * @throws com.subastas.NoSuchSubastaException if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.subastas.model.Subasta findByproducto_First(
        java.lang.String producto,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.subastas.NoSuchSubastaException;

    /**
    * Returns the first subasta in the ordered set where producto = &#63;.
    *
    * @param producto the producto
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching subasta, or <code>null</code> if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.subastas.model.Subasta fetchByproducto_First(
        java.lang.String producto,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last subasta in the ordered set where producto = &#63;.
    *
    * @param producto the producto
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching subasta
    * @throws com.subastas.NoSuchSubastaException if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.subastas.model.Subasta findByproducto_Last(
        java.lang.String producto,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.subastas.NoSuchSubastaException;

    /**
    * Returns the last subasta in the ordered set where producto = &#63;.
    *
    * @param producto the producto
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching subasta, or <code>null</code> if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.subastas.model.Subasta fetchByproducto_Last(
        java.lang.String producto,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the subastas before and after the current subasta in the ordered set where producto = &#63;.
    *
    * @param id the primary key of the current subasta
    * @param producto the producto
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next subasta
    * @throws com.subastas.NoSuchSubastaException if a subasta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.subastas.model.Subasta[] findByproducto_PrevAndNext(long id,
        java.lang.String producto,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.subastas.NoSuchSubastaException;

    /**
    * Removes all the subastas where producto = &#63; from the database.
    *
    * @param producto the producto
    * @throws SystemException if a system exception occurred
    */
    public void removeByproducto(java.lang.String producto)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of subastas where producto = &#63;.
    *
    * @param producto the producto
    * @return the number of matching subastas
    * @throws SystemException if a system exception occurred
    */
    public int countByproducto(java.lang.String producto)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the subastas where estado = &#63;.
    *
    * @param estado the estado
    * @return the matching subastas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.subastas.model.Subasta> findByestado(
        java.lang.String estado)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the subastas where estado = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.subastas.model.impl.SubastaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param estado the estado
    * @param start the lower bound of the range of subastas
    * @param end the upper bound of the range of subastas (not inclusive)
    * @return the range of matching subastas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.subastas.model.Subasta> findByestado(
        java.lang.String estado, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the subastas where estado = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.subastas.model.impl.SubastaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param estado the estado
    * @param start the lower bound of the range of subastas
    * @param end the upper bound of the range of subastas (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching subastas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.subastas.model.Subasta> findByestado(
        java.lang.String estado, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first subasta in the ordered set where estado = &#63;.
    *
    * @param estado the estado
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching subasta
    * @throws com.subastas.NoSuchSubastaException if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.subastas.model.Subasta findByestado_First(
        java.lang.String estado,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.subastas.NoSuchSubastaException;

    /**
    * Returns the first subasta in the ordered set where estado = &#63;.
    *
    * @param estado the estado
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching subasta, or <code>null</code> if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.subastas.model.Subasta fetchByestado_First(
        java.lang.String estado,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last subasta in the ordered set where estado = &#63;.
    *
    * @param estado the estado
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching subasta
    * @throws com.subastas.NoSuchSubastaException if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.subastas.model.Subasta findByestado_Last(
        java.lang.String estado,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.subastas.NoSuchSubastaException;

    /**
    * Returns the last subasta in the ordered set where estado = &#63;.
    *
    * @param estado the estado
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching subasta, or <code>null</code> if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.subastas.model.Subasta fetchByestado_Last(
        java.lang.String estado,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the subastas before and after the current subasta in the ordered set where estado = &#63;.
    *
    * @param id the primary key of the current subasta
    * @param estado the estado
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next subasta
    * @throws com.subastas.NoSuchSubastaException if a subasta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.subastas.model.Subasta[] findByestado_PrevAndNext(long id,
        java.lang.String estado,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.subastas.NoSuchSubastaException;

    /**
    * Removes all the subastas where estado = &#63; from the database.
    *
    * @param estado the estado
    * @throws SystemException if a system exception occurred
    */
    public void removeByestado(java.lang.String estado)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of subastas where estado = &#63;.
    *
    * @param estado the estado
    * @return the number of matching subastas
    * @throws SystemException if a system exception occurred
    */
    public int countByestado(java.lang.String estado)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the subastas where producto = &#63; and estado = &#63;.
    *
    * @param producto the producto
    * @param estado the estado
    * @return the matching subastas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.subastas.model.Subasta> findByproducto_estado(
        java.lang.String producto, java.lang.String estado)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the subastas where producto = &#63; and estado = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.subastas.model.impl.SubastaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param producto the producto
    * @param estado the estado
    * @param start the lower bound of the range of subastas
    * @param end the upper bound of the range of subastas (not inclusive)
    * @return the range of matching subastas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.subastas.model.Subasta> findByproducto_estado(
        java.lang.String producto, java.lang.String estado, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the subastas where producto = &#63; and estado = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.subastas.model.impl.SubastaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param producto the producto
    * @param estado the estado
    * @param start the lower bound of the range of subastas
    * @param end the upper bound of the range of subastas (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching subastas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.subastas.model.Subasta> findByproducto_estado(
        java.lang.String producto, java.lang.String estado, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first subasta in the ordered set where producto = &#63; and estado = &#63;.
    *
    * @param producto the producto
    * @param estado the estado
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching subasta
    * @throws com.subastas.NoSuchSubastaException if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.subastas.model.Subasta findByproducto_estado_First(
        java.lang.String producto, java.lang.String estado,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.subastas.NoSuchSubastaException;

    /**
    * Returns the first subasta in the ordered set where producto = &#63; and estado = &#63;.
    *
    * @param producto the producto
    * @param estado the estado
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching subasta, or <code>null</code> if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.subastas.model.Subasta fetchByproducto_estado_First(
        java.lang.String producto, java.lang.String estado,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last subasta in the ordered set where producto = &#63; and estado = &#63;.
    *
    * @param producto the producto
    * @param estado the estado
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching subasta
    * @throws com.subastas.NoSuchSubastaException if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.subastas.model.Subasta findByproducto_estado_Last(
        java.lang.String producto, java.lang.String estado,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.subastas.NoSuchSubastaException;

    /**
    * Returns the last subasta in the ordered set where producto = &#63; and estado = &#63;.
    *
    * @param producto the producto
    * @param estado the estado
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching subasta, or <code>null</code> if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.subastas.model.Subasta fetchByproducto_estado_Last(
        java.lang.String producto, java.lang.String estado,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the subastas before and after the current subasta in the ordered set where producto = &#63; and estado = &#63;.
    *
    * @param id the primary key of the current subasta
    * @param producto the producto
    * @param estado the estado
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next subasta
    * @throws com.subastas.NoSuchSubastaException if a subasta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.subastas.model.Subasta[] findByproducto_estado_PrevAndNext(
        long id, java.lang.String producto, java.lang.String estado,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.subastas.NoSuchSubastaException;

    /**
    * Removes all the subastas where producto = &#63; and estado = &#63; from the database.
    *
    * @param producto the producto
    * @param estado the estado
    * @throws SystemException if a system exception occurred
    */
    public void removeByproducto_estado(java.lang.String producto,
        java.lang.String estado)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of subastas where producto = &#63; and estado = &#63;.
    *
    * @param producto the producto
    * @param estado the estado
    * @return the number of matching subastas
    * @throws SystemException if a system exception occurred
    */
    public int countByproducto_estado(java.lang.String producto,
        java.lang.String estado)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the subastas where pujadorId = &#63;.
    *
    * @param pujadorId the pujador ID
    * @return the matching subastas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.subastas.model.Subasta> findBypujador(
        long pujadorId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the subastas where pujadorId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.subastas.model.impl.SubastaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param pujadorId the pujador ID
    * @param start the lower bound of the range of subastas
    * @param end the upper bound of the range of subastas (not inclusive)
    * @return the range of matching subastas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.subastas.model.Subasta> findBypujador(
        long pujadorId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the subastas where pujadorId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.subastas.model.impl.SubastaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param pujadorId the pujador ID
    * @param start the lower bound of the range of subastas
    * @param end the upper bound of the range of subastas (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching subastas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.subastas.model.Subasta> findBypujador(
        long pujadorId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first subasta in the ordered set where pujadorId = &#63;.
    *
    * @param pujadorId the pujador ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching subasta
    * @throws com.subastas.NoSuchSubastaException if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.subastas.model.Subasta findBypujador_First(long pujadorId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.subastas.NoSuchSubastaException;

    /**
    * Returns the first subasta in the ordered set where pujadorId = &#63;.
    *
    * @param pujadorId the pujador ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching subasta, or <code>null</code> if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.subastas.model.Subasta fetchBypujador_First(long pujadorId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last subasta in the ordered set where pujadorId = &#63;.
    *
    * @param pujadorId the pujador ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching subasta
    * @throws com.subastas.NoSuchSubastaException if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.subastas.model.Subasta findBypujador_Last(long pujadorId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.subastas.NoSuchSubastaException;

    /**
    * Returns the last subasta in the ordered set where pujadorId = &#63;.
    *
    * @param pujadorId the pujador ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching subasta, or <code>null</code> if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.subastas.model.Subasta fetchBypujador_Last(long pujadorId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the subastas before and after the current subasta in the ordered set where pujadorId = &#63;.
    *
    * @param id the primary key of the current subasta
    * @param pujadorId the pujador ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next subasta
    * @throws com.subastas.NoSuchSubastaException if a subasta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.subastas.model.Subasta[] findBypujador_PrevAndNext(long id,
        long pujadorId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.subastas.NoSuchSubastaException;

    /**
    * Removes all the subastas where pujadorId = &#63; from the database.
    *
    * @param pujadorId the pujador ID
    * @throws SystemException if a system exception occurred
    */
    public void removeBypujador(long pujadorId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of subastas where pujadorId = &#63;.
    *
    * @param pujadorId the pujador ID
    * @return the number of matching subastas
    * @throws SystemException if a system exception occurred
    */
    public int countBypujador(long pujadorId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the subastas where userId = &#63;.
    *
    * @param userId the user ID
    * @return the matching subastas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.subastas.model.Subasta> findBysubastador(
        long userId) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the subastas where userId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.subastas.model.impl.SubastaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param userId the user ID
    * @param start the lower bound of the range of subastas
    * @param end the upper bound of the range of subastas (not inclusive)
    * @return the range of matching subastas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.subastas.model.Subasta> findBysubastador(
        long userId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the subastas where userId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.subastas.model.impl.SubastaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param userId the user ID
    * @param start the lower bound of the range of subastas
    * @param end the upper bound of the range of subastas (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching subastas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.subastas.model.Subasta> findBysubastador(
        long userId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first subasta in the ordered set where userId = &#63;.
    *
    * @param userId the user ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching subasta
    * @throws com.subastas.NoSuchSubastaException if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.subastas.model.Subasta findBysubastador_First(long userId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.subastas.NoSuchSubastaException;

    /**
    * Returns the first subasta in the ordered set where userId = &#63;.
    *
    * @param userId the user ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching subasta, or <code>null</code> if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.subastas.model.Subasta fetchBysubastador_First(long userId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last subasta in the ordered set where userId = &#63;.
    *
    * @param userId the user ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching subasta
    * @throws com.subastas.NoSuchSubastaException if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.subastas.model.Subasta findBysubastador_Last(long userId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.subastas.NoSuchSubastaException;

    /**
    * Returns the last subasta in the ordered set where userId = &#63;.
    *
    * @param userId the user ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching subasta, or <code>null</code> if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.subastas.model.Subasta fetchBysubastador_Last(long userId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the subastas before and after the current subasta in the ordered set where userId = &#63;.
    *
    * @param id the primary key of the current subasta
    * @param userId the user ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next subasta
    * @throws com.subastas.NoSuchSubastaException if a subasta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.subastas.model.Subasta[] findBysubastador_PrevAndNext(long id,
        long userId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.subastas.NoSuchSubastaException;

    /**
    * Removes all the subastas where userId = &#63; from the database.
    *
    * @param userId the user ID
    * @throws SystemException if a system exception occurred
    */
    public void removeBysubastador(long userId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of subastas where userId = &#63;.
    *
    * @param userId the user ID
    * @return the number of matching subastas
    * @throws SystemException if a system exception occurred
    */
    public int countBysubastador(long userId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the subasta in the entity cache if it is enabled.
    *
    * @param subasta the subasta
    */
    public void cacheResult(com.subastas.model.Subasta subasta);

    /**
    * Caches the subastas in the entity cache if it is enabled.
    *
    * @param subastas the subastas
    */
    public void cacheResult(java.util.List<com.subastas.model.Subasta> subastas);

    /**
    * Creates a new subasta with the primary key. Does not add the subasta to the database.
    *
    * @param id the primary key for the new subasta
    * @return the new subasta
    */
    public com.subastas.model.Subasta create(long id);

    /**
    * Removes the subasta with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the subasta
    * @return the subasta that was removed
    * @throws com.subastas.NoSuchSubastaException if a subasta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.subastas.model.Subasta remove(long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.subastas.NoSuchSubastaException;

    public com.subastas.model.Subasta updateImpl(
        com.subastas.model.Subasta subasta)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the subasta with the primary key or throws a {@link com.subastas.NoSuchSubastaException} if it could not be found.
    *
    * @param id the primary key of the subasta
    * @return the subasta
    * @throws com.subastas.NoSuchSubastaException if a subasta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.subastas.model.Subasta findByPrimaryKey(long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.subastas.NoSuchSubastaException;

    /**
    * Returns the subasta with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the subasta
    * @return the subasta, or <code>null</code> if a subasta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.subastas.model.Subasta fetchByPrimaryKey(long id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the subastas.
    *
    * @return the subastas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.subastas.model.Subasta> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.subastas.model.Subasta> findAll(int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the subastas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.subastas.model.impl.SubastaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of subastas
    * @param end the upper bound of the range of subastas (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of subastas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.subastas.model.Subasta> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the subastas from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of subastas.
    *
    * @return the number of subastas
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
