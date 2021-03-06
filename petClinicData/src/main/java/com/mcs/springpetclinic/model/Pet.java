package com.mcs.springpetclinic.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "pets")
public class Pet extends NameEntity {

    @Builder
    public Pet(
            Long id,
            String name,
            Owner owner,
            LocalDate birthday,
            PetType petType,
            Set<Visit> visits) {
        super(id, name);
        this.owner = owner;
        this.birthday = birthday;
        this.petType = petType;

        if (visits != null && visits.size() > 0) {
            this.visits = visits;
        }
    }

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    @Column(name = "birth_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private PetType petType;

    @OneToMany(
            cascade = CascadeType.ALL,
            mappedBy = "pet")
    private Set<Visit> visits = new HashSet<>();
}
