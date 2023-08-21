package com.example.demo.common.domain.repository;

import com.example.demo.common.domain.entity.Bottle;

import java.util.*;

public class MemoryBottleRepository implements BottleRepository {
    private static final Map<Long, Bottle> store = new HashMap<>();

    private static long autoIncrementSequnce = 0L;

    @Override
    public List<Bottle> listAll() {
        return new ArrayList<>(store.values());
    }

    @Override
    public Optional<Bottle> retrieveById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<Bottle> create(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Bottle> updateById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Bottle> deleteById(Long id) {
        return Optional.empty();
    }
}
