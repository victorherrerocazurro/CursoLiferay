package com.subastas.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.subastas.service.ClpSerializer;
import com.subastas.service.SubastaLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class SubastaClp extends BaseModelImpl<Subasta> implements Subasta {
    private long _id;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private Date _createDate;
    private Date _modifiedDate;
    private String _producto;
    private String _estado;
    private double _pujaInicial;
    private double _pujaMaxima;
    private long _pujadorId;
    private String _pujadorName;
    private Date _fechaFin;
    private BaseModel<?> _subastaRemoteModel;
    private Class<?> _clpSerializerClass = com.subastas.service.ClpSerializer.class;

    public SubastaClp() {
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
    public long getPrimaryKey() {
        return _id;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getId() {
        return _id;
    }

    @Override
    public void setId(long id) {
        _id = id;

        if (_subastaRemoteModel != null) {
            try {
                Class<?> clazz = _subastaRemoteModel.getClass();

                Method method = clazz.getMethod("setId", long.class);

                method.invoke(_subastaRemoteModel, id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;

        if (_subastaRemoteModel != null) {
            try {
                Class<?> clazz = _subastaRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_subastaRemoteModel, groupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;

        if (_subastaRemoteModel != null) {
            try {
                Class<?> clazz = _subastaRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_subastaRemoteModel, companyId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;

        if (_subastaRemoteModel != null) {
            try {
                Class<?> clazz = _subastaRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_subastaRemoteModel, userId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;

        if (_subastaRemoteModel != null) {
            try {
                Class<?> clazz = _subastaRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_subastaRemoteModel, createDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getModifiedDate() {
        return _modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;

        if (_subastaRemoteModel != null) {
            try {
                Class<?> clazz = _subastaRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_subastaRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getProducto() {
        return _producto;
    }

    @Override
    public void setProducto(String producto) {
        _producto = producto;

        if (_subastaRemoteModel != null) {
            try {
                Class<?> clazz = _subastaRemoteModel.getClass();

                Method method = clazz.getMethod("setProducto", String.class);

                method.invoke(_subastaRemoteModel, producto);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getEstado() {
        return _estado;
    }

    @Override
    public void setEstado(String estado) {
        _estado = estado;

        if (_subastaRemoteModel != null) {
            try {
                Class<?> clazz = _subastaRemoteModel.getClass();

                Method method = clazz.getMethod("setEstado", String.class);

                method.invoke(_subastaRemoteModel, estado);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getPujaInicial() {
        return _pujaInicial;
    }

    @Override
    public void setPujaInicial(double pujaInicial) {
        _pujaInicial = pujaInicial;

        if (_subastaRemoteModel != null) {
            try {
                Class<?> clazz = _subastaRemoteModel.getClass();

                Method method = clazz.getMethod("setPujaInicial", double.class);

                method.invoke(_subastaRemoteModel, pujaInicial);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getPujaMaxima() {
        return _pujaMaxima;
    }

    @Override
    public void setPujaMaxima(double pujaMaxima) {
        _pujaMaxima = pujaMaxima;

        if (_subastaRemoteModel != null) {
            try {
                Class<?> clazz = _subastaRemoteModel.getClass();

                Method method = clazz.getMethod("setPujaMaxima", double.class);

                method.invoke(_subastaRemoteModel, pujaMaxima);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getPujadorId() {
        return _pujadorId;
    }

    @Override
    public void setPujadorId(long pujadorId) {
        _pujadorId = pujadorId;

        if (_subastaRemoteModel != null) {
            try {
                Class<?> clazz = _subastaRemoteModel.getClass();

                Method method = clazz.getMethod("setPujadorId", long.class);

                method.invoke(_subastaRemoteModel, pujadorId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPujadorName() {
        return _pujadorName;
    }

    @Override
    public void setPujadorName(String pujadorName) {
        _pujadorName = pujadorName;

        if (_subastaRemoteModel != null) {
            try {
                Class<?> clazz = _subastaRemoteModel.getClass();

                Method method = clazz.getMethod("setPujadorName", String.class);

                method.invoke(_subastaRemoteModel, pujadorName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getFechaFin() {
        return _fechaFin;
    }

    @Override
    public void setFechaFin(Date fechaFin) {
        _fechaFin = fechaFin;

        if (_subastaRemoteModel != null) {
            try {
                Class<?> clazz = _subastaRemoteModel.getClass();

                Method method = clazz.getMethod("setFechaFin", Date.class);

                method.invoke(_subastaRemoteModel, fechaFin);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getSubastaRemoteModel() {
        return _subastaRemoteModel;
    }

    public void setSubastaRemoteModel(BaseModel<?> subastaRemoteModel) {
        _subastaRemoteModel = subastaRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _subastaRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_subastaRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            SubastaLocalServiceUtil.addSubasta(this);
        } else {
            SubastaLocalServiceUtil.updateSubasta(this);
        }
    }

    @Override
    public Subasta toEscapedModel() {
        return (Subasta) ProxyUtil.newProxyInstance(Subasta.class.getClassLoader(),
            new Class[] { Subasta.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        SubastaClp clone = new SubastaClp();

        clone.setId(getId());
        clone.setGroupId(getGroupId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setProducto(getProducto());
        clone.setEstado(getEstado());
        clone.setPujaInicial(getPujaInicial());
        clone.setPujaMaxima(getPujaMaxima());
        clone.setPujadorId(getPujadorId());
        clone.setPujadorName(getPujadorName());
        clone.setFechaFin(getFechaFin());

        return clone;
    }

    @Override
    public int compareTo(Subasta subasta) {
        int value = 0;

        value = getEstado().compareTo(subasta.getEstado());

        if (value != 0) {
            return value;
        }

        value = getProducto().compareTo(subasta.getProducto());

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof SubastaClp)) {
            return false;
        }

        SubastaClp subasta = (SubastaClp) obj;

        long primaryKey = subasta.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(27);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append(", modifiedDate=");
        sb.append(getModifiedDate());
        sb.append(", producto=");
        sb.append(getProducto());
        sb.append(", estado=");
        sb.append(getEstado());
        sb.append(", pujaInicial=");
        sb.append(getPujaInicial());
        sb.append(", pujaMaxima=");
        sb.append(getPujaMaxima());
        sb.append(", pujadorId=");
        sb.append(getPujadorId());
        sb.append(", pujadorName=");
        sb.append(getPujadorName());
        sb.append(", fechaFin=");
        sb.append(getFechaFin());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(43);

        sb.append("<model><model-name>");
        sb.append("com.subastas.model.Subasta");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createDate</column-name><column-value><![CDATA[");
        sb.append(getCreateDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
        sb.append(getModifiedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>producto</column-name><column-value><![CDATA[");
        sb.append(getProducto());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>estado</column-name><column-value><![CDATA[");
        sb.append(getEstado());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>pujaInicial</column-name><column-value><![CDATA[");
        sb.append(getPujaInicial());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>pujaMaxima</column-name><column-value><![CDATA[");
        sb.append(getPujaMaxima());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>pujadorId</column-name><column-value><![CDATA[");
        sb.append(getPujadorId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>pujadorName</column-name><column-value><![CDATA[");
        sb.append(getPujadorName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>fechaFin</column-name><column-value><![CDATA[");
        sb.append(getFechaFin());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
