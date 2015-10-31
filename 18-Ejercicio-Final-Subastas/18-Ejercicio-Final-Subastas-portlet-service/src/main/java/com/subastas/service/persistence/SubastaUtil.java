package com.subastas.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.subastas.model.Subasta;

import java.util.List;

/**
 * The persistence utility for the subasta service. This utility wraps {@link SubastaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SubastaPersistence
 * @see SubastaPersistenceImpl
 * @generated
 */
public class SubastaUtil {
    private static SubastaPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Subasta subasta) {
        getPersistence().clearCache(subasta);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Subasta> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Subasta> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Subasta> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Subasta update(Subasta subasta) throws SystemException {
        return getPersistence().update(subasta);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Subasta update(Subasta subasta, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(subasta, serviceContext);
    }

    /**
    * Returns all the subastas where producto = &#63;.
    *
    * @param producto the producto
    * @return the matching subastas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.subastas.model.Subasta> findByproducto(
        java.lang.String producto)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByproducto(producto);
    }

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
    public static java.util.List<com.subastas.model.Subasta> findByproducto(
        java.lang.String producto, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByproducto(producto, start, end);
    }

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
    public static java.util.List<com.subastas.model.Subasta> findByproducto(
        java.lang.String producto, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByproducto(producto, start, end, orderByComparator);
    }

    /**
    * Returns the first subasta in the ordered set where producto = &#63;.
    *
    * @param producto the producto
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching subasta
    * @throws com.subastas.NoSuchSubastaException if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.subastas.model.Subasta findByproducto_First(
        java.lang.String producto,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.subastas.NoSuchSubastaException {
        return getPersistence().findByproducto_First(producto, orderByComparator);
    }

    /**
    * Returns the first subasta in the ordered set where producto = &#63;.
    *
    * @param producto the producto
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching subasta, or <code>null</code> if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.subastas.model.Subasta fetchByproducto_First(
        java.lang.String producto,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByproducto_First(producto, orderByComparator);
    }

    /**
    * Returns the last subasta in the ordered set where producto = &#63;.
    *
    * @param producto the producto
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching subasta
    * @throws com.subastas.NoSuchSubastaException if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.subastas.model.Subasta findByproducto_Last(
        java.lang.String producto,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.subastas.NoSuchSubastaException {
        return getPersistence().findByproducto_Last(producto, orderByComparator);
    }

    /**
    * Returns the last subasta in the ordered set where producto = &#63;.
    *
    * @param producto the producto
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching subasta, or <code>null</code> if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.subastas.model.Subasta fetchByproducto_Last(
        java.lang.String producto,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByproducto_Last(producto, orderByComparator);
    }

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
    public static com.subastas.model.Subasta[] findByproducto_PrevAndNext(
        long id, java.lang.String producto,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.subastas.NoSuchSubastaException {
        return getPersistence()
                   .findByproducto_PrevAndNext(id, producto, orderByComparator);
    }

    /**
    * Removes all the subastas where producto = &#63; from the database.
    *
    * @param producto the producto
    * @throws SystemException if a system exception occurred
    */
    public static void removeByproducto(java.lang.String producto)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByproducto(producto);
    }

    /**
    * Returns the number of subastas where producto = &#63;.
    *
    * @param producto the producto
    * @return the number of matching subastas
    * @throws SystemException if a system exception occurred
    */
    public static int countByproducto(java.lang.String producto)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByproducto(producto);
    }

    /**
    * Returns all the subastas where estado = &#63;.
    *
    * @param estado the estado
    * @return the matching subastas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.subastas.model.Subasta> findByestado(
        java.lang.String estado)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByestado(estado);
    }

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
    public static java.util.List<com.subastas.model.Subasta> findByestado(
        java.lang.String estado, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByestado(estado, start, end);
    }

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
    public static java.util.List<com.subastas.model.Subasta> findByestado(
        java.lang.String estado, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByestado(estado, start, end, orderByComparator);
    }

    /**
    * Returns the first subasta in the ordered set where estado = &#63;.
    *
    * @param estado the estado
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching subasta
    * @throws com.subastas.NoSuchSubastaException if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.subastas.model.Subasta findByestado_First(
        java.lang.String estado,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.subastas.NoSuchSubastaException {
        return getPersistence().findByestado_First(estado, orderByComparator);
    }

    /**
    * Returns the first subasta in the ordered set where estado = &#63;.
    *
    * @param estado the estado
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching subasta, or <code>null</code> if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.subastas.model.Subasta fetchByestado_First(
        java.lang.String estado,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByestado_First(estado, orderByComparator);
    }

    /**
    * Returns the last subasta in the ordered set where estado = &#63;.
    *
    * @param estado the estado
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching subasta
    * @throws com.subastas.NoSuchSubastaException if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.subastas.model.Subasta findByestado_Last(
        java.lang.String estado,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.subastas.NoSuchSubastaException {
        return getPersistence().findByestado_Last(estado, orderByComparator);
    }

    /**
    * Returns the last subasta in the ordered set where estado = &#63;.
    *
    * @param estado the estado
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching subasta, or <code>null</code> if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.subastas.model.Subasta fetchByestado_Last(
        java.lang.String estado,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByestado_Last(estado, orderByComparator);
    }

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
    public static com.subastas.model.Subasta[] findByestado_PrevAndNext(
        long id, java.lang.String estado,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.subastas.NoSuchSubastaException {
        return getPersistence()
                   .findByestado_PrevAndNext(id, estado, orderByComparator);
    }

    /**
    * Removes all the subastas where estado = &#63; from the database.
    *
    * @param estado the estado
    * @throws SystemException if a system exception occurred
    */
    public static void removeByestado(java.lang.String estado)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByestado(estado);
    }

    /**
    * Returns the number of subastas where estado = &#63;.
    *
    * @param estado the estado
    * @return the number of matching subastas
    * @throws SystemException if a system exception occurred
    */
    public static int countByestado(java.lang.String estado)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByestado(estado);
    }

    /**
    * Returns all the subastas where producto = &#63; and estado = &#63;.
    *
    * @param producto the producto
    * @param estado the estado
    * @return the matching subastas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.subastas.model.Subasta> findByproducto_estado(
        java.lang.String producto, java.lang.String estado)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByproducto_estado(producto, estado);
    }

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
    public static java.util.List<com.subastas.model.Subasta> findByproducto_estado(
        java.lang.String producto, java.lang.String estado, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByproducto_estado(producto, estado, start, end);
    }

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
    public static java.util.List<com.subastas.model.Subasta> findByproducto_estado(
        java.lang.String producto, java.lang.String estado, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByproducto_estado(producto, estado, start, end,
            orderByComparator);
    }

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
    public static com.subastas.model.Subasta findByproducto_estado_First(
        java.lang.String producto, java.lang.String estado,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.subastas.NoSuchSubastaException {
        return getPersistence()
                   .findByproducto_estado_First(producto, estado,
            orderByComparator);
    }

    /**
    * Returns the first subasta in the ordered set where producto = &#63; and estado = &#63;.
    *
    * @param producto the producto
    * @param estado the estado
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching subasta, or <code>null</code> if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.subastas.model.Subasta fetchByproducto_estado_First(
        java.lang.String producto, java.lang.String estado,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByproducto_estado_First(producto, estado,
            orderByComparator);
    }

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
    public static com.subastas.model.Subasta findByproducto_estado_Last(
        java.lang.String producto, java.lang.String estado,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.subastas.NoSuchSubastaException {
        return getPersistence()
                   .findByproducto_estado_Last(producto, estado,
            orderByComparator);
    }

    /**
    * Returns the last subasta in the ordered set where producto = &#63; and estado = &#63;.
    *
    * @param producto the producto
    * @param estado the estado
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching subasta, or <code>null</code> if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.subastas.model.Subasta fetchByproducto_estado_Last(
        java.lang.String producto, java.lang.String estado,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByproducto_estado_Last(producto, estado,
            orderByComparator);
    }

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
    public static com.subastas.model.Subasta[] findByproducto_estado_PrevAndNext(
        long id, java.lang.String producto, java.lang.String estado,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.subastas.NoSuchSubastaException {
        return getPersistence()
                   .findByproducto_estado_PrevAndNext(id, producto, estado,
            orderByComparator);
    }

    /**
    * Removes all the subastas where producto = &#63; and estado = &#63; from the database.
    *
    * @param producto the producto
    * @param estado the estado
    * @throws SystemException if a system exception occurred
    */
    public static void removeByproducto_estado(java.lang.String producto,
        java.lang.String estado)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByproducto_estado(producto, estado);
    }

    /**
    * Returns the number of subastas where producto = &#63; and estado = &#63;.
    *
    * @param producto the producto
    * @param estado the estado
    * @return the number of matching subastas
    * @throws SystemException if a system exception occurred
    */
    public static int countByproducto_estado(java.lang.String producto,
        java.lang.String estado)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByproducto_estado(producto, estado);
    }

    /**
    * Returns all the subastas where pujadorId = &#63;.
    *
    * @param pujadorId the pujador ID
    * @return the matching subastas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.subastas.model.Subasta> findBypujador(
        long pujadorId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBypujador(pujadorId);
    }

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
    public static java.util.List<com.subastas.model.Subasta> findBypujador(
        long pujadorId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBypujador(pujadorId, start, end);
    }

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
    public static java.util.List<com.subastas.model.Subasta> findBypujador(
        long pujadorId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findBypujador(pujadorId, start, end, orderByComparator);
    }

    /**
    * Returns the first subasta in the ordered set where pujadorId = &#63;.
    *
    * @param pujadorId the pujador ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching subasta
    * @throws com.subastas.NoSuchSubastaException if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.subastas.model.Subasta findBypujador_First(
        long pujadorId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.subastas.NoSuchSubastaException {
        return getPersistence().findBypujador_First(pujadorId, orderByComparator);
    }

    /**
    * Returns the first subasta in the ordered set where pujadorId = &#63;.
    *
    * @param pujadorId the pujador ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching subasta, or <code>null</code> if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.subastas.model.Subasta fetchBypujador_First(
        long pujadorId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchBypujador_First(pujadorId, orderByComparator);
    }

    /**
    * Returns the last subasta in the ordered set where pujadorId = &#63;.
    *
    * @param pujadorId the pujador ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching subasta
    * @throws com.subastas.NoSuchSubastaException if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.subastas.model.Subasta findBypujador_Last(
        long pujadorId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.subastas.NoSuchSubastaException {
        return getPersistence().findBypujador_Last(pujadorId, orderByComparator);
    }

    /**
    * Returns the last subasta in the ordered set where pujadorId = &#63;.
    *
    * @param pujadorId the pujador ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching subasta, or <code>null</code> if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.subastas.model.Subasta fetchBypujador_Last(
        long pujadorId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchBypujador_Last(pujadorId, orderByComparator);
    }

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
    public static com.subastas.model.Subasta[] findBypujador_PrevAndNext(
        long id, long pujadorId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.subastas.NoSuchSubastaException {
        return getPersistence()
                   .findBypujador_PrevAndNext(id, pujadorId, orderByComparator);
    }

    /**
    * Removes all the subastas where pujadorId = &#63; from the database.
    *
    * @param pujadorId the pujador ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeBypujador(long pujadorId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeBypujador(pujadorId);
    }

    /**
    * Returns the number of subastas where pujadorId = &#63;.
    *
    * @param pujadorId the pujador ID
    * @return the number of matching subastas
    * @throws SystemException if a system exception occurred
    */
    public static int countBypujador(long pujadorId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countBypujador(pujadorId);
    }

    /**
    * Returns all the subastas where userId = &#63;.
    *
    * @param userId the user ID
    * @return the matching subastas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.subastas.model.Subasta> findBysubastador(
        long userId) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBysubastador(userId);
    }

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
    public static java.util.List<com.subastas.model.Subasta> findBysubastador(
        long userId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBysubastador(userId, start, end);
    }

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
    public static java.util.List<com.subastas.model.Subasta> findBysubastador(
        long userId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findBysubastador(userId, start, end, orderByComparator);
    }

    /**
    * Returns the first subasta in the ordered set where userId = &#63;.
    *
    * @param userId the user ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching subasta
    * @throws com.subastas.NoSuchSubastaException if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.subastas.model.Subasta findBysubastador_First(
        long userId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.subastas.NoSuchSubastaException {
        return getPersistence().findBysubastador_First(userId, orderByComparator);
    }

    /**
    * Returns the first subasta in the ordered set where userId = &#63;.
    *
    * @param userId the user ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching subasta, or <code>null</code> if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.subastas.model.Subasta fetchBysubastador_First(
        long userId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchBysubastador_First(userId, orderByComparator);
    }

    /**
    * Returns the last subasta in the ordered set where userId = &#63;.
    *
    * @param userId the user ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching subasta
    * @throws com.subastas.NoSuchSubastaException if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.subastas.model.Subasta findBysubastador_Last(
        long userId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.subastas.NoSuchSubastaException {
        return getPersistence().findBysubastador_Last(userId, orderByComparator);
    }

    /**
    * Returns the last subasta in the ordered set where userId = &#63;.
    *
    * @param userId the user ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching subasta, or <code>null</code> if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.subastas.model.Subasta fetchBysubastador_Last(
        long userId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchBysubastador_Last(userId, orderByComparator);
    }

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
    public static com.subastas.model.Subasta[] findBysubastador_PrevAndNext(
        long id, long userId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.subastas.NoSuchSubastaException {
        return getPersistence()
                   .findBysubastador_PrevAndNext(id, userId, orderByComparator);
    }

    /**
    * Removes all the subastas where userId = &#63; from the database.
    *
    * @param userId the user ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeBysubastador(long userId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeBysubastador(userId);
    }

    /**
    * Returns the number of subastas where userId = &#63;.
    *
    * @param userId the user ID
    * @return the number of matching subastas
    * @throws SystemException if a system exception occurred
    */
    public static int countBysubastador(long userId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countBysubastador(userId);
    }

    /**
    * Caches the subasta in the entity cache if it is enabled.
    *
    * @param subasta the subasta
    */
    public static void cacheResult(com.subastas.model.Subasta subasta) {
        getPersistence().cacheResult(subasta);
    }

    /**
    * Caches the subastas in the entity cache if it is enabled.
    *
    * @param subastas the subastas
    */
    public static void cacheResult(
        java.util.List<com.subastas.model.Subasta> subastas) {
        getPersistence().cacheResult(subastas);
    }

    /**
    * Creates a new subasta with the primary key. Does not add the subasta to the database.
    *
    * @param id the primary key for the new subasta
    * @return the new subasta
    */
    public static com.subastas.model.Subasta create(long id) {
        return getPersistence().create(id);
    }

    /**
    * Removes the subasta with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the subasta
    * @return the subasta that was removed
    * @throws com.subastas.NoSuchSubastaException if a subasta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.subastas.model.Subasta remove(long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.subastas.NoSuchSubastaException {
        return getPersistence().remove(id);
    }

    public static com.subastas.model.Subasta updateImpl(
        com.subastas.model.Subasta subasta)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(subasta);
    }

    /**
    * Returns the subasta with the primary key or throws a {@link com.subastas.NoSuchSubastaException} if it could not be found.
    *
    * @param id the primary key of the subasta
    * @return the subasta
    * @throws com.subastas.NoSuchSubastaException if a subasta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.subastas.model.Subasta findByPrimaryKey(long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.subastas.NoSuchSubastaException {
        return getPersistence().findByPrimaryKey(id);
    }

    /**
    * Returns the subasta with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the subasta
    * @return the subasta, or <code>null</code> if a subasta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.subastas.model.Subasta fetchByPrimaryKey(long id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(id);
    }

    /**
    * Returns all the subastas.
    *
    * @return the subastas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.subastas.model.Subasta> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.subastas.model.Subasta> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

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
    public static java.util.List<com.subastas.model.Subasta> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the subastas from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of subastas.
    *
    * @return the number of subastas
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static SubastaPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (SubastaPersistence) PortletBeanLocatorUtil.locate(com.subastas.service.ClpSerializer.getServletContextName(),
                    SubastaPersistence.class.getName());

            ReferenceRegistry.registerReference(SubastaUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(SubastaPersistence persistence) {
    }
}
