package com.macasteglione.deployApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_owner;
    private String dni;
    private String name;
    private String surname;
    private String phone;

    public Owner() {
    }

    public Owner(Long id, String dni, String name, String surname, String phone) {
        this.id_owner = id;
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }
}
