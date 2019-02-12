package com.haulmont.sample.petclinic.web.employee.employee;

import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sample.petclinic.entity.employee.Employee;

@UiController("petclinic_Employee.browse")
@UiDescriptor("employee-browse.xml")
@LookupComponent("employeesTable")
@LoadDataBeforeShow
public class EmployeeBrowse extends StandardLookup<Employee> {
}