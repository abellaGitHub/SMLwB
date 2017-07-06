package com.springboot.myapp.services;

import com.springboot.myapp.models.Sensor;
import com.springboot.myapp.repositories.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import javax.xml.ws.soap.Addressing;
import java.util.List;

/**
 * Created by abella on 2017-07-04.
 */
@Service
@Transactional
public class SensorService {

    @Autowired
    private SensorRepository sensorRepository;

    public Sensor save(Sensor sensor) {
        return sensorRepository.save(sensor);
    }

    public List<Sensor> saveAll(Iterable<Sensor> sensorsList) {
        return sensorRepository.save(sensorsList);
    }

    public void delete(Long sensorId) {
        sensorRepository.delete(sensorId);
    }

    public List<Sensor> findAll() {
        return sensorRepository.findAll();
    }

    public Sensor findOne(Long sensorId) {
        return sensorRepository.findOne(sensorId);
    }
}
