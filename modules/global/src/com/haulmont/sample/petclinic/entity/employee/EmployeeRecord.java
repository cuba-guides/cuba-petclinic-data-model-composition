package com.haulmont.sample.petclinic.entity.employee;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "PETCLINIC_EMPLOYEE_RECORD")
@Entity(name = "petclinic_EmployeeRecord")
public class EmployeeRecord extends StandardEntity {
}