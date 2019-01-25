package com.haulmont.sample.petclinic.entity.owner;

import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.sample.petclinic.entity.NamedEntity;

import javax.persistence.*;

@Table(name = "PETCLINIC_ADDRESS")
@Entity(name = "petclinic_Address")
public class Address extends NamedEntity {
    @Column(name = "STREET")
    protected String street;

    @Column(name = "POSTCODE")
    protected String postcode;

    @Column(name = "CITY")
    protected String city;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup"})
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "OWNER_ID")
    protected Owner owner;

    @Column(name = "HOUSENUMBER")
    protected Integer housenumber;

    @Column(name = "HOUSENUMBER_SUFFIX", length = 4)
    protected String housenumberSuffix;

    public String getHousenumberSuffix() {
        return housenumberSuffix;
    }

    public void setHousenumberSuffix(String housenumberSuffix) {
        this.housenumberSuffix = housenumberSuffix;
    }

    public Integer getHousenumber() {
        return housenumber;
    }

    public void setHousenumber(Integer housenumber) {
        this.housenumber = housenumber;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}