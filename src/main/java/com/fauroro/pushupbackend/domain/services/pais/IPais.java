package com.fauroro.pushupbackend.domain.services.pais;

import com.fauroro.pushupbackend.persistence.entities.Pais;

import java.util.List;
import java.util.Optional;

public interface IPais {
    List<Pais> findAll();
    Optional<Pais> findById(int id);
}
