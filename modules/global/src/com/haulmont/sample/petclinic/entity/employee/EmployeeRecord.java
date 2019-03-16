package com.haulmont.sample.petclinic.entity.employee;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s|personellNumber")
@Table(name = "PETCLINIC_EMPLOYEE_RECORD")
@Entity(name = "petclinic_EmployeeRecord")
public class EmployeeRecord extends StandardEntity {
    @NotNull
    @Column(name = "PERSONELL_NUMBER", nullable = false)
    protected Integer personellNumber;

    @Column(name = "AMOUNT_SICK_DAYS")
    protected Integer amountSickDays;

    public Integer getAmountSickDays() {
        return amountSickDays;
    }

    public void setAmountSickDays(Integer amountSickDays) {
        this.amountSickDays = amountSickDays;
    }

    public Integer getPersonellNumber() {
        return personellNumber;
    }

    public void setPersonellNumber(Integer personellNumber) {
        this.personellNumber = personellNumber;
    }
}