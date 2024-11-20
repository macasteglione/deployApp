package com.macasteglione.deployApp.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PetOwnerDTO {
    private String petName;
    private String race;
    private String ownerName;
    private String ownerSurname;

    public PetOwnerDTO() {
    }

    public PetOwnerDTO(String petName, String race, String ownerName, String ownerSurname) {
        this.petName = petName;
        this.race = race;
        this.ownerName = ownerName;
        this.ownerSurname = ownerSurname;
    }
}
