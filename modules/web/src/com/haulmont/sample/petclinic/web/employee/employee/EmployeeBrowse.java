package com.haulmont.sample.petclinic.web.employee.employee;

import com.haulmont.cuba.gui.ScreenBuilders;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sample.petclinic.entity.employee.Employee;

import javax.inject.Inject;
import javax.inject.Named;

@UiController("petclinic_Employee.browse")
@UiDescriptor("employee-browse.xml")
@LookupComponent("employeesTable")
@LoadDataBeforeShow
public class EmployeeBrowse extends StandardLookup<Employee> {

    @Inject
    protected ScreenBuilders screenBuilders;

    @Inject
    protected GroupTable<Employee> employeesTable;

    @Subscribe("employeesTable.createSingleEditor")
    protected void onEmployeesTableCreateSingleEditor(Action.ActionPerformedEvent event) {

        screenBuilders.editor(Employee.class, this)
                .withScreenClass(EmployeeSingleEditorEdit.class)
                .newEntity()
                .build()
                .show();
    }

}