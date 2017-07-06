package com.springboot.myapp.controllers;

import com.springboot.myapp.models.*;
import com.springboot.myapp.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by abella on 2017-07-05.
 */

@RestController
public class MainController {

    @Autowired
    private BuildingService buildingService;

    @Autowired
    private FloorService floorService;

    @Autowired
    private RoomService roomService;

    @Autowired
    private SensorService sensorService;

    @Autowired
    private PersonService personService;

    private List<Building> buildingsList = new ArrayList<Building>();
    private List<Floor> floorsList = new ArrayList<Floor>();
    private List<Room> roomsList = new ArrayList<Room>();
    private List<Sensor> sensorsList = new ArrayList<Sensor>();
    private List<Person> peopleList = new ArrayList<Person>();

    @RequestMapping("/init")
    public void init(@RequestParam("file") MultipartFile file) {

        try {
            BufferedInputStream br = new BufferedInputStream(file.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Building> initBuildings(List<Building> buildingsList) {
        return buildingService.saveAll(buildingsList);
    }

    public List<Floor> initFloors(List<Floor> floorsList) {
        return floorService.saveAll(floorsList);
    }

    public List<Room> initRooms(List<Room> roomsList) {
        return roomService.saveAll(roomsList);
    }

    public List<Sensor> initSensors(List<Sensor> sensorsList) {
        return sensorService.saveAll(sensorsList);
    }

    public List<Person> initPeople(List<Person> peopleList) {
        return personService.saveAll(peopleList);
    }
}
