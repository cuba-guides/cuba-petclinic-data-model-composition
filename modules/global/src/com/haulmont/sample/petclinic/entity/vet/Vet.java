package com.haulmont.sample.petclinic.entity.vet;

import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.sample.petclinic.entity.Person;
import com.haulmont.sample.petclinic.entity.employee.Employee;

import javax.persistence.*;
import java.util.Set;

@Table(name = "PETCLINIC_VET")
@Entity(name = "petclinic_Vet")
public class Vet extends Person {
    private static final long serialVersionUID = 8571203926820669424L;

    @JoinTable(name = "PETCLINIC_VET_SPECIALTY_LINK",
            joinColumns = @JoinColumn(name = "VET_ID"),
            inverseJoinColumns = @JoinColumn(name = "SPECIALTY_ID"))
    @ManyToMany(mappedBy = "")
    protected Set<Specialty> specialties;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EMPLOYEE_ID")
    protected Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setSpecialties(Set<Specialty> specialties) {
        this.specialties = specialties;
    }

    public Set<Specialty> getSpecialties() {
        return specialties;
    }


}