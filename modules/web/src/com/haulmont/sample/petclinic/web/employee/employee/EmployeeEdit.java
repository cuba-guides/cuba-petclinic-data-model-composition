package com.haulmont.sample.petclinic.web.employee.employee;

import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sample.petclinic.entity.employee.Employee;

@UiController("petclinic_Employee.edit")
@UiDescriptor("employee-edit.xml")
@EditedEntityContainer("employeeDc")
@LoadDataBeforeShow
public class EmployeeEdit extends StandardEditor<Employee> {
}