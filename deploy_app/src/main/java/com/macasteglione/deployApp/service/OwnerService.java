package com.macasteglione.deployApp.service;

import com.macasteglione.deployApp.model.Owner;
import com.macasteglione.deployApp.repository.IOwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerService implements IOwnerService {
    @Autowired
    private IOwnerRepository repository;

    @Override
    public List<Owner> getOwners() {
        return repository.findAll();
    }

    @Override
    public void saveOwner(Owner owner) {
        repository.save(owner);
    }

    @Override
    public void removeOwner(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Owner findOwner(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void editOwner(Owner owner) {
        saveOwner(owner);
    }
}
