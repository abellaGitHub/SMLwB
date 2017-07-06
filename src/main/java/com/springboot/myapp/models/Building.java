package com.springboot.myapp.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "BUILDING")
public class Building {

    @Id
    @GeneratedValue
    @Column(name = "BUILDING_ID")
    private Long buildingId;

    @Column(name = "BUILDING_NAME")
    private String buildingName;

    @Column(name = "NUMBER_OF_FLOORS")
    private Integer numberOfFloors;

    @OneToMany
    @JoinTable(name = "BUILDING_FLOORS", joinColumns = @JoinColumn(name = "BUILDING_ID"), inverseJoinColumns = @JoinColumn(name = "FLOOR_ID"))
    private List<Floor> floorsList = new ArrayList<>();

    public Building() {}

    public Building(String buildingName, Integer numberOfFloors){
        this.buildingName = buildingName;
        this.numberOfFloors = numberOfFloors;
    }

    public Long getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Long buildingId) {
        this.buildingId = buildingId;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public Integer getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(Integer numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public List<Floor> getFloorsList() {
        return floorsList;
    }

    public void setFloorsList(List<Floor> floorsList) {
        this.floorsList = floorsList;
    }
}
