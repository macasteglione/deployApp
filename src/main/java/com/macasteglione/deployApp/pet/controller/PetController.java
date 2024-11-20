package com.macasteglione.deployApp.pet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.macasteglione.deployApp.dto.PetOwnerDTO;
import com.macasteglione.deployApp.pet.model.Pet;
import com.macasteglione.deployApp.pet.service.IPetService;

@RestController
public class PetController {
    @Autowired
    private IPetService service;

    @GetMapping("/pets/get")
    public List<Pet> getPets() {
        return service.getPets();
    }

    @PostMapping("/pets/create")
    public String savePet(@RequestBody Pet pet) {
        service.savePet(pet);
        return "La mascota fue creada correctamente";
    }

    @DeleteMapping("/pets/delete/{id}")
    public String deletePet(@PathVariable Long id) {
        service.removePet(id);
        return "La mascota fue borrada correctamente";
    }

    @PutMapping("/pets/edit")
    public Pet editPet(@RequestBody Pet pet) {
        service.editPet(pet);
        return service.findPet(pet.getId());
    }

    @GetMapping("/pets/get-owners")
    public List<PetOwnerDTO> getPetOwners() {
        return service.getPetOwners();
    }
}
