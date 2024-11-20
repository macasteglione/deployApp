package com.macasteglione.deployApp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String race;
    private String color;

    @OneToOne
    @JoinColumn(name = "id_owner", referencedColumnName = "id_owner")
    private Owner owner;
}
