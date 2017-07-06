package com.springboot.myapp.controllers;

import com.springboot.myapp.models.Person;
import com.springboot.myapp.models.Registry;
import com.springboot.myapp.models.Sensor;
import com.springboot.myapp.services.PersonService;
import com.springboot.myapp.services.RegistryService;
import com.springboot.myapp.services.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by abella on 2017-07-05.
 */

@RestController
public class RegistryController {

    @Autowired
    RegistryService registryService;

    @Autowired
    PersonService personService;

    @Autowired
    SensorService sensorService;

    @RequestMapping(value = "/register/{dataToRegister}")
    public void register(@PathVariable(value = "dataToRegister") String dataToRegister) {

        Registry registry;
        Person person;
        Sensor sensor;
        Timestamp time;

        Long personId;
        Long sensorId;
        String direction;
        String[] dataToRegisterTab;
        System.out.println(dataToRegister);
        dataToRegisterTab = dataToRegister.split("-");
        System.out.println("Length: " + dataToRegisterTab.length);
        if (dataToRegisterTab.length < 3) {
            System.out.println("Parameters error!");
            return;
        } else {
            sensorId = Long.parseLong(dataToRegisterTab[0]);
            personId = Long.parseLong(dataToRegisterTab[1]);
            direction = dataToRegisterTab[2];

            sensor = sensorService.findOne(sensorId);
            person = personService.findOne(personId);

            if (sensor == null || person == null || (!direction.equals("IN") && !direction.equals("OUT"))) {
                System.out.println("Entity error!");
                return;
            } else {
                registry = new Registry(person, sensor, direction, new Timestamp(System.currentTimeMillis()));
                registryService.save(registry);

                return;
            }
        }
    }
}
