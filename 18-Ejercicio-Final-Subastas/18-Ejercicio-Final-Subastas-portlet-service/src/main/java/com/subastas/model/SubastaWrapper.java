package com.subastas.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Subasta}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Subasta
 * @generated
 */
public class SubastaWrapper implements Subasta, ModelWrapper<Subasta> {
    private Subasta _subasta;

    public SubastaWrapper(Subasta subasta) {
        _subasta = subasta;
    }

    @Override
    public Class<?> getModelClass() {
        return Subasta.class;
    }

    @Override
    public String getModelClassName() {
        return Subasta.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("producto", getProducto());
        attributes.put("estado", getEstado());
        attributes.put("pujaInicial", getPujaInicial());
        attributes.put("pujaMaxima", getPujaMaxima());
        attributes.put("pujadorId", getPujadorId());
        attributes.put("pujadorName", getPujadorName());
        attributes.put("fechaFin", getFechaFin());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        String producto = (String) attributes.get("producto");

        if (producto != null) {
            setProducto(producto);
        }

        String estado = (String) attributes.get("estado");

        if (estado != null) {
            setEstado(estado);
        }

        Double pujaInicial = (Double) attributes.get("pujaInicial");

        if (pujaInicial != null) {
            setPujaInicial(pujaInicial);
        }

        Double pujaMaxima = (Double) attributes.get("pujaMaxima");

        if (pujaMaxima != null) {
            setPujaMaxima(pujaMaxima);
        }

        Long pujadorId = (Long) attributes.get("pujadorId");

        if (pujadorId != null) {
            setPujadorId(pujadorId);
        }

        String pujadorName = (String) attributes.get("pujadorName");

        if (pujadorName != null) {
            setPujadorName(pujadorName);
        }

        Date fechaFin = (Date) attributes.get("fechaFin");

        if (fechaFin != null) {
            setFechaFin(fechaFin);
        }
    }

    /**
    * Returns the primary key of this subasta.
    *
    * @return the primary key of this subasta
    */
    @Override
    public long getPrimaryKey() {
        return _subasta.getPrimaryKey();
    }

    /**
    * Sets the primary key of this subasta.
    *
    * @param primaryKey the primary key of this subasta
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _subasta.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the ID of this subasta.
    *
    * @return the ID of this subasta
    */
    @Override
    public long getId() {
        return _subasta.getId();
    }

    /**
    * Sets the ID of this subasta.
    *
    * @param id the ID of this subasta
    */
    @Override
    public void setId(long id) {
        _subasta.setId(id);
    }

    /**
    * Returns the group ID of this subasta.
    *
    * @return the group ID of this subasta
    */
    @Override
    public long getGroupId() {
        return _subasta.getGroupId();
    }

    /**
    * Sets the group ID of this subasta.
    *
    * @param groupId the group ID of this subasta
    */
    @Override
    public void setGroupId(long groupId) {
        _subasta.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this subasta.
    *
    * @return the company ID of this subasta
    */
    @Override
    public long getCompanyId() {
        return _subasta.getCompanyId();
    }

    /**
    * Sets the company ID of this subasta.
    *
    * @param companyId the company ID of this subasta
    */
    @Override
    public void setCompanyId(long companyId) {
        _subasta.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this subasta.
    *
    * @return the user ID of this subasta
    */
    @Override
    public long getUserId() {
        return _subasta.getUserId();
    }

    /**
    * Sets the user ID of this subasta.
    *
    * @param userId the user ID of this subasta
    */
    @Override
    public void setUserId(long userId) {
        _subasta.setUserId(userId);
    }

    /**
    * Returns the user uuid of this subasta.
    *
    * @return the user uuid of this subasta
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _subasta.getUserUuid();
    }

    /**
    * Sets the user uuid of this subasta.
    *
    * @param userUuid the user uuid of this subasta
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _subasta.setUserUuid(userUuid);
    }

    /**
    * Returns the create date of this subasta.
    *
    * @return the create date of this subasta
    */
    @Override
    public java.util.Date getCreateDate() {
        return _subasta.getCreateDate();
    }

    /**
    * Sets the create date of this subasta.
    *
    * @param createDate the create date of this subasta
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _subasta.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this subasta.
    *
    * @return the modified date of this subasta
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _subasta.getModifiedDate();
    }

    /**
    * Sets the modified date of this subasta.
    *
    * @param modifiedDate the modified date of this subasta
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _subasta.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the producto of this subasta.
    *
    * @return the producto of this subasta
    */
    @Override
    public java.lang.String getProducto() {
        return _subasta.getProducto();
    }

    /**
    * Sets the producto of this subasta.
    *
    * @param producto the producto of this subasta
    */
    @Override
    public void setProducto(java.lang.String producto) {
        _subasta.setProducto(producto);
    }

    /**
    * Returns the estado of this subasta.
    *
    * @return the estado of this subasta
    */
    @Override
    public java.lang.String getEstado() {
        return _subasta.getEstado();
    }

    /**
    * Sets the estado of this subasta.
    *
    * @param estado the estado of this subasta
    */
    @Override
    public void setEstado(java.lang.String estado) {
        _subasta.setEstado(estado);
    }

    /**
    * Returns the puja inicial of this subasta.
    *
    * @return the puja inicial of this subasta
    */
    @Override
    public double getPujaInicial() {
        return _subasta.getPujaInicial();
    }

    /**
    * Sets the puja inicial of this subasta.
    *
    * @param pujaInicial the puja inicial of this subasta
    */
    @Override
    public void setPujaInicial(double pujaInicial) {
        _subasta.setPujaInicial(pujaInicial);
    }

    /**
    * Returns the puja maxima of this subasta.
    *
    * @return the puja maxima of this subasta
    */
    @Override
    public double getPujaMaxima() {
        return _subasta.getPujaMaxima();
    }

    /**
    * Sets the puja maxima of this subasta.
    *
    * @param pujaMaxima the puja maxima of this subasta
    */
    @Override
    public void setPujaMaxima(double pujaMaxima) {
        _subasta.setPujaMaxima(pujaMaxima);
    }

    /**
    * Returns the pujador ID of this subasta.
    *
    * @return the pujador ID of this subasta
    */
    @Override
    public long getPujadorId() {
        return _subasta.getPujadorId();
    }

    /**
    * Sets the pujador ID of this subasta.
    *
    * @param pujadorId the pujador ID of this subasta
    */
    @Override
    public void setPujadorId(long pujadorId) {
        _subasta.setPujadorId(pujadorId);
    }

    /**
    * Returns the pujador name of this subasta.
    *
    * @return the pujador name of this subasta
    */
    @Override
    public java.lang.String getPujadorName() {
        return _subasta.getPujadorName();
    }

    /**
    * Sets the pujador name of this subasta.
    *
    * @param pujadorName the pujador name of this subasta
    */
    @Override
    public void setPujadorName(java.lang.String pujadorName) {
        _subasta.setPujadorName(pujadorName);
    }

    /**
    * Returns the fecha fin of this subasta.
    *
    * @return the fecha fin of this subasta
    */
    @Override
    public java.util.Date getFechaFin() {
        return _subasta.getFechaFin();
    }

    /**
    * Sets the fecha fin of this subasta.
    *
    * @param fechaFin the fecha fin of this subasta
    */
    @Override
    public void setFechaFin(java.util.Date fechaFin) {
        _subasta.setFechaFin(fechaFin);
    }

    @Override
    public boolean isNew() {
        return _subasta.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _subasta.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _subasta.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _subasta.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _subasta.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _subasta.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _subasta.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _subasta.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _subasta.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _subasta.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _subasta.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new SubastaWrapper((Subasta) _subasta.clone());
    }

    @Override
    public int compareTo(com.subastas.model.Subasta subasta) {
        return _subasta.compareTo(subasta);
    }

    @Override
    public int hashCode() {
        return _subasta.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.subastas.model.Subasta> toCacheModel() {
        return _subasta.toCacheModel();
    }

    @Override
    public com.subastas.model.Subasta toEscapedModel() {
        return new SubastaWrapper(_subasta.toEscapedModel());
    }

    @Override
    public com.subastas.model.Subasta toUnescapedModel() {
        return new SubastaWrapper(_subasta.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _subasta.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _subasta.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _subasta.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof SubastaWrapper)) {
            return false;
        }

        SubastaWrapper subastaWrapper = (SubastaWrapper) obj;

        if (Validator.equals(_subasta, subastaWrapper._subasta)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Subasta getWrappedSubasta() {
        return _subasta;
    }

    @Override
    public Subasta getWrappedModel() {
        return _subasta;
    }

    @Override
    public void resetOriginalValues() {
        _subasta.resetOriginalValues();
    }
}
