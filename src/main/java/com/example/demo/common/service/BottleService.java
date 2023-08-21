package com.example.demo.common.service;

import com.example.demo.common.domain.entity.Bottle;
import com.example.demo.common.domain.repository.BottleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BottleService {

    private final BottleRepository bottleRepository;

    public BottleService(BottleRepository bottleRepository) {
        this.bottleRepository = bottleRepository;
    }

    public Optional<Bottle> create() {
        return Optional.empty();
    }
}
