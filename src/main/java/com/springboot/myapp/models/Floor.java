package com.springboot.myapp.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "FLOOR")
public class Floor {

    @Id
    @GeneratedValue
    @Column(name = "FLOOR_ID")
    private Long floorId;

    @Column(name = "FLOOR_NAME")
    private String floorName;

    @Column(name = "NUMBER_OF_ROOMS")
    private Integer numberOfRooms;

    @OneToMany
    @JoinTable(name = "FLOOR_ROOMS", joinColumns = @JoinColumn(name = "FLOOR_ID"), inverseJoinColumns = @JoinColumn(name = "ROOM_ID"))
    private List<Room> roomsList = new ArrayList<>();

    public Floor() {}

    public Floor(String floorName, Integer numberOfRooms) {
        this.floorName = floorName;
        this.numberOfRooms = numberOfRooms;
    }

    public Long getFloorId() {
        return floorId;
    }

    public void setFloorId(Long floorId) {
        this.floorId = floorId;
    }

    public String getFloorName() {
        return floorName;
    }

    public void setFloorName(String floorName) {
        this.floorName = floorName;
    }

    public Integer getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(Integer numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public List<Room> getRoomsList() {
        return roomsList;
    }

    public void setRoomsList(List<Room> roomsList) {
        this.roomsList = roomsList;
    }
}
