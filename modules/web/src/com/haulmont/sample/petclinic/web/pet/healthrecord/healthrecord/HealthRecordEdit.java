package com.haulmont.sample.petclinic.web.pet.healthrecord.healthrecord;

import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sample.petclinic.entity.pet.healthrecord.HealthRecord;


@UiController("petclinic_HealthRecord.edit")
@UiDescriptor("health-record-edit.xml")
@EditedEntityContainer("healthRecordDc")
@LoadDataBeforeShow
public class HealthRecordEdit extends StandardEditor<HealthRecord> {
}