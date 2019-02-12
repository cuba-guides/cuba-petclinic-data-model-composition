package com.haulmont.sample.petclinic.web.employee.employeerecord;

import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sample.petclinic.entity.employee.EmployeeRecord;

@UiController("petclinic_EmployeeRecord.edit")
@UiDescriptor("employee-record-edit.xml")
@EditedEntityContainer("employeeRecordDc")
@LoadDataBeforeShow
public class EmployeeRecordEdit extends StandardEditor<EmployeeRecord> {
}