package com.fauroro.pushupbackend.domain.services.pais;

import com.fauroro.pushupbackend.domain.repositories.PaisRepository;
import com.fauroro.pushupbackend.persistence.entities.Pais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaisImpl implements IPais {
    @Autowired
    private PaisRepository repository;

    @Override
    public List<Pais> findAll() {
        return (List<Pais>) repository.findAll();
    }

    @Override
    public Optional<Pais> findById(int id) {
        return repository.findById(id);
    }
}
