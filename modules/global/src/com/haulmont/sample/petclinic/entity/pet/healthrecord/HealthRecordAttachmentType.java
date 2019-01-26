package com.haulmont.sample.petclinic.entity.pet.healthrecord;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum HealthRecordAttachmentType implements EnumClass<String> {

    INCOMING("INCOMING"),
    OUTGOING("OUTGOING"),
    INTERNAL("INTERNAL");

    private String id;

    HealthRecordAttachmentType(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static HealthRecordAttachmentType fromId(String id) {
        for (HealthRecordAttachmentType at : HealthRecordAttachmentType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}