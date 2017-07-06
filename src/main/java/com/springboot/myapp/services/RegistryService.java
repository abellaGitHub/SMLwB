package com.springboot.myapp.services;

import com.springboot.myapp.models.Registry;
import com.springboot.myapp.repositories.RegistryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by abella on 2017-07-04.
 */

@Service
@Transactional
public class RegistryService {

    @Autowired
    private RegistryRepository registryRepository;

    public Registry save(Registry registry) {
        return registryRepository.save(registry);
    }

    public void delete(Long registryId) {
        registryRepository.delete(registryId);
    }

    public List<Registry> findAll() {
        return registryRepository.findAll();
    }

    public Registry findOne(Long registryId) {
        return registryRepository.findOne(registryId);
    }
}
