package com.subastas.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SubastaSoap implements Serializable {
    private long _id;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private Date _createDate;
    private Date _modifiedDate;
    private String _producto;
    private String _estado;
    private double _pujaInicial;
    private double _pujaMaxima;
    private long _pujadorId;
    private String _pujadorName;
    private Date _fechaFin;

    public SubastaSoap() {
    }

    public static SubastaSoap toSoapModel(Subasta model) {
        SubastaSoap soapModel = new SubastaSoap();

        soapModel.setId(model.getId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setProducto(model.getProducto());
        soapModel.setEstado(model.getEstado());
        soapModel.setPujaInicial(model.getPujaInicial());
        soapModel.setPujaMaxima(model.getPujaMaxima());
        soapModel.setPujadorId(model.getPujadorId());
        soapModel.setPujadorName(model.getPujadorName());
        soapModel.setFechaFin(model.getFechaFin());

        return soapModel;
    }

    public static SubastaSoap[] toSoapModels(Subasta[] models) {
        SubastaSoap[] soapModels = new SubastaSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static SubastaSoap[][] toSoapModels(Subasta[][] models) {
        SubastaSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new SubastaSoap[models.length][models[0].length];
        } else {
            soapModels = new SubastaSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static SubastaSoap[] toSoapModels(List<Subasta> models) {
        List<SubastaSoap> soapModels = new ArrayList<SubastaSoap>(models.size());

        for (Subasta model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new SubastaSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _id;
    }

    public void setPrimaryKey(long pk) {
        setId(pk);
    }

    public long getId() {
        return _id;
    }

    public void setId(long id) {
        _id = id;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public Date getCreateDate() {
        return _createDate;
    }

    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    public Date getModifiedDate() {
        return _modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    public String getProducto() {
        return _producto;
    }

    public void setProducto(String producto) {
        _producto = producto;
    }

    public String getEstado() {
        return _estado;
    }

    public void setEstado(String estado) {
        _estado = estado;
    }

    public double getPujaInicial() {
        return _pujaInicial;
    }

    public void setPujaInicial(double pujaInicial) {
        _pujaInicial = pujaInicial;
    }

    public double getPujaMaxima() {
        return _pujaMaxima;
    }

    public void setPujaMaxima(double pujaMaxima) {
        _pujaMaxima = pujaMaxima;
    }

    public long getPujadorId() {
        return _pujadorId;
    }

    public void setPujadorId(long pujadorId) {
        _pujadorId = pujadorId;
    }

    public String getPujadorName() {
        return _pujadorName;
    }

    public void setPujadorName(String pujadorName) {
        _pujadorName = pujadorName;
    }

    public Date getFechaFin() {
        return _fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        _fechaFin = fechaFin;
    }
}
