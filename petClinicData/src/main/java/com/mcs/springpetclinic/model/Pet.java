package com.mcs.springpetclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Pet {

    private Owner owner;
    private PetType petType;
    private LocalDate birthday;
}