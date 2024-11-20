package com.macasteglione.deployApp.pet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.macasteglione.deployApp.pet.model.Pet;

@Repository
public interface IPetRespository extends JpaRepository<Pet, Long> {
}
