package com.macasteglione.deployApp.service;

import com.macasteglione.deployApp.model.Owner;

import java.util.List;

public interface IOwnerService {
    List<Owner> getOwners();

    void saveOwner(Owner owner);

    void removeOwner(Long id);

    Owner findOwner(Long id);

    void editOwner(Owner owner);
}
