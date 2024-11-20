package com.macasteglione.deployApp.service;

import com.macasteglione.deployApp.dto.PetOwnerDTO;
import com.macasteglione.deployApp.model.Pet;

import java.util.List;

public interface IPetService {
    List<Pet> getPets();

    void savePet(Pet pet);

    void removePet(Long id);

    Pet findPet(Long id);

    void editPet(Pet pet);

    List<PetOwnerDTO> getPetOwners();
}
