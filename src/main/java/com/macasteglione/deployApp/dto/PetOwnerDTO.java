package com.macasteglione.deployApp.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PetOwnerDTO {
    private String petName;
    private String race;
    private String ownerName;
    private String ownerSurname;
}
