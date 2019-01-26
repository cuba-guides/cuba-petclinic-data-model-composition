package com.haulmont.sample.petclinic.entity.pet.healthrecord;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.sample.petclinic.entity.NamedEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Table(name = "PETCLINIC_HEALTH_RECORD_ATTACHMENT")
@Entity(name = "petclinic_HealthRecordAttachment")
public class HealthRecordAttachment extends NamedEntity {
    @NotNull
    @Column(name = "TYPE_", nullable = false)
    protected String type;

    @Temporal(TemporalType.DATE)
    @Column(name = "ATTACHMENT_DATE")
    protected Date attachmentDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "RECEIVE_DATE")
    protected Date receiveDate;

    @Column(name = "HANDED_OUT")
    protected Boolean handedOut;

    @Temporal(TemporalType.DATE)
    @Column(name = "HANDED_OUT_DATE")
    protected Date handedOutDate;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "FILE_ID")
    protected FileDescriptor file;

    @Lookup(type = LookupType.DROPDOWN)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "HEALTH_RECORD_ID")
    protected HealthRecord healthRecord;

    public HealthRecordAttachmentType getType() {
        return type == null ? null : HealthRecordAttachmentType.fromId(type);
    }

    public void setType(HealthRecordAttachmentType type) {
        this.type = type == null ? null : type.getId();
    }

    public HealthRecord getHealthRecord() {
        return healthRecord;
    }

    public void setHealthRecord(HealthRecord healthRecord) {
        this.healthRecord = healthRecord;
    }

    public FileDescriptor getFile() {
        return file;
    }

    public void setFile(FileDescriptor file) {
        this.file = file;
    }

    public Date getHandedOutDate() {
        return handedOutDate;
    }

    public void setHandedOutDate(Date handedOutDate) {
        this.handedOutDate = handedOutDate;
    }

    public Boolean getHandedOut() {
        return handedOut;
    }

    public void setHandedOut(Boolean handedOut) {
        this.handedOut = handedOut;
    }

    public Date getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(Date receiveDate) {
        this.receiveDate = receiveDate;
    }

    public Date getAttachmentDate() {
        return attachmentDate;
    }

    public void setAttachmentDate(Date attachmentDate) {
        this.attachmentDate = attachmentDate;
    }
}