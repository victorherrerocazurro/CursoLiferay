package com.subastas.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.subastas.model.Subasta;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Subasta in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Subasta
 * @generated
 */
public class SubastaCacheModel implements CacheModel<Subasta>, Externalizable {
    public long id;
    public long groupId;
    public long companyId;
    public long userId;
    public long createDate;
    public long modifiedDate;
    public String producto;
    public String estado;
    public double pujaInicial;
    public double pujaMaxima;
    public long pujadorId;
    public String pujadorName;
    public long fechaFin;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(27);

        sb.append("{id=");
        sb.append(id);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", modifiedDate=");
        sb.append(modifiedDate);
        sb.append(", producto=");
        sb.append(producto);
        sb.append(", estado=");
        sb.append(estado);
        sb.append(", pujaInicial=");
        sb.append(pujaInicial);
        sb.append(", pujaMaxima=");
        sb.append(pujaMaxima);
        sb.append(", pujadorId=");
        sb.append(pujadorId);
        sb.append(", pujadorName=");
        sb.append(pujadorName);
        sb.append(", fechaFin=");
        sb.append(fechaFin);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Subasta toEntityModel() {
        SubastaImpl subastaImpl = new SubastaImpl();

        subastaImpl.setId(id);
        subastaImpl.setGroupId(groupId);
        subastaImpl.setCompanyId(companyId);
        subastaImpl.setUserId(userId);

        if (createDate == Long.MIN_VALUE) {
            subastaImpl.setCreateDate(null);
        } else {
            subastaImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            subastaImpl.setModifiedDate(null);
        } else {
            subastaImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (producto == null) {
            subastaImpl.setProducto(StringPool.BLANK);
        } else {
            subastaImpl.setProducto(producto);
        }

        if (estado == null) {
            subastaImpl.setEstado(StringPool.BLANK);
        } else {
            subastaImpl.setEstado(estado);
        }

        subastaImpl.setPujaInicial(pujaInicial);
        subastaImpl.setPujaMaxima(pujaMaxima);
        subastaImpl.setPujadorId(pujadorId);

        if (pujadorName == null) {
            subastaImpl.setPujadorName(StringPool.BLANK);
        } else {
            subastaImpl.setPujadorName(pujadorName);
        }

        if (fechaFin == Long.MIN_VALUE) {
            subastaImpl.setFechaFin(null);
        } else {
            subastaImpl.setFechaFin(new Date(fechaFin));
        }

        subastaImpl.resetOriginalValues();

        return subastaImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        id = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        producto = objectInput.readUTF();
        estado = objectInput.readUTF();
        pujaInicial = objectInput.readDouble();
        pujaMaxima = objectInput.readDouble();
        pujadorId = objectInput.readLong();
        pujadorName = objectInput.readUTF();
        fechaFin = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(id);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);
        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);

        if (producto == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(producto);
        }

        if (estado == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(estado);
        }

        objectOutput.writeDouble(pujaInicial);
        objectOutput.writeDouble(pujaMaxima);
        objectOutput.writeLong(pujadorId);

        if (pujadorName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(pujadorName);
        }

        objectOutput.writeLong(fechaFin);
    }
}
