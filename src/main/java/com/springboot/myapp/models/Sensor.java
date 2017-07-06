package com.springboot.myapp.models;

import javax.persistence.*;

/**
 * Created by abella on 2017-07-03.
 */

@Entity
@Table(name = "SENSOR")
public class Sensor {

    @Id
    @GeneratedValue
    @Column(name = "SENSOR_ID")
    private Long sensorId;

    @Column(name = "SENSOR_NAME")
    private String sensorName;

    public Sensor() {}

    public Sensor(String sensorName) {
        this.sensorName = sensorName;
    }

    public Long getSensorId() {
        return sensorId;
    }

    public void setSensorId(Long sensorId) {
        this.sensorId = sensorId;
    }

    public String getSensorName() {
        return sensorName;
    }

    public void setSensorName(String sensorName) {
        this.sensorName = sensorName;
    }
}
