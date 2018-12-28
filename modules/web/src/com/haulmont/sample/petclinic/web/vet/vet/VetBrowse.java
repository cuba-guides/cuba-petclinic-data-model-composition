package com.haulmont.sample.petclinic.web.vet.vet;

import com.haulmont.sample.petclinic.entity.vet.Vet;
import com.haulmont.cuba.gui.screen.LookupComponent;
import com.haulmont.cuba.gui.screen.StandardLookup;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

@UiController("petclinic_Vet.browse")
@UiDescriptor("vet-browse.xml")
@LookupComponent("vetsTable")
public class VetBrowse extends StandardLookup<Vet> {

}