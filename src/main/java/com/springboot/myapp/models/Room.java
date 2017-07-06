package com.springboot.myapp.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by abella on 2017-07-03.
 */

@Entity
@Table(name = "ROOM")
public class Room {

    @Id
    @GeneratedValue
    @Column(name = "ROOM_ID")
    private Long roomId;

    @Column(name = "ROOM_NAME")
    private String roomName;

    @Column(name = "MAX_NUMBER_OF_PEOPLE")
    private Integer maxNumberOfPeople;

    @Column(name = "NUMBER_OF_SENSORS")
    private Integer numberOfSensors;

    @OneToMany
    @JoinTable(name = "ROOM_SENSORS", joinColumns = @JoinColumn(name = "ROOM_ID"), inverseJoinColumns = @JoinColumn(name = "SENSOR_ID"))
    private List<Sensor> sensorsList = new ArrayList<Sensor>();

    public Room() {}

    public Room(String roomName, Integer maxNumberOfPeople, Integer numberOfSensors) {
        this.roomName = roomName;
        this.maxNumberOfPeople = maxNumberOfPeople;
        this.numberOfSensors = numberOfSensors;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public Integer getMaxNumberOfPeople() {
        return maxNumberOfPeople;
    }

    public void setMaxNumberOfPeople(Integer maxNumberOfPeople) {
        this.maxNumberOfPeople = maxNumberOfPeople;
    }

    public Integer getNumberOfSensors() {
        return numberOfSensors;
    }

    public void setNumberOfSensors(Integer numberOfSensors) {
        this.numberOfSensors = numberOfSensors;
    }

    public Collection<Sensor> getSensorsList() {
        return sensorsList;
    }

    public void setSensorsList(List<Sensor> sensorsList) {
        this.sensorsList = sensorsList;
    }
}
