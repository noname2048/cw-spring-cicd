package com.example.demo.common.domain.repository;

import com.example.demo.common.domain.entity.Bottle;

import java.util.List;
import java.util.Optional;

public interface BottleRepository {

    public List<Bottle> listAll();

    public Optional<Bottle> retrieveById(Long id);

    public Optional<Bottle> create(Long id);

    public Optional<Bottle> updateById(Long id);

    public Optional<Bottle> deleteById(Long id);
}
