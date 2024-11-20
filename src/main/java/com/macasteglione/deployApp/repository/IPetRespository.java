package com.macasteglione.deployApp.repository;

import com.macasteglione.deployApp.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPetRespository extends JpaRepository<Pet, Long> {
}
