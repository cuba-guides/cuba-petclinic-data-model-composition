package com.haulmont.sample.petclinic.web.pet.healthrecord.healthrecordattachment;

import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sample.petclinic.entity.pet.healthrecord.HealthRecordAttachment;


@UiController("petclinic_HealthRecordAttachment.edit")
@UiDescriptor("health-record-attachment-edit.xml")
@EditedEntityContainer("healthRecordAttachmentDc")
@LoadDataBeforeShow
public class HealthRecordAttachmentEdit extends StandardEditor<HealthRecordAttachment> {
}