package com.mcs.springpetclinic.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Speciality extends NameEntity {

    private String description;

    @Override
    public String toString() {
        return "Specialty{" +
                "description='" + description + '\'' +
                '}';
    }
}