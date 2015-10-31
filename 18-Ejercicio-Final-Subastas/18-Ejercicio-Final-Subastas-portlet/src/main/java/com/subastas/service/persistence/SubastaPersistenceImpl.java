package com.subastas.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.subastas.NoSuchSubastaException;

import com.subastas.model.Subasta;
import com.subastas.model.impl.SubastaImpl;
import com.subastas.model.impl.SubastaModelImpl;

import com.subastas.service.persistence.SubastaPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the subasta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SubastaPersistence
 * @see SubastaUtil
 * @generated
 */
public class SubastaPersistenceImpl extends BasePersistenceImpl<Subasta>
    implements SubastaPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link SubastaUtil} to access the subasta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = SubastaImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SubastaModelImpl.ENTITY_CACHE_ENABLED,
            SubastaModelImpl.FINDER_CACHE_ENABLED, SubastaImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SubastaModelImpl.ENTITY_CACHE_ENABLED,
            SubastaModelImpl.FINDER_CACHE_ENABLED, SubastaImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SubastaModelImpl.ENTITY_CACHE_ENABLED,
            SubastaModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTO = new FinderPath(SubastaModelImpl.ENTITY_CACHE_ENABLED,
            SubastaModelImpl.FINDER_CACHE_ENABLED, SubastaImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByproducto",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTO =
        new FinderPath(SubastaModelImpl.ENTITY_CACHE_ENABLED,
            SubastaModelImpl.FINDER_CACHE_ENABLED, SubastaImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByproducto",
            new String[] { String.class.getName() },
            SubastaModelImpl.PRODUCTO_COLUMN_BITMASK |
            SubastaModelImpl.ESTADO_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_PRODUCTO = new FinderPath(SubastaModelImpl.ENTITY_CACHE_ENABLED,
            SubastaModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByproducto",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_PRODUCTO_PRODUCTO_1 = "subasta.producto IS NULL";
    private static final String _FINDER_COLUMN_PRODUCTO_PRODUCTO_2 = "subasta.producto = ?";
    private static final String _FINDER_COLUMN_PRODUCTO_PRODUCTO_3 = "(subasta.producto IS NULL OR subasta.producto = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ESTADO = new FinderPath(SubastaModelImpl.ENTITY_CACHE_ENABLED,
            SubastaModelImpl.FINDER_CACHE_ENABLED, SubastaImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByestado",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ESTADO =
        new FinderPath(SubastaModelImpl.ENTITY_CACHE_ENABLED,
            SubastaModelImpl.FINDER_CACHE_ENABLED, SubastaImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByestado",
            new String[] { String.class.getName() },
            SubastaModelImpl.ESTADO_COLUMN_BITMASK |
            SubastaModelImpl.PRODUCTO_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_ESTADO = new FinderPath(SubastaModelImpl.ENTITY_CACHE_ENABLED,
            SubastaModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByestado",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_ESTADO_ESTADO_1 = "subasta.estado IS NULL";
    private static final String _FINDER_COLUMN_ESTADO_ESTADO_2 = "subasta.estado = ?";
    private static final String _FINDER_COLUMN_ESTADO_ESTADO_3 = "(subasta.estado IS NULL OR subasta.estado = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTO_ESTADO =
        new FinderPath(SubastaModelImpl.ENTITY_CACHE_ENABLED,
            SubastaModelImpl.FINDER_CACHE_ENABLED, SubastaImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByproducto_estado",
            new String[] {
                String.class.getName(), String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTO_ESTADO =
        new FinderPath(SubastaModelImpl.ENTITY_CACHE_ENABLED,
            SubastaModelImpl.FINDER_CACHE_ENABLED, SubastaImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByproducto_estado",
            new String[] { String.class.getName(), String.class.getName() },
            SubastaModelImpl.PRODUCTO_COLUMN_BITMASK |
            SubastaModelImpl.ESTADO_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_PRODUCTO_ESTADO = new FinderPath(SubastaModelImpl.ENTITY_CACHE_ENABLED,
            SubastaModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByproducto_estado",
            new String[] { String.class.getName(), String.class.getName() });
    private static final String _FINDER_COLUMN_PRODUCTO_ESTADO_PRODUCTO_1 = "subasta.producto IS NULL AND ";
    private static final String _FINDER_COLUMN_PRODUCTO_ESTADO_PRODUCTO_2 = "subasta.producto = ? AND ";
    private static final String _FINDER_COLUMN_PRODUCTO_ESTADO_PRODUCTO_3 = "(subasta.producto IS NULL OR subasta.producto = '') AND ";
    private static final String _FINDER_COLUMN_PRODUCTO_ESTADO_ESTADO_1 = "subasta.estado IS NULL";
    private static final String _FINDER_COLUMN_PRODUCTO_ESTADO_ESTADO_2 = "subasta.estado = ?";
    private static final String _FINDER_COLUMN_PRODUCTO_ESTADO_ESTADO_3 = "(subasta.estado IS NULL OR subasta.estado = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PUJADOR = new FinderPath(SubastaModelImpl.ENTITY_CACHE_ENABLED,
            SubastaModelImpl.FINDER_CACHE_ENABLED, SubastaImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBypujador",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PUJADOR =
        new FinderPath(SubastaModelImpl.ENTITY_CACHE_ENABLED,
            SubastaModelImpl.FINDER_CACHE_ENABLED, SubastaImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBypujador",
            new String[] { Long.class.getName() },
            SubastaModelImpl.PUJADORID_COLUMN_BITMASK |
            SubastaModelImpl.ESTADO_COLUMN_BITMASK |
            SubastaModelImpl.PRODUCTO_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_PUJADOR = new FinderPath(SubastaModelImpl.ENTITY_CACHE_ENABLED,
            SubastaModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBypujador",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_PUJADOR_PUJADORID_2 = "subasta.pujadorId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SUBASTADOR =
        new FinderPath(SubastaModelImpl.ENTITY_CACHE_ENABLED,
            SubastaModelImpl.FINDER_CACHE_ENABLED, SubastaImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBysubastador",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUBASTADOR =
        new FinderPath(SubastaModelImpl.ENTITY_CACHE_ENABLED,
            SubastaModelImpl.FINDER_CACHE_ENABLED, SubastaImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBysubastador",
            new String[] { Long.class.getName() },
            SubastaModelImpl.USERID_COLUMN_BITMASK |
            SubastaModelImpl.ESTADO_COLUMN_BITMASK |
            SubastaModelImpl.PRODUCTO_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_SUBASTADOR = new FinderPath(SubastaModelImpl.ENTITY_CACHE_ENABLED,
            SubastaModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBysubastador",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_SUBASTADOR_USERID_2 = "subasta.userId = ?";
    private static final String _SQL_SELECT_SUBASTA = "SELECT subasta FROM Subasta subasta";
    private static final String _SQL_SELECT_SUBASTA_WHERE = "SELECT subasta FROM Subasta subasta WHERE ";
    private static final String _SQL_COUNT_SUBASTA = "SELECT COUNT(subasta) FROM Subasta subasta";
    private static final String _SQL_COUNT_SUBASTA_WHERE = "SELECT COUNT(subasta) FROM Subasta subasta WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "subasta.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Subasta exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Subasta exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(SubastaPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "id"
            });
    private static Subasta _nullSubasta = new SubastaImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Subasta> toCacheModel() {
                return _nullSubastaCacheModel;
            }
        };

    private static CacheModel<Subasta> _nullSubastaCacheModel = new CacheModel<Subasta>() {
            @Override
            public Subasta toEntityModel() {
                return _nullSubasta;
            }
        };

    public SubastaPersistenceImpl() {
        setModelClass(Subasta.class);
    }

    /**
     * Returns all the subastas where producto = &#63;.
     *
     * @param producto the producto
     * @return the matching subastas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Subasta> findByproducto(String producto)
        throws SystemException {
        return findByproducto(producto, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
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
    @Override
    public List<Subasta> findByproducto(String producto, int start, int end)
        throws SystemException {
        return findByproducto(producto, start, end, null);
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
    @Override
    public List<Subasta> findByproducto(String producto, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTO;
            finderArgs = new Object[] { producto };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTO;
            finderArgs = new Object[] { producto, start, end, orderByComparator };
        }

        List<Subasta> list = (List<Subasta>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Subasta subasta : list) {
                if (!Validator.equals(producto, subasta.getProducto())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_SUBASTA_WHERE);

            boolean bindProducto = false;

            if (producto == null) {
                query.append(_FINDER_COLUMN_PRODUCTO_PRODUCTO_1);
            } else if (producto.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_PRODUCTO_PRODUCTO_3);
            } else {
                bindProducto = true;

                query.append(_FINDER_COLUMN_PRODUCTO_PRODUCTO_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(SubastaModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindProducto) {
                    qPos.add(producto);
                }

                if (!pagination) {
                    list = (List<Subasta>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Subasta>(list);
                } else {
                    list = (List<Subasta>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public Subasta findByproducto_First(String producto,
        OrderByComparator orderByComparator)
        throws NoSuchSubastaException, SystemException {
        Subasta subasta = fetchByproducto_First(producto, orderByComparator);

        if (subasta != null) {
            return subasta;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("producto=");
        msg.append(producto);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchSubastaException(msg.toString());
    }

    /**
     * Returns the first subasta in the ordered set where producto = &#63;.
     *
     * @param producto the producto
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching subasta, or <code>null</code> if a matching subasta could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Subasta fetchByproducto_First(String producto,
        OrderByComparator orderByComparator) throws SystemException {
        List<Subasta> list = findByproducto(producto, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Subasta findByproducto_Last(String producto,
        OrderByComparator orderByComparator)
        throws NoSuchSubastaException, SystemException {
        Subasta subasta = fetchByproducto_Last(producto, orderByComparator);

        if (subasta != null) {
            return subasta;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("producto=");
        msg.append(producto);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchSubastaException(msg.toString());
    }

    /**
     * Returns the last subasta in the ordered set where producto = &#63;.
     *
     * @param producto the producto
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching subasta, or <code>null</code> if a matching subasta could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Subasta fetchByproducto_Last(String producto,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByproducto(producto);

        if (count == 0) {
            return null;
        }

        List<Subasta> list = findByproducto(producto, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Subasta[] findByproducto_PrevAndNext(long id, String producto,
        OrderByComparator orderByComparator)
        throws NoSuchSubastaException, SystemException {
        Subasta subasta = findByPrimaryKey(id);

        Session session = null;

        try {
            session = openSession();

            Subasta[] array = new SubastaImpl[3];

            array[0] = getByproducto_PrevAndNext(session, subasta, producto,
                    orderByComparator, true);

            array[1] = subasta;

            array[2] = getByproducto_PrevAndNext(session, subasta, producto,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Subasta getByproducto_PrevAndNext(Session session,
        Subasta subasta, String producto, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_SUBASTA_WHERE);

        boolean bindProducto = false;

        if (producto == null) {
            query.append(_FINDER_COLUMN_PRODUCTO_PRODUCTO_1);
        } else if (producto.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_PRODUCTO_PRODUCTO_3);
        } else {
            bindProducto = true;

            query.append(_FINDER_COLUMN_PRODUCTO_PRODUCTO_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(SubastaModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindProducto) {
            qPos.add(producto);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(subasta);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Subasta> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the subastas where producto = &#63; from the database.
     *
     * @param producto the producto
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByproducto(String producto) throws SystemException {
        for (Subasta subasta : findByproducto(producto, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(subasta);
        }
    }

    /**
     * Returns the number of subastas where producto = &#63;.
     *
     * @param producto the producto
     * @return the number of matching subastas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByproducto(String producto) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_PRODUCTO;

        Object[] finderArgs = new Object[] { producto };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_SUBASTA_WHERE);

            boolean bindProducto = false;

            if (producto == null) {
                query.append(_FINDER_COLUMN_PRODUCTO_PRODUCTO_1);
            } else if (producto.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_PRODUCTO_PRODUCTO_3);
            } else {
                bindProducto = true;

                query.append(_FINDER_COLUMN_PRODUCTO_PRODUCTO_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindProducto) {
                    qPos.add(producto);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the subastas where estado = &#63;.
     *
     * @param estado the estado
     * @return the matching subastas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Subasta> findByestado(String estado) throws SystemException {
        return findByestado(estado, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<Subasta> findByestado(String estado, int start, int end)
        throws SystemException {
        return findByestado(estado, start, end, null);
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
    @Override
    public List<Subasta> findByestado(String estado, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ESTADO;
            finderArgs = new Object[] { estado };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ESTADO;
            finderArgs = new Object[] { estado, start, end, orderByComparator };
        }

        List<Subasta> list = (List<Subasta>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Subasta subasta : list) {
                if (!Validator.equals(estado, subasta.getEstado())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_SUBASTA_WHERE);

            boolean bindEstado = false;

            if (estado == null) {
                query.append(_FINDER_COLUMN_ESTADO_ESTADO_1);
            } else if (estado.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_ESTADO_ESTADO_3);
            } else {
                bindEstado = true;

                query.append(_FINDER_COLUMN_ESTADO_ESTADO_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(SubastaModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindEstado) {
                    qPos.add(estado);
                }

                if (!pagination) {
                    list = (List<Subasta>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Subasta>(list);
                } else {
                    list = (List<Subasta>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public Subasta findByestado_First(String estado,
        OrderByComparator orderByComparator)
        throws NoSuchSubastaException, SystemException {
        Subasta subasta = fetchByestado_First(estado, orderByComparator);

        if (subasta != null) {
            return subasta;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("estado=");
        msg.append(estado);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchSubastaException(msg.toString());
    }

    /**
     * Returns the first subasta in the ordered set where estado = &#63;.
     *
     * @param estado the estado
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching subasta, or <code>null</code> if a matching subasta could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Subasta fetchByestado_First(String estado,
        OrderByComparator orderByComparator) throws SystemException {
        List<Subasta> list = findByestado(estado, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Subasta findByestado_Last(String estado,
        OrderByComparator orderByComparator)
        throws NoSuchSubastaException, SystemException {
        Subasta subasta = fetchByestado_Last(estado, orderByComparator);

        if (subasta != null) {
            return subasta;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("estado=");
        msg.append(estado);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchSubastaException(msg.toString());
    }

    /**
     * Returns the last subasta in the ordered set where estado = &#63;.
     *
     * @param estado the estado
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching subasta, or <code>null</code> if a matching subasta could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Subasta fetchByestado_Last(String estado,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByestado(estado);

        if (count == 0) {
            return null;
        }

        List<Subasta> list = findByestado(estado, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Subasta[] findByestado_PrevAndNext(long id, String estado,
        OrderByComparator orderByComparator)
        throws NoSuchSubastaException, SystemException {
        Subasta subasta = findByPrimaryKey(id);

        Session session = null;

        try {
            session = openSession();

            Subasta[] array = new SubastaImpl[3];

            array[0] = getByestado_PrevAndNext(session, subasta, estado,
                    orderByComparator, true);

            array[1] = subasta;

            array[2] = getByestado_PrevAndNext(session, subasta, estado,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Subasta getByestado_PrevAndNext(Session session, Subasta subasta,
        String estado, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_SUBASTA_WHERE);

        boolean bindEstado = false;

        if (estado == null) {
            query.append(_FINDER_COLUMN_ESTADO_ESTADO_1);
        } else if (estado.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_ESTADO_ESTADO_3);
        } else {
            bindEstado = true;

            query.append(_FINDER_COLUMN_ESTADO_ESTADO_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(SubastaModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindEstado) {
            qPos.add(estado);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(subasta);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Subasta> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the subastas where estado = &#63; from the database.
     *
     * @param estado the estado
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByestado(String estado) throws SystemException {
        for (Subasta subasta : findByestado(estado, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(subasta);
        }
    }

    /**
     * Returns the number of subastas where estado = &#63;.
     *
     * @param estado the estado
     * @return the number of matching subastas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByestado(String estado) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_ESTADO;

        Object[] finderArgs = new Object[] { estado };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_SUBASTA_WHERE);

            boolean bindEstado = false;

            if (estado == null) {
                query.append(_FINDER_COLUMN_ESTADO_ESTADO_1);
            } else if (estado.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_ESTADO_ESTADO_3);
            } else {
                bindEstado = true;

                query.append(_FINDER_COLUMN_ESTADO_ESTADO_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindEstado) {
                    qPos.add(estado);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the subastas where producto = &#63; and estado = &#63;.
     *
     * @param producto the producto
     * @param estado the estado
     * @return the matching subastas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Subasta> findByproducto_estado(String producto, String estado)
        throws SystemException {
        return findByproducto_estado(producto, estado, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
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
    @Override
    public List<Subasta> findByproducto_estado(String producto, String estado,
        int start, int end) throws SystemException {
        return findByproducto_estado(producto, estado, start, end, null);
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
    @Override
    public List<Subasta> findByproducto_estado(String producto, String estado,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTO_ESTADO;
            finderArgs = new Object[] { producto, estado };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTO_ESTADO;
            finderArgs = new Object[] {
                    producto, estado,
                    
                    start, end, orderByComparator
                };
        }

        List<Subasta> list = (List<Subasta>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Subasta subasta : list) {
                if (!Validator.equals(producto, subasta.getProducto()) ||
                        !Validator.equals(estado, subasta.getEstado())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_SUBASTA_WHERE);

            boolean bindProducto = false;

            if (producto == null) {
                query.append(_FINDER_COLUMN_PRODUCTO_ESTADO_PRODUCTO_1);
            } else if (producto.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_PRODUCTO_ESTADO_PRODUCTO_3);
            } else {
                bindProducto = true;

                query.append(_FINDER_COLUMN_PRODUCTO_ESTADO_PRODUCTO_2);
            }

            boolean bindEstado = false;

            if (estado == null) {
                query.append(_FINDER_COLUMN_PRODUCTO_ESTADO_ESTADO_1);
            } else if (estado.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_PRODUCTO_ESTADO_ESTADO_3);
            } else {
                bindEstado = true;

                query.append(_FINDER_COLUMN_PRODUCTO_ESTADO_ESTADO_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(SubastaModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindProducto) {
                    qPos.add(producto);
                }

                if (bindEstado) {
                    qPos.add(estado);
                }

                if (!pagination) {
                    list = (List<Subasta>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Subasta>(list);
                } else {
                    list = (List<Subasta>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public Subasta findByproducto_estado_First(String producto, String estado,
        OrderByComparator orderByComparator)
        throws NoSuchSubastaException, SystemException {
        Subasta subasta = fetchByproducto_estado_First(producto, estado,
                orderByComparator);

        if (subasta != null) {
            return subasta;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("producto=");
        msg.append(producto);

        msg.append(", estado=");
        msg.append(estado);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchSubastaException(msg.toString());
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
    @Override
    public Subasta fetchByproducto_estado_First(String producto, String estado,
        OrderByComparator orderByComparator) throws SystemException {
        List<Subasta> list = findByproducto_estado(producto, estado, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Subasta findByproducto_estado_Last(String producto, String estado,
        OrderByComparator orderByComparator)
        throws NoSuchSubastaException, SystemException {
        Subasta subasta = fetchByproducto_estado_Last(producto, estado,
                orderByComparator);

        if (subasta != null) {
            return subasta;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("producto=");
        msg.append(producto);

        msg.append(", estado=");
        msg.append(estado);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchSubastaException(msg.toString());
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
    @Override
    public Subasta fetchByproducto_estado_Last(String producto, String estado,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByproducto_estado(producto, estado);

        if (count == 0) {
            return null;
        }

        List<Subasta> list = findByproducto_estado(producto, estado, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Subasta[] findByproducto_estado_PrevAndNext(long id,
        String producto, String estado, OrderByComparator orderByComparator)
        throws NoSuchSubastaException, SystemException {
        Subasta subasta = findByPrimaryKey(id);

        Session session = null;

        try {
            session = openSession();

            Subasta[] array = new SubastaImpl[3];

            array[0] = getByproducto_estado_PrevAndNext(session, subasta,
                    producto, estado, orderByComparator, true);

            array[1] = subasta;

            array[2] = getByproducto_estado_PrevAndNext(session, subasta,
                    producto, estado, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Subasta getByproducto_estado_PrevAndNext(Session session,
        Subasta subasta, String producto, String estado,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_SUBASTA_WHERE);

        boolean bindProducto = false;

        if (producto == null) {
            query.append(_FINDER_COLUMN_PRODUCTO_ESTADO_PRODUCTO_1);
        } else if (producto.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_PRODUCTO_ESTADO_PRODUCTO_3);
        } else {
            bindProducto = true;

            query.append(_FINDER_COLUMN_PRODUCTO_ESTADO_PRODUCTO_2);
        }

        boolean bindEstado = false;

        if (estado == null) {
            query.append(_FINDER_COLUMN_PRODUCTO_ESTADO_ESTADO_1);
        } else if (estado.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_PRODUCTO_ESTADO_ESTADO_3);
        } else {
            bindEstado = true;

            query.append(_FINDER_COLUMN_PRODUCTO_ESTADO_ESTADO_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(SubastaModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindProducto) {
            qPos.add(producto);
        }

        if (bindEstado) {
            qPos.add(estado);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(subasta);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Subasta> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the subastas where producto = &#63; and estado = &#63; from the database.
     *
     * @param producto the producto
     * @param estado the estado
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByproducto_estado(String producto, String estado)
        throws SystemException {
        for (Subasta subasta : findByproducto_estado(producto, estado,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(subasta);
        }
    }

    /**
     * Returns the number of subastas where producto = &#63; and estado = &#63;.
     *
     * @param producto the producto
     * @param estado the estado
     * @return the number of matching subastas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByproducto_estado(String producto, String estado)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_PRODUCTO_ESTADO;

        Object[] finderArgs = new Object[] { producto, estado };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_SUBASTA_WHERE);

            boolean bindProducto = false;

            if (producto == null) {
                query.append(_FINDER_COLUMN_PRODUCTO_ESTADO_PRODUCTO_1);
            } else if (producto.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_PRODUCTO_ESTADO_PRODUCTO_3);
            } else {
                bindProducto = true;

                query.append(_FINDER_COLUMN_PRODUCTO_ESTADO_PRODUCTO_2);
            }

            boolean bindEstado = false;

            if (estado == null) {
                query.append(_FINDER_COLUMN_PRODUCTO_ESTADO_ESTADO_1);
            } else if (estado.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_PRODUCTO_ESTADO_ESTADO_3);
            } else {
                bindEstado = true;

                query.append(_FINDER_COLUMN_PRODUCTO_ESTADO_ESTADO_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindProducto) {
                    qPos.add(producto);
                }

                if (bindEstado) {
                    qPos.add(estado);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the subastas where pujadorId = &#63;.
     *
     * @param pujadorId the pujador ID
     * @return the matching subastas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Subasta> findBypujador(long pujadorId)
        throws SystemException {
        return findBypujador(pujadorId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
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
    @Override
    public List<Subasta> findBypujador(long pujadorId, int start, int end)
        throws SystemException {
        return findBypujador(pujadorId, start, end, null);
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
    @Override
    public List<Subasta> findBypujador(long pujadorId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PUJADOR;
            finderArgs = new Object[] { pujadorId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PUJADOR;
            finderArgs = new Object[] { pujadorId, start, end, orderByComparator };
        }

        List<Subasta> list = (List<Subasta>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Subasta subasta : list) {
                if ((pujadorId != subasta.getPujadorId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_SUBASTA_WHERE);

            query.append(_FINDER_COLUMN_PUJADOR_PUJADORID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(SubastaModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(pujadorId);

                if (!pagination) {
                    list = (List<Subasta>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Subasta>(list);
                } else {
                    list = (List<Subasta>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public Subasta findBypujador_First(long pujadorId,
        OrderByComparator orderByComparator)
        throws NoSuchSubastaException, SystemException {
        Subasta subasta = fetchBypujador_First(pujadorId, orderByComparator);

        if (subasta != null) {
            return subasta;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("pujadorId=");
        msg.append(pujadorId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchSubastaException(msg.toString());
    }

    /**
     * Returns the first subasta in the ordered set where pujadorId = &#63;.
     *
     * @param pujadorId the pujador ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching subasta, or <code>null</code> if a matching subasta could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Subasta fetchBypujador_First(long pujadorId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Subasta> list = findBypujador(pujadorId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Subasta findBypujador_Last(long pujadorId,
        OrderByComparator orderByComparator)
        throws NoSuchSubastaException, SystemException {
        Subasta subasta = fetchBypujador_Last(pujadorId, orderByComparator);

        if (subasta != null) {
            return subasta;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("pujadorId=");
        msg.append(pujadorId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchSubastaException(msg.toString());
    }

    /**
     * Returns the last subasta in the ordered set where pujadorId = &#63;.
     *
     * @param pujadorId the pujador ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching subasta, or <code>null</code> if a matching subasta could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Subasta fetchBypujador_Last(long pujadorId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countBypujador(pujadorId);

        if (count == 0) {
            return null;
        }

        List<Subasta> list = findBypujador(pujadorId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Subasta[] findBypujador_PrevAndNext(long id, long pujadorId,
        OrderByComparator orderByComparator)
        throws NoSuchSubastaException, SystemException {
        Subasta subasta = findByPrimaryKey(id);

        Session session = null;

        try {
            session = openSession();

            Subasta[] array = new SubastaImpl[3];

            array[0] = getBypujador_PrevAndNext(session, subasta, pujadorId,
                    orderByComparator, true);

            array[1] = subasta;

            array[2] = getBypujador_PrevAndNext(session, subasta, pujadorId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Subasta getBypujador_PrevAndNext(Session session,
        Subasta subasta, long pujadorId, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_SUBASTA_WHERE);

        query.append(_FINDER_COLUMN_PUJADOR_PUJADORID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(SubastaModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(pujadorId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(subasta);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Subasta> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the subastas where pujadorId = &#63; from the database.
     *
     * @param pujadorId the pujador ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeBypujador(long pujadorId) throws SystemException {
        for (Subasta subasta : findBypujador(pujadorId, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(subasta);
        }
    }

    /**
     * Returns the number of subastas where pujadorId = &#63;.
     *
     * @param pujadorId the pujador ID
     * @return the number of matching subastas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countBypujador(long pujadorId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_PUJADOR;

        Object[] finderArgs = new Object[] { pujadorId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_SUBASTA_WHERE);

            query.append(_FINDER_COLUMN_PUJADOR_PUJADORID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(pujadorId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the subastas where userId = &#63;.
     *
     * @param userId the user ID
     * @return the matching subastas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Subasta> findBysubastador(long userId)
        throws SystemException {
        return findBysubastador(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
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
    @Override
    public List<Subasta> findBysubastador(long userId, int start, int end)
        throws SystemException {
        return findBysubastador(userId, start, end, null);
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
    @Override
    public List<Subasta> findBysubastador(long userId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUBASTADOR;
            finderArgs = new Object[] { userId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SUBASTADOR;
            finderArgs = new Object[] { userId, start, end, orderByComparator };
        }

        List<Subasta> list = (List<Subasta>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Subasta subasta : list) {
                if ((userId != subasta.getUserId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_SUBASTA_WHERE);

            query.append(_FINDER_COLUMN_SUBASTADOR_USERID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(SubastaModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(userId);

                if (!pagination) {
                    list = (List<Subasta>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Subasta>(list);
                } else {
                    list = (List<Subasta>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public Subasta findBysubastador_First(long userId,
        OrderByComparator orderByComparator)
        throws NoSuchSubastaException, SystemException {
        Subasta subasta = fetchBysubastador_First(userId, orderByComparator);

        if (subasta != null) {
            return subasta;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("userId=");
        msg.append(userId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchSubastaException(msg.toString());
    }

    /**
     * Returns the first subasta in the ordered set where userId = &#63;.
     *
     * @param userId the user ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching subasta, or <code>null</code> if a matching subasta could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Subasta fetchBysubastador_First(long userId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Subasta> list = findBysubastador(userId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Subasta findBysubastador_Last(long userId,
        OrderByComparator orderByComparator)
        throws NoSuchSubastaException, SystemException {
        Subasta subasta = fetchBysubastador_Last(userId, orderByComparator);

        if (subasta != null) {
            return subasta;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("userId=");
        msg.append(userId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchSubastaException(msg.toString());
    }

    /**
     * Returns the last subasta in the ordered set where userId = &#63;.
     *
     * @param userId the user ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching subasta, or <code>null</code> if a matching subasta could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Subasta fetchBysubastador_Last(long userId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countBysubastador(userId);

        if (count == 0) {
            return null;
        }

        List<Subasta> list = findBysubastador(userId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Subasta[] findBysubastador_PrevAndNext(long id, long userId,
        OrderByComparator orderByComparator)
        throws NoSuchSubastaException, SystemException {
        Subasta subasta = findByPrimaryKey(id);

        Session session = null;

        try {
            session = openSession();

            Subasta[] array = new SubastaImpl[3];

            array[0] = getBysubastador_PrevAndNext(session, subasta, userId,
                    orderByComparator, true);

            array[1] = subasta;

            array[2] = getBysubastador_PrevAndNext(session, subasta, userId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Subasta getBysubastador_PrevAndNext(Session session,
        Subasta subasta, long userId, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_SUBASTA_WHERE);

        query.append(_FINDER_COLUMN_SUBASTADOR_USERID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(SubastaModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(userId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(subasta);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Subasta> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the subastas where userId = &#63; from the database.
     *
     * @param userId the user ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeBysubastador(long userId) throws SystemException {
        for (Subasta subasta : findBysubastador(userId, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(subasta);
        }
    }

    /**
     * Returns the number of subastas where userId = &#63;.
     *
     * @param userId the user ID
     * @return the number of matching subastas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countBysubastador(long userId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_SUBASTADOR;

        Object[] finderArgs = new Object[] { userId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_SUBASTA_WHERE);

            query.append(_FINDER_COLUMN_SUBASTADOR_USERID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(userId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the subasta in the entity cache if it is enabled.
     *
     * @param subasta the subasta
     */
    @Override
    public void cacheResult(Subasta subasta) {
        EntityCacheUtil.putResult(SubastaModelImpl.ENTITY_CACHE_ENABLED,
            SubastaImpl.class, subasta.getPrimaryKey(), subasta);

        subasta.resetOriginalValues();
    }

    /**
     * Caches the subastas in the entity cache if it is enabled.
     *
     * @param subastas the subastas
     */
    @Override
    public void cacheResult(List<Subasta> subastas) {
        for (Subasta subasta : subastas) {
            if (EntityCacheUtil.getResult(
                        SubastaModelImpl.ENTITY_CACHE_ENABLED,
                        SubastaImpl.class, subasta.getPrimaryKey()) == null) {
                cacheResult(subasta);
            } else {
                subasta.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all subastas.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(SubastaImpl.class.getName());
        }

        EntityCacheUtil.clearCache(SubastaImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the subasta.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Subasta subasta) {
        EntityCacheUtil.removeResult(SubastaModelImpl.ENTITY_CACHE_ENABLED,
            SubastaImpl.class, subasta.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Subasta> subastas) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Subasta subasta : subastas) {
            EntityCacheUtil.removeResult(SubastaModelImpl.ENTITY_CACHE_ENABLED,
                SubastaImpl.class, subasta.getPrimaryKey());
        }
    }

    /**
     * Creates a new subasta with the primary key. Does not add the subasta to the database.
     *
     * @param id the primary key for the new subasta
     * @return the new subasta
     */
    @Override
    public Subasta create(long id) {
        Subasta subasta = new SubastaImpl();

        subasta.setNew(true);
        subasta.setPrimaryKey(id);

        return subasta;
    }

    /**
     * Removes the subasta with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the subasta
     * @return the subasta that was removed
     * @throws com.subastas.NoSuchSubastaException if a subasta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Subasta remove(long id)
        throws NoSuchSubastaException, SystemException {
        return remove((Serializable) id);
    }

    /**
     * Removes the subasta with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the subasta
     * @return the subasta that was removed
     * @throws com.subastas.NoSuchSubastaException if a subasta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Subasta remove(Serializable primaryKey)
        throws NoSuchSubastaException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Subasta subasta = (Subasta) session.get(SubastaImpl.class,
                    primaryKey);

            if (subasta == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchSubastaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(subasta);
        } catch (NoSuchSubastaException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Subasta removeImpl(Subasta subasta) throws SystemException {
        subasta = toUnwrappedModel(subasta);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(subasta)) {
                subasta = (Subasta) session.get(SubastaImpl.class,
                        subasta.getPrimaryKeyObj());
            }

            if (subasta != null) {
                session.delete(subasta);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (subasta != null) {
            clearCache(subasta);
        }

        return subasta;
    }

    @Override
    public Subasta updateImpl(com.subastas.model.Subasta subasta)
        throws SystemException {
        subasta = toUnwrappedModel(subasta);

        boolean isNew = subasta.isNew();

        SubastaModelImpl subastaModelImpl = (SubastaModelImpl) subasta;

        Session session = null;

        try {
            session = openSession();

            if (subasta.isNew()) {
                session.save(subasta);

                subasta.setNew(false);
            } else {
                session.merge(subasta);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !SubastaModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((subastaModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTO.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        subastaModelImpl.getOriginalProducto()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PRODUCTO, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTO,
                    args);

                args = new Object[] { subastaModelImpl.getProducto() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PRODUCTO, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTO,
                    args);
            }

            if ((subastaModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ESTADO.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        subastaModelImpl.getOriginalEstado()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ESTADO, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ESTADO,
                    args);

                args = new Object[] { subastaModelImpl.getEstado() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ESTADO, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ESTADO,
                    args);
            }

            if ((subastaModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTO_ESTADO.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        subastaModelImpl.getOriginalProducto(),
                        subastaModelImpl.getOriginalEstado()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PRODUCTO_ESTADO,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTO_ESTADO,
                    args);

                args = new Object[] {
                        subastaModelImpl.getProducto(),
                        subastaModelImpl.getEstado()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PRODUCTO_ESTADO,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTO_ESTADO,
                    args);
            }

            if ((subastaModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PUJADOR.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        subastaModelImpl.getOriginalPujadorId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PUJADOR, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PUJADOR,
                    args);

                args = new Object[] { subastaModelImpl.getPujadorId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PUJADOR, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PUJADOR,
                    args);
            }

            if ((subastaModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUBASTADOR.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        subastaModelImpl.getOriginalUserId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SUBASTADOR,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUBASTADOR,
                    args);

                args = new Object[] { subastaModelImpl.getUserId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SUBASTADOR,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUBASTADOR,
                    args);
            }
        }

        EntityCacheUtil.putResult(SubastaModelImpl.ENTITY_CACHE_ENABLED,
            SubastaImpl.class, subasta.getPrimaryKey(), subasta);

        return subasta;
    }

    protected Subasta toUnwrappedModel(Subasta subasta) {
        if (subasta instanceof SubastaImpl) {
            return subasta;
        }

        SubastaImpl subastaImpl = new SubastaImpl();

        subastaImpl.setNew(subasta.isNew());
        subastaImpl.setPrimaryKey(subasta.getPrimaryKey());

        subastaImpl.setId(subasta.getId());
        subastaImpl.setGroupId(subasta.getGroupId());
        subastaImpl.setCompanyId(subasta.getCompanyId());
        subastaImpl.setUserId(subasta.getUserId());
        subastaImpl.setCreateDate(subasta.getCreateDate());
        subastaImpl.setModifiedDate(subasta.getModifiedDate());
        subastaImpl.setProducto(subasta.getProducto());
        subastaImpl.setEstado(subasta.getEstado());
        subastaImpl.setPujaInicial(subasta.getPujaInicial());
        subastaImpl.setPujaMaxima(subasta.getPujaMaxima());
        subastaImpl.setPujadorId(subasta.getPujadorId());
        subastaImpl.setPujadorName(subasta.getPujadorName());
        subastaImpl.setFechaFin(subasta.getFechaFin());

        return subastaImpl;
    }

    /**
     * Returns the subasta with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the subasta
     * @return the subasta
     * @throws com.subastas.NoSuchSubastaException if a subasta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Subasta findByPrimaryKey(Serializable primaryKey)
        throws NoSuchSubastaException, SystemException {
        Subasta subasta = fetchByPrimaryKey(primaryKey);

        if (subasta == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchSubastaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return subasta;
    }

    /**
     * Returns the subasta with the primary key or throws a {@link com.subastas.NoSuchSubastaException} if it could not be found.
     *
     * @param id the primary key of the subasta
     * @return the subasta
     * @throws com.subastas.NoSuchSubastaException if a subasta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Subasta findByPrimaryKey(long id)
        throws NoSuchSubastaException, SystemException {
        return findByPrimaryKey((Serializable) id);
    }

    /**
     * Returns the subasta with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the subasta
     * @return the subasta, or <code>null</code> if a subasta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Subasta fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Subasta subasta = (Subasta) EntityCacheUtil.getResult(SubastaModelImpl.ENTITY_CACHE_ENABLED,
                SubastaImpl.class, primaryKey);

        if (subasta == _nullSubasta) {
            return null;
        }

        if (subasta == null) {
            Session session = null;

            try {
                session = openSession();

                subasta = (Subasta) session.get(SubastaImpl.class, primaryKey);

                if (subasta != null) {
                    cacheResult(subasta);
                } else {
                    EntityCacheUtil.putResult(SubastaModelImpl.ENTITY_CACHE_ENABLED,
                        SubastaImpl.class, primaryKey, _nullSubasta);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(SubastaModelImpl.ENTITY_CACHE_ENABLED,
                    SubastaImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return subasta;
    }

    /**
     * Returns the subasta with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the subasta
     * @return the subasta, or <code>null</code> if a subasta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Subasta fetchByPrimaryKey(long id) throws SystemException {
        return fetchByPrimaryKey((Serializable) id);
    }

    /**
     * Returns all the subastas.
     *
     * @return the subastas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Subasta> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<Subasta> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<Subasta> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<Subasta> list = (List<Subasta>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_SUBASTA);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_SUBASTA;

                if (pagination) {
                    sql = sql.concat(SubastaModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Subasta>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Subasta>(list);
                } else {
                    list = (List<Subasta>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the subastas from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Subasta subasta : findAll()) {
            remove(subasta);
        }
    }

    /**
     * Returns the number of subastas.
     *
     * @return the number of subastas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_SUBASTA);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    @Override
    protected Set<String> getBadColumnNames() {
        return _badColumnNames;
    }

    /**
     * Initializes the subasta persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.subastas.model.Subasta")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Subasta>> listenersList = new ArrayList<ModelListener<Subasta>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Subasta>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(SubastaImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
