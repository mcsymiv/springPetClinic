package com.mcs.springpetclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class Owner extends Person {

    private Set<Pet> pets;

    @Override
    public String toString() {
        return super.toString() + " " +
                "Owner{" +
                "pets=" + pets +
                '}';
    }
}
