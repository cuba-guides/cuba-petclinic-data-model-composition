package com.haulmont.sample.petclinic.web.employee.employee;

import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.model.InstancePropertyContainer;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sample.petclinic.entity.employee.Employee;
import com.haulmont.sample.petclinic.entity.employee.EmployeeRecord;

import javax.inject.Inject;

@UiController("petclinic_EmployeeSingleEditor.edit")
@UiDescriptor("employee-single-editor-edit.xml")
@EditedEntityContainer("employeeDc")
@LoadDataBeforeShow
public class EmployeeSingleEditorEdit extends StandardEditor<Employee> {

    @Inject
    protected Metadata metadata;

    @Inject
    protected InstancePropertyContainer<EmployeeRecord> employeeRecordDc;

    @Subscribe
    protected void onInitEntity(InitEntityEvent<Employee> event) {
        Employee employee = event.getEntity();

        EmployeeRecord employeeRecord = metadata.create(EmployeeRecord.class);
        employee.setEmployeeRecord(employeeRecord);

        employeeRecordDc.setItem(employeeRecord);
    }

}