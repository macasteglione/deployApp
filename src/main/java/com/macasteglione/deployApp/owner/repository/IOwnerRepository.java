package com.macasteglione.deployApp.owner.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.macasteglione.deployApp.owner.model.Owner;

@Repository
public interface IOwnerRepository extends JpaRepository<Owner, Long> {
}
