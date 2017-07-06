package com.springboot.myapp.services;

import com.springboot.myapp.models.Building;
import com.springboot.myapp.repositories.BuildingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by abella on 2017-07-04.
 */
@Service
@Transactional
public class BuildingService {

    @Autowired
    private BuildingRepository buildingRepository;

    public Building save(Building building) {
        return buildingRepository.save(building);
    }

    public List<Building> saveAll(Iterable<Building> buildingsList) {
        return buildingRepository.save(buildingsList);
    }

    public void delete(Long buildingId) {
        buildingRepository.delete(buildingId);
    }

    public List<Building> findAll() {
        return buildingRepository.findAll();
    }

    public Building findOne(Long buildingId) {
        return buildingRepository.findOne(buildingId);
    }
}
