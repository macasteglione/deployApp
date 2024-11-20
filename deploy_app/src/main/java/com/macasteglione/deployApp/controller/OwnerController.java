package com.macasteglione.deployApp.controller;

import com.macasteglione.deployApp.model.Owner;
import com.macasteglione.deployApp.service.IOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OwnerController {

    @Autowired
    private IOwnerService service;

    @GetMapping("/owner/get")
    public List<Owner> getOwners() {
        return service.getOwners();
    }

    @PostMapping("/owner/create")
    public String saveOwner(@RequestBody Owner owner) {
        service.saveOwner(owner);
        return "La persona fue creada correctamente";
    }

    @DeleteMapping("/owner/delete/{id}")
    public String deleteOwner(@PathVariable Long id) {
        service.removeOwner(id);
        return "La persona fue borrada correctamente";
    }

    @PutMapping("/owner/edit")
    public Owner editOwner(@RequestBody Owner owner) {
        service.editOwner(owner);
        return service.findOwner(owner.getId_owner());
    }
}
