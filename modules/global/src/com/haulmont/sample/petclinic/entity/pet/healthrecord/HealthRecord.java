package com.haulmont.sample.petclinic.entity.pet.healthrecord;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import com.haulmont.sample.petclinic.entity.pet.Pet;
import com.haulmont.sample.petclinic.entity.vet.Vet;
import com.haulmont.sample.petclinic.entity.visit.Visit;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Table(name = "PETCLINIC_HEALTH_RECORD")
@Entity(name = "petclinic_HealthRecord")
public class HealthRecord extends StandardEntity {
    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "RECORD_DATE", nullable = false)
    protected Date recordDate;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "RESPONSIBLE_VET_ID")
    protected Vet responsibleVet;

    @NotNull
    @Column(name = "RESPONSIBLE_NURSE", nullable = false)
    protected String responsibleNurse;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PET_ID")
    protected Pet pet;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "VISIT_ID")
    protected Visit visit;

    @Lob
    @Column(name = "ADMINISSION_NOTE")
    protected String adminissionNote;

    @Lob
    @Column(name = "PROGRESS_NOTE")
    protected String progressNote;

    @Lob
    @Column(name = "OPERATIVE_NOTE")
    protected String operativeNote;

    @Lob
    @Column(name = "POSTOPERATIVE_NOTE")
    protected String postoperativeNote;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "healthRecord")
    protected List<HealthRecordAttachment> attachments;

    public List<HealthRecordAttachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<HealthRecordAttachment> attachments) {
        this.attachments = attachments;
    }

    public String getPostoperativeNote() {
        return postoperativeNote;
    }

    public void setPostoperativeNote(String postoperativeNote) {
        this.postoperativeNote = postoperativeNote;
    }

    public String getOperativeNote() {
        return operativeNote;
    }

    public void setOperativeNote(String operativeNote) {
        this.operativeNote = operativeNote;
    }

    public String getProgressNote() {
        return progressNote;
    }

    public void setProgressNote(String progressNote) {
        this.progressNote = progressNote;
    }

    public String getAdminissionNote() {
        return adminissionNote;
    }

    public void setAdminissionNote(String adminissionNote) {
        this.adminissionNote = adminissionNote;
    }

    public Visit getVisit() {
        return visit;
    }

    public void setVisit(Visit visit) {
        this.visit = visit;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String getResponsibleNurse() {
        return responsibleNurse;
    }

    public void setResponsibleNurse(String responsibleNurse) {
        this.responsibleNurse = responsibleNurse;
    }

    public Vet getResponsibleVet() {
        return responsibleVet;
    }

    public void setResponsibleVet(Vet responsibleVet) {
        this.responsibleVet = responsibleVet;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }
}