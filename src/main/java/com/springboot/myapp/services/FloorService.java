package com.springboot.myapp.services;

import com.springboot.myapp.models.Floor;
import com.springboot.myapp.repositories.FloorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by abella on 2017-07-04.
 */
@Service
@Transactional
public class FloorService {

    @Autowired
    private FloorRepository floorRepository;

    public Floor save(Floor floor) {
        return floorRepository.save(floor);
    }

    public List<Floor> saveAll(Iterable<Floor> floorsList) {
        return floorRepository.save(floorsList);
    }

    public void delete(Long floorId) {
        floorRepository.delete(floorId);
    }

    public List<Floor> findAll() {
        return floorRepository.findAll();
    }

    public Floor findOne(Long floorId) {
        return floorRepository.findOne(floorId);
    }
}
