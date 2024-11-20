package com.macasteglione.deployApp.owner.service;

import java.util.List;

import com.macasteglione.deployApp.owner.model.Owner;

public interface IOwnerService {
    List<Owner> getOwners();

    void saveOwner(Owner owner);

    void removeOwner(Long id);

    Owner findOwner(Long id);

    void editOwner(Owner owner);
}
