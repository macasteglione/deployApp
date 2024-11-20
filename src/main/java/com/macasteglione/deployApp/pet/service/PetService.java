package com.macasteglione.deployApp.pet.service;

import com.macasteglione.deployApp.dto.PetOwnerDTO;
import com.macasteglione.deployApp.pet.model.Pet;
import com.macasteglione.deployApp.pet.repository.IPetRespository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PetService implements IPetService {
    @Autowired
    private IPetRespository repository;

    @Override
    public List<Pet> getPets() {
        return repository.findAll();
    }

    @Override
    public void savePet(Pet pet) {
        repository.save(pet);
    }

    @Override
    public void removePet(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Pet findPet(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void editPet(Pet pet) {
        savePet(pet);
    }

    @Override
    public List<PetOwnerDTO> getPetOwners() {
        List<Pet> pets = getPets();
        List<PetOwnerDTO> petOwners = new ArrayList<PetOwnerDTO>();
        PetOwnerDTO petOwner = new PetOwnerDTO();

        for (Pet pet : pets) {
            System.out.println(pet.getName());
            petOwner.setOwnerName(pet.getOwner().getName());
            petOwner.setPetName(pet.getName());
            petOwner.setOwnerSurname(pet.getOwner().getSurname());
            petOwner.setRace(pet.getRace());

            petOwners.add(petOwner);
            petOwner = new PetOwnerDTO();
        }

        return petOwners;
    }
}
