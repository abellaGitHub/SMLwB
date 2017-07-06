package com.springboot.myapp.models;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by abella on 2017-07-03.
 */

@Entity
@Table(name = "REGISTRY")
public class Registry implements Serializable {

    @Id
    @GeneratedValue
    Long registryId;

    @OneToOne
    @JoinColumn(name = "PERSON_ID")
    private Person person;

    @OneToOne
    @JoinColumn(name = "SENSOR_ID")
    private Sensor sensor;

    @Column(name = "DIRECTION")
    private String direction;

    @Column(name = "TIME")
    private Timestamp time;

    public Registry() {}

    public Registry(Person person, Sensor sensor, String direction, Timestamp time) {
        this.person = person;
        this.sensor = sensor;
        this.direction = direction;
        this.time = time;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }
}
