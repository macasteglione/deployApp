package com.macasteglione.deployApp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String race;
    private String color;

    @OneToOne
    @JoinColumn(name = "id_owner", referencedColumnName = "id_owner")
    private Owner owner;

    public Pet() {
    }

    public Pet(Long id, String name, String race, String color) {
        this.id = id;
        this.name = name;
        this.race = race;
        this.color = color;
    }
}
