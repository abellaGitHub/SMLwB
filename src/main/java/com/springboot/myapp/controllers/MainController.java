package com.springboot.myapp.controllers;

import com.springboot.myapp.models.*;
import com.springboot.myapp.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @RequestMapping("/init")
    @ResponseBody
    public List<Building> init(@RequestBody List<Building> buildingsList) {

        List<Floor> floorsList;
        List<Room> roomsList;
        List<Sensor> sensorsList;
        List<Person> peopleList;

        for(Building building : buildingsList) {
            floorsList = building.getFloorsList();

            for(Floor floor : floorsList) {
                roomsList = floor.getRoomsList();

                for(Room room : roomsList) {
                    sensorsList = room.getSensorsList();

                    room.setSensorsList(initSensors(sensorsList)); // create sensors for room in db and return with id's
                }
                floor.setRoomsList(initRooms(roomsList)); // create rooms for floor in db and return with id's
            }
            building.setFloorsList(initFloors(floorsList)); // create floors for building in db and return with id's
        }
        buildingsList = initBuildings(buildingsList); // create buildings in db and return with id's

        return buildingsList;
    }

    private List<Building> initBuildings(List<Building> buildingsList) {
        return buildingService.saveAll(buildingsList);
    }

    private List<Floor> initFloors(List<Floor> floorsList) {
        return floorService.saveAll(floorsList);
    }

    private List<Room> initRooms(List<Room> roomsList) {
        return roomService.saveAll(roomsList);
    }

    private List<Sensor> initSensors(List<Sensor> sensorsList) {
        return sensorService.saveAll(sensorsList);
    }

    private List<Person> initPeople(List<Person> peopleList) {
        return personService.saveAll(peopleList);
    }
}
